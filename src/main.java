
import java.util.Scanner;
import java.util.SortedMap;


public class main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner =new Scanner(System.in);

        //wichti ist, das der sever und der Client denselben Port nutzten
        ShopServer sever =new ShopServer(16);
        ShopClient kunde = new ShopClient("localhost",16);

        Thread.sleep(45);

        while(kunde.isConnected()) {

            System.out.println("Was möchtest du machen? \n [1] Neues TShirt bestellen \n [2] Bestellung bestätigung \n [3] Weiter Shoppen \n [4] Abmelden");
            int auswahl = scanner.nextInt();
            if (auswahl==1){
                String groessse;
                String farbe;
                System.out.println("In welcher Größe möchtest du dein TShirt bestellen? (S/M/L/XL/XXl)");
                groessse = scanner.next();
                System.out.println("Welche Farbe soll das TShirt haben? ");
                farbe=scanner.next();
                kunde.groesseFarbeWaehlen(groessse,farbe);

            }else if( auswahl==2){
                System.out.println("Ja oder Nein");
                String antwort= scanner.next();
                kunde.bestaetigen(antwort);
            }
            else if (auswahl== 3){
                String groessse;
                String farbe;
                System.out.println("In welcher Größe möchtest du dein weiteres TShirt bestellen? (S/M/L/XL/XXl) Die Vorherige Auswahl wird somit gespeichert.");
                groessse = scanner.next();
                System.out.println("Welche Farbe soll das TShirt haben? ");
                farbe=scanner.next();
                kunde.groesseFarbeWaehlen(groessse,farbe);
            }


            else if (auswahl == 4){
                kunde.abmelden();
            }
            else {
                System.out.println("Ungültige eingabe. Bitte Nutzte nur 1,2 oder 3");
            }


        }

    }
}