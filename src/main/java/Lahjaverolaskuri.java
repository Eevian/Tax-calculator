
import java.util.Scanner;

public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("How much is the gift?");
        int lahja = Integer.valueOf(lukija.nextLine());  
   
// 5.000 - 25.000 A
        double veroalarajalla1 = 100;
        double asteikonpienin1 = 5000;
        double veroprosentti1 = 8;

// 25.000 - 55.000 B
        double veroalarajalla2 = 1700;
        double asteikonpienin2 = 25000;
        double veroprosentti2 = 10;

// 55.000 - 200.000 C
        double veroalarajalla3 = 4700;
        double asteikonpienin3 = 55000;
        double veroprosentti3 = 12;

//200.000 - 1.000.000 D
        double veroalarajalla4 = 22100;
        double asteikonpienin4 = 200000;
        double veroprosentti4 = 15;

//1000.000 - ääretön E
        double veroalarajalla5 = 142100;
        double asteikonpienin5 = 1000000;
        double veroprosentti5 = 17;

        if (lahja <= 4999){
            System.out.println("No tax");
       
        } else if (lahja >= 5000 && lahja <= 25000){
            System.out.println("Tax:"+ (veroalarajalla1 + ((lahja - asteikonpienin1) *veroprosentti1/100)));
            
        } else if (lahja >= 25000 && lahja <= 55000){
            System.out.println("Tax:"+(veroalarajalla2 +((lahja - asteikonpienin2) *(veroprosentti2/100))));
            
        } else if (lahja >= 55000 && lahja <= 200000){
            System.out.println("Tax:"+(veroalarajalla3 + ((lahja - asteikonpienin3) *(veroprosentti3/100))));
            
        } else if (lahja >=200000 && lahja <= 1000000){
            System.out.println("Tax:"+(veroalarajalla4 + ((lahja - asteikonpienin4) *(veroprosentti4/100))));
            
        } else if (lahja >=1000000){ 
            System.out.println("Tax:"+(veroalarajalla5 + ((lahja - asteikonpienin5) *(veroprosentti5/100))));    
        }
    }
}

