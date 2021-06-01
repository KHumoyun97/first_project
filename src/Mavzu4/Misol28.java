package Mavzu4;

import java.util.Scanner;

public class Misol28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Yilni kiriting :");
        int x=sc.nextInt();
        if ((2020-x)%2==0){
            System.out.println(" Bu yil Kabisa yili "+x);
        }else System.out.println(" Kabisa yili emas !!!");
    }
}
