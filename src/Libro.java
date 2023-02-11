public class Libro extends Prodotto {
    private String ISNB;
    private String titolo;
    private String categoria;

    private int pagine;

    public Libro(){

    }
    public Libro(String ISNB,String titolo,String categoria,int pagine,double peso,double costo){
        super(peso,costo);
        this.ISNB = ISNB;
        this.titolo = titolo;
        this.categoria = categoria;
        this.pagine = pagine;


    }

    public String getISNB() {
        return ISNB;
    }

    public void setISNB(String ISNB) {
        this.ISNB = ISNB;
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

    public int getPagine() {
        return pagine;
    }

    public void setPagine(int pagine) {
        this.pagine = pagine;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISNB='" + ISNB + '\'' +
                ", titolo='" + titolo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", pagine=" + pagine +
                '}';
    }
}



