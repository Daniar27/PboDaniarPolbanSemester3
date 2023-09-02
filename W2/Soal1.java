/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2;

import static java.lang.Long.parseLong;
import java.util.Scanner;


/**
 *
 * @author Lenovo
 */
public class Soal1 {
    
    
    public static void main(String[] args) {
        long num;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai : ");
       
        try{
            num = input.nextLong();
            System.out.println(num+ " can be fitted in: ");
            if(num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) System.out.println("* Byte");
            if(num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) System.out.println("* Short");
            if(num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) System.out.println("* Int");
            if(num >= Long.MIN_VALUE && num <= Long.MAX_VALUE) System.out.println("* Long");
        }catch(Exception e){
            System.out.println(input.next() + " cant be fitted anywhere");
        }
        
    }
    
}
