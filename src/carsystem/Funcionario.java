package carsystem;

public class Funcionario {
    
    String nome;
    String sexo;
    int idade;

    public Funcionario(String nome, String sexo, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;

    }

    @Override
    public String toString(){
        return "Funcionario{" +
        "nome='" + nome + '\'' +
        ", sexo='" + sexo + '\'' +
        ", idade=" + idade +
        '}';
    }
    
}
