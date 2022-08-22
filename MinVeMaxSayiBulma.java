import java.util.Scanner;

public class MinVeMaxSayiBulma {
    public static void main(String[] args) {
        int sayiAdet, i = 1;
        int sayi;
        int minSayi=1, maxSayi=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Kac Tane Sayi Gireceksiniz: ");
        sayiAdet = input.nextInt();

        while (i <= sayiAdet) {
            System.out.print(i + ".Sayiyi Giriniz: ");
            sayi = input.nextInt();

                if (i==1){
                    minSayi=sayi;
                    maxSayi=sayi;
                }
                if (sayi < minSayi) {
                    minSayi = sayi;

                }
                if (sayi > maxSayi) {
                    maxSayi = sayi;

                }
            i++;
            }
        System.out.println("En Kuyuk Sayi: " + minSayi);
        System.out.println("En Buyuk Sayi: " + maxSayi);
        }
    }


/*Java ile klavyeden girilen N tane sayma sayısından
en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
 */


