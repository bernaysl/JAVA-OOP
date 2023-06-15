
//belirtilen bir karakterin tekrarı


package Odev61;
import java.util.Scanner;

public class Odev61 {
	public static int sayisi(String str, char karakter) {
		
        int tekrarlanma_sayisi = 0;
        
        for (int i = 0; i < str.length(); i++) { //kelimenin icindeki harfleri sayiyoruz
        	
            if (str.charAt(i) == karakter) {
            	tekrarlanma_sayisi++;
            }
        }
        return tekrarlanma_sayisi;
    }

    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in); 

        System.out.print("Bir kelime giriniz: ");
        String kelime = input.nextLine();

        System.out.print("Hangi tekrarlanan harfi görmek istiyorsunuz?: ");
        char karakter = input.nextLine().charAt(0);

        int tekrarlanma_sayisi = sayisi( kelime, karakter);
        System.out.println("Karakter " + karakter + " bu kelimenin içinde " + tekrarlanma_sayisi + " kez tekrarlanmistir.");
    }
}
