package Mavzu4;

import java.util.Scanner;

public class Misol1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Son kiriitng :");
        int x=sc.nextInt();
        if (x>0){
            x+=1;
            System.out.println(" Naitja : "+x);
        }else System.out.println(" Natija : "+x);
    }
}
