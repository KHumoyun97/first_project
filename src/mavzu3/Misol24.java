package mavzu3;

import java.util.Scanner;

public class Misol24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" 1-sonni kiriting !!!");
        int a=sc.nextInt();
        System.out.println(" 2-sonni kiriting !!!");
        int b=sc.nextInt();
        System.out.println(" 3-sonni kiriting !!!");
        int c=sc.nextInt();
        int d=b*b-4*a*c;
        int x1=(int) (-1*b+Math.sqrt(d))/2*a;
        int x2= (int) ((-1*b-Math.sqrt(d))/2*a);
        if (x1>0){
            System.out.println(x1+" "+true);
        }else if (x2>0){
            System.out.println(x2+" " +true);
        }else System.out.println(false);


    }
}
