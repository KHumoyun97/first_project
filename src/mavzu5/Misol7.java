package mavzu5;

import com.sun.jmx.snmp.internal.SnmpSecurityCache;

import java.util.Scanner;

public class Misol7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Sonni kiriting : ");
        double x=sc.nextDouble();
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
