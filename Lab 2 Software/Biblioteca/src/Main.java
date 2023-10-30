import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

//          Biblioteca biblioteca = new Biblioteca();
//        biblioteca = new Carte("Capra cu 3 iezi", "Ion Creanga");
//        ((Carte) biblioteca).afisareCarte();
//        biblioteca = new Carte("Fat-Frumos", "Mihai Eminescu");
//        ((Carte) biblioteca).afisareCarte();

        //Pagina pagina = new Pagina();

        List<Carte> listaCarte = new ArrayList<Carte>();

        Carte carte = new Carte("Ion", "Liviu Rebreanu");
        listaCarte.add(carte);


        carte = new Carte("Moara cu noroc", "Mihail Sadoveanu");
        listaCarte.add(carte);


        carte = new Carte("Luceafarul", "Mihai Eminescu");
        listaCarte.add(carte);


        carte = new Carte("Fat-Frumos", "Mihai Eminescu");
        listaCarte.add(carte);


        listaCarte.sort(new Comparator<Carte>() {
            @Override
            public int compare(Carte o1, Carte o2) {
                if (Objects.equals(o1.autor, o2.autor)) {
                    return (o1.titlu.compareTo(o2.titlu));
                } else {
                    return (o1.autor.compareTo((o2.autor)));
                }
            }
        });

        for (Carte element : listaCarte) {
            element.afisareCarte();
        }

        List<Pagina> pagini = new ArrayList();

        Pagina pagina = new Pagina("Ion", "Liviu Rebreanu", 10, "ACACACACACA");

        pagina.afisarePagina();
        

        //de facut cautarea unei fraze, titlu+pagina si afisarea paginii  (titlu + pagina), cautare binara, map




    }
}