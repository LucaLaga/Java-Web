import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Giocattolo> giocattoli = new ArrayList<>();
    private Cliente cliente;

    public Inventario(Cliente cliente){
        if(cliente != null){
            this.cliente = cliente;
        }
    }

    public void aggiungiGiocattolo(Giocattolo giocattolo){
        if(giocattolo != null & this.cliente.checkAdmin()){
            this.giocattoli.add(giocattolo);
        }
    }

    public void removeGiocattolo(Giocattolo giocattolo){
        if(giocattolo != null & this.cliente.checkAdmin()){
            this.giocattoli.remove(giocattolo);
        }
    }
}
