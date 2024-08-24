/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesQuestoes1a4;

public abstract class Animal {

    // Atributos
    private String nome;
    private int idade;

    // Construtor
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters
    public String obterNome() {
        return nome;
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public int obterIdade() {
        return idade;
    }

    public void definirIdade(int idade) {
        this.idade = idade;
    }

    // Métodos
    public void emitirSom() {
        System.out.println(nome + " está emitindo um som!");
    }

    public void locomover() {
        System.out.println(nome + " está se movendo!");
    }
}