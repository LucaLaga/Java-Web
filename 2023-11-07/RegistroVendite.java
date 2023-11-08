import java.util.List;

public abstract class RegistroVendite {
    public List<Vendita> vendi(Cliente cliente, Giocattolo giocattolo, List<Vendita> vendite){
        if(cliente!=null && giocattolo!=null){
            Vendita vendita = new Vendita(giocattolo, cliente);
            vendita.acquista();
            vendite.add(vendita);
        }

        return vendite;
    }
}
