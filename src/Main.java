// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<mazlicek> zvirata = new ArrayList<>();

     /*   for (int i = 0; i < 3; i++) {
            System.out.println("jmeno mazlička");
            String jmeno = sc.nextLine();
            System.out.println("druh mazlicča");
            String druh = sc.nextLine();
            System.out.println("vek mazlička");
            int vek = sc.nextInt();
            System.out.println("váha v kg mazlička");
            double vaha = sc.nextDouble();
            sc.nextLine();
            zvirata.add(new mazlicek(jmeno, druh, vek, vaha));
        }
*/
        String input = "" ;
        while (!input.equals(0)) {
            System.out.println("zadejte číslo:\n 1 prídáte mazlíčka \n 2 vypíše info \n 3 průměr věku " +
                    "\n 4 průměr váhy\n 5 hledaní jména mazlíček \n 6 druh mazlíčka  \n 0:konec");
            input = sc.nextLine();

            switch (input) {
                case "1":
                    System.out.println("jmeno mazlička");
                    String jmeno = sc.nextLine();
                    System.out.println("druh mazlicča");
                    String druh = sc.nextLine();
                    System.out.println("vek mazlička");
                    int vek = sc.nextInt();
                    System.out.println("váha v kg mazlička");
                    double vaha = sc.nextDouble();
                    zvirata.add(new mazlicek(jmeno, druh, vek, vaha));
                    sc.nextLine();
                    break;
                case "2":
                    for (int i = 0; i < zvirata.size(); i++) {
                        System.out.println(zvirata.get(i).getJmeno() + ",");
                    }
                    sc.nextLine();
                    break;
                case "3":
                    double prumer = 0;
                    double celkem = 0;
                    for (int i = 0; i < zvirata.size(); i++) {
                        celkem = zvirata.get(i).getVek();
                        prumer = prumer + celkem;
                    }
                    System.out.println("Průměrný věk je " + prumer / zvirata.size());
                    break;

                case "4":
                    prumer = 0;
                    celkem = 0;
                    for (int i = 0; i < zvirata.size(); i++) {
                        celkem = zvirata.get(i).getVaha();
                        prumer = prumer + celkem;
                    }
                    System.out.println("Průměrný vaha je " + prumer / zvirata.size());
                    break;

                case "5":
                    System.out.println("Zadejte jméno mazlíčka ,kterýho hledáte");
                    String hledame = sc.nextLine();
                    for (int i = 0; i < zvirata.size(); i++) {
                        if (hledame.equals(zvirata.get(i).getJmeno())) {
                            System.out.println("Mazlicek se tam nachází");
                            if (!hledame.equals(zvirata.get(i).getJmeno())) ;
                            System.out.println("Mazlicek se tam nenachází");
                        }
                    }

                    break;
                case "6":
                    for (int i = 0; i < zvirata.size(); i++) {
                        System.out.println(zvirata.get(i).getDruh());
                    }
                    System.out.println("Zadejte druh mazlíčka kterýho hledáte");
                    hledame = sc.nextLine();
                    for (int i = 0; i < zvirata.size(); i++) {
                        if (hledame.equals(zvirata.get(i).getDruh())) {
                            System.out.println(zvirata.get(i));
                        }
                    }
                    break;
                default:
                    System.out.println("Nepasal jste špatné výchozí číslo");
            }
        }
    }
}