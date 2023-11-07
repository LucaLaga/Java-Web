public class Cliente {
    private final int id;
    private final static String emailAdmin = "admin@admin.it";
    private String nome;
    private String email;
    private double conto;
    public static int nextId;
    private final boolean isAdmin;

    
    public Cliente(String nome, String email, double conto){
        this.id = nextId++;
        this.nome = nome;
        this.email = email;
        this.isAdmin = this.email.equals(emailAdmin);
    }

    // Getters
    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public double getConto(){
        return this.conto;
    }

    public boolean checkAdmin(){
        return this.isAdmin;
    }

    // Setters
    public void setNome(String nome){
        if(nome!=null){
            this.nome = nome;
        }
    }

    public void setEmail(String email){
        if(nome!=null){
            this.email = email;
        }
    }

    public void aggiornaConto(double conto){
        if(conto >= 0){
            this.conto = conto;
        }
    }

    @Override
    public String toString(){
        return this.id + ": "
        + this.nome + " - "
        + this.email;
    }
}