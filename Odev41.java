//Klavyeden pozitif tamsayılar okuyan ve pozitif olmayan bir tamsayı okuduğunda sona eren bir döngü içeren bir program yazınız.
//Döngü sona erdikten sonra, okunan tüm çift tamsayıların toplamı, okunan tüm tek tamsayıların toplamı, okunan çift tamsayıların sayısı ve okunan tek tamsayıların sayısını, en az bir boşlukla, yazdırır. 

 

package Odev41;
import java.util.Scanner;
public class Odev41 {
	public static void Main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("bir sayi giriniz: " );

		
        int cift_sayi = 0;
        int tek_sayi = 0;
        int cift_toplam = 0;
        int tek_toplam = 0;
        int sayi;

        do {
            sayi = scanner.nextInt();
            if (sayi > 0) {
            	
                if (sayi % 2 == 0){
                    cift_sayi += sayi;
                    cift_toplam++;
                } 
                else {
                    tek_sayi += sayi;
                    tek_toplam++;
                }
            }
        } while (sayi > 0);

        System.out.println("çift sayilarin sayisi: " +cift_sayi);
        System.out.println("tek sayilarin sayisi: " + tek_sayi);
        System.out.println("çift sayilarin toplami: " +cift_toplam);
        System.out.println("tek sayilarin sayisi: " + tek_toplam);
        
    }
	
	
}
