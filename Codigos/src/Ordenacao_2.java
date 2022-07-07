import java.io.IOException;

public class Ordenacao_2 {


    public static final int Coluna = 1;

    public static void Duration(String[][] LAMetroTrips) {

        try {
            CriarArquivos(LAMetroTrips);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void CriarArquivos(String[][] LAMetroTrips) throws IOException {
        int TAM = LAMetroTrips.length;
        
        // INSERTION SORT
        // Executa arquivo em médio caso
        String[][] dadosAlterados = LAMetroTrips;
        String[][] piorCaso = new String[TAM][];

    
        dadosAlterados = Algoritmos_2.InsertionSort(LAMetroTrips);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_insertionSort_medioCaso");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_2.InsertionSort(dadosAlterados);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_insertionSort_melhorCaso");
        // Inverte valores da matriz para ordena-lo no pior caso
        for (int i = 1, j = TAM-1; i < TAM; i++ , j--){
            piorCaso[i] = dadosAlterados[j];
        }
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_2.InsertionSort(dadosAlterados);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_insertionSort_piorCaso");
    
        // SELECTION SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_2.SelectionSort(LAMetroTrips, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_selectionSort_medioCaso");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_2.SelectionSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_selectionSort_melhorCaso");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_2.SelectionSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_selectionSort_piorCaso");
        
        // QUICK SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_2.QuickSort(LAMetroTrips, 1, TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_quickSort_medioCaso");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_2.QuickSort(dadosAlterados, 1, TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_quickSort_melhorCaso");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_2.QuickSort(dadosAlterados, 1, TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_quickSort_piorCaso");

        // HEAP SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_2.HeapSort(LAMetroTrips, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_heapSort_medioCaso");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_2.HeapSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_heapSort_melhorCaso");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_2.HeapSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_heapSort_piorCaso");

        // MERGE SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_2.MergeSort(LAMetroTrips,1,TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_mergeSort_medioCaso");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_2.MergeSort(dadosAlterados,1,TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_mergeSort_melhorCaso");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_2.MergeSort(dadosAlterados,1,TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_mergeSort_piorCaso");

        // COUTING SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_2.CoutingSort(LAMetroTrips, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_coutingSort_medioCaso");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_2.CoutingSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_coutingSort_melhorCaso");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_2.CoutingSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_coutingSort_piorCaso");

        // QUICK SORT MEDIANA DE TRES
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_2.QuickSortMedianaDeTres(LAMetroTrips, 1, TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_quickSortMedianaDeTres_medioCaso");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_2.QuickSortMedianaDeTres(LAMetroTrips, 1, TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_quickSortMedianaDeTres_melhorCaso");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_2.QuickSortMedianaDeTres(LAMetroTrips, 1, TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_quickSortMedianaDeTres_piorCaso");

    }
}
