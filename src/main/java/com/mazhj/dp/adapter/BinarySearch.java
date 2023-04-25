package com.mazhj.dp.adapter;

import java.util.Arrays;

public class BinarySearch {
    /**
     * 二分查找
     * @param array
     * @param key
     * @return 返回 key 所在的下标
     */
    public int binarySearch(int[] array,int key){
        //保证数组是有序的
        Arrays.sort(array);

        int head = 0;
        int end = array.length - 1;
        int middle = 0;

        if (key < array[head] || key > array[end] )
            return -1;

        while (head <= end){
            middle = (head + end) >>> 1;

            if (key < array[middle]){
                end = middle - 1;
            }else if (key > array[middle]){
                head = middle + 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
