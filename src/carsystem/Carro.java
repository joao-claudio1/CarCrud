
package carsystem;

/**
 *
 * @author João Cláudio Soares
 */
class Carro {
    String modelo;
    String marca;
    int ano;

    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                '}';
    }
}