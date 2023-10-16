public class Carte{
    public String titlu;
    public String autor;

    public Carte(String titlu, String autor){
        this.titlu = titlu;
        this.autor = autor;
    }
    public void afisareCarte(){
        System.out.println(titlu + " - " + autor);
    }
}
