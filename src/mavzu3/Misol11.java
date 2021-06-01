package mavzu3;

import java.util.Scanner;

public class Misol11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" A soni kiritig :");
        int a=sc.nextInt();
        System.out.println(" B soni kriting :");
        int b=sc.nextInt();
        //Natija: A<B
        if (a%2!=0&&b%2!=0){
            System.out.println(" Son togri kirtilgan !!!!");
        }else if (a%2==0&&b%2==0) {
            System.out.println(" Sonlar notugri kiritilgan!!");
        }
    }
}
