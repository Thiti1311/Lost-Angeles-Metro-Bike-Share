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

        // Define as variavéis com os nomes dos arquivos
        String path_main = "../Lost-Angeles-Metro-Bike-Share/LA_Metro_BikeSharing_CLEANED_2016quater3-2021q3.csv";
        String path_stations = "../Lost-Angeles-Metro-Bike-Share/stations.csv";
        
        // Cria matrizes para receber os dados das linhas e colunas dos arquivos especificados
        String[][] MainArchive = new String[TAM][];
        String[][] StationsId = new String[349][];

        // Carrega arquivos nas matrizes MainArchive e StationsID
        ExecutaCsv.LerCsv(path_main, MainArchive);
        ExecutaCsv.LerCsv(path_stations, StationsId);
       
        // Primeira transformação
        System.out.printf("\nGerando LAMetroTrips.csv...");
        // Compara os dados da coluna 'station_id' do 'stations.csv' com a do arquivo 'LA_Metro_Bike...'
        for (int j = 1; j < TAM; j++) {
            for (int k = 1; k < StationsId.length-1; k++) {
                if(MainArchive[j][9].equals(StationsId[k][0])){ // Compara a coluna 'start_station' 
                    MainArchive[j][9] = StationsId[k][1]; // Efetua a subtituição
                }
                if(MainArchive[j][10].equals(StationsId[k][0])){ // Compara a coluna 'end_station' 
                    MainArchive[j][10] = StationsId[k][1]; // Efetua a subtituição
                }
            }
        }
        // Chama o método 'AdicionaVirgula' para concatenar os elementos das colunas linha a linha e envia o nome do arquivo a ser gereado
        AdicionaVirgula(MainArchive,"LAMetroTrips"); 
        System.out.printf("Arquivo Gerado com Sucesso!!\n");
        String[][] Ordenacoes = MainArchive;

        // Segunda transformação
        System.out.printf("\nGerando LAMetroTrips_F1.csv...");
        // Cria variavel para receber a posição da linha que contém viagens de Pasadena
        int[] listaPosicao = new int[TAM];
        // Contador para controlar a posição dos elementos da lista
        int contador = 0; 

        for (int j = 1; j < TAM; j++) {
            for (int k = 1; k < StationsId.length-1; k++) {
                // Compara a coluna 'start_station' e 'end_station' com as estações em 'stations.csv', e verifica se são de Pasadena
                if(MainArchive[j][9].equals(StationsId[k][1]) && StationsId[k][3].equals("Pasadena") 
                || MainArchive[j][10].equals(StationsId[k][1]) && StationsId[k][3].equals("Pasadena")){ 
                    listaPosicao[contador] = j; // Adiona o valor da linha a 'listaPosicao'
                    contador++; // Soma o contador
                }
            }
        }
        // Chama a função 'FiltrarCSV' contida no arquivo 'Executa.Csv' concatenando os elementos com virgula os separando
        ExecutaCsv.FiltrarCSV(MainArchive, "LAMetroTrips_F1", listaPosicao, contador);
        System.out.printf("Arquivo Gerado com Sucesso!!\n");

        // Terceira transformação       
        System.out.printf("\nGerando LAMetroTrips_F1.csv...");
        // Calcula media da duração dos passeios contidos em 'LAMetroTrips.csv'
        float media = 0;
        // Soma todos os valores da coluna 'duration'
        for (int i = 1; i < TAM; i++) {
            media += Float.parseFloat(MainArchive[i][1]);
        }
        // Divide pelo total de elementos e obtém-se a média geral de tempo dos passeios
        media = media/TAM;
        // Zera a variavel 'listaPosicao' e 'contador'
        listaPosicao = new int[TAM];
        contador = 0;

        // Filtrar os passeios com tempo maior que a média geral
        for (int i = 1; i < TAM; i++) {
            // Verifica se os valores são maior que a média
            if(Integer.parseInt(MainArchive[i][1]) > media){
                listaPosicao[contador] = i; // Adiona o valor da linha a 'listaPosicao'
                contador++;
            }
        }
        // Chama a função 'FiltrarCSV' contida no arquivo 'Executa.Csv' concatenando os elementos com virgula os separando
        ExecutaCsv.FiltrarCSV(MainArchive, "LAMetroTrips_F2", listaPosicao, contador);
        System.out.printf("Arquivo Gerado com Sucesso!!\n");

        System.out.printf("\n*****************************************************\n");
        System.out.printf("* Agora usaremos os seguintes algoritmos de ordenação *\n");
        System.out.printf("* teremos arquivos de medio, pior e melhor caso para  *\n");
        System.out.printf("* cada algoritmo pedido.                              *\n");
        System.out.printf("\n*****************************************************\n");

        System.out.printf("* Ordenação 1 - Ordem em ordem alfabetica pelos nomes *\n");
        System.out.printf("* das estações (campo station_name/ station_id)       *\n");
        //Ordenacao_1.n sei o nome(Ordenacoes);
        System.out.printf("\n* Ordenação 1 feita!!                               *\n\n");
        System.out.printf("* Ordenação 2 - pelo campo de duração da viagem       *\n");
        System.out.printf("* (campo duration) do menor para o maior.             *\n");
        Ordenacao_2.Duration(Ordenacoes);
        System.out.printf("\n* Ordenação 2 feita!!                               *\n\n");
        System.out.printf("* Ordenação 3 - pela data de início da viagem         *\n");
        System.out.printf("* (campo Start_time) mais recente para o mais antigo. *\n");
        Ordenacao_3.Star_time(Ordenacoes);
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