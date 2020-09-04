package factorymethod;

public class ArmaduraLeve extends Armadura{
    
    public ArmaduraLeve() {
        super("Armadura Leve", 7, 10);
    }
    
    public ArmaduraLeve(String nome, int peso, int defesa) {
        super(nome, peso, defesa);
    }
    
}
