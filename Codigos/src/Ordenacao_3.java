import java.io.IOException;

public class Ordenacao_3 {

    public static final int Coluna = 2;
    public static final int TAM = App.TAM;

    public static String[][] particao1;
    public static String[][] particao2;
    public static String[][] particao3;
    public static String[][] particao4;

    public static void Star_time(String[][] LAMetroTrips) {
        try {
            CriarArquivos(LAMetroTrips);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void CriarArquivos(String[][] LAMetroTrips) throws IOException {
        int TAM = LAMetroTrips.length;

        String[][] dadosAlterados = new String[TAM][];
        String[][] piorCaso = new String[TAM][];

        // MERGE SORT
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_3.MergeSort(LAMetroTrips,1,TAM, Coluna);
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_mergeSort_medioCaso.csv");
        piorCaso[0] = dadosAlterados[0];
        for (int i = 1, j = TAM-1; i < TAM; i++ , j--){
            piorCaso[i] = dadosAlterados[j];
        }
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.MergeSort(dadosAlterados,1,TAM, Coluna);
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_mergeSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.MergeSort(dadosAlterados,1,TAM, Coluna);
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_mergeSort_piorCaso.csv");
    /*
       // HEAP SORT 
        dadosAlterados = LAMetroTrips;
        dadosAlterados[0][Coluna] = "0";
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_3.HeapSort(dadosAlterados, Coluna);
        dadosAlterados[0][Coluna] = "start_time";
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_heapSort_medioCaso");
        // Executa arquivo em melhor caso
        dadosAlterados[0][Coluna] = "0";
        dadosAlterados = Algoritmos_3.HeapSort(dadosAlterados, Coluna);
        dadosAlterados[0][Coluna] = "start_time";
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_heapSort_melhorCaso");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados[0][Coluna] = "0";
        dadosAlterados = Algoritmos_3.HeapSort(dadosAlterados, Coluna);
        dadosAlterados[0][Coluna] = "start_time";
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_heapSort_piorCaso");
    */
        // INSERTION SORT
        // Executa o arquivo em medio caso
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_insertionSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.InsertionSort(dadosAlterados, Coluna);
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_insertionSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.InsertionSort(dadosAlterados, Coluna);
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_insertionSort_piorCaso.csv");
    /*
        // SELECTION SORT
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_3.SelectionSort(LAMetroTrips,Coluna);
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_selectionSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.SelectionSort(dadosAlterados, Coluna);
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_selectionSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.SelectionSort(dadosAlterados, Coluna);
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_selectionSort_piorCaso.csv");
    */
    /*      
        // QUICK SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_3.QuickSort(LAMetroTrips, 1, TAM-1, Coluna);
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSort_medioCaso.csv");
        piorCaso[0] = dadosAlterados[0];
        for (int i = 1, j = TAM-1; i < TAM; i++ , j--){
            piorCaso[i] = dadosAlterados[j];
        }
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.QuickSort(dadosAlterados, 1, TAM-1, Coluna);
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.QuickSort(dadosAlterados, 1, TAM-1, Coluna);
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSort_piorCaso.csv");
    */
    /*
        // COUTING SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_3.CoutingSort(LAMetroTrips, Coluna);
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_coutingSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.CoutingSort(dadosAlterados, Coluna);
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_coutingSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.CoutingSort(dadosAlterados, Coluna);
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_coutingSort_piorCaso.csv");
    */
    /*
        // QUICK SORT MEDIANA DE TRES
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_3.QuickSortMedianaDeTres(LAMetroTrips, 1, TAM, Coluna);
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSortMedianaDeTres_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.QuickSortMedianaDeTres(LAMetroTrips, 1, TAM, Coluna);
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSortMedianaDeTres_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.QuickSortMedianaDeTres(LAMetroTrips, 1, TAM, Coluna);
        App.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSortMedianaDeTres_piorCaso.csv");
    */
    }
    public static String TransformarData(String elemento) {
        String[] divide = elemento.split("/");
        String data;

        if(Integer.parseInt(divide[1]) > 12){
            String[] aux = divide[2].split(" ");
            data = aux[0]+divide[0]+divide[1];
            //divide = aux[1].split(":");
            //data += divide[0]+divide[1];
        }else{
            String[] aux = divide[2].split(" ");
            data = aux[0]+divide[1]+divide[0];
            //divide = aux[1].split(":");
            //data += divide[0]+divide[1];
        }

       return data;
    }
}