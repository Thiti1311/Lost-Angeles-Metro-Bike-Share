public interface InsertionParticionado {
    public static String[][] Particiona(String[][] Arquivo){

        InsertionSort(Arquivo, 1,(Arquivo.length)/2);
        InsertionSort(Arquivo, (Arquivo.length)/2,Arquivo.length);

        Intercala(Arquivo, 1, (Arquivo.length)/2, Arquivo.length);

        return Arquivo;
    }
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
