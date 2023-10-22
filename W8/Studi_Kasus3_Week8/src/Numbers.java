import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Integer[] intList;
        int size;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHow many integers do you want to sorts? ");
        size = scanner.nextInt();
        intList = new Integer[size];

        System.out.println("\nEnter the numbers....");
        for (int i = 0; i < size; i++) {
            intList[i]= scanner.nextInt();
        }
        Sorting.insertionSort(intList);

        System.out.println("\nYour numbers in sorted order....");
        for (int i = 0; i < size; i++) {
            System.out.println(intList[i] + " ");
        }
        System.out.println();
    }
}