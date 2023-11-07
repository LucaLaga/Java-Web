package VenditeGiocattolo;

public class Vendita {
    private Giocattolo giocattolo;
    private Cliente cliente;

    public Vendita(Giocattolo giocattolo, Cliente cliente){
        if(giocattolo != null & cliente != null){
            this.cliente = cliente;
            this.giocattolo = giocattolo;
        }
    }
}
