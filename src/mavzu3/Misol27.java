package mavzu3;

import java.util.Scanner;

public class Misol27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" x ni kiriting :");
        int x=sc.nextInt();
        System.out.println(" y ni kiriting :");
        int y=sc.nextInt();
        if (x<0&&y<0){
            System.out.println(" Uchinchi choragida : "+x+" "+y);
        }else if (x>0&&y>0){
            System.out.println(" Ikkinchi choragida : "+x+" "+y);
        }else System.out.println(false);
    }
}
