package factorymethod;

public class Guerreiro extends Personagem{
    
    public Guerreiro() {
        super(88, 55, 82, 39, 39, 38);
        this.classe = "Guerreiro";
        this.armadura = new ArmaduraPesada();
        this.arma = new Espada();
    }
    
    public Guerreiro(int STR, int DEX, int CON, int INT, int WIT, int MEN) {
        super(STR, DEX, CON, INT, WIT, MEN);
        this.classe = "Guerreiro";
        this.armadura = new ArmaduraPesada();
        this.arma = new Espada();
    }
    
}
