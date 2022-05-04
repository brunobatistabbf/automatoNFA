import javax.swing.JOptionPane;

public class App {

    static int[] aceitacao = { 2 };
    static int estadoInicial = 0;
    static int[][][] transicao = { { { 0, 1 }, { 0 } },
            { {}, { 2 } },
            { {}, {} } };

    public static void main(String[] args) throws Exception {
        //Realizar a entrada da cadeia
        String entrada = JOptionPane.showInputDialog("Digite a cadeia para analise!");

        //Armazenar conjunto de estados 
        int[] estados = { estadoInicial };
        //TO-DO Aplicar o uso da função teste
        
    }

    private static int[] testar(String entrada, int[]estados, int posicao){
        return null;
    }

}
