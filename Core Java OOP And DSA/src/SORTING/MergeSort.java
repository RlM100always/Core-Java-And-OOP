package SORTING;

import java.util.Scanner;

public class MergeSort {

    public void merge(int []arr ,int l ,int mid ,int r ){
        //compariosn baesd //time complexity->o(n*log(n))n->size of the array
        //Not in place //sc->o(n)
        //divide and conquer
        //recursive call
        int count =0 ;int []temp;
         temp=new int[r-l+1];

        int i=l ,j=mid+1  ;
        //merge two sorted array

        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                temp[count]=arr[i];
                i++ ;count++ ;
            }else{
                temp[count]=arr[j];
                j++;count++ ;
            }
        }
        while(i<=mid ){
                temp[count]=arr[i];
                i++ ;count++ ;

        }
        while(j<=r ){
            temp[count]=arr[j];
            j++ ;count++ ;
        }

        //copy temp array value to the main array
       // System.out.println("l ="+l+" r= "+r);

        for(int n=l ;n<=r ;n++){
            arr[n]=temp[n-l];
        }


    }

    static void  mergeSort(int arr[] ,int l ,int r){
         var obj = new MergeSort();
         int mid ;
         if(l<r) {

             mid = l + (r - l) / 2;
             //System.out.print("Yes ");
             mergeSort(arr, l, mid);

             //System.out.print("No ");
             mergeSort(arr, mid + 1, r);

             //System.out.println("Good ");
             //System.out.println("l ="+l+" mid ="+mid+" r= "+r);
             obj.merge(arr, l, mid, r);
         }

    }

    void printArray(int arr[],int size){
        for(int i=0 ;i<size ;i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size of the Array : ");
        int size = input.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter the array : ");
        for(int i=0 ;i<size ;i++){
            arr[i]= input.nextInt();
        }
        mergeSort(arr,0,size-1);
        var obj = new MergeSort();
        obj.printArray(arr,size);

//        for(int i=0 ;i<size ;i++){
//            System.out.print(arr[i]+" ");
//        }


    }
}
