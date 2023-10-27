
package carsystem;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author João Cláudio Soares
 */

public class CarSystem {
    private static ArrayList<Carro> carros = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("1. Registrar Carro");
            System.out.println("2. Listar Carros");
            System.out.println("3. Apagar Carro");
            System.out.println("4. Editar Carro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    registrarCarro();
                    break;
                case 2:
                    listarCarros();
                    break;
                case 3:
                    apagarCarro();
                    break;
                case 4:
                    editarCarro();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void registrarCarro() {
   
    }

    private static void listarCarros() {
     
    }

    private static void apagarCarro() {
        
    }

    private static void editarCarro() {
    }
      
}