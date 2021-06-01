package mavzu3;

import java.util.Scanner;

public class Misol13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" A ni kiritng :");
        int a=sc.nextInt();
        System.out.println(" B ni kiritng :");
        int b=sc.nextInt();
        System.out.println(" C ni kiritng :");
        int c=sc.nextInt();
        if (a%2==0||b%2==0||c%2==0){
            System.out.println(true);
        }else System.out.println(false);
    }
}
