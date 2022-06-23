import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {

        String path_main = "../LostAngeles/LA_Metro_BikeSharing_CLEANED_2016quater3-2021q3.csv";
        String path_stations = "../LostAngeles/stations.csv";
        String line = "";

        String[][] MainArchive = new String[1250836][];
        String[][] StationsId = new String[349][];

        try {
            BufferedReader br = new BufferedReader(new FileReader(path_main));
            int i = 0;
            while((line = br.readLine()) != null){
                MainArchive[i] = line.split(",");
                i++;
            }
            br.close();
            BufferedReader br2 = new BufferedReader(new FileReader(path_stations));
            i = 0;
            while((line = br2.readLine()) != null){
                StationsId[i] = line.split(",");
                i++;
            }
            br2.close();
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

            /*for (int j = 1; j < 30; j++) {
                System.out.println(MainArchive[j][9] +" | "+MainArchive[j][10]);
            }*/

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}