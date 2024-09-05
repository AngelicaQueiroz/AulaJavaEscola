package ExemploEscola;

public class Aluno extends Pessoa {
    
    @Override
    public void apresentar(){
        System.out.println("Olá, eu sou o aluno" + getNome() + "e minha matrícula é" + matricula + "!");

    }
}