public class teste {

    void sort(String[][] matriz, String[] dataInt, int coluna)
    {
        int n = matriz.length;
 
        String output[][] = new String[n][];
 
        int count[] = new int[20211209];
        for (int i = 0; i < 20211209; ++i)
            count[i] = 0;
 
        for (int i = 0; i < n; ++i)
            ++count[Integer.parseInt(dataInt[i])];
 
        for (int i = 1; i <= 10105605; ++i)
            count[i] += count[i - 1];
 
        for (int i = n - 1; i >= 0; i--) {
            output[count[Integer.parseInt(dataInt[i])] - 1] = matriz[i];
            --count[Integer.parseInt(dataInt[i])];
        }
        for (int i = 0; i < n; ++i)
            matriz[i] = output[i];
    }
 
   
}
