import java.io.IOException;

public class Ordenacao_3 {

    public static final int TAM = 10;

    public static void Star_time(String[][] LAMetroTrips) {
        String[] data = new String[TAM];
        int[] dataInt = new int[TAM];

        for (int i = 1, j = 0; i < TAM; i++, j++) {
            data[j] = LAMetroTrips[i][2];
            data[j] = transformarData(data[j]);
            dataInt[j] = Integer.parseInt(data[j]);
        }
        try {
            CriarArquivos(LAMetroTrips, dataInt);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void CriarArquivos(String[][] LAMetroTrips, int[] dataInt) throws IOException {
        // INSERTION SORT
        // Executa arquivo em médio caso
        String[][] dadosAlterados = LAMetroTrips;

        dadosAlterados = Algoritmos.InsertionSort(LAMetroTrips, dataInt);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_Algoritmos.insertionSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos.InsertionSort(dadosAlterados, dataInt);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_Algoritmos.insertionSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = PiorCaso(LAMetroTrips, dataInt);
        dadosAlterados = Algoritmos.InsertionSort(dadosAlterados, dataInt);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_Algoritmos.insertionSort_piorCaso.csv");

        // SELECTION SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = SelectionSort(LAMetroTrips, dataInt);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_selectionSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = SelectionSort(dadosAlterados, dataInt);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_selectionSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = PiorCaso(LAMetroTrips, dataInt);
        dadosAlterados = SelectionSort(dadosAlterados, dataInt);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_selectionSort_piorCaso.csv");

        // QUICK SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        //vetor,0,vetor.length-1
        dadosAlterados = QuickSort(LAMetroTrips, dataInt, 0, dataInt.length);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = QuickSort(LAMetroTrips, dataInt, 0, dataInt.length);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = PiorCaso(LAMetroTrips, dataInt);
        dadosAlterados = QuickSort(LAMetroTrips, dataInt, 0, dataInt.length);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSort_piorCaso.csv");

    }
    
    public static String TransformarData(String data) {
        String[] aux = data.split("/");
        String aux2 = aux[2];
        String[] aux3 = aux2.split(" ");
        String newData = aux3[0];

        newData += aux[0];
        newData += aux[1];

        return newData;
    }
    public static String[][] PiorCaso(String[][] table, int[] vetor) {
        for (int i = 1; i < vetor.length - 1; i++) {
            for (int j = 1; j < vetor.length - 1 - i; j++) {
                if (vetor[j] < vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;

                    String Aux = table[j][2];
                    table[j][2] = table[j + 1][2];
                    table[j + 1][2] = Aux;
                }
            }
        }
        return table;
    }
}