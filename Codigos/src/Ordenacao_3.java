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

        String[][] dadosOrdenados1 = new String[TAM/4][];
        String[][] dadosOrdenados2 = new String[TAM/4][];
        String[][] dadosOrdenados3 = new String[TAM/4][];
        String[][] dadosOrdenados4 = new String[TAM/4][];

        String[][] meiaParticao = new String[TAM/2][];

        String[][] dadosAlterados = new String[TAM][];
        String[][] aux = MelhorCaso(LAMetroTrips);
        String[][] piorCaso = new String[TAM][];
        piorCaso[0] = aux[0];
        for (int i = 1, j = TAM-1; i < TAM; i++ , j--){
            aux[i] = piorCaso[j];
        }
        // INSERTION SORT
        // Executa arquivo em médio caso
        dadosOrdenados1 = Algoritmos_3.InsertionSort(particao1, Coluna);
        dadosOrdenados2 = Algoritmos_3.InsertionSort(particao2, Coluna);
        dadosOrdenados3 = Algoritmos_3.InsertionSort(particao3, Coluna);
        dadosOrdenados4 = Algoritmos_3.InsertionSort(particao4, Coluna);

        meiaParticao = Unir(dadosOrdenados1, dadosOrdenados2, 2);
        dadosAlterados = Algoritmos_3.InsertionSort(meiaParticao, Coluna);
        meiaParticao = Unir(dadosOrdenados3, dadosOrdenados4, 2);
        aux = Algoritmos_3.InsertionSort(meiaParticao, Coluna);

        dadosAlterados = Unir(dadosAlterados, aux, 1);
        dadosAlterados = Algoritmos_3.InsertionSort(dadosAlterados, Coluna);

/*
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_insertionSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.InsertionSort(dadosAlterado, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_nsertionSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.InsertionSort(dadosAlterado, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_insertionSort_piorCaso.csv");
        System.out.println("Insrtion");*/
/* 
       // SELECTION SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_3.SelectionSort(LAMetroTrips,Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_selectionSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.SelectionSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_selectionSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.SelectionSort(dadosAlterados, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_selectionSort_piorCaso.csv");
         /*
        // QUICK SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_3.QuickSort(LAMetroTrips, 1, TA, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.QuickSort(dadosAlterados, 1, TA, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.QuickSort(dadosAlterados, 1, TA, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSort_piorCaso.csv");

        // HEAP SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_3.HeapSort(LAMetroTrip, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_heapSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.HeapSort(dadosAlterado, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_heapSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.HeapSort(dadosAlterado, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_heapSort_piorCaso.csv");

        // MERGE SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_3.MergeSort(LAMetroTrips,1,TA, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_mergeSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.MergeSort(dadosAlterados,1,TA, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_mergeSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.MergeSort(dadosAlterados,1,TA, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_mergeSort_piorCaso.csv");

        // COUTING SORT
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_3.CoutingSort(LAMetroTrip, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_coutingSort_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.CoutingSort(dadosAlterado, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_coutingSort_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.CoutingSort(dadosAlterado, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_coutingSort_piorCaso.csv");

        // QUICK SORT MEDIANA DE TRES
        dadosAlterados = LAMetroTrips;
        // Executa arquivo em médio caso
        dadosAlterados = Algoritmos_3.QuickSortMedianaDeTres(LAMetroTrips, 1, TA, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSortMedianaDeTres_medioCaso.csv");
        // Executa arquivo em melhor caso
        dadosAlterados = Algoritmos_3.QuickSortMedianaDeTres(LAMetroTrips, 1, TA, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSortMedianaDeTres_melhorCaso.csv");
        // Inverte valores da matriz para ordena-lo no pior caso
        dadosAlterados = piorCaso;
        dadosAlterados = Algoritmos_3.QuickSortMedianaDeTres(LAMetroTrips, 1, TA, Coluna);
        Main.AdicionaVirgula(dadosAlterados, "LAMetroTrips_start_time_quickSortMedianaDeTres_piorCaso.csv");
*/
    }
    public static String TransformarData(String elemento) {
        String[] divide = elemento.split("/");
        String data;

        if(Integer.parseInt(divide[1]) > 12){
            String[] aux = divide[2].split(" ");
            data = aux[0]+divide[0]+divide[1];
        }else{
            String[] aux = divide[2].split(" ");
            data = aux[0]+divide[0]+divide[1];
        }

       return data;
    }
    public static String[][] MelhorCaso(String[][] matrix) {
        Algoritmos_2.MergeSort(matrix, 1, matrix.length, 2);
        return matrix;
    }
    public static void Separar(String[][] matriz) {
        int particao = matriz.length/4;

        particao1[0] = matriz[0];
        particao1 = CriarParticao(matriz, particao, 1);        
        particao2 = CriarParticao(matriz, particao, 2);
        particao3 = CriarParticao(matriz, particao, 3);
        particao4 = CriarParticao(matriz, particao, 4);

    }

    public static String[][] CriarParticao(String[][] matrix, int particao, int num) {
        int tamanho = particao * (num);
        String[][] matriz = new String[particao][];
        for (int i = tamanho, j = 0; i < (tamanho+particao); i++, j++)
            matriz[j] = matrix[i];
        
        return matriz;
    }
    public static String[][] Unir(String[][] concatenar1, String[][] concatenar2, int num){
        
        String[][] primeiraMetade = new String[TAM/2][];
        String[][] segundaMetade = new String[TAM/2][];

    for (int i = 1, j = 0; i < (TAM/2) && j < (TAM/2); i++, j++){
        //if(concatenar1 < )
        primeiraMetade[i] = concatenar1[j];
        
    }

    String[][] uniao_1 = Algoritmos_2.MergeSort(primeiraMetade, 1, primeiraMetade.length, 2);
    String[][] uniao_2 = Algoritmos_2.MergeSort(segundaMetade, 0, segundaMetade.length, 2);

    for (int i = 1, j = 0; i < (TAM/2); i++, j++)
        primeiraMetade[i] = concatenar1[j];
        
    }
}
