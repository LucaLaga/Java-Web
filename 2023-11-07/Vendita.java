public class Vendita {
    private Giocattolo giocattolo;
    private Cliente cliente;
    private String tipo;

    public Vendita(Giocattolo giocattolo, Cliente cliente, String tipo){
        if(giocattolo != null & cliente != null){
            this.cliente = cliente;
            this.giocattolo = giocattolo;
            this.tipo = tipo;
        }
    }

    public void acquista(){
        cliente.aggiornaConto(cliente.getConto()-giocattolo.getPrezzo());
    }

    public void vendi(){
        cliente.aggiornaConto(cliente.getConto()+giocattolo.getPrezzo());
    }
}
