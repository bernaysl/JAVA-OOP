//en büyük satır ve sütun

package Odev53;
import java.util.Random; //rastgele sayi üretmek için
public class Odev53 {
	public static void main(String[] args) {
		
        //matris oluşturma
        int[][] matris = new int[5][5];
        Random rastgele = new Random();
        
        // rastgele 0 ve 1ler ata
        for (int i = 0; i < matris.length; i++) {
        	
            for (int j = 0; j < matris[i].length; j++) {
            	
                matris[i][j] = rastgele.nextInt(2); //0 ve1 arasında olması icin
            }
        }
        
        // matrisi yazdır
        System.out.println("Matris: ");
        for (int i = 0; i < matris.length; i++) {
        	
            for (int j = 0; j < matris[i].length; j++) {
            	
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        
 
        int en_buyuk = 0;
        int satirda_en_buyuk = -1;
        int sutunda_en_buyuk = -1;
        
        for (int i = 0; i < matris.length; i++) {
        	
            int satir = 0;
            int sutun = 0;
            
            for (int j = 0; j < matris[i].length; j++) {
            	
                if (matris[i][j] == 1) {
                	satir++;
                }
                
                if (matris[j][i] == 1) {
                	sutun++;
                }
            }
            
            if (satir > en_buyuk) {
            	en_buyuk = satir;
            	satirda_en_buyuk = i;
            }
            
            if (sutun > en_buyuk) {
            	en_buyuk = sutun;
            	sutunda_en_buyuk = i;
            }
            
        }
        
     
        System.out.println("en çok 1'lerin bulunduğu ilk satır: " + (satirda_en_buyuk+1));
        System.out.println("en çok 1'lerin bulunduğu ilk sütun: " + (sutunda_en_buyuk+1));
    }
}
