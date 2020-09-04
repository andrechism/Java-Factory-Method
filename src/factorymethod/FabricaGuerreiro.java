package factorymethod;

public class FabricaGuerreiro extends FabricaPersonagem{

    @Override
    public void criarPersonagens() {
        personagens.add(new Guerreiro());
        //personagens.add(new Guerreiro(1, 2, 3, 4, 5, 6));
    }
    
}
