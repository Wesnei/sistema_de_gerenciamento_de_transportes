public class Veiculos {

    public String marca;
    public String modelo;
    public String ano;
    public int quantidadeDePortas;
    public int cilindradas;
    public double capacidadeDeCargas;
    public int numeroDeAssentos;

    public Veiculos(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Veiculos(String marca, String modelo, String ano, int quantidadeDePortas, int cilindradas, double capacidadeDeCargas, int numeroDeAssentos) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quantidadeDePortas = quantidadeDePortas;
        this.cilindradas = cilindradas;
        this.capacidadeDeCargas = capacidadeDeCargas;
        this.numeroDeAssentos = numeroDeAssentos;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        if (quantidadeDePortas > 0) {
            System.out.println("Quantidade de Portas: " + quantidadeDePortas);
        }
        if (cilindradas > 0) {
            System.out.println("Cilindradas: " + cilindradas);
        }
        if (capacidadeDeCargas > 0) {
            System.out.println("Capacidade de Cargas: " + capacidadeDeCargas + " kg");
        }
        if (numeroDeAssentos > 0) {
            System.out.println("Número de Assentos: " + numeroDeAssentos);
        }
    }

    public void mover() {
        System.out.println("O veículo está se movendo");
    }
}
