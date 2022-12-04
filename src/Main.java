import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, spouseName;
        int userAge, spouseAge;

        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang Di Program Ramalan Cupu");
        System.out.println("++++++++++++++++++++++++++++++++++++++\n");

        System.out.println("Data Anda :");
        loveSymbols("user");

        System.out.print("Masukkan nama anda : ");
        userName = input.nextLine();

        System.out.print("Masukkan umur anda : ");
        userAge = Integer.parseInt(input.nextLine());

        System.out.println("\nData Pasangan Anda :");
        loveSymbols("spouse");

        System.out.print("Masukkan nama pasangan anda : ");
        spouseName = input.nextLine();

        System.out.print("Masukkan umur pasangan anda : ");
        spouseAge = Integer.parseInt(input.nextLine());

        if (userName == null || userAge == 0 || spouseName == null || spouseAge == 0) {
            System.out.println("Anda harus melengkapi data diatas!");
        } else {
            getPrediction(userName, userAge, spouseName, spouseAge);
        }
    }

    private static void getPrediction(String uName, int uAge, String sName, int sAge) {
        int up, low, random;
        double cocoklogi;

        up = 100;
        low = 50;
        random = (int)(Math.random() * (up - low)) + low;

        cocoklogi = random / 1.1;

        System.out.println("\n" +uName+ " [" +uAge+ "] tahun");
        loveSymbols("relation");
        System.out.println(sName+ " [" +sAge+ "] tahun\n");
        runEnter();
        System.out.println("Kecocokan anda dengan pasangan anda adalah : " +String.format("%.2f", cocoklogi)+ "%\n");
        System.out.println("Terimakasih karena anda telah menggunakan jasa ramalan kami... :D");
    }

    private static void runEnter(){
        System.out.print("Tekan ENTER untuk melihat hasil ramalan...");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loveSymbols(String type) {
        switch (type) {
            case "user":
                System.out.println("\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665");
                break;
            case "spouse":
                System.out.println("\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665");
                break;
            default:
                int n = 5;
                for(int i = 3; i <= n; i++) {
                    for(int j = n - i; j >= 1; j--) {
                        System.out.print(" ");
                    }

                    for(int k = 1; k <= i; k++) {
                        System.out.print("\u2665");
                    }

                    for(int k = 2; k <= i; k++) {
                        System.out.print("\u2665");
                    }

                    for(int j = (n-i) * 2; j >= 1; j--) {
                        System.out.print(" ");
                    }

                    for(int k = 1; k <= i; k++) {
                        System.out.print("\u2665");
                    }

                    for(int k = 2; k <= i; k++) {
                        System.out.print("\u2665");
                    }

                    System.out.println("");
                }

                for(int i = 1; i <= (n * 2) - 1; i++) {
                    for(int j = 2; j <= i; j++) {
                        System.out.print(" ");
                    }

                    for(int k = (n * 4) - 1; k >= i * 2; k--) {
                        System.out.print("\u2665");
                    }

                    System.out.println("");
                }
                break;
        }
    }
}