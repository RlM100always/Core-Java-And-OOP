package SORTING;

import java.util.Scanner;

public class RadixSort {

    static Scanner myScanner = new Scanner(System.in);

    public static int getMax(int []arr,int size){
        int Max = arr[0];
        for (int i=0 ;i<size ;i++){
            if(arr[i]>Max)Max=arr[i];
        }
        return Max ;
    }

    public static void toCountSort(int arr[],int size,int pos){
    
        //  int siz=size;
        int countArray[]=new int[10];
        int outputArray[]=new int[size];
        int i;
        //12 345 2 3 34
        //2 5 2 3 4
        for( i=0 ;i<10;i++)countArray[i]=0;
        for(i=0 ;i<size ;i++)countArray[arr[i]%pos]++;
        for(i=1 ;i<10 ;i++)countArray[i]=countArray[i]+countArray[i-1];
        for(i=size-1 ;i>=0 ;i--){
            countArray[arr[i]]=countArray[arr[i]]-1;
            outputArray[countArray[arr[i]]]=arr[i];
        }

        prln("Ouput Sorted Array : ");
        for (i=0 ;i<size;i++)pr(outputArray[i]);
    }
    

    public static void radixSort(int []arr ,int size){
        int Max=getMax(arr,size)+1;
        //5 6 782
        for(int pos=1 ;Max/pos>0 ; pos*=10  ){ //1->728//10->72//100->7//1000->0
            toCountSort(arr,size,pos);
        }
    }
    
    
    public static void main(String[] args) {
        pr("Enter the Size of the Array : ");
        int size = myScanner.nextInt();
        pr("Enter Input  the Array : ");
        int inputArray[]=new int[size];


        for(int i=0 ;i<size;i++){
            inputArray[i]= myScanner.nextInt();
        }
    }


    public static void prln(Object anyObject){
        System.out.println(anyObject);
    }


    public static void pr(Object obj){
        System.out.print(obj+" ");
    }
}
