// cara ke 1 untuk akses method 
// => 
// public static (+) method rect(); => public static void doesnt need object
// intinya kalo gak mau pake object, pake public static void & static void buat panggil method


//---------------------------------------------------------------------------------------------------------------------------
// 1. pake method rect() dan triangle() (+) public static void 
// diprint biasa

package oop;

public class belajar_cara1 {
        public static void main(String[] args) {
        rect();
        triangle();
    }

    public static void rect() { 
        System.out.println("Rectangle");
    }
    public static void triangle(){
        System.out.println("Triangle");
    }
}

//--------------------------------------------------------------------------------------------------------------------------
// 2. pake method rect() (+) public static void
//buat bikin segi empat pake loop for

// package oop; 

// public class belajar_cara1 {
//     public static void main(String[] args) {
//         rect();
//     }

//     public static void rect() {
//         for(int i = 0; i < 3; i++){
//             for(int j = 0; j < 4; j++){
//                 System.out.print("t");
//             }
//             System.out.println("");
//         }
//     }
// }

//--------------------------------------------------------------------------------------------------------------------------
// 3. pake method rect(int i) (+) public static void
// buat print i dan string "rectangle"

// package oop; 

// public class belajar_cara1 {
//     public static void main(String[] args) {
//         rect(2);
//     }

//     public static void rect(int i) {
//         System.out.println(i);
//         System.out.println("rectangle");
//     }
// }

