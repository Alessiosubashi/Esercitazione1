
public class TestNegozio {
    public static void main(String[] args) {
        Negozio neg = new Negozio();

        Prodotto libro1 = new Libro("ISNB", "giungla", "Fantasy", 100, 0.2, 20);
        Prodotto libro2 = new Libro("ISNB", "JavaHeadFirst", "informatica", 900, 1, 160);
        Prodotto dvd1 = new Dvd(0.1,10.99,"avatar","fantasy",120);
        Prodotto racchetta1 = new RacchettaPadel(2,100,"sport",Tipo.GOCCIA);
        Prodotto racchetta2 = new RacchettaPadel(2,101,"sport",Tipo.DIAMANTE);
        Prodotto racchetta3 = new RacchettaPadel(2,101,"sport",Tipo.GOCCIA);
        neg.aggiungiProdotto(libro1);
        neg.aggiungiProdotto(libro2);
        neg.aggiungiProdotto(dvd1);
        neg.aggiungiProdotto(racchetta1);
        neg.aggiungiProdotto(racchetta2);
        neg.aggiungiProdotto(racchetta3);
        System.out.println(neg.numProdotti());
        System.out.println(neg.pesoProdotti());
        System.out.println(neg.costoMaggiore());
        System.out.println(neg.numLibriFantasy());
        System.out.println(neg.listaRacchetteaGoccia());

    }

    }


