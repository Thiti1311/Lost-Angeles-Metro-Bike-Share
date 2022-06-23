public class Main {
    public static void main(String[] args) throws Exception {

        String path_main = "../LostAngeles/LA_Metro_BikeSharing_CLEANED_2016quater3-2021q3.csv";
        String path_stations = "../LostAngeles/stations.csv";

        String[][] MainArchive = new String[1250836][];
        String[][] StationsId = new String[349][];

        System.out.println("Iniciou");

        //carrega arquivos nas matrizes MainArchive e StationsID
        ExecutaCsv.LerCsv(path_main, MainArchive);
        //System.out.println("Leu o primeiro");
        ExecutaCsv.LerCsv(path_stations, StationsId);
        //System.out.println("Leu o segundo");
        
        //int PasadenaTravels = 0;

        // Primeira transformação
        for (int j = 1; j < MainArchive.length; j++) {
            for (int k = 1; k < StationsId.length-1; k++) {
                if(MainArchive[j][9].equals(StationsId[k][0])){ 
                    MainArchive[j][9] = StationsId[k][1];
                }
                if(MainArchive[j][10].equals(StationsId[k][0])){ 
                    MainArchive[j][10] = StationsId[k][1];
                }
            }
        }
        // Escrever a matriz em uma linha
        String[] linhas = new String[1250836];
        //System.out.println(MainArchive.length);
        for (int i = 0; i < MainArchive.length; i++){
            linhas[i] = "";
            for (int j = 0; j < 16; j++){
                if (j < 15) {
                    linhas[i] += MainArchive[i][j] + ",";
                    //System.out.println(linhas[i] +" | "+MainArchive[i][j]);
                }
                else linhas[i] += MainArchive[i][j];
            }            
            //System.out.println(linhas[i]);
        }
        String primeiraTransf = ExecutaCsv.VerificarExistencia("LAMetroTrips");
        ExecutaCsv.Escrever(primeiraTransf, linhas);

        // Segunda transformação
        for (int j = 1; j < MainArchive.length; j++) {
            for (int k = 1; k < StationsId.length-1; k++) {
                if(MainArchive[j][9].equals(StationsId[k][1]) && StationsId[k][3].equals("Pasadena") 
                || MainArchive[j][10].equals(StationsId[k][1]) && StationsId[k][3].equals("Pasadena")){ 
                    //falta colocar as viagens que passam por pasadena em um array/matriz tu quem sabe
                    //depois disso criar o terceiro arquivo e terceira transformação
                    
                }
            }
        }

        // Terceira transformação
        
        System.out.println("Terceira transformação");
        String terceiraTransf = ExecutaCsv.VerificarExistencia("LAMetroTrips_F2");
        // Calcular media da duração
        float media = 0;
        for (int i = 1; i < MainArchive.length; i++) {
            media += Float.parseFloat(MainArchive[i][1]);
        }
        media = media/MainArchive.length;
        linhas = new String[1250836];
        //filtrar lista de acordo com aduração
        for (int i = 1; i < MainArchive.length; i++) {
            if(Integer.parseInt(MainArchive[i][1]) > media){
                for (int n = 0; n < MainArchive.length;n++){
                    linhas[n] = "";
                    for (int j = 0; j < 16; j++){
                        if (j < 15) {
                            linhas[n] += MainArchive[n][j] + ",";
                        }   
                        else linhas[n] += MainArchive[n][j];
                    }            
                }
            }
        }

        ExecutaCsv.Escrever(terceiraTransf, linhas);
        //System.out.println("media =" + media);
        
    }
}