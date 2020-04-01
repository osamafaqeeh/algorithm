package com.osama.proplem;

public class MergeSort {
    int[]array;
    int[]tempArray;
    public static void main(String[] args) {
        int []arr={1,50,30,10,40,80};
        System.out.println("before sorting");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\t");
           MergeSort c =  new MergeSort();
           c.prepareForSort(arr);
            c.doMargeSort(0,arr.length-1);
            System.out.println(arr.toString());
        }
    }
    void prepareForSort(int[]arr){
        //prepare for sort
        this.array=arr;
        this.tempArray=new int[arr.length];

    }

    //divide to small problem
    void doMargeSort(int lowerIndex,int higherIndex){

        if (lowerIndex<higherIndex){
        int middle=lowerIndex+(higherIndex-lowerIndex)/2;
        doMargeSort(lowerIndex,middle);
        doMargeSort(middle+1,higherIndex);
        MargePart(lowerIndex,middle,higherIndex);

        }
    }
     void MargePart(int lowerIndex,int middle,int higherIndex){
        for (int i=lowerIndex;i<=higherIndex;i++){
            tempArray[i]=array[i];
        }
            int i=lowerIndex;
            int h=middle+1;
            int k=lowerIndex;
            while (i<=middle && h<=higherIndex) {
                if (tempArray[i]<=tempArray[h]){
                    array[k]=tempArray[i];
                    i++;
                }
                else {
                    array[k]=tempArray[h];
                    h++;
                }
                k++;
            }
            while (i<=middle){
                array[k]=tempArray[i];
                i++;
                k++;
            }
            while (h<=higherIndex){
                array[k]=tempArray[h];
                h++;
                k++;
            }

        }
     }

