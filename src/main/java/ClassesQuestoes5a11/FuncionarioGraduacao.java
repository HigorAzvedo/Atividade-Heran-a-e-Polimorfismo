package ClassesQuestoes5a11;

public class FuncionarioGraduacao extends Funcionario {

    private final String nomeUniversidade;
    private final int SALARIO_BASE = 3300;
    
    // Construtor
    public FuncionarioGraduacao(String nome, int codigoFuncionario, Cargo cargo, String nomeUniversidade) {
        super(nome, codigoFuncionario, cargo);
        this.nomeUniversidade = nomeUniversidade;
    }
    
    // Getter
    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    @Override
    public void calcularSalarioFinal() {
        int novoSalario = this.SALARIO_BASE + getBonificacao();        
        setSalarioFinal(novoSalario);
    }
}