import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        blatt2Aufgabe2();
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

        Scanner in = new Scanner(System.in);
        System.out.println("Geben Sie 2 Zahlen ein");
        boolean x, y;

        System.out.println("Geben Sie für X einen Wert ein");
        x = in.nextBoolean();

        System.out.println("Geben Sie für Y einen Wert ein");
        y = in.nextBoolean();

        if (x == y) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }

    public static void blatt2Aufgabe2() {

        Scanner in = new Scanner(System.in);
        int x,y;

        System.out.println("Geben Sie eine Zahl für X ein:");
        x = in.nextInt();

        System.out.println("Geben Sie ein Zahl für Y ein:");
        y = in.nextInt();

        if((x > 0) || (y > 0)) {
        } if(x > y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
        if ((x & y) < 0) {
            System.out.println(0);
        }
    }
}
