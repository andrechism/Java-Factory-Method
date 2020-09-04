package factorymethod;

public class Robe extends Armadura{
    
    public Robe() {
        super("Robe", 4, 5);
    }
    
    public Robe(String nome, int peso, int defesa) {
        super(nome, peso, defesa);
    }
    
}
