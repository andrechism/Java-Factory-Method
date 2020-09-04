package factorymethod;

public class FabricaMago extends FabricaPersonagem{

    @Override
    public void criarPersonagens() {
        personagens.add(new Mago());
        //personagens.add(new Mago(1, 2, 3, 4, 5, 6));
    }
    
}
