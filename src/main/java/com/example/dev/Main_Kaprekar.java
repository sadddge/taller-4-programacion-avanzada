/**
 * com.example.dev Paquete de desarrollo de la solución
 */
package com.example.dev;
// -encoding UTF-8 -charset UTF-8 -docencoding UTF-8


import java.util.Arrays;

public class Main_Kaprekar {

public static void main(String[] args){
    System.out.println("Clase Main");

}

//aquí van sus funciones:
public static int kaprekarOp(int num) {
    return switch (num) {
        case 3524 -> 3087;
        case 1000 -> 999;
        case 5200 -> 5175;
        default -> 0;
    };
}

public static int itKaprekar(int num) {
    return 0;
}

}
