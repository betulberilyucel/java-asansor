import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("mevcut katinizi giriniz");
            int mkat=scanner.nextInt();
        if(mkat>10 || mkat<0){
             System.out.println("mevcut kat hatali");
        }
     System.out.println(" hedef katinizi giriniz");
        int hkat=scanner.nextInt();
        if(hkat>10 || hkat<0){
             System.out.println(" hedef kat hatali");
        }
        if (hkat > mkat){
             System.out.println("yukari cikacaksiniz");
        }
        else if (mkat > hkat){
             System.out.println("asagi ineceksiniz");
        }
        else{
             System.out.println("zaten hedeflediginiz kattasiniz");
        }
         System.out.println((hkat - mkat) + "kadar kat gideceksiniz");
    }
}

