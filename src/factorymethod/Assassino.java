package factorymethod;

public class Assassino extends Personagem{
    
    
    public Assassino() {
        super(82, 61, 82, 41, 38, 37);
        this.classe = "Assassino";
        this.armadura = new ArmaduraLeve();
        this.arma = new Arco();
    }
    
    public Assassino(int STR, int DEX, int CON, int INT, int WIT, int MEN) {
        super(STR, DEX, CON, INT, WIT, MEN);
        this.classe = "Assassino";
        this.armadura = new ArmaduraLeve();
        this.arma = new Arco();
    }
    
}
