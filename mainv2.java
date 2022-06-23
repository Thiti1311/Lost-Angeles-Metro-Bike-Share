public class mainv2 {
    public static void main(String[] args) throws Exception {

        String path_main = "C:/Users/calic/OneDrive/Área de Trabalho/LostAngeles/LA_Metro_BikeSharing_CLEANED_2016quater3-2021q3.CSV";
        String path_stations = "C:/Users/calic/OneDrive/Área de Trabalho/LostAngeles/stations.csv";

        String[][] MainArchive = new String[1250836][];
        String[][] StationsId = new String[349][];

        System.out.println("Iniciou");

        //carrega arquivos nas matrizes MainArchive e StationsID
        ExecutaCsv.LerCsv(path_main, MainArchive);
        System.out.println("Leu o primeiro");
        ExecutaCsv.LerCsv(path_stations, StationsId);
        System.out.println("Leu o segundo");

        //primeira mudança
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
        System.out.println("primeira transformação");
        for (int i = 0; i < 40; i++) {
            System.out.println(MainArchive[i][10]);
        }

        // Transformar a matriz em uma linha

        //Cria segundo arquivo

        //Carrega novo arquivo em outra matriz
        
        //segunda mudança

        for (int j = 1; j < MainArchive.length; j++) {
            for (int k = 1; k < StationsId.length-1; k++) {
                if(MainArchive[j][9].equals(StationsId[k][1]) && StationsId[k][3].equals("Pasadena") 
                || MainArchive[j][10].equals(StationsId[k][1]) && StationsId[k][3].equals("pasadena")){ 
                    //falta colocar as viagens que passam por pasadena em um array/matriz tu quem sabe
                    //depois disso criar o terceiro arquivo e terceira transformação
                    
                }
            }
        }
        //terceira mudança

        //calcular media da duração
        System.out.println("terceira transformação");

        float media = 0;
        for (int i = 1; i < MainArchive.length; i++) {
            media += Float.parseFloat(MainArchive[i][1]);
        }
        media = media/MainArchive.length ;
        
        //filtrar lista de acordo com aduração
        for (int i = 1; i < MainArchive.length; i++) {
            if(Integer.parseInt(MainArchive[i][1]) > media){
                System.out.println(MainArchive[i][1]);
            }
        }
        System.out.println("media =" + media);

        //imprime os 40 primeiros arquivos para teste
        for (int i = 0; i < 40; i++) {
            System.out.println(MainArchive[i]);
        }

    }

}