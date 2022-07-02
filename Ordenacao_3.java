import java.io.IOException;

public class Ordenacao_3 {

    public static final int Coluna = 2;

    public static void Star_time(String[][] LAMetroTrips) {

        try {
            CriarArquivos(LAMetroTrips);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void CriarArquivos(String[][] LAMetroTrips) throws IOException {
        int TAM = LAMetroTrips.length;

        // INSERTION SORT
        // Executa arquivo em médio caso
        String[][] dadosAlterados = LAMetroTrips;
        String[][] piorCaso = PiorCaso(LAMetroTrips, 1, TAM);

        dadosAlterados = Algoritmos.InsertionSort(LAMetroTrips, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_Algoritmos.insertionSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos.InsertionSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_Algoritmos.insertionSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos.InsertionSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_Algoritmos.insertionSort_piorCaso.csv");

        // SELECTION SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos.SelectionSort(LAMetroTrips, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_selectionSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos.SelectionSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_selectionSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos.SelectionSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_selectionSort_piorCaso.csv");
        
        // BUBBLE SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos.BubbleSort(LAMetroTrips, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_bubbleSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos.BubbleSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_bubbleSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos.BubbleSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_bubbleSort_piorCaso.csv");

        // QUICK SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos.QuickSort(LAMetroTrips, 1, TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos.QuickSort(dadosAlterados, 1, TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos.QuickSort(dadosAlterados, 1, TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSort_piorCaso.csv");

        // HEAP SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos.HeapSort(LAMetroTrips, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_heapSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos.HeapSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_heapSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos.HeapSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_heapSort_piorCaso.csv");

        // MERGE SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos.MergeSort(LAMetroTrips,1,TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_mergeSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos.MergeSort(dadosAlterados,1,TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_mergeSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos.MergeSort(dadosAlterados,1,TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_mergeSort_piorCaso.csv");

        // COUTING SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos.CoutingSort(LAMetroTrips, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_coutingSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos.CoutingSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_coutingSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos.CoutingSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_coutingSort_piorCaso.csv");

        // QUICK SORT MEDIANA DE TRES
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos.QuickSortMedianaDeTres(LAMetroTrips, 1, TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSortMedianaDeTres_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos.QuickSortMedianaDeTres(LAMetroTrips, 1, TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSortMedianaDeTres_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos.QuickSortMedianaDeTres(LAMetroTrips, 1, TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSortMedianaDeTres_piorCaso.csv");

    }
    public static String[][] PiorCaso(String[][] vetor, int inicio, int fim) {
        if(inicio < fim - 1) {
            int meio = (inicio + fim) / 2;
            PiorCaso(vetor, inicio, meio);
            PiorCaso(vetor, meio, fim);
            Intercala(vetor, inicio, meio, fim);
        }

        return vetor;
    }

    private static void Intercala(String[][] vetor, int inicio, int meio, int fim) {
        String[][] novoVetor = new String[fim - inicio][];
        int i = inicio;
        int m = meio;
        int pos = 0;
        while(i < meio && m < fim) {
          if(Integer.parseInt(vetor[i][1]) <= Integer.parseInt(vetor[m][Coluna])) {
            novoVetor[pos] = vetor[i];
            pos = pos + 1;
            i = i + 1;
          } else {
            novoVetor[pos] = vetor[m];
            pos = pos + 1;
            m = m + 1;
          }
        }
        while(i < meio) {
          novoVetor[pos] = vetor[i];
          pos = pos + 1;
          i = i + 1;
        }
        while(m < fim) {
            novoVetor[pos] = vetor[m];
            pos = pos + 1;
            m = m + 1;
        }
        for(pos = 0, i = inicio; i < fim; i++, pos++) {
            vetor[i] = novoVetor[pos];  
        }
    }
}