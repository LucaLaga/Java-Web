package VenditeGiocattolo;

public class Cliente {
    private final int id;
    private String nome;
    private String email;
    public static int nextId; 

    public Cliente(String nome, String email){
        this.id = nextId++;
        this.nome = nome;
        this.email = email;
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

    @Override
    public String toString(){
        return this.id + ": "
        + this.nome + " - "
        + this.email;
    }
}