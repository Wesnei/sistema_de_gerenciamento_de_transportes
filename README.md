# Projeto de Gerenciamento de Veículos

Este projeto é uma aplicação Java para gerenciamento de diferentes tipos de veículos, incluindo carros, motos, caminhões e ônibus. A aplicação demonstra conceitos de programação orientada a objetos, herança e sobrescrita de métodos em Java.

## Sumário

- [Descrição do Projeto](#descrição-do-projeto)
- [Funcionalidades](#funcionalidades)
- [Instalação](#instalação)
- [Uso](#uso)
- [Exemplos](#exemplos)
- [Contribuições](#contribuições)
- [Licença](#licença)

## Descrição do Projeto
O projeto visa criar uma estrutura para gerenciar diferentes tipos de veículos, 
com a capacidade de exibir detalhes específicos e comportamentos variados para cada tipo de veículo. Utiliza a orientação a objetos para demonstrar herança e polimorfismo.

### Tipos de Veículos

- **Carro**: Representa um carro com atributos específicos como quantidade de portas.
- **Moto**: Representa uma moto com atributos como cilindradas.
- **Caminhão**: Representa um caminhão com atributos como capacidade de carga.
- **Ônibus**: Representa um ônibus com atributos como número de assentos.

## Funcionalidades

- **Gerenciamento de Veículos**: Adiciona e manipula diferentes tipos de veículos.
- **Exibição de Detalhes**: Mostra detalhes específicos para cada tipo de veículo.
- **Movimentação**: Cada tipo de veículo tem um comportamento de movimento distinto.

## Instalação

1. **Clone o Repositório**

   ```bash
   git clone https://github.com/Wesnei/sistema_de_gerenciamento_de_transportes.git
   ```

2. **Navegue até o Diretório do Projeto**

   ```bash
   cd Veiculo
   ```

3. **Compile o Código**

   Certifique-se de ter o JDK 22 instalado. Compile o código usando:

   ```bash
   javac -d out src/**/*.java
   ```

4. **Execute o Código**

   Após a compilação, execute a classe `Main`:

   ```bash
   java -cp out Main
   ```

## Uso

Após a execução, o programa criará instâncias dos diferentes tipos de veículos e exibirá detalhes e mensagens específicas para cada um.

### Exemplo de Saída

```
O carro está acelerando na estrada
A moto está acelerando na estrada
O caminhão está transportando carga
O ônibus está transportando passageiros

Marca: Volkswagen
Modelo: Gol
Ano: 2014
Quantidade de Portas: 4

Marca: Honda
Modelo: Bros
Ano: 2020
Cilindradas: 150

Marca: Mercedes
Modelo: F1000
Ano: 2002
Capacidade de Cargas: 5000.0 kg

Marca: Marcopolo
Modelo: Paradiso
Ano: 2012
Número de Assentos: 45
```

## Contribuições

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork do projeto.
2. Crie uma nova branch (`git checkout -b minha-branch`).
3. Faça suas alterações e commit (`git commit -am 'Adiciona nova funcionalidade'`).
4. Faça o push para a branch (`git push origin minha-branch`).
5. Crie um Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.



