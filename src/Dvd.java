public class Dvd extends Prodotto{
    private String titolo;
    private String categoria;

    private double durata;

    public Dvd() {

    }

    public Dvd(double peso, double costo, String titolo, String categoria, double durata) {
        super(peso, costo);
        this.titolo = titolo;
        this.categoria = categoria;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getDurata() {
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "titolo='" + titolo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", durata=" + durata +
                '}';
    }
}
