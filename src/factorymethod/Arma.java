package factorymethod;

public abstract class Arma extends Equipamento{
    
    private int ataque;
    
    public Arma(String nome, int peso, int ataque) {
        super(nome, peso);
        this.ataque = ataque;
    }
    
    public int getAtaque(){
        return ataque;
    }
    
}
