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

    public static void CriarArquivos(String[][] LAMetroTrips) throws IOException {
        int TAM = LAMetroTrips.length;

        // INSERTION SORT
        // Executa arquivo em médio caso
        String[][] dadosAlterados = LAMetroTrips;
        String[][] piorCaso = Ordenacao_3.PiorCaso(LAMetroTrips, 1, TAM);

        dadosAlterados = Algoritmos.InsertionSort(LAMetroTrips, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_Algoritmos.insertionSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos.InsertionSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_Algoritmos.insertionSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos.InsertionSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_Algoritmos.insertionSort_piorCaso.csv");

        // SELECTION SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos.SelectionSort(LAMetroTrips, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_selectionSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos.SelectionSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_selectionSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos.SelectionSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_selectionSort_piorCaso.csv");
        
        // BUBBLE SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos.BubbleSort(LAMetroTrips, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_bubbleSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos.BubbleSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_bubbleSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos.BubbleSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_bubbleSort_piorCaso.csv");

        // QUICK SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos.QuickSort(LAMetroTrips, 1, TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_quickSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos.QuickSort(dadosAlterados, 1, TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_quickSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos.QuickSort(dadosAlterados, 1, TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_quickSort_piorCaso.csv");

        // HEAP SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos.HeapSort(LAMetroTrips, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_heapSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos.HeapSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_heapSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos.HeapSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_heapSort_piorCaso.csv");

        // MERGE SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos.MergeSort(LAMetroTrips,1,TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_mergeSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos.MergeSort(dadosAlterados,1,TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_mergeSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos.MergeSort(dadosAlterados,1,TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_mergeSort_piorCaso.csv");

        // COUTING SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos.CoutingSort(LAMetroTrips, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_coutingSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos.CoutingSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_coutingSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos.CoutingSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_coutingSort_piorCaso.csv");

        // QUICK SORT MEDIANA DE TRES
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos.QuickSortMedianaDeTres(LAMetroTrips, 1, TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_quickSortMedianaDeTres_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos.QuickSortMedianaDeTres(LAMetroTrips, 1, TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_quickSortMedianaDeTres_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos.QuickSortMedianaDeTres(LAMetroTrips, 1, TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_quickSortMedianaDeTres_piorCaso.csv");

    }
}