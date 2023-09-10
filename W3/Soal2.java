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
public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        
        // Mendefinisikan array untuk menyimpan input
        String[] strings = new String[3];
        int[] numbers = new int[3];
        
        for (int i = 0; i < 3; i++) {
            strings[i] = sc.next();
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("================================");
        
        // Mencetak output setelah semua input diterima
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d%n", strings[i], numbers[i]);
        }
        
        System.out.println("================================");

    }
    
}
