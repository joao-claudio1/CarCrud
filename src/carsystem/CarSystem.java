
package carsystem;
import java.util.ArrayList;
import java.util.Scanner;
<<<<<<< HEAD
// import  funcionario.FuncionarioControler.FuncionarioControler;

=======
import carsystem.carroController.CarroController;
import static carsystem.carroController.CarroController.registrarCarro;
import static carsystem.carroController.CarroController.listarCarros;
>>>>>>> bef6df3efb40ac9cbfa2497d9ee8f639321c3ab8

public class CarSystem {
    private static ArrayList<Carro> carros = new ArrayList<>();
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static ArrayList<Materiais> materiais = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println(">>>>>BEM VINDO A CARROS DOS MANOS<<<<");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("1. Carros                >>>" );
            System.out.println("2. Funcionários          >>>" );
            System.out.println("3. Materiais             >>>" );
            System.out.println("0. Sair                  >>>" );
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>" );
            System.out.print("Escolha uma opção: ");
           
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    opCarro();
                    break;
                case 2:
<<<<<<< HEAD
                   opFuncionarios();
               
=======
                  // opFuncionarios();
>>>>>>> bef6df3efb40ac9cbfa2497d9ee8f639321c3ab8
                    break;
                case 3:
                   // opMateriais();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }


    private static void opCarro(){

        int opCarro;

        System.out.println("1. Registrar Carros");
        System.out.println("2. Listar Carros");
        System.out.println("3. Apagar Carros");
        System.out.println("4. Editar Carros");
        System.out.println("Escolha uma opcao: ");

        opCarro = scanner.nextInt();
        
        if(opCarro == 1){
          registrarCarro();
        }
        else if(opCarro == 2){
          listarCarros();
        }
        

    }


    private static void opFuncionarios(){

        int opcao;

        System.out.println("1. Registrar Funcionarios");
        System.out.println("2. Listar Funcionarios");
        System.out.println("3. Apagar Funcionarios");
        System.out.println("4. Editar Funcionarios");
        System.out.println("Escolha uma opcao: ");

        opcao = scanner.nextInt();

   

        
    }


    private static void opMateriais(){

        int opcao;

        System.out.println("1. Registrar Materiais");
        System.out.println("2. Listar Materiais");
        System.out.println("3. Apagar Materiais");
        System.out.println("Editar Materiais");
        System.out.println("Escolha uma opcao: ");

        opcao = scanner.nextInt();

    }


      
}