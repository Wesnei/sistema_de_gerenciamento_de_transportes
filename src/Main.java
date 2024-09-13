public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Volkswagen", "Gol", "2014", 4);
        Moto moto = new Moto("Honda", "Bros", "2020", 150);
        Caminhao caminhao = new Caminhao("Mercedes", "F1000", "2002", 5000.0);
        Onibus onibus = new Onibus("Marcopolo", "Paradiso", "2012", 45);

        carro.mover();
        moto.mover();
        caminhao.mover();
        onibus.mover();

        carro.exibirDetalhes();
        moto.exibirDetalhes();
        caminhao.exibirDetalhes();
        onibus.exibirDetalhes();
    }
}
