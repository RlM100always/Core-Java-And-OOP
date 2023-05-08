package SORTING;

import java.util.Scanner;

public class BubbleSort {

    public static void BubblesortMethod(int arr[],int size){
        //o(n^n)//comparison based//in place sorting algorithm
        //2 4 1 7 -4 5
        int i=0,j=0 ;
        for(i=0 ;i<=size-2;i++){
            for(j=0 ;j<=size-2-i ;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
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

        BubblesortMethod(arr,size);

        print(arr,size);


    }
}
