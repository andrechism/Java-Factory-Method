package factorymethod;

public class Arco extends Arma{
    
    public Arco() {
        super("Arco", 4, 12);
    }
    
    public Arco(String nome, int peso, int ataque) {
        super(nome, peso, ataque);
    }
    
}
