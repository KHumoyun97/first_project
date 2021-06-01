package mavzu5;

import java.util.Scanner;

public class Misol4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" 1 da 7 gacha son kiriting :");
        int x=sc.nextInt();
        switch (x){
            case 1:
                System.out.println(" Yanvar 31 kun");break;
            case 2:
                System.out.println("Fevral 28 kun");break;
            case 3:
                System.out.println(" Mart 31 kun");break;
            case 4:
                System.out.println(" Aprel 30 kun");break;
            case 5:
                System.out.println(" May 31 kun");break;
            case 6:
                System.out.println(" Iyun 31 kun");break;
            case 7:
                System.out.println(" Iyul 31 kun");break;
            case 8:
                System.out.println(" Avgust 31 kun");break;
            case 9:
                System.out.println(" Sentyabr 30 kun");break;
            case 10:
                System.out.println(" Oktyabr 31 kun");break;
            case 11:
                System.out.println(" Noyabr 30 kun");break;
            case 12:
                System.out.println(" Dekabr 31 kun");break;
            default:
                System.out.println(" Notugri raqam kiritldi : ");
        }
    }
}
