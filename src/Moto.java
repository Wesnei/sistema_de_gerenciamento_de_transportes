public class Moto extends Veiculos {

    public Moto(String marca, String modelo, String ano, int cilindradas) {
        super(marca, modelo, ano, 0, cilindradas, 0, 0);
    }

    @Override
    public void mover() {
        System.out.println("A moto está acelerando na estrada");
    }
}
