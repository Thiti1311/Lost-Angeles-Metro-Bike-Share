import java.io.IOException;

public class Ordenacao_3 {

    public static final int TAM = 10;

    public static void Star_time(String[][] LAMetroTrips) throws IOException{
        String[] data = new String[TAM];
        int[] dataInt = new int[TAM];
        int[] position = new int[TAM];
        for(int i = 1, j = 0; i < TAM; i++, j++){
            data[j] = LAMetroTrips[i][2];
            data[j] = transformarData(data[j]);
            dataInt[j] = Integer.parseInt(data[j]);
            position[i] = i;
        }
        String[][] LAMetroTrips_BubbleSort = BubbleSort(LAMetroTrips, dataInt);
        Main.AdicionaVirgula(LAMetroTrips_BubbleSort, "LAMetroTrips_start_time_bubbleSort_medioCaso.csv");
        
        //dataInt = InsertionSort(dataInt);

        
    }
    public static String transformarData(String data){
        String[] aux = data.split("/");
        String aux2 = aux[2];
        String[] aux3 = aux2.split(" ");
        String newData = aux3[0];

        newData += aux[0];
        newData += aux[1];

        return newData;
    }
    public static String[][] BubbleSort(String[][] table, int[] vetor){ 

        for(int i = 1; i < vetor.length - 1; i++){
            for (int j = 1; j < vetor.length - 1 - i; j++){
                if (vetor[j] > vetor[j + 1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;

                    String Aux = table[j][2];
                    table[j][2] = table[j+1][2];
                    table[j + 1][2] = Aux;
                }
            }
        }

        return table;
    }
    public static int[] InsertionSort(int[] vetor) {
        int key;
    
        for (int j = 1, i; j < vetor.length; j++){
            key = vetor[j];
            for ( i = j - 1; (i >= 0) && (vetor[i] > key); i--){
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }
        return vetor;
    }

}
