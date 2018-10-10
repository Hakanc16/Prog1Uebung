import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        blatt3Aufgabe2();
    }

    public static void blatt1Aufgabe1() {

        Scanner in = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein");
        int Zahl = in.nextInt();
        int Ergebnis = Zahl % 17;
        System.out.println("Der Rest bei Division durch " + 17 + " ist " + Ergebnis);

    }

    public static void blatt1Aufgabe2() {
        //kann nicht gelöst werden, weil wir die Dateien nicht dazu haben.
    }

    public static void blatt2Aufgabe1() {
        boolean x;
        boolean y;

        Scanner in = new Scanner(System.in);

        System.out.println("x");
        x = in.nextBoolean();

        System.out.println("y");
        y = in.nextBoolean();

        if (x && y) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    public static void blatt2Aufgabe2() {

        Scanner in = new Scanner(System.in);
        int x, y;

        System.out.println("Geben Sie eine Zahl für X ein:");
        x = in.nextInt();

        System.out.println("Geben Sie ein Zahl für Y ein:");
        y = in.nextInt();

        if ((x > 0) || (y > 0)) {
        }
        if (x > y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
        if ((x & y) < 0) {
            System.out.println(0);
        }
    }

    public static void blatt2Aufgabe3() {

        Scanner in = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl für n ein:");
        int n = in.nextInt();

        System.out.println("Hier sind deine ersten " + n + " ungeraden Zahlen:");
        for (int i = 1; i <= n * 2; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("Hier sind deine ersten " + n + " geraden Quadratzahlen:");
        for (int i = 2; i <= n; i++) {
            System.out.println(i * i);
        }

        System.out.println("Hier sind deine ersten " + n + " positiven Zahlen, die durch 13 teilbar sind:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i * 13);
        }

        System.out.println("Hier sind deine ersten " + n + " positiven geraden Zahlen rückwärts:");
        for (int i = n; i > 0; i--) {
            System.out.println(i * 2);
        }
    }

    public static void blatt2Aufgabe4() {
        //Kann nicht gelöst werden
    }

    public static void blatt3Aufgabe1() {

        Scanner in = new Scanner(System.in);
        System.out.println("Bitte String eingeben:");
        String s = in.nextLine();
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};

        for (char i : vowels) { //ForEach-Schleife hier sagt man das er über jedes Array in dem String iterieren soll bzw. durchgehen
            s = s.replace(String.valueOf(i), "");
        }
        System.out.println(s);
    }

    public static void blatt3Aufgabe2() {

        Scanner in = new Scanner(System.in);
        System.out.println("Geben Sie einen String ein:");
        String wort = in.nextLine();
        String neu = "";

        wort = wort.toUpperCase();

        for (int i = wort.length()-1; i >= 0; i--) {
            neu = neu + wort.charAt(i);
        }
        if (wort.equals(neu)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}



