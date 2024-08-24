/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesQuestoes1a4;

public class Preguica extends Animal {

    // Construtor
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void locomover() {
        System.out.println(obterNome() + " está subindo em uma árvore!");
    }
}
