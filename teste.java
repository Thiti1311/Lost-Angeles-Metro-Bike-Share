import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class teste{
    public static void main(String[] args) throws IOException {

        String path = VerificarExistencia("arq1");

        Escrever(path, "linha1");
        Escrever(path, "linha1");
        Escrever(path, "linha1");
        Escrever(path, "linha1");
        Escrever(path, "linha1");
        Escrever(path, "linha1");
        Escrever(path, "linha1");
        Escrever(path, "linha1");
        Escrever(path, "linha1");
        Escrever(path, "linha1");


    }
        public static String VerificarExistencia(String nome) throws IOException{
        // Forma o nome do arquivo para a busca
        String path = "../LostAngeles/" + nome +".csv"; 
        // Define o nome da variavel arquivo
        File arquivo = new File(path);
        // Verifica se o arquivo existe
        if (arquivo.exists() == true){
            // Deleta o arquivo caso exista
            arquivo.delete();
            //cria um arquivo (vazio)
            arquivo.createNewFile();
        }else arquivo.createNewFile();

        return path;
    }
    public static void Escrever(String path, String linha) throws IOException{
        path = "../LostAngeles/" + path +".csv"; 
        File arquivo = new File(path);
        FileWriter fw = new FileWriter(arquivo);

        // Construtor recebe como argumento o objeto do tipo FileWriter
        BufferedWriter bw = new BufferedWriter(fw);
        
        //Escreve o conteúdo no arquivo
        bw.write(linha);
        // Adiciona a quebra de linha no arquivo
        bw.newLine();
        
        // Fecha os recursos
        //bw.close();
        //fw.close();
    }
    public static void LerCsv(String path, String[][] arquivo){
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            int i = 0;
            while((line = br.readLine()) != null){
                arquivo[i] = line.split(",");
                i++;
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}