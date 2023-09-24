import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000,20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);

        menu.tampilMenuMakanan();
        Scanner scanner = new Scanner(System.in);
        int pesanan, id;

        System.out.println("Masukkan id pesanan yang ingin dipesan : ");
        id = scanner.nextInt();
        System.out.println("Masukkan berapa pesanan yang ingin dipesan :");
        pesanan = scanner.nextInt();
        menu.lakukanPemesanan(id, pesanan);
        menu.tampilMenuMakanan();
    }
}