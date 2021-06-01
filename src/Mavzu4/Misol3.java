package Mavzu4;

import java.util.Scanner;

public class Misol3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" son kiriting : ");
        int x=sc.nextInt();
        if (x>0){
            x+=1;
            System.out.println(" Natija : "+x);
        }else if (x==0){
            x+=10;
            System.out.println(" Natija : "+x);
        }else if (x<0){
            x-=2;
            System.out.println("Naitja : "+x);
        }
    }
}
