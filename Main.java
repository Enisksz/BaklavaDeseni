package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n,i,j,k;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        n = input.nextInt();

        for (i=0;i<=n;i++){
            for (j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for (k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(i=n;i>0;i--){

            for(j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for (k=n-1;k<=2*i+1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
