import java.util.Scanner;

public class Konversi {
    void konversi_method() {
        double c, f, r, k;
        boolean kondisi=true;
        do {

            System.out.print("\033[H\033[2J");

            Scanner sc=new Scanner(System.in);
            System.out.println("\n 1. Fahrenheit  \n 2. Reamur  \n 3. Kelvin  \n 4. Exit Program \n Ubah Celcius ke-... : ");
            int ch=sc.nextInt();
            switch(ch) {
                case 1:
                    System.out.println("Masukkan Celcius:");
                    c = sc.nextDouble();
                    f = (9 * c) / 5 + 32;
                    if (c>0&&c<100) {
                        System.out.println(c + " Celcius adalah " + f + " Fahrenheit");
                        System.out.println("Kondisi Air Normal");
                    } else if (c<=0) {
                        System.out.println(c + " Celcius adalah " + f + " Fahrenheit");
                        System.out.println("Kondisi Air Beku");
                    } else if (c>=100) {
                        System.out.println(c + " Celcius adalah " + f + " Fahrenheit");
                        System.out.println("Kondisi Air Mendidih");
                    }
                    break;
                case 2:
                    System.out.println("Masukkan Celcius:");
                    c = sc.nextDouble();
                    r = (4 * c) / 5;
                    if (c>0&&c<100) {
                        System.out.println(c + " Celcius adalah " + r + " Reamur");
                        System.out.println("Kondisi Air Normal");
                    } else if (c<=0) {
                        System.out.println(c + " Celcius adalah " + r + " Reamur");
                        System.out.println("Kondisi Air Beku");
                    } else if (c>=100) {
                        System.out.println(c + " Celcius adalah " + r + " Reamur");
                        System.out.println("Kondisi Air Mendidih");
                    }
                    break;
                case 3:
                    System.out.println("Masukkan Celcius:");
                    c = sc.nextDouble();
                    k = c + 273.15;
                    if (c>0&&c<100) {
                        System.out.println(c + " Celcius adalah " + k + " Kelvin");
                        System.out.println("Kondisi Air Normal");
                    } else if (c<=0) {
                        System.out.println(c + " Celcius adalah " + k + " Kelvin");
                        System.out.println("Kondisi Air Beku");
                    } else if (c>=100) {
                        System.out.println(c + " Celcius adalah " + k + " Kelvin");
                        System.out.println("Kondisi Air Mendidih");
                    }
                    break;
                case 4:
                    kondisi=false;
                    System.out.println("Program selesai...");
                    break;
                default:
                    System.out.println("Input yang dimasukkan salah");
                    break;
            }
        } while(kondisi);
    }
}
