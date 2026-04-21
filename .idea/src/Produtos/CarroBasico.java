package Produtos;

public class CarroBasico implements Carro {
    @Override
    public void montar() {
        System.out.println("Montando carro básico: motor simples, bancos de temido, som padrão.");
    }
}
