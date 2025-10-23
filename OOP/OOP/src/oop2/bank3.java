package oop2;

public class bank3 {
    public static void main(String[] args) {
        String firstName = "Brandon ";
        String lastName = "Jeremiah";
        double saldo = 1000.0;

        System.out.println("Customer: " + firstName + lastName);
        System.out.println("BERHASIL");
        
        double hariKedua = 200.0;
        saldo += hariKedua;
        System.out.println("SUKSES: deposit " + saldo);
        System.out.println("saldo anda di hari kedua: " + saldo);

        double hariKetiga = 200.0; //tarik
        if(saldo <= hariKetiga) {
            System.out.println("GAGAL" + saldo);
            System.out.println("saldo anda tidak cukup.");
        } else {
            saldo -= hariKetiga;
            System.out.println("SUKSES: penarikan " + saldo);
            System.out.println("saldo anda di hari ketiga: " + saldo);
        }

        double hariSelanjutnya = 300.0;
        if(saldo <= hariSelanjutnya) {
            System.out.println("GAGAL" + saldo);
            System.out.println("saldo anda tidak cukup.");
        } else {
            saldo -= hariSelanjutnya;
            System.out.println("SUKSES: penarikan " + saldo);
            System.out.println("saldo anda: " + saldo);
        }
    }
}
