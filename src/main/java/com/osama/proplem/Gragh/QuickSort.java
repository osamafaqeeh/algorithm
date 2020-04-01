package com.osama.proplem.Gragh;

public class QuickSort {
    int arr[]=new int[5];
    public static void main(String[] args) {

    }

    public int partition(int l,int h){
        int pivot=arr[l];
        while (h>l) {
            while (arr[l] < pivot) {
                l++;
            }
            while (arr[h] > pivot) {
                h++;
            }
            if (h > l) {
                this.swap(l, h);
            }
        }
        swap(arr[l],arr[h]);
        return h;

    }
    public void swap(int index1,int index2){
        int temp =arr[index2];
        arr[index2]=arr[index1];
        arr[index1]=temp;
    }
    public void QuickSort(int l,int h){
       if(h>l){
         int j=  this.partition(l,h);
           QuickSort(l,j);
           QuickSort(j+1,h);
       }
    }
}
