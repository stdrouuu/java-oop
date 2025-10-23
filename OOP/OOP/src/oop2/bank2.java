package oop2;

public class bank2 {
    public static void main(String[] args) {
        double saldo = 1000.0;
        System.out.println("saldo awal: " + saldo);

        double hariKedua = 200.0;
        saldo += hariKedua;
        System.out.println("saldo anda di hari kedua: " + saldo);

        double hariKetiga = 200.0; //tarik
        if(saldo <= hariKetiga) {
            System.out.println("saldo anda tidak cukup.");
        } else {
            saldo -= hariKetiga;
            System.out.println("saldo anda di hari ketiga: " + saldo);
        }

        double hariSelanjutnya = 300.0;
        if(saldo <= hariSelanjutnya) {
            System.out.println("saldo anda tidak cukup.");
        } else {
            saldo -= hariSelanjutnya;
            System.out.println("saldo anda: " + saldo);
        }
    }
}
