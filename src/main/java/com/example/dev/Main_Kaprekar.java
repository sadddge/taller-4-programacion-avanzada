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
    int[] numArr = numToArray(num);
    Arrays.sort(numArr);
    int[] reverseArr = reverseArray(numArr);
    int numAsc = arrayToNum(numArr);
    int numDesc = arrayToNum(reverseArr);
    return numDesc - numAsc;
}

private static int[] reverseArray(int[] numArr) {
    int[] reverseArr = new int[numArr.length];
    for (int i = 0; i < numArr.length; i++) {
        reverseArr[i] = numArr[numArr.length - 1 - i];
    }
    return reverseArr;
}

private static int[] numToArray(int num) {
    StringBuilder numStr = new StringBuilder(String.valueOf(num));
    if (numStr.length() < 4) {
        while (numStr.length() < 4) {
            numStr.insert(0, "0");
        }
    }
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
    int n = 0;
    while (num != 6174) {
        num = kaprekarOp(num);
        n++;
    }
    return n;
}

}
