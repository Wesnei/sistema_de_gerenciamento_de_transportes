public class Caminhao extends Veiculos {

    public Caminhao(String marca, String modelo, String ano, double capacidadeDeCargas) {
        super(marca, modelo, ano, 0, 0, capacidadeDeCargas, 0);
    }

    @Override
    public void mover() {
        System.out.println("O caminhão está transportando carga");
    }
}
