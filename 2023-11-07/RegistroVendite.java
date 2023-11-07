import java.util.ArrayList;
import java.util.List;

public abstract class RegistroVendite {
    protected static List<Vendita> vendite = new ArrayList<>();
    public static void acquista(Cliente cliente, Giocattolo giocattolo){
        System.out.println("Stai acquistando un " + giocattolo.getNome());
        updateVendite(cliente, giocattolo, "acquisto");
    }
    public static void vendi(Cliente cliente, Giocattolo giocattolo){
        System.out.println("Stai vendendo un " + giocattolo.getNome());
        updateVendite(cliente, giocattolo, "vendita");
    }

    private static void updateVendite(Cliente cliente, Giocattolo giocattolo, String tipo){
        Vendita newVendita = new Vendita(giocattolo, cliente, tipo);
        if(tipo.equals("acquisto")){
            newVendita.acquista();
        }else{
            newVendita.vendi();
        }
        vendite.add(newVendita);
    }
}
