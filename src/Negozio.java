import java.util.ArrayList;

public class Negozio {
    private ArrayList<Prodotto> listaProdotti = new ArrayList<>();

    public ArrayList<Prodotto> getListaProdotti() {
        return listaProdotti;
    }

    public void setListaProdotti(ArrayList<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }
    public int numProdotti(){
       return this.listaProdotti.size();
    }
    public double pesoProdotti(){
        double pesoTot = 0;
        for ( Prodotto p : this.listaProdotti ) {

            pesoTot = pesoTot +p.getPeso();
        }
        return pesoTot;
    }
    public Prodotto costoMaggiore(){
        double costoMax = 0;
        Prodotto prodCostoMax = new Prodotto();
        for(Prodotto p : this.listaProdotti){
            if(p.getCosto() > costoMax){
                costoMax = p.getCosto();
                prodCostoMax = p;
            }
        }
        return prodCostoMax;
    }
    public void aggiungiProdotto(Prodotto p){
      this.listaProdotti.add(p);
    }
    public int numLibriFantasy(){
        int libro = 0;
        for(Prodotto p : listaProdotti){
            if(p instanceof Libro && ((Libro) p).getCategoria().equalsIgnoreCase("Fantasy")){
               libro++;
            }

        }
        return libro;
    }
    public ArrayList<RacchettaPadel> listaRacchetteaGoccia(){
        ArrayList<RacchettaPadel> listaRacchette = new ArrayList<>();
        for(Prodotto p : listaProdotti){
            if(p instanceof RacchettaPadel && p.getCosto() > 100 && ((RacchettaPadel) p).getTipo() == Tipo.GOCCIA){
                listaRacchette.add((RacchettaPadel)p);
            }
        }
        return listaRacchette;
    }
}
