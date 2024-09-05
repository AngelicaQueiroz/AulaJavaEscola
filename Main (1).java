package ExemploEscola;

class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(){}

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}


class Professor extends Pessoa {
    @Override
    public void apresentar () {
        System.out.println ("Olá, eu sou o professor" + getNome() + "e leciono a disciplina de" + disciplina + "!");
    }
}
public class Main {
    public static void main (String[] args) {
        Pessoa aluno = new Aluno("Caroline", 30, 12345);
        Pessoa professor = new Professor ("Raphael", 39, "POO")
        System.out.println("Informações da Pessoa 1:\n"+aluno.toString()+"\n");
        System.out.println("Informações da Pessoa 2:\n"+professor.toString());
        aluno.apresentar();
        professor.apresentar(professor.getIdade());
        professor.apresentar
    }
}
