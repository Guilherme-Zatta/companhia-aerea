import java.util.HashMap;
import java.util.Map;
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

        // Mapa para armazenar os assentos - Esse foi novidade, mas entendi como utilizar 
        Map<String, Assento> assentos = new HashMap<>();

        // Preenchendo o mapa com os assentos
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 11; j++) {
                Assento assento;
                if (i <= 5) {
                    assento = new AssentoPrimeiraClasse();
                } else {
                    assento = new AssentoEconomico();
                }
                assentos.put(i + " " + j, assento);
            }
        }

        // Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Loop para interagir com o usuário
        while (true) {
            System.out.print("Informe a fileira e a poltrona desejadas (Ex: 5 10): ");
            String[] input = scanner.nextLine().split(" ");
            int fileira = Integer.parseInt(input[0]);
            int poltrona = Integer.parseInt(input[1]);

            // Verificando se a entrada é válida
            if (fileira < 1 || fileira > 20 || poltrona < 1 || poltrona > 11) {
                System.out.println("Fileira ou poltrona inválida. Tente novamente.");
                continue;
            }

            // Obtendo o assento desejado
            Assento assento = assentos.get(fileira + " " + poltrona);

            // Verificando se o assento está disponível e realizando a reserva
            if (assento.reservar()) {
                double preco = (fileira <= 5) ? 3000.00 : 250.00;
                System.out.println("Assento reservado com sucesso. Valor da reserva: R$" + preco);
            } else {
                System.out.println("Assento ocupado. Escolha outro assento.");
            }
        }
    }
}