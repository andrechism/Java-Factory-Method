package factorymethod;

public class FabricaAssassino extends FabricaPersonagem{

    @Override
    public void criarPersonagens() {
        personagens.add(new Assassino());
        //personagens.add(new Assassino(1, 2, 3, 4, 5, 6));
    }
    
}
