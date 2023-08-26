import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("İlk sayıyı gir: ");
        int sayi1 = take.nextInt();
        System.out.println("Ikinci sayıyı gir: ");
        int sayi2 = take.nextInt();
        int i1 = 1,i2=1;
        int ebob=1;
        int ekok=1;
        while (i1<=sayi1 && i1<= sayi2)
        {
            if (sayi1%i1==0 & sayi2%i1==0)
            {
                ebob=i1;
            }
            i1++;
        }
        ekok = sayi1*sayi2/(ebob);
        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);
    }
}
