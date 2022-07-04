public class Algoritmos_3 {
    private static int tamanho;
    private static String[][] lista;
    public static int column;

    public static String[][] InsertionSort(String[][] matriz, String[] dataInt, int coluna) {
        String key;
        String[] keyAux;

        for (int j = 1, i; j < matriz.length; j++) {
            key = dataInt[j];
            keyAux = matriz[j];
            for (i = j - 1; (i >= 0) && (Integer.parseInt(dataInt[i]) > Integer.parseInt(key)); i--) {
                matriz[i + 1][coluna] = matriz[i][coluna];
                dataInt[i + 1] = dataInt[i];
            }
            matriz[i + 1] = keyAux;
            dataInt[i + 1] = key;
        }
        return matriz;
    }
    public static String[][] SelectionSort(String[][] matriz, String[] dataInt, int coluna) {
        for (int i = 0; i < matriz.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < matriz.length; j++) {
                if (Integer.parseInt(dataInt[j]) < Integer.parseInt(dataInt[index])) {
                    index = j;
                }
            }
            String[] smallerNumber = matriz[index];
            matriz[index] = matriz[i];
            matriz[i] = smallerNumber;

            String aux = dataInt[index];
            dataInt[index] = 
        }
        return matriz;
    }
    public static String[][] QuickSort(String[][] matriz, int begin, int end, String[] dataInt, int coluna) {
        column = coluna;
        if (begin < end) {
            int particaoIndex = Particao(matriz, begin, end, dataInt);

            QuickSort(matriz, begin, particaoIndex-1,dataInt, coluna);
            QuickSort(matriz, particaoIndex+1, end, dataInt, coluna);
        }
        return matriz;
    }

    private static int Particao(String[][] matriz, int begin, int end, String[] dataInt) {
        String pivo = dataInt[end];
        int i = (begin-1);
    
        for (int j = begin; j < end; j++) {
            if (Integer.parseInt(dataInt[j]) <= Integer.parseInt(pivo)) {
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
    public static String[][] HeapSort(String[][] matriz, String[] dataInt, int coluna) {
        column = coluna;
        lista = matriz;      
        tamanho = lista.length - 1;    

        ConstroiHeap(dataInt);

        for (int i = tamanho; i > 0; i--) {
            Trocar(0, tamanho);      
            tamanho -= 1;           
            MaxHeap(0, dataInt);    
        }
        return lista;
    }
    private static void ConstroiHeap(String[] dataInt) {
        int meio = (int) (tamanho/2);
        for (int i = meio - 1; i >= 0; i--) {
            MaxHeap(i, dataInt);
        }
    }
    private static void Trocar(int i, int j) {
        String aux;

        aux = lista[i][column];
        lista[i][column] = lista[j][column];
        lista[j][column] = aux;
    }
    private static void MaxHeap(int pai, String[] dataInt) {
        int maior = pai, esquerda = 2 * pai + 1, direita = 2 * pai + 2; 

        if (esquerda <= tamanho && Integer.parseInt(dataInt[esquerda]) > Integer.parseInt(dataInt[maior])) maior = esquerda;

        if (direita <= tamanho && Integer.parseInt(dataInt[direita]) > Integer.parseInt(dataInt[maior])) maior = direita;
        if (maior != pai) {
            Trocar(pai, maior);      
            MaxHeap(maior, dataInt); 
        }
    }
    public static String[][] MergeSort(String[][] matriz, int inicio, int fim, String[] dataInt, int coluna) {
        column = coluna;
        if(inicio < fim - 1) {
            int meio = (inicio + fim) / 2;
            MergeSort(matriz, inicio, meio,dataInt, coluna);
            MergeSort(matriz, meio, fim,dataInt, coluna);
            Intercala(matriz, inicio, meio, fim, dataInt);
        }
        return matriz;
    }

    private static void Intercala(String[][] matriz, int inicio, int meio, int fim, String[] dataInt) {
        String[][] novomatriz = new String[fim - inicio][];
        int i = inicio;
        int m = meio;
        int pos = 0;
        while(i < meio && m < fim) {
          if(Integer.parseInt(dataInt[i]) <= Integer.parseInt(dataInt[m])) {
            novomatriz[pos] = matriz[i];
            pos = pos + 1;
            i = i + 1;
          } else {
            novomatriz[pos] = matriz[m];
            pos = pos + 1;
            m = m + 1;
          }
        }
        while(i < meio) {
          novomatriz[pos] = matriz[i];
          pos = pos + 1;
          i = i + 1;
        }
        while(m < fim) {
            novomatriz[pos] = matriz[m];
            pos = pos + 1;
            m = m + 1;
        }
        for(pos = 0, i = inicio; i < fim; i++, pos++) {
            matriz[i] = novomatriz[pos];  
        }
    }
    public static String[][] CoutingSort(String[][] matriz, String[] dataInt, int coluna){
        
        int n = matriz.length;
 
        String output[][] = new String[n][];
 
        int count[] = new int[20211209];
        for (int i = 0; i < 20211209; ++i)
            count[i] = 0;
 
        for (int i = 0; i < n; ++i)
            ++count[Integer.parseInt(dataInt[i])];
 
        for (int i = 1; i <= 10105605; ++i)
            count[i] += count[i - 1];
 
        for (int i = n - 1; i >= 0; i--) {
            output[count[Integer.parseInt(dataInt[i])] - 1] = matriz[i];
            --count[Integer.parseInt(dataInt[i])];
        }
        for (int i = 0; i < n; ++i)
            matriz[i] = output[i];
        
        return matriz;
    }
    public static String[][] QuickSortMedianaDeTres(String[][] matriz, int inicio, int fim, String[] dataInt, int coluna){      
        column = coluna;  
        if(inicio < fim){
            int q = ParticaoMediana(matriz, inicio, fim, dataInt);
            QuickSortMedianaDeTres(matriz, inicio, q - 1,dataInt, coluna);
            QuickSortMedianaDeTres(matriz, q + 1, fim, dataInt, coluna);            
        }
        return matriz;
    }
    private static int ParticaoMediana(String[][] matriz, int inicio, int fim, String[] dataInt){
        int meio = (inicio + fim)/2;
        String a = dataInt[inicio];
        String b = dataInt[meio];
        String c = dataInt[fim];
        int medianaIndice; 
        if(Integer.parseInt(a) < Integer.parseInt(b)){
            if(Integer.parseInt(b) < Integer.parseInt(c)){
                medianaIndice = meio;
            }else{                
                if(Integer.parseInt(a) < Integer.parseInt(c)){
                    medianaIndice = fim;
                }else{
                    medianaIndice = inicio;
                }
            }
        }else{
            if(Integer.parseInt(c) < Integer.parseInt(b)){
                medianaIndice = meio;
            }else{
                if(Integer.parseInt(c) < Integer.parseInt(a)){
                    medianaIndice = fim;
                }else{
                    medianaIndice = inicio;
                }
            }
        }
        Swap(matriz, medianaIndice, fim);
        String pivo = dataInt[fim];
        int i = inicio - 1;
        for(int j = inicio; j <= fim - 1; j++){
            if(Integer.parseInt(dataInt[j]) <= Integer.parseInt(pivo)){
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
