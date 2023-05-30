import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int rastgelesayi = (int)(Math.random()*101);
            int tahmin = -1;

            Scanner input = new Scanner(System.in);
            System.out.println("Tahmin girin");

            while (rastgelesayi != tahmin) {
                tahmin = input.nextInt();

                if (tahmin < 0 || tahmin > 100) {
                    System.out.println("lütfen 0-100 arasında bir sayı girin");
                    continue;
                }

                if (rastgelesayi > tahmin) {
                    System.out.println("Sayınızı yükseltin");
                } else if (rastgelesayi < tahmin) {
                    System.out.println("Sayınızı azaltın");
                } else {
                    System.out.println("Tebrikler");
                }
            }

        }

    }
