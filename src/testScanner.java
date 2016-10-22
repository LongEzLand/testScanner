import java.util.Scanner;

public class testScanner {
    //Creating method to make a blank line
    public static void blankLine(){
        System.out.println();

    }
    public static void main(String[]Args){
        /*
        String line;

        Scanner in = new Scanner(System.in);

        System.out.print("Type something: ");
        line = in.nextLine();
        System.out.println("You said: "+ line);

        System.out.print("Type something else: ");
        line = in.nextLine();
        System.out.println("You also said: "+ line);
        */

        //Inch to cm converter
/*
        double cm=20;
        int inch;
        final double CM_PER_INCH = 2.54;

        Scanner in=new Scanner(System.in);

        System.out.print("How many inches? ");
        inch=in.nextInt();

        cm = inch * CM_PER_INCH;
        System.out.print(inch + " in = ");
        System.out.println(cm + " cm");
        blankLine();
        System.out.printf("Four thirds = %.3f", 4.0/3.0);
        blankLine();
        System.out.printf("Pi on selline arv: %.2f", 3.14159);
        */
        /*
        //Ch 3.7 Centimeters to inches
        double pi = 3.14159;
        double x = (int) pi*20;
        System.out.println(x);
        */
        /*
        int quotinent = 76/12; // division ehk jagamine, jääki ei kuvata
        System.out.println(quotinent);
        int remainder = 76 % 12; // modulus ehk jääk
        System.out.println(remainder);
        */

        /** Testprogramm: Kas arvud jaguvad täpselt?*/

        int Esimene;
        int Teine;

        Scanner input = new Scanner(System.in);
        System.out.print("Kirjuta jagatav: ");
        Esimene = input.nextInt();
        System.out.print("Kirjuta jagaja: ");
        Teine = input.nextInt();
        if (Esimene % Teine == 0){
            System.out.println("Arvud jaguvad omavahel täpselt");
        }
        else {
            System.out.print("Arvud ei jagu omavahel täpselt, jagamisel tekib jääk: ");
            System.out.println(Esimene % Teine);
        }
        /** Juhuu, minu esimene lahendus, kombineerides omandatud teadmisi!!*/

        /*esialgne kellaaeg 12
          teine kellaaeg 14

                */


    }
}
