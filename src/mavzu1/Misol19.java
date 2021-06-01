package mavzu1;

import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;

public class Misol19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" x1 ni kiriting :");
        int x1=sc.nextInt();
        System.out.println(" x2 ni kiriting :");
        int x2=sc.nextInt();
        System.out.println(" y1 ni kiriting :");
        int y1=sc.nextInt();
        System.out.println(" y2 ni kiriting :");
        int y2=sc.nextInt();
        System.out.println(" Osidagi masofa : "+ Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
    }
}
