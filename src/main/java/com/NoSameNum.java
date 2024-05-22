package com;

import java.util.ArrayList;
import java.util.HashSet;

public class NoSameNum {
    public static void main(String[] args) {

    int[] answer = {};

    int [] arr1 = {1,1,3,3,0,1,1,2};
    int [] arr2 = {4,4,4,3,3};

    ArrayList<Integer> al = new ArrayList<>();

    for(int i = 1; i < arr1.length; i++){
        if(i == arr1.length-1) {
            al.add(arr1[i]);
            break;
        }
        if(arr1[i] != arr1[i-1]){
            al.add(arr1[i-1]);
            }
        }


        System.out.println(arr1.length);
        System.out.println(al);



    }


}
