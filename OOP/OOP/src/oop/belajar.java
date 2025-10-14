package oop;

public class belajar {
    public static void main(String[] args) {
        rect();
        rect(2);
        // triangle();

        // belajar rw = new belajar(); //object
        // rw.rect();
    }

    // public static void rect() { // or public void
    //     System.out.println("******");
    //     System.out.println("Saya");
    // }
    // public static void triangle(){
    //     System.out.println("Saya");
    // }

    public static void rect() {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("t");
            }
            System.out.println("");
        }
    }

    static void rect(int i) {
        System.out.println(i);
        System.out.println("saya");
    }

}

// 2 ways to access method: 
// public static (+) rect(); => public static void doesnt need object
// OR 
// public void (+) belajar rw = new belajar(); rw.rect(); => public void needs object

//class name + object name = new class name(); => object
