package Fabricas;

import Produtos.Carro;
import Produtos.CarroLuxo;


public class LuxoFactory implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new CarroLuxo();
    }
}
