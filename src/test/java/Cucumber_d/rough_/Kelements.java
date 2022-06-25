package Cucumber_d.rough_;

import java.util.ArrayList;
import java.util.Arrays;

public class Kelements {
    public static void main(String[] args) {

    }

    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k) {
        // code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        int temp=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        Arrays.sort(arr);
        int count=0;
        int start=arr.length-1;
        while(count<k){
            al.add(arr[start]);
            count++;
            start--;

        }
        return al;
    }
}


