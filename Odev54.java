//adam asmaca oyunu

package Odev54;
import java.util.Random;
import java.util.Scanner;
public class Odev54 {
	 public static void main(String[] args) {
		 
	        String[] kelimeler = {"dolap", "kıyafet", "ayakkabı", "çanta", "pembe"};
	        
	        Random rastgele = new Random();
	        Scanner scanner = new Scanner(System.in);
	        boolean devam = true; //oyundaki baska kelimeyle devam etme secenegi

	        while (devam) {
	        	
	            String kelime = kelimeler[rastgele.nextInt(kelimeler.length)];
	            int kalanHak = kelime.length();
	            
	            StringBuilder gosterim = new StringBuilder();
	            
	            
	            for (int i = 0; i < kelime.length(); i++) {
	                gosterim.append("*");
	            }

	            
	            while (kalanHak > 0) {
	            	
	                System.out.println("Kelime: " + gosterim);
	                System.out.print("Bir harf tahmin edin: ");
	                
	                String tahmin = scanner.nextLine();
	                boolean dogruTahmin = false;
	                
	                for (int i = 0; i < kelime.length(); i++) { //burada kontrol saglıyoruz
	                	
	                    if (kelime.charAt(i) == tahmin.charAt(0)) {
	                    	
	                        gosterim.setCharAt(i, tahmin.charAt(0));
	                        kalanHak--;
	                        dogruTahmin = true;
	                    }
	                    
	                }
	                
	                if (!dogruTahmin) {
	                    System.out.println("Yanlış tahminde bulundunuz. Kalan hak: " + (--kalanHak));
	                }
	                
	                if (kalanHak == 0) {
	                    System.out.println("Tebrikler kelimeyi doğru tahmin ettiniz. :)");
	                }
	            }

	            System.out.print("Başka bir kelimeyle devam etmek ister misiniz? (E/H): ");
	            String cevap = scanner.nextLine();
	            
	            if (cevap.equalsIgnoreCase("H")) {
	                devam = false;
	            }
	        }
	    }
}
