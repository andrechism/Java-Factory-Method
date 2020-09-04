package factorymethod;

public class Armadura extends Equipamento {
    
    private int defesa;
    
    public Armadura(String nome, int peso, int defesa) {
        super(nome, peso);
        this.defesa = defesa;
    }
    
    public int getDefesa(){
        return defesa;
    }
    
}
