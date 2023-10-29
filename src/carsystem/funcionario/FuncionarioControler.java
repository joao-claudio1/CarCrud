package carsystem.funcionario;

import java.util.Scanner;

public class FuncionarioControler {


    private static Scanner scanner = new Scanner(System.in);


    private static void Registrar(){

        System.out.println("Insira o nome do funcionario: ");
        scanner.nextLine();

        System.out.println("Insira o sexo do funcionario: ");
        scanner.nextLine();

        System.out.println("Insira a idade do funcionario: ");
        scanner.nextLine();
    }
    
}
