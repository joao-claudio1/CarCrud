
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


}
