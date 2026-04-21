# Padrão Abstract Factory em Java

Este projeto demonstra a implementação do **padrão de projeto Abstract Factory** em Java, criando diferentes tipos de carros (básico e luxo) através de fábricas especializadas.

## Estrutura do Projeto

- **App** → Classe principal que utiliza uma fábrica para criar um carro sem conhecer sua implementação concreta.
- **Carro (interface)** → Define o contrato para os carros.
- **CarroBasico / CarroLuxo** → Implementações concretas da interface `Carro`.
- **CarroFactory (interface)** → Define o contrato para as fábricas de carros.
- **BasicoFactory / LuxoFactory** → Implementações concretas da interface `CarroFactory`.

## Diagrama UML

O diagrama abaixo representa a relação entre as classes e interfaces:

- `<<interface>> Carro` é implementada por `CarroBasico` e `CarroLuxo`.
- `<<interface>> CarroFactory` é implementada por `BasicoFactory` e `LuxoFactory`.
- `App` depende de `CarroFactory` para criar objetos do tipo `Carro`.
