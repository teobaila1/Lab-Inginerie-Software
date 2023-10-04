import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");

        List <Parinte> parinti = new ArrayList();

        Parinte parinte = new Parinte("Teo");
        Copil copil = new Copil("Marius");

        parinti.add(parinte);
        parinte = new Parinte("Alex");

        parinti.add(parinte);

        for(Parinte element : parinti)
        {
            element.afiseaza();
        }
        copil.afiseaza();

        //parinte = new Copil(); //mostenire
        //parinte.afiseaza("Alex");
    }
}