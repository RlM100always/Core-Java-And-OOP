package SORTING;

import java.util.Scanner;

public class InsertionSortFunc {

    public static void InsertionSort(int arr[],int size){
        //comparison based //o(n^n)//In palace sorting algorithm
        //space complexity->o(1)
        //2 5 1 1 5 89
   //sorted //unsorted
          for(int i=1 ;i<size ;i++){
              int hole =arr[i];
              int j=i-1 ;
              while(j>=0 && arr[j]>hole){
                  arr[j+1]=arr[j];//shifting 1 unit
                  j--;
              }
              arr[j+1]=hole ;

          }
    }

    public static void print(int arr[],int size){
        System.out.println("After Insertion Sorting :");
        for(int i=0 ;i<size ;i++){
            System.out.print(arr[i]+" ");
        }
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
        InsertionSort(arr,size);
        print(arr,size);
    }
}
