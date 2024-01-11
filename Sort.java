package sort;

import Tree.tree.heap.MaxHeap;
import Tree.tree.heap.MinHeap;

public class Sort {

        static void bubbleSort(int[] array){
            int n = array.length;
            int temp=0;
            for (int i=0;i<n;i++){
                for (int j=n-1;j>i;j--){
                    if (array[j-1] > array[j]){
                        temp = array[j-1];
                        array[j-1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        static void bubbleSortL(int A[]){
            for(int i=A.length-1;i>0;i--){
                for(int j=0;j<i;j++){
                    if (A[j]>A[j+1]){
                        int temp = A[j];
                        A[j] = A[j+1];
                        A[j+1]=temp;
                    }
                }
            }
        }
        static void insertion(int a[]){
            int j , k;
            for(int i=1;i<a.length;i++){
                j=i-1;
                k = a[i];
                while( j>=0 && a[j]>k ){
                    a[j+1]=a[j];
                    j--;
                }
                a[j+1]=k;
            }
        }

        static void selectionSort(int a[]){
            int min;
            for(int i=0;i< a.length;i++){
                min = a[i];
                for(int j=i+1;j<a.length;j++){
                    if(min>a[j]){
                        int temp = a[j];
                        a[j]= min;
                        min = temp;
                    }
                    a[i]=min;
                }
            }
        }
        static void quickSort(int a[] , int low , int high){
            int j;
            if(low<high){
                j = partition(a , low  , high);
                quickSort(a,low , j-1);
                quickSort(a,j+1,high);
            }
        }
        static int partition(int a[] , int low , int high){
            int i , j , pivot;
            pivot = a[low];
            i = low+1;
            j=high;
            while(i<j){
                while(i<j && a[i]<=pivot){
                    i++;
                }
                while( a[j]>pivot){
                    j--;
                }
                if(i<j){
                   int temp = a[j];
                   a[j]=a[i];
                   a[i] = temp;

                }

            }
            if(pivot>a[j]) {
                int temp = a[low];
                a[low] = a[j];
                a[j] = temp;
            }
            return j;
        }

        static void mHeapSort(int a[]){
            int i;
    MaxHeap maxHeap = new MaxHeap(100);
            for(i=0;i<a.length;i++){
                maxHeap.add_max_heap(a[i]);
            }
            for (i=a.length-1;i>=0;i--){
                a[i] = maxHeap.delete_max_heap();
            }
    }
        static void minHeapSort(int a[]){
        int i;
        MinHeap minHeap = new MinHeap(100);
        for(i=0;i<a.length;i++){
            minHeap.add_min_heap(a[i]);
        }
        for (i=0;i<a.length;i++){
            a[i] = minHeap.delete_min_heap();
        }
    }

    static void mergeSort(int a[] , int low , int high){
            if(low<high){
                int mid = (low+high)/2;
                mergeSort(a,low,mid);
                mergeSort(a,mid+1,high);
                merge(a,low,high);
            }
    }
    static void merge(int a[] , int low , int high){
            int b[],i=0,j=0,k=0,mid;
            mid = (high+low)/2;
            i=low;
            j=mid+1;
            b = new int[high-low+1];
            while(i<=mid && j<=high){
                if(a[i]<=a[j]){
                    b[k++] = a[i++];
                }
                else {
                    b[k++]=a[j++];
                }
            }
            if(i>mid){
                for(;j<=high;j++){
                    b[k++]=a[j];
                }
            }
            else if (j>high){
                for(;i<=mid;i++){
                    b[k++]=a[i];
                }
            }
            for(i=low,j=0;i<=high;i++,j++){
                a[i] = b[j];
            }
    }


    public static void main(String[] args) {

    int []arr = {14,7,23,42,54,9,8};
        System.out.println("Array Before Sort:");
        for (int i =0 ; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
//        bubbleSortL(arr);
//        System.out.println("Array After Bubble Sort:");
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }

//        insertion(arr);
//        System.out.println("Array After Insertion Sort:");
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }

//        selectionSort(arr);
//        System.out.println(" \n"+"Array After Selection Sort:");
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }


//        quickSort(arr , 0 , arr.length-1);
//        System.out.println(" \n"+"Array After Quick Sort:");
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }

//        mHeapSort(arr);
//        System.out.println(" \n"+"Array After MaxHeap Sort:");
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }

//        minHeapSort(arr);
//        System.out.println(" \n"+"Array After MinHeap Sort:");
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
//        mergeSort(arr,0, arr.length-1);
//        System.out.println(" \n"+"Array After Merge Sort:");
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }


    }
}
