import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

/**
 * 
 * Exercício 03 - Gado de corte
 * Um grande pecuarista está fazendo um experimento com um lote
 * de 10 cabeças de gado de corte em sua fazenda.
 * O gado de corte come diariamente em média 3% de sua massa,
 * porém o produtor está buscando uma eficiência no consumo de alimentos,
 * onde o esperado é que o animal esteja se alimentando de até 12 Kg
 * de comida no coxo por dia.
 * Neste exercício, gere uma matriz de 10 linhas e 7 colunas,
 * sendo as linhas para os animais e as colunas para os
 * dias da semana (domingo à sábado), onde os valores das colunas
 * devem ser reais e devem ser gerados randomicamente entre 10 e 13 Kg.
 * Após gerar os valores, deverá ser avaliado o consumo
 * em uma semana desses 10 animais, buscando manter um padrão de mais
 * de 60% dos dias de cada animal consumindo menos que 12 Kg.
 * Caso a média de todos os animais seja maior ou igual a 60%,
 * mostrar a mensagem "Meta alcançada! Resultado x%"
 * e caso contrário mostrar a mensagem "Meta não alcançada. Resultado x%"
 */

public class Exercicio03 {
  public static void main(String[] args) {
    // 1- criar a matriz
    int numeroAnimais = 10;
    int numeroDias = 7;
    int[][] tabela = new int[numeroAnimais][numeroDias];

    SecureRandom random = new SecureRandom();
    // 2- gerar os valores da matriz de forma aleatória
    // percorre as linhas
    for (int i = 0; i < numeroAnimais; i++) {
      // percorre as colunas
      for (int j = 0; j < numeroDias; j++) {
        tabela[i][j] = random.nextInt(10, 13);
      }
    }

    // 3- processar os dados e calcular o percentual
    double somaPercentuais = 0;
    // percorre as linhas
    for (int i = 0; i < numeroAnimais; i++) {
      int quantidadeDiasOk = 0;
      
      // percorre as colunas
      for (int j = 0; j < numeroDias; j++) {
        if (tabela[i][j] < 12) {
          quantidadeDiasOk++;
        }
      }

      double percentualOk = (quantidadeDiasOk * 100) / numeroDias;

      // somaPercentuais = somaPercentuais + percentualOk;
      somaPercentuais += percentualOk;

      System.out.println("Percentual: " + percentualOk);
      System.out.println(Arrays.toString(tabela[i]));
    }
    // 4- imprimir os dados
    double percentualGlobal = somaPercentuais / numeroAnimais;

    if (percentualGlobal >= 60) {
      System.out.println("Meta alcançada! Resultado " + percentualGlobal + " %");
    } else {
      System.out.println("Meta não alcançada! Resultado " + percentualGlobal + " %");
    }
  }
}