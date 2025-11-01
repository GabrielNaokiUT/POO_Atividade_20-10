public class Aluno{

    public String Aluno;
    private int idade;
    protected String matricula;

    public Aluno(String Aluno, int idade, String matricula){
        this.Aluno = Aluno;
        this.idade = idade;
        this.matricula = matricula;
    }
    private void validarIdade(){
        if(idade > 0){
            System.out.println("Idade válida.");
        }
        else{
            System.out.println("Idade inválida. Menor que 0.");
        }
    }
    public void exibirDados(){
        System.out.println("Aluno: " + Aluno + "\n" +
            "Nº de matrícula: " + matricula + "\n" +
            "Idade: " + getIdade() + " anos" );
        validarIdade();

    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
}
