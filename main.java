import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        double a,b; double temp=0,temp2=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz : ");
        a = inp.nextInt();
        for(int i=1; i<=a; i++) {
            System.out.print("Bir sayi giriniz : ");
            b = inp.nextInt();
            if (b >= temp) {
                temp = b;
            }else if(b<=temp) {
                temp2=b;
            }
        }
         System.out.println("En buyuk sayi : " + temp);
         System.out.print("En kucuk sayi : " + temp2);

    }
}

