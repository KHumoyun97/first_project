package mavzu3;

import java.util.Scanner;

public class Misol26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" x ni kiriting :");
        int x=sc.nextInt();
        System.out.println(" y ni kiriting :");
        int y=sc.nextInt();
        if (x<0&&y<0){
            System.out.println(" Tortinchi choragida : "+x+" "+y);
        }else System.out.println(false);
    }
}
