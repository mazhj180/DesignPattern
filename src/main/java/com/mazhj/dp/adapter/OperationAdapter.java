package com.mazhj.dp.adapter;

public class OperationAdapter implements DataOperation{
    private QuickSort sortObj;
    private BinarySearch searchObj;

    public OperationAdapter(QuickSort sortObj, BinarySearch searchObj) {
        this.sortObj = sortObj;
        this.searchObj = searchObj;
    }

    @Override
    public int[] sort(int[] array) {
        return sortObj.quickSort(array);
    }

    @Override
    public int search(int[] array,int key) {
        return searchObj.binarySearch(array,key);
    }
}
