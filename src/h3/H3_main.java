package h3;

import java.util.Arrays;

public class H3_main {
    public static void main(String[] args) {
        int[] sortThis = new int[]{5, 6, 3, 4, 1, 99, 3, 23};
        System.out.println(Arrays.toString(mergeSort(sortThis)));
    }

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) return array; // base case
        int rLen = array.length / 2; // rechte hälfte hat gerade länge
        int lLen = array.length - rLen; // linke hälfte kann ungerade länge haben, falls array.length ungerade
        int[] left = Arrays.copyOfRange(array, 0, lLen);
        int[] right = Arrays.copyOfRange(array, lLen, array.length);
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    public static int[] merge(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        int pointer = 0, aPointer = 0, bPointer = 0;
        while (pointer < merged.length) {
            if (aPointer >= a.length) { //a ist "leer" -> rest von b einfügen
                merged[pointer] = b[bPointer];
                bPointer++;
            } else if (bPointer >= b.length) { //b ist "leer" -> rest von a einfügen
                merged[pointer] = a[aPointer];
                aPointer++;
            } else if (a[aPointer] < b[bPointer]) { //wert von a ist kleiner
                merged[pointer] = a[aPointer];
                aPointer++;
            } else if (a[aPointer] >= b[bPointer]) { //wert von a ist größer/gleich
                merged[pointer] = b[bPointer];
                bPointer++;
            }
            pointer++; // nächste pos in merged
        }
        return merged;
    }
}
