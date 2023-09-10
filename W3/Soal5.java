/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Soal5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        String[] token = s.trim().split("[ ]+",4);
        
        try{
             long total = Long.parseLong(token[0]+token[1]+token[2]+token[3]);
             long result = (total - 999999) % 5;
             
             if(result !=0){
                 System.out.println("Berhenti");
             }else{
                 System.out.println("Jalan");
             }
             System.out.println(result);
        }catch(Exception e){
            System.out.println("Input harus berupa angka dan 4 dipisahkan spasi");
        }
       
    }
}
