package SORTING;

import java.util.Scanner;

public class SelectionSort {

    public static void SelectionMethod(int arr[],int size){
        //4 5 1 2 9
        for(int i=0 ;i<size ;i++){
            int min_index =i ;
            for(int j=i+1;j<size ;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j ;
                }
            }
            int temp =arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;

        }

    }

    public static void print(int arr[],int size){

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
        SelectionSort.SelectionMethod(arr,size);
        SelectionSort.print(arr,size);
    }
}
