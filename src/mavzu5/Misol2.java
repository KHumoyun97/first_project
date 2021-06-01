package mavzu5;

import java.util.Scanner;

public class Misol2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" 1 da 5 gacha son kiriting :");
        int x=sc.nextInt();
        switch (x){
            case 1:
                System.out.println(" Yomon");break;
            case 2:
                System.out.println(" Qoniqarsiz");break;
            case 3:
                System.out.println(" Qoniqarli");break;
            case 4:
                System.out.println(" Yaxshi");break;
            case 5:
                System.out.println(" A'lo");break;
           default:        System.out.println(" Notugri raqam kiritldi : ");
        }
    }
}
