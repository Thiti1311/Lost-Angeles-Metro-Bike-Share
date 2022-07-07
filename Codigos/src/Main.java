import java.io.IOException;

public class Main {
    public static final int TAM = 1250836; // Variavél constante do tamanho 
                                          //do arquivo principal "LA_Metro_BikeSharing_CLEANED_2016quater3-2021q3.csv"
    public static void main(String[] args) throws Exception {

        System.out.printf("***************** Programa Iniciado *****************\n");
        System.out.printf("*****************  Seja Bem Vindo!  *****************\n");
        System.out.printf("*                                                   *\n");
        System.out.printf("* Em instantes os seguintes arquivos serão gerados: *\n");
        System.out.printf("* 1) LAMetroTrips.csv                               *\n");
        System.out.printf("* 2) LAMetroTrips_F1.csv                            *\n");
        System.out.printf("* 3) LAMetroTrips_F2.csv                            *\n");
        System.out.printf("*                                                   *\n");
        System.out.printf("*****************************************************\n");

        // Cria matrizes para receber os dados das linhas e colunas dos arquivos especificados
        String[][] Ordenacoes = new String[TAM][];
        String path = "../Lost-Angeles-Metro-Bike-Share/Arquivos/NovosArquivos/LAMetroTrips.csv";
        ExecutaCsv.LerCsv(path, Ordenacoes);

        System.out.printf("\n*****************************************************\n");
        System.out.printf("* Agora usaremos os seguintes algoritmos de ordenação *\n");
        System.out.printf("* teremos arquivos de medio, pior e melhor caso para  *\n");
        System.out.printf("* cada algoritmo pedido.                              *\n");
        System.out.printf("\n*****************************************************\n");

        System.out.printf("* Ordenação 1 - Ordem em ordem alfabetica pelos nomes *\n");
        System.out.printf("* das estações (campo station_name/ station_id)       *\n");
        //Ordenacao_1.n sei o nome(Ordenacoes);
        System.out.printf("\n* Ordenação 1 feita!!                               *\n\n");
        System.out.printf("* Ordenação 2 - pelo campo de duração da viagem     *\n");
        System.out.printf("* (campo duration) do menor para o maior.           *\n");
        Ordenacao_2.Duration(Ordenacoes);
        System.out.printf("\n* Ordenação 2 feita!!                               *\n\n");
        System.out.printf("* Ordenação 3 - pela data de início da viagem       *\n");
        System.out.printf("*(campo Start_time) mais recente para o mais antigo.*\n"); 
        //Ordenacao_3.Star_time(Ordenacoes);
        System.out.printf("\n* Ordenação 3 feita!!                               *\n\n");
        System.out.printf("\n*****************************************************\n");
        System.out.printf("********** Programa executado com sucesso. **********\n");
        System.out.printf("*****************************************************\n");
    }
    public static void AdicionaVirgula(String[][] MatrizString, String archiveName) throws IOException{
        // Inicializa a variavel que vai conter e fomrar cada linha do arquivo
        String[] linhas = new String[TAM];

        for (int i = 0; i < TAM; i++){
            linhas[i] = ""; // Inicia cada linha com vazio
            for (int j = 0; j < 16; j++){
                if (j < 15) { // Verifica se é ou não o último elemento
                    linhas[i] += MatrizString[i][j] + ","; // Concatena cada variavel com uma virgula as separando
                }
                else linhas[i] += MatrizString[i][j]; // Concatena o último elemento da linha 
            }            
        }
        // Chama a função contida em 'ExecutaCsv' para criar o arquivo especificado e caso exista o apaga
        String transformar = ExecutaCsv.VerificarExistencia(archiveName);
        // Chama a função contida em 'ExecutaCsv' e eEscreve no arquivo especificado o que está contido na variavel 'linhas'
        ExecutaCsv.Escrever(transformar, linhas);
    }
}