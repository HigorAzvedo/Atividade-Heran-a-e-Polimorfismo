package ClassesQuestoes5a11;


public class Funcionario {

    private String nome;
    private int codigoFuncionario;
    private final int SALARIO_BASE = 1000; // Valor padrão, pode aumentar dependendo de qualificações (nas subclasses)
    private Cargo cargo;
    private int bonificacao;
    private int salarioFinal = 0;

    public Funcionario(String nome, int codigoFuncionario, Cargo cargo) {
        this.nome = nome;
        this.codigoFuncionario = codigoFuncionario;
        this.cargo = cargo;
        definirBonificacao(cargo);        
        calcularSalarioFinal();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public int getSalarioBase() {
        return SALARIO_BASE;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
        definirBonificacao(cargo);
    }

    public int getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(int bonificacao) {
        this.bonificacao = bonificacao;
    }

    public int getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(int salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    // Métodos
    public void definirBonificacao(Cargo cargo) {
        // Define a bonificação com base no cargo do funcionário
        switch (cargo) {
            case GERENTE:
                setBonificacao(1500);
                break;
            case SUPERVISOR:
                setBonificacao(600);
                break;
            case VENDEDOR:
                setBonificacao(250);
                break;
            default:
                throw new IllegalArgumentException("Cargo não reconhecido!");
        }
    }

    public void calcularSalarioFinal() {        
        int novoSalario = this.SALARIO_BASE + getBonificacao();        
        setSalarioFinal(novoSalario);
    }

    @Override
    public String toString() {
        return "Funcionario{"
                + "nome = " + nome
                + ", bonificacao = " + bonificacao
                + ", salarioFinal = " + getSalarioFinal()
                + '}';
    }
}
