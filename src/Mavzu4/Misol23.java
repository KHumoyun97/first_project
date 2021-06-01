package Mavzu4;

import java.util.Scanner;

public class Misol23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" To'gri tortburchak 1 tomoni :");
        int a=sc.nextInt();
        System.out.println(" To'gri tortburchak 2 tomoni :");
        int b=sc.nextInt();
        System.out.println(" To'gri tortburchak 3 tomoni :");
        int c=sc.nextInt();
        if (a==b){
            System.out.println(" Togri tortburchakning 4-tomoni "+c+" teng :");
        }else if (a==c){
            System.out.println(" Togri tortburchakning 4-tomoni "+b+" teng :");
        }else if (c==b){
            System.out.println(" Togri tortburchakning 4-tomoni "+a+" teng :");
        }
    }
}
