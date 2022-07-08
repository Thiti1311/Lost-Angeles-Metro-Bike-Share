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
        int TAM = App.TAM;
        
        // INSERTION SORT
        // Executa arquivo em médio caso
        String[][] dadosAlterados = LAMetroTrips;
        String[][] piorCaso = new String[TAM][];

        // MERGE SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_2.MergeSort(LAMetroTrips,1,TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_mergeSort_medioCaso");

        piorCaso[0] = dadosAlterados[0];
        for (int i = 1, j = TAM-1; i < TAM; i++ , j--){
            piorCaso[i] = dadosAlterados[j];
        }

        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_2.MergeSort(dadosAlterados,1,TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_mergeSort_melhorCaso");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_2.MergeSort(dadosAlterados,1,TAM, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_mergeSort_piorCaso");

        // HEAP SORT 
        dadosAlterados = LAMetroTrips;
        dadosAlterados[0][1] = "0";
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_2.HeapSort(dadosAlterados, Coluna);
        dadosAlterados[0][1] = "duration";
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_heapSort_medioCaso");
        // Executa arquivo em melhor caso
        dadosAlterados[0][1] = "0";
        dadosAlterados = Algoritmos_2.HeapSort(dadosAlterados, Coluna);
        dadosAlterados[0][1] = "duration";
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_heapSort_melhorCaso");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados[0][1] = "0";
        dadosAlterados = Algoritmos_2.HeapSort(dadosAlterados, Coluna);
        dadosAlterados[0][1] = "duration";
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_heapSort_piorCaso");

        // InsertionSort
        // Executa o arquivo em medio caso 
        dadosAlterados = Algoritmos_2.InsertionSort(LAMetroTrips);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_insertionSort_medioCaso");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_2.InsertionSort(dadosAlterados);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_insertionSort_melhorCaso");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_2.InsertionSort(dadosAlterados);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_insertionSort_piorCaso");
   
        // SELECTION SORT
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

   /*      // QUICK SORT
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_2.QuickSort(LAMetroTrips, 0, TAM-1, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_quickSort_medioCaso");
        piorCaso[0] = dadosAlterados[0];
        for (int i = 1, j = TAM-1; i < TAM; i++ , j--){
            piorCaso[i] = dadosAlterados[j];
        }
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_2.QuickSort(dadosAlterados, 1, TAM-1, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_quickSort_melhorCaso");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_2.QuickSort(dadosAlterados, 1, TAM-1, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_quickSort_piorCaso");

*//*
        // COUTING SORT
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_2.CoutingSort(LAMetroTrips, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_coutingSort_medioCaso");

        piorCaso[0] = dadosAlterados[0];
        for (int i = 1, j = TAM-1; i < TAM; i++ , j--){
            piorCaso[i] = dadosAlterados[j];
        }

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
        dadosAlterados = Algoritmos_2.QuickSortMedianaDeTres(LAMetroTrips, 1, TAM-1, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_quickSortMedianaDeTres_medioCaso");

        piorCaso[0] = dadosAlterados[0];
        for (int i = 1, j = TAM-1; i < TAM; i++ , j--){
            piorCaso[i] = dadosAlterados[j];
        }

        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_2.QuickSortMedianaDeTres(LAMetroTrips, 1, TAM-1, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_quickSortMedianaDeTres_melhorCaso");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_2.QuickSortMedianaDeTres(LAMetroTrips, 1, TAM-1, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_duration_quickSortMedianaDeTres_piorCaso");
*/
    }
    public static String[][] Particiona(String[][] Arquivo){

        int inicio = 1, meio = Arquivo.length/2, fim = Arquivo.length;
        //int um_quarto = Arquivo.length/4, tres_quartos = Arquivo.length - (Arquivo.length/4);

        //goritmos_2.InsertionSort(Arquivo, inicio,meio);
        //Algoritmos_2.InsertionSort(Arquivo, meio,fim);
        
        Intercala(Arquivo, inicio, meio, fim);        
/*
        Algoritmos_2.InsertionSort(Arquivo, inicio,um_quarto);
        Algoritmos_2.InsertionSort(Arquivo, um_quarto,meio);
        
        Intercala(Arquivo, inicio, um_quarto, meio);

      
        Algoritmos_2.InsertionSort(Arquivo, meio,tres_quartos);
        Algoritmos_2.InsertionSort(Arquivo, tres_quartos,fim);
        

        Intercala(Arquivo, meio,tres_quartos, fim);

        Intercala(Arquivo, inicio, meio, fim);
*/
        return Arquivo;
    }
    private static void Intercala(String[][] vetor, int inicio, int meio, int fim) {
        String[][] novoVetor = new String[fim - inicio][];
        int i = inicio;
        int m = meio;
        int pos = 0;
        while(i < meio && m < fim) {
          if(Integer.parseInt(vetor[i][1]) <= Integer.parseInt(vetor[m][1])) {
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
