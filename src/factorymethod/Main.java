package factorymethod;

public class Main {

    public static void main(String[] args) {
        criarPersonagens(1);
        criarPersonagens(2);
        criarPersonagens(3);
    }
    
    public static void criarPersonagens(int tipo) {
        FabricaPersonagem fabricaPersonagem = null;
        
        switch(tipo){
            case 1:
                fabricaPersonagem = new FabricaGuerreiro();
                break;
            case 2:
                fabricaPersonagem = new FabricaMago();
                break;
            case 3:
                fabricaPersonagem = new FabricaAssassino();
                break;
        }
        
        fabricaPersonagem.criarPersonagens();
        fabricaPersonagem.exibirPersonagens();
    }
}
        