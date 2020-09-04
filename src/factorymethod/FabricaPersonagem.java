package factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class FabricaPersonagem {
    List<Personagem> personagens = new ArrayList<Personagem>();
    
    public abstract void criarPersonagens();
    
    public void exibirPersonagens() {
        
        for(int i = 0; i < personagens.size(); i++) {
            System.out.println("____________________________________________________________");
            System.out.println("Classe: " + personagens.get(i).getClasse());
            System.out.print(" STR: " + personagens.get(i).getSTR());
            System.out.print(" DEX: " + personagens.get(i).getDEX());
            System.out.print(" CON: " + personagens.get(i).getCON());
            System.out.print(" INT: " + personagens.get(i).getINT());
            System.out.print(" WIT: " + personagens.get(i).getWIT());
            System.out.print(" MEN: " + personagens.get(i).getMEN());
            System.out.println("\n");
            
            System.out.println("- Armadura: " + personagens.get(i).armadura.getNome() 
                             + " |Defesa: " + personagens.get(i).armadura.getDefesa()
                             + " |Peso: " + personagens.get(i).armadura.getPeso());
            
            System.out.println("- Arma: " + personagens.get(i).arma.getNome() 
                             + " |Ataque: " + personagens.get(i).arma.getAtaque()
                             + " |Peso: " +  + personagens.get(i).arma.getPeso());
            System.out.println("____________________________________________________________");
            System.out.println("\n");
        }
        
    }
}
