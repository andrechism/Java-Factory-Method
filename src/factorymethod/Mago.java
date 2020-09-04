package factorymethod;

public class Mago extends Personagem{
    
    public Mago() {
        super(38, 27, 41, 79, 78, 78);
        this.classe = "Mago";
        this.armadura = new Robe();
        this.arma = new Cajado();
    }
    
    public Mago(int STR, int DEX, int CON, int INT, int WIT, int MEN) {
        super(STR, DEX, CON, INT, WIT, MEN);
        this.classe = "Mago";
        this.armadura = new Robe();
        this.arma = new Cajado();
    }
    
}
