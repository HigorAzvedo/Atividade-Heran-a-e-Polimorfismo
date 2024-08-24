package ClassesQuestoes5a11;

public class FuncionarioEnsinoMedio extends Funcionario {

    private final String nomeEscola;
    private final int SALARIO_BASE = 1650;
    
    // Construtor
    public FuncionarioEnsinoMedio(String nome, int codigoFuncionario, Cargo cargo, String nomeEscola) {
        super(nome, codigoFuncionario, cargo);
        this.nomeEscola = nomeEscola;
    }
    
    // Getter
    public String getNomeEscola() {
        return nomeEscola;
    }           

    @Override
    public void calcularSalarioFinal() {
        int novoSalario = this.SALARIO_BASE + getBonificacao();        
        setSalarioFinal(novoSalario);
    }
}
