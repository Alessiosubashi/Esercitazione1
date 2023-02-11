public class Prodotto {

    private double peso;
    private double costo;

    public Prodotto(double peso, double costo) {
        this.peso = peso;
        this.costo = costo;
    }

    public Prodotto() {

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Prodotto{" + "peso = " + peso + ", costo=" + costo + "}";
    }
}
