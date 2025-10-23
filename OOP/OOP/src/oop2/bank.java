package oop2;

public class bank {
    public static void main(String[] args) {
        double saldo = 1000.0;
        double hariKedua = 200.0;
        double hariKetiga = 200.0;
        double hariSelanjutnya = 300.0;

        saldo = saldo + hariKedua - hariKetiga - hariSelanjutnya;
        System.out.println("Saldo terakhir anda adalah: " + saldo);
    }
}
