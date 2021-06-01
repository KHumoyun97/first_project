package Mavzu4;

import java.util.Scanner;

public class Misol4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Uchta son kiriting  :");
        int x=sc.nextInt();
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        if ( x>0&&x1<0&&x2<0){
            System.out.println(" Bittasi mustabt son!!!");
        }else  if ( x>0&&x1>0&&x2<0){
            System.out.println(" Ikkitasi mustabt son!!!");
        }else  if ( x>0&&x1>0&&x2>0){
            System.out.println(" Uchtasi mustabt son!!!");
        }
}
}
