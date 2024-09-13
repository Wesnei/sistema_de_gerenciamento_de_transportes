public class Carro extends Veiculos {

    public Carro(String marca, String modelo, String ano, int quantidadeDePortas) {
        super(marca, modelo, ano, quantidadeDePortas, 0, 0, 0);
    }

    @Override
    public void mover() {
        System.out.println("O carro está acelerando na estrada");
    }
}
