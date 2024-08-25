package Interfaces;

public class MergeSort implements Sortable{
    @Override
    public void sort(int[] arr) {
        mergeSort(arr,0,arr.length-1);
    }
    private static void mergeSort(int[] arr,int l,int r) {
        if(l<r){
            int m=(l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }

    }

    private static void merge(int[] arr, int l, int m, int r) {
        int n1=m-l+1;
        int n2=r-m;

        int[] a1=new int[n1];
        int[] a2=new int[n2];
        for (int i=0;i<a1.length;i++){
            a1[i]=arr[l+i];
        }
        for (int i=0;i<a2.length;i++){
            a2[i]=arr[m+1+i];
        }
        int i=0,j=0,k=l;
        while (i<a1.length&&j<a2.length){
            if(a1[i]<a2[j])
                arr[k++]=a1[i++];
            else
                arr[k++]=a2[j++];
        }

        while (i<a1.length) {
            arr[k++] = a1[i++];
        }
        while (j<a2.length){
            arr[k++]=a2[j++];
        }

    }
}
