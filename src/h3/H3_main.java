package h3;

import java.util.Arrays;

public class H3_main {
    public static void main(String[] args){
        int[] sortThis = new int[]{4,7,9};
        System.out.println(Arrays.toString(mergeSort(sortThis)));
    }

    public static int[] mergeSort(int[] array){
        //is sorted?
        if (array.length <= 1) return array;
        int rLen = array.length /2;
        int lLen = array.length - rLen;
        int[] left = Arrays.copyOfRange(array, 0, lLen-1);
        int[] right = Arrays.copyOfRange(array, lLen, rLen - 1);
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left,right);
    }

    public static int[] merge(int[] a, int[] b){
        return null;
    }
}
