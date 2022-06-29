public class Algoritmos {

    private static int tamanho;
    private static int[] lista;

    public static String[][] InsertionSort(String[][] table, int[] vetor) {
        int key;

        for (int j = 1, i; j < vetor.length; j++) {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }
        return table;
    }
    public static String[][] SelectionSort(String[][] table, int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[index]) {
                    index = j;
                }
            }
            int menorNumero = vetor[index];
            vetor[index] = vetor[i];
            vetor[i] = menorNumero;

            String Aux = table[index][2];
            table[index][2] = table[i][2];
            table[i][2] = Aux;
        }
        return table;
    }
    private static String[][] QuickSort(String[][] table, int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = Dividir(table, vetor, inicio, fim);
            QuickSort(table, vetor, inicio, posicaoPivo - 1);
            QuickSort(table, vetor, posicaoPivo + 1, fim);
        }
        return table;
    }
    private static int Dividir(String[][] table, int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[f])
                f--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;

                String Aux = table[i][2];
                table[i][2] = table[f][2];
                table[f][2] = Aux;

                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
    public static void HeapSort(int[] array) {
        lista = array;      
        tamanho = lista.length - 1;    

        ConstroiHeap();

        for (int i = tamanho; i > 0; i--) {
            Trocar(0, tamanho);      
            tamanho -= 1;           
            MaxHeap(0);    
        }
    }
    private static void ConstroiHeap() {
        int meio = (int) (tamanho/2);
        for (int i = meio - 1; i >= 0; i--) {
            MaxHeap(i);
        }
    }
    private static void Trocar(int i, int j) {
        int aux;

        aux = lista[i];
        lista[i] = lista[j];
        lista[j] = aux;
    }
    private static void MaxHeap(int pai) {
        int maior = pai, esquerda = 2 * pai + 1, direita = 2 * pai + 2; 

        if (esquerda <= tamanho && lista[esquerda] > lista[maior]) maior = esquerda;

        if (direita <= tamanho && lista[direita] > lista[maior]) maior = direita;
        if (maior != pai) {
            Trocar(pai, maior);      
            MaxHeap(maior); 
        }
    }
}
