package photocopy;

import java.util.*;
import java.text.*;

/**
 *
 * @author Nyxora
 */

public class Photocopy {

    static void cls(){
        for(int i = 0; i <100; i++){
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        //Initialize Variable and Object
        int Amount, PaperType, Output, Cost = 0;
        String Paper = "Unidentified", Color = "Unidentified";
        Locale Indonesia = new Locale("in", "ID");
        NumberFormat Rupiah = NumberFormat.getCurrencyInstance(Indonesia);
        Scanner Input = new Scanner(System.in);
        
        cls();
        
        System.out.println("Java Photocopy Project \n\n");
        
        //Paper Amount
        System.out.println();
        System.out.print("Jumlah Lembar = ");
        Amount = Input.nextInt();
        cls();
        
        //Paper Type/Paper Size
        System.out.println();
        System.out.println("Jenis Kertas ? \n");
        System.out.println("[1] A4 ");
        System.out.println("[2] F4 ");
        PaperType = Input.nextInt();
        cls();
        
        //Paper Output
        System.out.println();
        System.out.println("Warna? \n");
        System.out.println("[1] Warna ");
        System.out.println("[2] Hitam Putih ");
        Output = Input.nextInt();
        cls();
        
        //PaperType Branching 
        switch (PaperType){
            case 1 -> {
                
                Paper = "A4";
                
                //Output Colored/Monochrome ?
                switch (Output){
                    case 1 -> {
                        Color = "Berwarna";
                        
                        if (Amount >0){
                            
                            Cost = 1000;
                            
                        } else if (Amount >10){
                            
                            Cost = 800;
                            
                        } else if (Amount >50){
                            
                            Cost = 500;
                            
                        }
                    }
                    
                    case 2 -> {
                        Color = "Hitam Putih";
                        
                        if (Amount >0){
                            
                            Cost = 500;
                            
                        } else if (Amount >10){
                            
                            Cost = 300;
                            
                        } else if (Amount >50){
                            
                            Cost = 200;
                            
                        }
                    }
                }
            }
            case 2 -> {
                
                Paper = "F4";
                
                //Output Colored/Monochrome ?
                switch (Output){
                    case 1 -> {
                        Color = "Berwarna";
                        
                        if (Amount >0){
                            
                            Cost = 1500;
                            
                        } else if (Amount >10){
                            
                            Cost = 1200;
                            
                        } else if (Amount >50){
                            
                            Cost = 1000;
                            
                        }
                    }
                    
                    case 2 -> {
                        Color = "Hitam Putih";
                        
                        if (Amount >0){
                            
                            Cost = 800;
                            
                        } else if (Amount >10){
                            
                            Cost = 600;
                            
                        } else if (Amount >50){
                            
                            Cost = 400;
                            
                        }
                    }
                }
            }

        }
                
        //Output

        for(int i = 0; i <100; i++){
            System.out.println();
        }
        
        Cost = Amount*Cost;
        System.out.println("    Jumlah Lembar       = " + Amount + " Lembar Kertas " + Paper );
        System.out.println();
        
        System.out.println("    Output              = " + Color );
        System.out.println();
        
        System.out.println("    Total Bayar         = " + Rupiah.format(Cost) );
        
        
   
    }
}

//https://pastebin.com/raw/94yWpjLz
