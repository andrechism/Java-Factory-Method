package factorymethod;

public class Espada extends Arma{
    
    public Espada() {
        super("Espada", 10, 25);
    }
    
    public Espada(String nome, int peso, int ataque) {
        super(nome, peso, ataque);
    }
    
}
