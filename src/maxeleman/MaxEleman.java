
package maxeleman;

import java.util.Scanner;

public class MaxEleman {

    public int getEnBuyukEleman(int[] dizi){
    
        int enBuyuk;
        enBuyuk = dizi[0];
        
        for(int j=0 ; j<dizi.length ; j++){
            if(dizi[j]>enBuyuk){
                enBuyuk = dizi[j];
        
            }
        }
        return enBuyuk;
    }
   
    public static void main(String[] args) {
        
        System.out.println("Dizinin en buyuk elemanini bulan algoritma");
      
        System.out.println("Dizinin eleman sayisini giriniz:");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        int cikti=0;
        int dizi[] = new int[sayi];
        
        for(int i=0;i<sayi;i++){
            System.out.print("dizinin("+i+") giriniz :");
            dizi[i] =scan.nextInt();
            System.out.println("");
        }
       
        MaxEleman max = new MaxEleman();
        cikti = max.getEnBuyukEleman(dizi);
        System.out.println("En buyuk eleman: "+cikti);
        
    }
    
}
