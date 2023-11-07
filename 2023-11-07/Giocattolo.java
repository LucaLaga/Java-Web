public class Giocattolo {
    private final int id;
    private String nome;
    private double prezzo;
    private int eta_consigl;
    public static int nextId; 

    public Giocattolo(String nome, double prezzo, int eta_consigl){
        this.id = nextId++;
        this.nome = nome;
        this.prezzo = prezzo;
        this.eta_consigl = eta_consigl;
    }

    // Getters
    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPrezzo(){
        return this.prezzo;
    }

    public int getEta(){
        return this.eta_consigl;
    }

    // Setters
    public void setNome(String nome){
        if(nome!=null){
            this.nome = nome;
        }
    }

    public void setPrezzo(double prezzo){
        if(prezzo>=0){
            this.prezzo=prezzo;
        }
    }

    public void setEtaCons(int eta_consigl){
        if(eta_consigl>=1){
            this.eta_consigl = eta_consigl;
        }
    }

    @Override
    public String toString(){
        return this.id + ": "
        + this.nome + " "
        + this.prezzo + "€\tEtà consigliata: "
        + this.eta_consigl + " anni";
    }
}