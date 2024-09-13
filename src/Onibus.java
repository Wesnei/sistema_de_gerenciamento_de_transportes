public class Onibus extends Veiculos {

    public Onibus(String marca, String modelo, String ano, int numeroDeAssentos) {
        super(marca, modelo, ano, 0, 0, 0, numeroDeAssentos);
    }

    @Override
    public void mover() {
        System.out.println("O ônibus está transportando passageiros");
    }
}
