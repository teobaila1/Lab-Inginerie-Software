import java.util.*;
import java.util.List;
import java.util.Arrays;


public class Main{

    public static void main(String[] args) {

        //System.out.println("Hello world!");

        List<Parinte> parinti = new ArrayList();

        Parinte parinte = new Parinte("Teo");
        parinti.add(parinte);                   //dupa fiecare obiect, adaug in lista

        parinte = new Parinte("Alex");
        parinti.add(parinte);

        parinte = new Copil("Marius");
        //Copil copil = new Copil("Marius");
        //Parinte parinte1 = new Copil("Raul");     // polimorfism
        parinti.add(parinte);

        parinti.sort(new Comparator<Parinte>() {
            @Override
            public int compare(Parinte o1, Parinte o2) {

                return (o1.name.compareTo(o2.name));
            }
        });



        //parinte = new Parinte("Alex");
        //parinte = new Parinte("Mihai");

        //parinte1.afiseaza();
        //copil.afiseaza();

//        for (int i = 0; i < parinti.size(); i++) {
//            parinti.get(i).afiseaza();
//        }

        for (Parinte element : parinti) {
            element.afiseaza();
        }

        //parinte = new Copil(); //mostenire
        //parinte.afiseaza("Alex");
    }
}