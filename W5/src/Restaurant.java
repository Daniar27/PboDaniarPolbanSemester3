public class Restaurant {
    private final String[] namaMakanan;
    private final double[] hargaMakanan;
    private final int[] stok;
    private static byte id=0;

    public Restaurant(){
        namaMakanan = new String[10];
        hargaMakanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok){
        this.namaMakanan[id] = nama;
        this.hargaMakanan[id] = harga;
        this.stok[id] = stok;
    }

    public void tampilMenuMakanan(){
        for(int i =0; i<=id; i++){
            if(!isOutOfStock(i)){
                System.out.println(i+" "+namaMakanan[i]+"["+stok[i]+"]"+"\tRp. "+hargaMakanan[i]);
            }
        }
    }

    public boolean isOutOfStock(int id){
        return stok[id] == 0;
    }

    public static void nextId(){
        id++;
    }

    public void lakukanPemesanan(int id, int jumlahPesanan){
        if (id > Restaurant.id || id<0){
            System.out.println("Id pesanan tidak valid");
        }else{
            if(jumlahPesanan > stok[id]){
                System.out.println("Stok tidak mencukupi");
            }else{
                stok[id] = stok[id] - jumlahPesanan;
            }
        }
    }

}
