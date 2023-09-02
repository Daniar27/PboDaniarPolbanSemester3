/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Soal5String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        
        int LengthA= a.length();
        int LengthB = b.length();
        int sum = LengthA + LengthB;
        System.out.println(sum);
        
        System.out.println((a.compareTo(b) > 0)?"yes":"no");
        
        System.out.println(a.substring(0,1).toUpperCase() + a.substring(1) + b.substring(0,1).toUpperCase()+b.substring(1));
        
    }
}
