public class Vendita {
    private Giocattolo giocattolo;
    private Cliente cliente;

    public Vendita(Giocattolo giocattolo, Cliente cliente){
        if(giocattolo != null & cliente != null){
            this.cliente = cliente;
            this.giocattolo = giocattolo;
        }
    }

    public void acquista(){
        cliente.aggiornaConto(cliente.getConto()-giocattolo.getPrezzo());
    }

    public void getRefound(){
        cliente.aggiornaConto(cliente.getConto()+giocattolo.getPrezzo());
    }
}
