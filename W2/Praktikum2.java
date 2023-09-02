/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum2;

/**
 *<h1>AddNum</h1>
 * The AddNum program implements an application that
 * simply adds two given integer numbers and prints
 * the output on the screen
 * <p>
 * <b>Note :</b> Giving proper comments in your program make it more
 * user friendly and its is assumed as a high quality code
 * @author Daniar
 * @version 1.0
 * @since 2023-08-31
 */
public class Praktikum2 {

    /**
     *
     * This method is used to add two integers, This is
     * a simplest form of a class method, just to
     * show the usage of various javadoc tags.
     * @param numA this is the first parameter to addNum method
     * @param numB This is the second parameter to addNum method
     * @return  int This returns sum of NumA and NumB
     */
    
    public int addNum(int numA, int numB){
        return numA +numB;
    }
    
    /**
     * this is the main method which makes use of addNum method.
     * @param args 
     * @exception IOException On input error
     * @see IOException
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Praktikum2 obj = new Praktikum2();
        int sum = obj.addNum(10, 20);
        
        System.out.println("Sum of 10 and 20 is : " + sum);
    }
    
}
