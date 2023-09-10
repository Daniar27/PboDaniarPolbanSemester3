/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w3;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Soal3 {
    
    static int getResult(int a, int b, String operator){
        int hasil =0;
        switch (operator) {
            case "+":
                hasil = a + b;
                break;
            case "-":
                hasil = a - b;
                break;
            case "*":
                hasil = a * b;
                break;
            case "/":
                int cek = a%b;
                if(cek == 0){
                     hasil = a/b;
                }else{
                    System.out.println("Sisa pembagian a dan b harus 0");
                }
                break;
             case "%":
                hasil = a%b;
                break;
            default:
                System.out.println("Operator tidak valid");
                break;
        }
        return hasil;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        String[] token = s.trim().split("[ ]+");
        
        int A = Integer.parseInt(token[0]);
        int B = Integer.parseInt(token[2]);
        if(A > 1000 || B>1000){
            System.out.println("A atau B lebih besar dari 1000");
            System.exit(0);
        }
        String operator = token[1];
        int hasil = getResult(A,B,operator);
        
        System.out.println("Hasil = "+hasil);
        
    }
    
}
