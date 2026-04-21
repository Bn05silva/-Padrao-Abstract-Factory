package Fabricas;

import Produtos.Carro;
import Produtos.CarroBasico;


public class BasicoFactory implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new CarroBasico();
    }
}
