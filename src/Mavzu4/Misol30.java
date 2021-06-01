package Mavzu4;

import java.util.Scanner;

public class Misol30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Son kiritign :");
        int x=sc.nextInt();
        if (x>=100&&x%2==0){
            System.out.println(" Uch xonali juft son");
        }else if (x>=100&&x%2!=0){
            System.out.println(" Uch xonali toq son");
        }else if (x<100&&x%2==0){
            System.out.println(" Ikki xonali juft son");
        }else if (x<100&&x%2!=0){
            System.out.println(" ikki xonali toq son");
        }

    }
}
