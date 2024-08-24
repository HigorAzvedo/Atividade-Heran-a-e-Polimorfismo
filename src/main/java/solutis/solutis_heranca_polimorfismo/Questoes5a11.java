package solutis.solutis_heranca_polimorfismo;

import ClassesQuestoes5a11.Cargo;
import ClassesQuestoes5a11.Funcionario;
import ClassesQuestoes5a11.FuncionarioEnsinoBasico;
import ClassesQuestoes5a11.FuncionarioEnsinoMedio;
import ClassesQuestoes5a11.FuncionarioGraduacao;
import java.util.ArrayList;

public class Questoes5a11 {

    public static void main() {
        FuncionarioEnsinoBasico func1 = new FuncionarioEnsinoBasico("Lucas", 1, Cargo.VENDEDOR, "Escola Menor");
        FuncionarioEnsinoBasico func2 = new FuncionarioEnsinoBasico("Amanda", 2, Cargo.VENDEDOR, "Escola Raio de Sol");
        FuncionarioEnsinoBasico func3 = new FuncionarioEnsinoBasico("Pedro", 3, Cargo.VENDEDOR, "Escola Pinguinho");
        FuncionarioEnsinoBasico func4 = new FuncionarioEnsinoBasico("Juliana", 4, Cargo.VENDEDOR, "Escola Central");
        FuncionarioEnsinoMedio func5 = new FuncionarioEnsinoMedio("Gabriel", 5, Cargo.VENDEDOR, "Colegio Evolucao");
        FuncionarioEnsinoMedio func6 = new FuncionarioEnsinoMedio("Mariana", 6, Cargo.VENDEDOR, "Colegio Luz do Saber");
        FuncionarioEnsinoMedio func7 = new FuncionarioEnsinoMedio("Rafael", 7, Cargo.VENDEDOR, "Colegio Jorge Calmon");
        
        FuncionarioEnsinoMedio func8 = new FuncionarioEnsinoMedio("Bianca", 8, Cargo.SUPERVISOR, "Colegio Centro do Saber");
        FuncionarioGraduacao func9 = new FuncionarioGraduacao("Henrique", 9, Cargo.SUPERVISOR, "Faculdade Dom Pedro");
        
        FuncionarioGraduacao func10 = new FuncionarioGraduacao("Camila", 10, Cargo.GERENTE, "Universidade Jorge Amado");

        ArrayList<Funcionario> empresaSquadTech = new ArrayList<>();
        empresaSquadTech.add(func1);
        empresaSquadTech.add(func2);
        empresaSquadTech.add(func3);
        empresaSquadTech.add(func4);
        empresaSquadTech.add(func5);
        empresaSquadTech.add(func6);
        empresaSquadTech.add(func7);
        empresaSquadTech.add(func8);
        empresaSquadTech.add(func9);
        empresaSquadTech.add(func10);


        int totalEnsinoBasico = 0;
        int totalEnsinoMedio = 0;
        int totalGraduacao = 0;
        int totalSalario = 0;

        // Calculando e exibindo os gastos
        for (Funcionario funcionario : empresaSquadTech) {
            System.out.println(funcionario);

            if (funcionario instanceof FuncionarioEnsinoBasico) {
                totalEnsinoBasico += funcionario.getSalarioFinal();
            }

            if (funcionario instanceof FuncionarioEnsinoMedio) {
                totalEnsinoMedio += funcionario.getSalarioFinal();
            }

            if (funcionario instanceof FuncionarioGraduacao) {
                totalGraduacao += funcionario.getSalarioFinal();
            }

            totalSalario += funcionario.getSalarioFinal();
        }

        System.out.printf("\nGastos com Funcionários com Ensino Básico: R$%.2f", (float) totalEnsinoBasico);
        System.out.printf("\nGastos com Funcionários com Ensino Médio: R$%.2f", (float) totalEnsinoMedio);
        System.out.printf("\nGastos com Funcionários com Graduação: R$%.2f", (float) totalGraduacao);
        System.out.print("\n=========================================");
        System.out.printf("\nA empresa tem um gasto total com Salários de: R$%.2f", (float) totalSalario);
    }
}
