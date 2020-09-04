package factorymethod;

public abstract class Equipamento {
    private String nome;
    private int peso;
    
    public Equipamento(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getPeso(){
        return peso;
    }
}
