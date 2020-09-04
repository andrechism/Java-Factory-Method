package factorymethod;

public class ArmaduraPesada extends Armadura{
    
    public ArmaduraPesada(){
        super("Armadura Pesada", 15, 25);
    }
    
    public ArmaduraPesada(String nome, int peso, int defesa) {
        super(nome, peso, defesa);
    }
    
}
