package mavzu3;

import java.util.Scanner;

public class misol5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" A soni kiritig :");
        int a=sc.nextInt();
        System.out.println(" B soni kriting :");
        int b=sc.nextInt();
        if (a>=0){
            System.out.println(" Natija :"+a);
        }else System.out.println(" A soni 0 ga teng yoki past son!!");
        if (b<-2){
            System.out.println(" Naitja : "+b);
        }
        System.out.println(" B soni -2 dan kichik son!!!");

    }
}
