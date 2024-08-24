/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesQuestoes1a4;

public class Zoologico {

    public Animal[] jaulas;

    public Zoologico() {
        this.jaulas = new Animal[10];
    }

    public void percorrerJaulas() {
        System.out.println("Percorrendo as Jaulas:");

        for (int i = 0; i < jaulas.length; i++) {
            Animal animal = jaulas[i];
            String tipoAnimal = animal.getClass().getSimpleName();
            System.out.println("Jaula [" + (i + 1) + "]");
            System.out.println(animal.obterNome() + " - " + tipoAnimal);

            // Emitir som do animal
            animal.emitirSom();

            // Verificar se o animal corre
            if (animal instanceof Cavalo || animal instanceof Cachorro) {
                animal.locomover();
            }

            System.out.println();
        }
    }

    public void adicionarAnimal(int index, Animal animal) {
        if (index >= 0 && index < jaulas.length) {
            jaulas[index] = animal;
        } else {
            System.out.println("Índice fora dos limites das jaulas.");
        }
    }
}