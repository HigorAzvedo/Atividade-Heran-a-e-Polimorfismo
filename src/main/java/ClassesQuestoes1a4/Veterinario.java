/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesQuestoes1a4;

public class Veterinario {

    private String nome;

    public Veterinario(String nome) {
        this.nome = nome;
    }

    public void realizarExame(Animal animal) {
        String tipoAnimal = animal.getClass().getSimpleName();
        System.out.println("========================");
        System.out.println("Veterinário(a) " + this.nome + " está examinando o(a) " + tipoAnimal + " chamado(a) " + animal.obterNome());
        animal.emitirSom();
        System.out.println("========================");
    }
}