/*
* Você está planejando uma viagem de carro e deseja calcular quantos quilômetros poderá percorrer com o
* combustível disponível no tanque. Para isso, você precisa considerar:
*
* O consumo médio do veículo (km/l)
* A capacidade total do tanque de combustível (litros)
* A quantidade de combustível disponível no momento (litros)
* A distância da viagem planejada (km)
*
* Com essas informações, o programa deverá calcular:
* A autonomia máxima do carro (quantos quilômetros pode percorrer com um tanque cheio).
* A autonomia atual, baseada na quantidade de combustível disponível.
* Se a quantidade de combustível atual será suficiente para percorrer um determinado trajeto informado pelo usuário.
*
* Formula de apoio:
* Autonomia máxima = Consumo médio * Capacidade do tanque
* Autonomia atual = Consumo médio * Quantidade de combustível disponível
*
* input:
* consumoMedio = 12.0
* capacidadeTanque = 50.0
* quantidadeCombustivel = 20.0
* distanciaViagem = 150.0
*
* output:
* Autonomia máxima: 600.0 km
* Autonomia atual: 240.0 km
* A quantidade de combustível atual é suficiente para percorrer a viagem? Sim
*
* */

public class DesafioDez {

    public static void main(String[] args) {
        double consumoMedio = 12.0; // km/l
        double capacidadeTanque = 50.0; // litros
        double quantidadeCombustivel = 20.0; // litros
        double distanciaViagem = 150.0; // km

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * quantidadeCombustivel;

        System.out.printf("Autonomia máxima: %.2f km%n", autonomiaMaxima);
        System.out.printf("Autonomia atual: %.2f km%n", autonomiaAtual);

        boolean suficiente = autonomiaAtual >= distanciaViagem;
        System.out.println("A quantidade de combustível atual é suficiente para percorrer a viagem? " + (suficiente ? "Sim" : "Não"));
    }
}
