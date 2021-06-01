package mavzu5;

import java.util.Scanner;

public class Misol6 {
    public static void main(String[] args) {
        Scanner ssc=new Scanner(System.in);
        System.out.println(" Son kiritng :");
       double x=ssc.nextDouble();
       switch ((int) x){
           case 1:
               System.out.println(" Natija : "+( x*100));break;

           case 2:
               System.out.println(" Natija : "+( x/1000));break;

           case 3:
               System.out.println(" Natija : "+( x));break;

           case 4:
               System.out.println(" Natija : "+( x*1000));break;

           case 5:
               System.out.println(" Natija : "+( x*10));break;
       }
    }
}
