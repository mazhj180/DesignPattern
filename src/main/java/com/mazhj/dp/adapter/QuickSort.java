package com.mazhj.dp.adapter;

public class QuickSort {
    /**
     * 快排入口函数
     * @param array
     * @return
     */
    public int[] quickSort(int array[]){
        sort(array,0,array.length - 1);
        return array;
    }

    /**
     * 递归函数
     * @param array
     * @param p
     * @param r
     */
    private void sort(int[] array,int p,int r){
        if (p < r){
            int pivot = this.partition(array,p,r);
            sort(array,p,pivot-1);
            sort(array,pivot+1,r);
        }
    }

    /**
     * 真正的排序算法函数
     * @param array
     * @param p
     * @param r
     * @return
     */
    private int partition(int[] array,int p,int r){

        int left = p;
        int right = r;

        int standard = array[left];

        while(left < right){
            while (standard <= array[right] && left < right){
                right--;
            }
            while (standard >= array[left] && left < right){
                left++;
            }
            if (left < right)
                this.swap(array,left,right);
        }
        this.swap(array,p,left);

        return left;

    }

    /**
     * 值交换函数
     * @param array
     * @param i
     * @param j
     */
    private void swap(int[] array,int i,int j){
        int tem;
        tem = array[i];
        array[i] = array[j];
        array[j] = tem;
    }

}
