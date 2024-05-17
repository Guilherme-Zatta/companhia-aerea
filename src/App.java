import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

/*  "Uma companhia aérea está adquirindo uma nova aeronave do tipo widebody, que possui dois corredores com 3 fileiras cada, sendo que as fileiras das janelas possuem 3 assentos 
    e a fileira do meio possui 5 poltronas. A aeronave possui um total de 20 fileiras.
    
    Vamos criar um programa no qual o usuário possa informar a fileira e a poltrona desejadas. 
    As fileiras devem ser identificadas de 1 a 20 e as poltronas de 1 a 11. 
    O usuário deverá informar a posição, por exemplo 5 10, e então o programa deverá: se o assento estiver livre, reservar o assento e imprimir o valor, em reais, da reserva; 
    ou se o assento já estiver ocupado, imprimir que ele está ocupado. Os assentos das cinco primeiras fileiras são assentos de primeira classe, 
    cujo valor é diferenciado dos outros assentos, que são assentos econômicos. 
    Os assentos devem ser representados por objetos de classes que implementam a interface Assento, que possui o método abstrato ‘reservar’, 
    de forma que AssentoEconomico e AssentoPrimeiraClasse sejam classes diferentes."    
*/

        // Criar matriz para representar os assentos da aeronave
        Assento[][] assentos = new Assento[20][11];
        // Inicializar todos os assentos como econômicos
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 11; j++) {
                assentos[i][j] = new AssentoEconomico();
            }
        }

        // Inicializar os assentos das cinco primeiras fileiras como primeira classe
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
                assentos[i][j] = new AssentoPrimeiraClasse();
            }
        }

        // Pedir ao usuário para informar a fileira e a poltrona desejadas
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a fileira e a poltrona desejadas (exemplo: 5 10):");
        int fileira = scanner.nextInt() - 1; // Subtrair 1 para converter para índice de matriz
        int poltrona = scanner.nextInt() - 1; // Subtrair 1 para converter para índice de matriz

        // Verificar se o assento está livre e reservá-lo, ou informar que está ocupado
        if (fileira >= 0 && fileira < 20 && poltrona >= 0 && poltrona < 11) {
            if (assentos[fileira][poltrona].reservar()) {
                System.out.println("Assento reservado com sucesso.");
                // Aqui você pode adicionar a lógica para calcular e imprimir o valor da reserva
            } else {
                System.out.println("Assento ocupado.");
            }
        } else {
            System.out.println("Assento inválido.");
        }

        scanner.close();
    }
}