public class Algoritmos_3 {
    private static int tamanho;
    private static String[][] lista;
    public static int column;
    private static int TAM = App.TAM;

    public static String[][] InsertionSort(String[][] matriz, int coluna) {
        String[] key;

        for (int j = 1, i; j < matriz.length; j++) {
            key = matriz[j];

            String data = Ordenacao_3.TransformarData(matriz[j][coluna]);

            for (i = j - 1; (i >= 0) && (Integer.parseInt(data) > Integer.parseInt(key[coluna])); i--) {
                matriz[i + 1][coluna] = matriz[i][coluna];
            }
            matriz[i + 1] = key;
        }
        return matriz;
    }
    public static String[][] SelectionSort(String[][] matriz, int coluna) {
        for (int i = 0; i < TAM - 1; i++) {
            int index = i;
            for (int j = i + 1; j < TAM; j++) {

                String data = Ordenacao_3.TransformarData(matriz[j][coluna]);
                String data_secundaria = Ordenacao_3.TransformarData(matriz[j][coluna]);

                if (Integer.parseInt(data) < Integer.parseInt(data_secundaria)) {
                    index = j;
                }
            }
            String[] smallerNumber = matriz[index];
            matriz[index] = matriz[i];
            matriz[i] = smallerNumber;
        }
        return matriz;
    }
    public static String[][] QuickSort(String[][] matriz, int begin, int end, int coluna) {
        column = coluna;
        if (begin < end) {
            int particaoIndex = Particao(matriz, begin, end);

            QuickSort(matriz, begin, particaoIndex-1, coluna);
            QuickSort(matriz, particaoIndex+1, end, coluna);
        }
        return matriz;
    }

    private static int Particao(String[][] matriz, int begin, int end) {
        String[] pivot = matriz[end];
        int i = (begin-1);

        String data = Ordenacao_3.TransformarData(pivot[column]);

        for (int j = begin; j < end; j++) {
            String data_secundaria = Ordenacao_3.TransformarData(matriz[j][column]);
            if (Integer.parseInt(data_secundaria) <= Integer.parseInt(data)) {
                i++;

                String[] swapTemp = matriz[i];
                matriz[i] = matriz[j];
                matriz[j] = swapTemp;
            }
        }

        String[] swapTemp = matriz[i+1];
        matriz[i+1] = matriz[end];
        matriz[end] = swapTemp;

        return i+1;
    }
    public static String[][] HeapSort(String[][] array, int coluna) {
        column = coluna;
        lista = array;      
        tamanho = lista.length - 1;    

        ConstroiHeap();

        for (int i = tamanho; i > 0; i--) {
            Trocar(0, tamanho);      
            tamanho -= 1;           
            MaxHeap(0);    
        }
        return lista;
    }
    private static void ConstroiHeap() {
        int meio = (int) (tamanho/2);
        for (int i = meio - 1; i >= 0; i--) {
            MaxHeap(i);
        }
    }
    private static void Trocar(int i, int j) {
        String aux;

        aux = lista[i][column];
        lista[i][column] = lista[j][column];
        lista[j][column] = aux;
    }
    private static void MaxHeap(int pai) {
        int maior = pai, esquerda = 2 * pai + 1, direita = 2 * pai + 2; 

        String data = Ordenacao_3.TransformarData(lista[esquerda][column]);
        String data_secundaria = Ordenacao_3.TransformarData(lista[maior][column]);

        if (esquerda <= tamanho && Integer.parseInt(data) > Integer.parseInt(data_secundaria)) maior = esquerda;

        data = Ordenacao_3.TransformarData(lista[direita][column]);

        if (direita <= tamanho && Integer.parseInt(data) > Integer.parseInt(data_secundaria)) maior = direita;
        if (maior != pai) {
            Trocar(pai, maior);      
            MaxHeap(maior); 
        }
    }
    public static String[][] MergeSort(String[][] vetor, int inicio, int fim, int coluna) {
        column = coluna;
        if(inicio < fim - 1) {
            int meio = (inicio + fim) / 2;
            MergeSort(vetor, inicio, meio, coluna);
            MergeSort(vetor, meio, fim, coluna);
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

            String data = Ordenacao_3.TransformarData(vetor[i][column]);
            String data_secundaria = Ordenacao_3.TransformarData(vetor[m][column]);

          if(Integer.parseInt(data) <= Integer.parseInt(data_secundaria)) {
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
    public static String[][] CoutingSort(String[][] matriz, int coluna)
    {
        int n = matriz.length;
 
        String[][] output = new String[n][];
 
        int count[] = new int[20211209];
        for (int i = 200000; i < 20211209; ++i)
            count[i] = 0;
        for (int i = 1; i < n; ++i){
            String data = Ordenacao_3.TransformarData(matriz[i][coluna]);
            ++count[Integer.parseInt(data)];
        }
        for (int i = 1; i <= 10105605; ++i)
            count[i] += count[i - 1];
        for (int i = n - 1; i >= 1; i--) {
            String data = Ordenacao_3.TransformarData(matriz[i][coluna]);
            output[count[Integer.parseInt(data)] - 1] = matriz[i];
            --count[Integer.parseInt(data)];
        }
        for (int i = 1; i < n; ++i)
            matriz[i] = output[i];
        
        return matriz;
    }
    public static String[][] QuickSortMedianaDeTres(String[][] matriz, int inicio, int fim, int coluna){      
        column = coluna;  
        if(inicio < fim){
            int q = ParticaoMediana(matriz, inicio, fim);
            QuickSortMedianaDeTres(matriz, inicio, q - 1, coluna);
            QuickSortMedianaDeTres(matriz, q + 1, fim, coluna);            
        }
        return matriz;
    }
    private static int ParticaoMediana(String[][] matriz, int inicio, int fim){
        int meio = (inicio + fim)/2;
        String[] a = matriz[inicio];
        String[] b = matriz[meio];
        String[] c = matriz[fim];
        int medianaIndice; 

        String data_a = Ordenacao_3.TransformarData(a[column]);
        String data_b = Ordenacao_3.TransformarData(b[column]);
        String data_c = Ordenacao_3.TransformarData(c[column]);

        if(Integer.parseInt(data_a) < Integer.parseInt(data_b)){
            if(Integer.parseInt(data_b) < Integer.parseInt(data_c)){
                medianaIndice = meio;
            }else{                
                if(Integer.parseInt(data_a) < Integer.parseInt(data_c)){
                    medianaIndice = fim;
                }else{
                    medianaIndice = inicio;
                }
            }
        }else{
            if(Integer.parseInt(data_c) < Integer.parseInt(data_b)){
                medianaIndice = meio;
            }else{
                if(Integer.parseInt(data_c) < Integer.parseInt(data_a)){
                    medianaIndice = fim;
                }else{
                    medianaIndice = inicio;
                }
            }
        }
        Swap(matriz, medianaIndice, fim);
        String[] pivo = matriz[fim];
        int i = inicio - 1;
        for(int j = inicio; j <= fim - 1; j++){
            String data_pivo = Ordenacao_3.TransformarData(pivo[column]);
            String data = Ordenacao_3.TransformarData(matriz[j][column]);
            if(Integer.parseInt(data) <= Integer.parseInt(data_pivo)){
                i = i + 1;
                Swap(matriz, i, j);
            }
        }
        Swap(matriz, i + 1, fim);
        return i + 1;
    }
    private static void Swap(String[][] matriz, int i, int j){
        String[] temp = matriz[i];
        matriz[i] = matriz[j];
        matriz[j] = temp;
    }    
}