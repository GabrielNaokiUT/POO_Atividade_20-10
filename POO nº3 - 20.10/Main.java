public class Main {

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("Gabriel Naoki", 20, "12345");
        Aluno student = new Aluno("Fulano de Tal", -2, "54321");

        System.out.println("Aluno: " + aluno.Aluno);
        System.out.println("Nº de matrícula: " + aluno.matricula);
        aluno.setIdade(20);
        System.out.println("Idade: " + aluno.getIdade() + " anos \n");


        student.exibirDados();
    }
} 
//objeto aluno teve os atributos Aluno e matricula acesados diretamente na classse Main e o atributo idade usando get e set, mas o método private validarIdade não é possível//
//objeto student teve todos seus atributos e o método validarIdade exibidos pelo método exibirDados//