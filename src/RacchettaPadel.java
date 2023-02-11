public class RacchettaPadel extends Prodotto {

    private String marca;
    private Tipo tipo;

    public RacchettaPadel() {

    }

    public RacchettaPadel(double peso, double costo, String marca, Tipo tipo) {
        super(peso, costo);
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "RacchettaPadel{" +
                "marca='" + marca + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
