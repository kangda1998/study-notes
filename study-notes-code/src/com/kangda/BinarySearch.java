package com.kangda;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int binarySearch = binarySearch(arr, 5);
        System.out.println(binarySearch);
    }
    /**
     * 二分处理
     * @param a
     * @param b
     */
    private static int binarySearch(int[] a, int b) {
        if (a.length==0){
            return  -1;
        }
        int left = 0;
        int right = a.length;
//        取length 然后退出条件时left=right
        while (left < right){
            int mid = (left+right)>>>1;
            int midVal = a[mid];
            if (b > midVal){
                //目标值比中位值大的话，舍弃中位值和中位值左边的
                left = mid+1;
            }
            else {
                right = mid;
            }
        }
//如果找到的话返回，找不到返回-1
        return a[left] == b ? left : -1;
    }
}
