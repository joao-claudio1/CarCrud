
package carsystem.carroController;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author João Cláudio Soares
 */

import carsystem.CarSystem;
import carsystem.Carro;

public class CarroController {
     public static Scanner scanner = new Scanner(System.in);
     public static ArrayList<Carro> carros = new ArrayList<>();
    public static void registrarCarro() {
        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite a marca do carro: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o ano do carro: ");
        int ano = scanner.nextInt();

        Carro novoCarro = new Carro(modelo, marca, ano);
        carros.add(novoCarro);

        System.out.println("Carro registrado com sucesso!");
    }
    
    
    public static void listarCarros() {
        if (carros.isEmpty()) {
            System.out.println("Nenhum carro registrado.");
        } else {
            System.out.println("Lista de Carros:");
            for (Carro carro : carros) {
                System.out.println(carro);
            }
        }
    }
    
      public static void apagarCarro() {
        listarCarros();
        if (!carros.isEmpty()) {
            System.out.print("Digite o índice do carro a ser apagado: ");
            int indice = scanner.nextInt();
            if (indice >= 0 && indice < carros.size()) {
                carros.remove(indice);
                System.out.println("Carro apagado com sucesso!");
            } else {
                System.out.println("Índice inválido.");
            }
        }
    }

    public static void editarCarro() {
       
        if (!carros.isEmpty()) {
            System.out.print("Digite o índice do carro a ser editado: ");
            int indice = scanner.nextInt();
            scanner.nextLine(); 
            if (indice >= 0 && indice < carros.size()) {
                Carro carro = carros.get(indice);

                System.out.print("Digite o novo modelo do carro (" + carro.modelo + "): ");
                String novoModelo = scanner.nextLine();
                carro.modelo = novoModelo.isEmpty() ? carro.modelo : novoModelo;

                System.out.print("Digite a nova marca do carro (" + carro.marca + "): ");
                String novaMarca = scanner.nextLine();
                carro.marca = novaMarca.isEmpty() ? carro.marca : novaMarca;

                System.out.print("Digite o novo ano do carro (" + carro.ano + "): ");
                String novoAnoStr = scanner.nextLine();
                int novoAno = novoAnoStr.isEmpty() ? carro.ano : Integer.parseInt(novoAnoStr);
                carro.ano = novoAno;

                System.out.println("Carro editado com sucesso!");
            } else {
                System.out.println("Índice inválido.");
            }
        }
    }


}
