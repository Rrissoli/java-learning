package src.entities;

public class Enquilinos {
    private String nome;
    private String email;
    private int quarto;

    public String getNome(){
        return this.nome;
    }

    public String getEmail() {
        return email;
    }

    public int getQuarto() {
        return quarto;
    }

    public Enquilinos(String nome, String email, int quarto) {
        this.nome = nome;
        this.email = email;
        this.quarto = quarto;
    }

    @Override
    public String toString() {
        return " nome=" + nome + ", email=" + email + "";
    }


    
    
}
