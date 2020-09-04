package factorymethod;

public class Cajado extends Arma{
    
    public Cajado() {
        super("Cajado", 7, 10);
    }
    
    public Cajado(String nome, int peso, int ataque) {
        super(nome, peso, ataque);
    }
    
}
