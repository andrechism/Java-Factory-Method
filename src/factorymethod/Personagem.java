package factorymethod;

public abstract class Personagem {
    protected String classe;
    private int STR;
    private int DEX;
    private int CON;
    private int INT;
    private int WIT;
    private int MEN;
    protected Arma arma;
    protected Armadura armadura;
    
    public Personagem(int STR, int DEX, int CON, int INT, int WIT, int MEN) {
        this.STR = STR;
        this.DEX = DEX;
        this.CON = CON;
        this.INT = INT;
        this.WIT = WIT;
        this.MEN = MEN;
    }

    public String getClasse() {
        return classe;
    }

    public int getSTR() {
        return STR;
    }

    public int getDEX() {
        return DEX;
    }

    public int getCON() {
        return CON;
    }

    public int getINT() {
        return INT;
    }

    public int getWIT() {
        return WIT;
    }

    public int getMEN() {
        return MEN;
    }
    
    
}
