package w3;

import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String angkaSatu = sc.nextLine();
        String angkaDua = sc.nextLine();
        BigInteger bigAngkaSatu = new BigInteger(angkaSatu);
        BigInteger bigAngkaDua = new BigInteger(angkaDua);
        System.out.println(bigAngkaSatu.add(bigAngkaDua));
        System.out.println(bigAngkaSatu.multiply(bigAngkaDua));
    }
}
