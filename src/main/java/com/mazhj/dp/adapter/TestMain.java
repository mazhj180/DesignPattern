package com.mazhj.dp.adapter;

public class TestMain {
    public static void main(String[] args) {
//        int[] ints = new QuickSort().quickSort(new int[]{1, 5, 2, 7, 2, 3, 2, 9, 5});
//        System.out.println(3 >>> 1);
//        System.out.println(new BinarySearch().binarySearch(new int[]{1, 5, 2, 7, 2, 3, 2, 9, 5}, 9));
        OperationAdapter adapter = new OperationAdapter(new QuickSort(), new BinarySearch());
        int[] ints = adapter.sort(new int[]{1, 5, 2, 7, 2, 3, 2, 9, 5});
        for (int i :
                ints) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("key=9的下标是："+adapter.search(ints, 9));
    }
}
