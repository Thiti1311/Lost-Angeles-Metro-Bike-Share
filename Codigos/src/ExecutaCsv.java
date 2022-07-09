import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExecutaCsv{
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
    public static String VerificarExistencia(String nome) throws IOException{
        // Forma o nome do arquivo para a busca
        String path = "../Lost-Angeles-Metro-Bike-Share-main/Arquivos/NovosArquivos/" + nome +".csv"; 
        // Define o nome da variavel arquivo
        File arquivo = new File(path);
        // Verifica se o arquivo existe
        boolean existe = arquivo.exists();
        if (existe == true){
            // Deleta o arquivo caso exista
            arquivo.delete();
            // Cria um arquivo (vazio)
            arquivo.createNewFile();
        }else arquivo.createNewFile();

        return path; // Retorna o caminho do arquivo criado
    }
    public static void Escrever(String path, String[] linhas) throws IOException{
        // Inicializa o objeto 'arquivo' como caminho do arquivo desejado
        File arquivo = new File(path);
        // Inicializa o objeto 'fw' para inicializar o contrutor 'bw'
        FileWriter fw = new FileWriter(arquivo);

        // Construtor recebe como argumento o objeto do tipo FileWriter
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < linhas.length; i++){
            //Escreve o conteúdo no arquivo
            bw.write(linhas[i]);
            // Adiciona a quebra de linha no arquivo
            bw.newLine();
            
        }
        // Fecha os recursos
        bw.close();
        fw.close();
    }
    public static void FiltrarCSV(String[][] MatrizString, String archiveName, int[] listaPosicao, int tamanho) throws IOException{
        // Inicializa variavel 'linhas' para formar as linhas do arquivo
        String[] linhas = new String[tamanho];

        for (int i = 0; i < tamanho; i++){
            linhas[i] = ""; // Inicia cada linha com vazio
            for (int j = 0; j < 16; j++){
                // Adiciona a primeira linha do arquivo os nomes das colunas
                if (i == 0) linhas[i] += MatrizString[i][j];
                else {
                    if (j < 15) { // Verifica se é ou não o último elemento
                        // Concatena cada variavel com uma virgula as separando
                        linhas[i] += MatrizString[listaPosicao[i]][j] + ","; 
                    }
                    else linhas[i] += MatrizString[listaPosicao[i]][j]; // Concatena o último elemento da linha 
                }
            }
        }
        // Chama a função para criar o arquivo especificado e caso exista o apaga
        String transformar = VerificarExistencia(archiveName);
        // Chama a função para escrever no arquivo especificado o que está contido na variavel 'linhas'
        Escrever(transformar, linhas);
    }
}