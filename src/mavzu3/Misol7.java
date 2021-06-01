package mavzu3;

import java.util.Scanner;

public class Misol7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" A soni kiritig :");
        int a=sc.nextInt();
        System.out.println(" B soni kriting :");
        int b=sc.nextInt();
        System.out.println(" C soni kriting :");
        int c=sc.nextInt();
        //Natija: A<B<C
        if (a<b&&b<c){
            System.out.println(" Natija :"+a);
        }else System.out.println(" Son notugri kiritilgan!!");

    }
}
