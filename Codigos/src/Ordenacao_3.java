import java.io.IOException;

public class Ordenacao_3 {

    public static final int Coluna = 2;

    public static void Star_time(String[][] LAMetroTrips) {
        String[] dataInt = TransformarData(LAMetroTrips);
        
        try {
            CriarArquivos(LAMetroTrips, dataInt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void CriarArquivos(String[][] LAMetroTrips, String[] dataInt) throws IOException {
        int TAM = LAMetroTrips.length;
        // INSERTION SORT
        // Executa arquivo em médio caso
        String[][] dadosAlterados = LAMetroTrips;
        String[][] piorCaso = PiorCaso(LAMetroTrips, 1, TAM);

        dadosAlterados = Algoritmos_3.InsertionSort(LAMetroTrips,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_insertionSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.InsertionSort(dadosAlterados,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_nsertionSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.InsertionSort(dadosAlterados,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_insertionSort_piorCaso.csv");

        // SELECTION SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_3.SelectionSort(LAMetroTrips,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_selectionSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.SelectionSort(dadosAlterados,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_selectionSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.SelectionSort(dadosAlterados,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_selectionSort_piorCaso.csv");
        
        // QUICK SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_3.QuickSort(LAMetroTrips, 1, TAM,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.QuickSort(dadosAlterados, 1, TAM,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.QuickSort(dadosAlterados, 1, TAM,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSort_piorCaso.csv");

        // HEAP SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_3.HeapSort(LAMetroTrips,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_heapSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.HeapSort(dadosAlterados,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_heapSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.HeapSort(dadosAlterados,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_heapSort_piorCaso.csv");

        // MERGE SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_3.MergeSort(LAMetroTrips,1,TAM,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_mergeSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.MergeSort(dadosAlterados,1,TAM,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_mergeSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.MergeSort(dadosAlterados,1,TAM,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_mergeSort_piorCaso.csv");

        // COUTING SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_3.CoutingSort(LAMetroTrips,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_coutingSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.CoutingSort(dadosAlterados,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_coutingSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.CoutingSort(dadosAlterados,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_coutingSort_piorCaso.csv");

        // QUICK SORT MEDIANA DE TRES
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_3.QuickSortMedianaDeTres(LAMetroTrips, 1, TAM,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSortMedianaDeTres_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.QuickSortMedianaDeTres(LAMetroTrips, 1, TAM,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSortMedianaDeTres_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.QuickSortMedianaDeTres(LAMetroTrips, 1, TAM,dataInt, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSortMedianaDeTres_piorCaso.csv");

    }
    private static String[] TransformarData(String[][] matriz) {
        // DATA = 20/11/2016 00:00  ResultadoFinal = 20161120
        String[] dataInt = new String[matriz.length];
        dataInt[0] = "0";
        for (int i = 1; i < matriz.length; i++){
            
            String aux = matriz[i][Coluna];
            String[] vetorAux = aux.split("/");
            aux = vetorAux[1]+vetorAux[0];
            vetorAux = vetorAux[2].split(" ");
            matriz[i][Coluna] = vetorAux[0] + aux;
            
            dataInt[i] = matriz[i][Coluna];
        }
        return dataInt;
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
          if(Integer.parseInt(vetor[i][Coluna]) <= Integer.parseInt(vetor[m][Coluna])) {
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