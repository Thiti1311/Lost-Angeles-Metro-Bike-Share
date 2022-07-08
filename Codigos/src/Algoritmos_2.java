public class Algoritmos_2 {

    private static int tamanho;
    private static String[][] lista;
    public static int column;

    
    public static String[][] InsertionSort(String[][] table){
        for(int i = 2, j; i < table.length; i++){
            String[] key = table[i];
            j = i - 1;
            while (j >= 1 && Integer.parseInt(table[j][1]) > Integer.parseInt(key[1]))
            {
                table[j + 1] = table[j];
                j = j - 1;
            }
            table[j + 1] = key;
            }
        return table;
    }/*
    public static String[][] InsertionSort(String[][] table, int inicio, int fim){
        for(int i = inicio+1, j; i < fim; i++){
            String[] key = table[i];
            j = i - 1;
            while (j >= 1 && Integer.parseInt(table[j][1]) > Integer.parseInt(key[1]))
            {
                table[j + 1] = table[j];
                j = j - 1;
            }
            table[j + 1] = key;
            }
        return table;
    }
*/
    public static String[][] SelectionSort(String[][] v, int coluna) {
        for (int i = 1; i < v.length; i++) {
		
            int i_menor = i;
            for (int j = i + 1; j < v.length; j++)
              if (Integer.parseInt(v[j][coluna]) < Integer.parseInt(v[i_menor][coluna]))
                i_menor = j;
            
            String[] aux = v[i];
            v[i] = v[i_menor];
            v[i_menor] = aux;
          
        }		
        return v;
    }
    
    public static String[][] QuickSort(String[][] matriz, int begin, int end, int coluna) {
        column = coluna;
        if (begin < end) {
            int particaoIndex = Particao(matriz, begin, end);
    
            matriz = QuickSort(matriz, begin, particaoIndex-1, coluna);
            matriz = QuickSort(matriz, particaoIndex+1, end, coluna);
        }
        return matriz;
    }
    
    private static int Particao(String[][] matriz, int begin, int end) {
        String[] pivot = matriz[end];
        int i = (begin-1);
    
        for (int j = begin; j < end; j++) {
            if (Integer.parseInt(matriz[j][column]) <= Integer.parseInt(pivot[column])) {
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
        String[] aux;
    
        aux = lista[i];
        lista[i] = lista[j];
        lista[j] = aux;
    }
    private static void MaxHeap(int pai) {
        int maior = pai, esquerda = 2 * pai + 1, direita = 2 * pai + 2; 
    
        if (esquerda <= tamanho && Integer.parseInt(lista[esquerda][column]) > Integer.parseInt(lista[maior][column])) maior = esquerda;
    
        if (direita <= tamanho && Integer.parseInt(lista[direita][column]) > Integer.parseInt(lista[maior][column])) maior = direita;
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
          if(Integer.parseInt(vetor[i][1]) <= Integer.parseInt(vetor[m][column])) {
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
 
        int count[] = new int[500];
        for (int i = 0; i < 500; ++i)
            count[i] = 0;
        for (int i = 1; i < n; ++i)
            ++count[Integer.parseInt(matriz[i][coluna])];
        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1];
        for (int i = n - 1; i >= 1; i--) {
            output[count[Integer.parseInt(matriz[i][coluna])] - 1] = matriz[i];
            --count[Integer.parseInt(matriz[i][coluna])];
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
        if(Integer.parseInt(a[column]) < Integer.parseInt(b[column])){
            if(Integer.parseInt(b[column]) < Integer.parseInt(c[column])){
                medianaIndice = meio;
            }else{                
                if(Integer.parseInt(a[column]) < Integer.parseInt(c[column])){
                    medianaIndice = fim;
                }else{
                    medianaIndice = inicio;
                }
            }
        }else{
            if(Integer.parseInt(c[column]) < Integer.parseInt(b[column])){
                medianaIndice = meio;
            }else{
                if(Integer.parseInt(c[column]) < Integer.parseInt(a[column])){
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
            if(Integer.parseInt(matriz[j][column]) <= Integer.parseInt(pivo[1])){
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