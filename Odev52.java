//çalışanların haftalık saatleri
package Odev52;

public class Odev52 {
	 public static void main(String[] args) {
	        int[][] calismaSaatleri = {{2,4,3,4,5,8,8},
	                                   {7,3,4,3,3,4,4},
	                                   {3,3,4,3,3,2,2},
	                                   {9,3,4,7,3,4,1},
	                                   {3,5,4,3,6,3,8},
	                                   {3,4,4,6,3,4,4},
	                                   {6,3,5,9,2,7,9}};
	        
	        int[] toplamSaatler = new int[calismaSaatleri.length];
	        
	        double[] ortalamaSaatler = new double[calismaSaatleri.length];

	        //her çalışan icin toplam çalışma saatlerini hesapla
	        for (int i = 0; i < calismaSaatleri.length; i++) {
	            int toplam = 0;
	            
	            for (int j = 0; j < calismaSaatleri[i].length; j++) {
	            	
	                toplam += calismaSaatleri[i][j];
	            }
	            
	            toplamSaatler[i] = toplam;
	        }

	        //her çalışanın ortalama çalışma saatlerini hesapla
	        for (int i = 0; i < toplamSaatler.length; i++) {
	        	
	            ortalamaSaatler[i] = (double)toplamSaatler[i]/calismaSaatleri[i].length;
	        }

	        //çalışanları ortalama çalışma saatlerine göre artan sırada gösterecegiz
	        for (int i = 0; i < ortalamaSaatler.length; i++) {
	        	
	            int max = i;
	            
	            for (int j = i + 1; j < ortalamaSaatler.length; j++) {
	            	
	                if (ortalamaSaatler[j] > ortalamaSaatler[max]) {
	                    max = j;
	                }
	            }
	            
	            
	            double degisenSaat1 = ortalamaSaatler[i];
	            ortalamaSaatler[i] = ortalamaSaatler[max];
	            ortalamaSaatler[max] = degisenSaat1;

	            int[] degisenSaat2 = calismaSaatleri[i];
	            calismaSaatleri[i] = calismaSaatleri[max];
	            calismaSaatleri[max] = degisenSaat2;
	        }

	        // bu kısımda sonuçları yazdıracagız
	        for (int i = 0; i < calismaSaatleri.length; i++) {
	        	
	            System.out.print("Çalışan " + (i+1) + ": "); //sütunda calisan1, calisan2 diye gorulmesi icin
	            
	            for (int j = 0; j < calismaSaatleri[i].length; j++) {
	       
	                System.out.print(calismaSaatleri[i][j] + " ");
	            }
	            
	            System.out.println("toplam saat: " + toplamSaatler[i] + ", ortalama saat: " + ortalamaSaatler[i]);
	        }
	        
	        
	    }
}
