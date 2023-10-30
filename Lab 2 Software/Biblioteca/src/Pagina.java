public class Pagina extends Carte{
    int nrPaginii;
    String text;

    public Pagina(String titlu, String autor, int nrPaginii, String text) {
        super(titlu, autor);
        this.nrPaginii = nrPaginii;
        this.text = text;
    }

    public void afisarePagina(){
        System.out.println(nrPaginii + " - " + text);
    }
}
