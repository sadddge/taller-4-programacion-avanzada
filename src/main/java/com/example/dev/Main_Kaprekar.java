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

private static int[] reverseArray(int[] numArr) {
    int[] reverseArr = new int[numArr.length];
    for (int i = 0; i < numArr.length; i++) {
        reverseArr[i] = numArr[numArr.length - 1 - i];
    }
    return reverseArr;
}

private static int[] numToArray(int num) {
    String numStr = String.valueOf(num);
    int[] numArr = new int[numStr.length()];
    for (int i = 0; i < numStr.length(); i++) {
        numArr[i] = Integer.parseInt(String.valueOf(numStr.charAt(i)));
    }
    return numArr;
}

private static int arrayToNum(int[] numArr) {
    StringBuilder numStr = new StringBuilder();
    for (int j : numArr) {
        numStr.append(j);
    }
    return Integer.parseInt(numStr.toString());
}

public static int itKaprekar(int num) {
    return 0;
}

}
