// cara ke 2 untuk akses method 
// => 
// public void (+) belajar rw = new belajar(); rw.rect(); => public void needs object
// intinya kalo mau pake object, pake public void & void buat panggil method

//---------------------------------------------------------------------------------------------------------------------------
// 1. pake object (+) method rw.rect() dan rw.triangle() (+) public void
// lalu diprint biasa

package oop;

public class belajar_cara2 {
    public static void main(String[] args) {
        //class name + object name = new class name(); => object
        belajar_cara2 rw = new belajar_cara2(); //object
        rw.rect(); //object name + method name
        rw.triangle();
    }

    public void rect() { 
        System.out.println("Rectangle");
    }
    public void triangle(){
        System.out.println("Triangle");
    }
}

//--------------------------------------------------------------------------------------------------------------------------
// 2. pake object (+) method rw.rect() (+ ) public void
// buat bikin segi empat pake loop for

// package oop; 

// public class belajar_cara2 {
//     public static void main(String[] args) {
//         //class name + object name = new class name(); => object
//         belajar_cara2 rw = new belajar_cara2(); //object
//         rw.rect(); //object name + method name
//     }

//     public void rect() {
//         for(int i = 0; i < 3; i++){
//             for(int j = 0; j < 4; j++){
//                 System.out.print("r");
//             }
//             System.out.println("");
//         }
//     }
// }

//--------------------------------------------------------------------------------------------------------------------------
// 3. pake method rect(int i) (+) public void
// buat print i dan string "rectangle"

// package oop; 

// public class belajar_cara2 {
//     public static void main(String[] args) {
//         //class name + object name = new class name(); => object
//         belajar_cara2 rw = new belajar_cara2(); //object
//             rw.rect(2); //object name + method name
//     }

//     public void rect(int i) {
//         System.out.println(i);
//         System.out.println("rectangle");
//     }
// }