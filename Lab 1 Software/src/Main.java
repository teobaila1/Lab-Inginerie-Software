import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        List <Parinte> parinti = new ArrayList();

        Parinte parinte = new Parinte();
        Copil copil = new Copil();

        scanner.nextLine();

        parinte.nume(parinte.nume);
        parinte.afiseaza(parinte.nume);
//        parinte.afiseaza("Teo");
//        parinte.afiseaza("Alex");
//        parinte.afiseaza("Ion");


        List<Parinte> parinteList = new ArrayList<>();





        //parinte = new Copil(); //mostenire
        //parinte.afiseaza("Alex");
    }
}