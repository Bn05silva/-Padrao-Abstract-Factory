package App;

import Fabricas.CarroFactory;
import Fabricas.LuxoFactory;
import Fabricas.BasicoFactory;
import Produtos.Carro;

public class App {
    public static void main(String[] args) {
        CarroFactory factory = new LuxoFactory();

        Carro carro = factory.criarCarro();
        carro.montar();
    }
}
