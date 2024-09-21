package com.company;

public class PrintStartAndEndIndicesOfSubArrayLengthK {

    public static void main(String[] args) {

        int[] A ={3,4,7,2,8};

        int k =3;

        int i=0;
        int end = k-1;

        while(end< A.length)  {
            System.out.println(i + " " + end);
            i++;
            end++;
        }
    }
}
