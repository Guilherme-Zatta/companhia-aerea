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

        int fileira = 20;
        int poltrona = 11;
        int[][] tabela = new int[fileira][poltrona];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < fileira; i++) {
            // percorre as colunas
            for (int j = 0; j < poltrona; j++) {
            //  tabela[i][j] = random.nextInt(10, 13);

    }
}
