package solutis.solutis_heranca_polimorfismo;

import ClassesQuestoes1a4.Cachorro;
import ClassesQuestoes1a4.Cavalo;
import ClassesQuestoes1a4.Preguica;
import ClassesQuestoes1a4.Veterinario;
import ClassesQuestoes1a4.Zoologico;

public class Questoes1a4 {

    public static void main() {
        
        Cachorro cachorro1 = new Cachorro("Max", 10);
        Cavalo cavalo1 = new Cavalo("Trovao", 5);
        Preguica preguica1 = new Preguica("Sid", 3);

       
        cachorro1.emitirSom();
        cavalo1.emitirSom();
        preguica1.emitirSom();  // Preguiça emite som padrão da classe Animal

        System.out.println("========================");

        Veterinario veterinario1 = new Veterinario("Dr. Silva");

        veterinario1.realizarExame(cachorro1);
        veterinario1.realizarExame(cavalo1);
        veterinario1.realizarExame(preguica1);

        Zoologico zoologico1 = new Zoologico();
        zoologico1.jaulas[0] = new Cachorro("Max", 14);
        zoologico1.jaulas[1] = new Cachorro("Bolt", 3);
        zoologico1.jaulas[2] = new Cavalo("Relâmpago", 2);
        zoologico1.jaulas[3] = new Cavalo("Silver", 1);
        zoologico1.jaulas[4] = new Preguica("Lento", 9);
        zoologico1.jaulas[5] = new Preguica("Folgado", 2);
        zoologico1.jaulas[6] = new Preguica("Preguiça", 9);
        zoologico1.jaulas[7] = new Cavalo("Pegasus", 7);
        zoologico1.jaulas[8] = new Preguica("Vagaroso", 9);
        zoologico1.jaulas[9] = new Cachorro("Princesa", 8);

        
        zoologico1.percorrerJaulas();
    }
}
