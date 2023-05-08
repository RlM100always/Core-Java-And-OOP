package SORTING;

import java.util.Scanner;

public class CountingSortClass {

    static Scanner myScanner = new Scanner(System.in);

    public static int getMax(int []arr,int size){
        int Max = arr[0];
        for (int i=0 ;i<size ;i++){
            if(arr[i]>Max)Max=arr[i];
        }
        return Max ;
    }
    //for positive number
    //4 65 9 7 34
    //count array[size->65]->declare 0 every index value
    //non compariosn based sorting algorithm
    //TC->(o(n+k))
    //SC->o(n+k)
    //not inplace sorting algorithm

    //0 1 2 3 4 5 6
    //1 5 2 2 4 6 6

    //  output[--count[arr[5]]]=arr[5]
    //output[--count[arr[i]]]=arr[i];

    //count[6] =count[6]-1=7-1=>6
    //count[6]=6->5

    //0 1 2 3 4 5 6
    //            6

    //0 1 2 3 4 5 6//count->ind(main value)
    //0 0 0 0 0 0 0
    //0 1 2 0 1 1 2
    //0 1 3 3 4 5 7->count_value->(Main ind)


    public static void toCountSort(int arr[],int size){
        int Max=getMax(arr,size)+1;
      //  int siz=size;

        int countArray[]=new int[Max];
        int outputArray[]=new int[size];

        int i;

        for( i=0 ;i<Max;i++)countArray[i]=0;
        for(i=0 ;i<size ;i++)countArray[arr[i]]++;
        for(i=1 ;i<Max ;i++)countArray[i]=countArray[i]+countArray[i-1];
        for(i=size-1 ;i>=0 ;i--){
            countArray[arr[i]]=countArray[arr[i]]-1;
            outputArray[countArray[arr[i]]]=arr[i];
        }


        prln("Ouput Sorted Array : ");
        for (i=0 ;i<size;i++)pr(outputArray[i]);
    }

    public static void main(String[] args) {
        pr("Enter the Size of the Array : ");
        int size = myScanner.nextInt();
        pr("Enter Input  the Array : ");
        int inputArray[]=new int[size];


        for(int i=0 ;i<size;i++){
            inputArray[i]= myScanner.nextInt();
        }
        toCountSort(inputArray,size);


    }

    public static void prln(Object anyObject){
        System.out.println(anyObject);
    }

    public static void pr(Object obj){
        System.out.print(obj+" ");
    }
}
