import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        blatt1Aufgabe1();
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
}
