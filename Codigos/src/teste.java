
public class teste {

  public static int column;

  public static void main(String[] args) {
    String[][] Main = new String[10][10];
    int k = 9;
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        Main[i][j] = Integer.toString(k);
      }
      k--;
      // System.out.println("");
    }
    // System.out.println("");
    // System.out.printf("%s ,", Main[0][0]);
    Main = SelectionSort(Main, 1);
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.printf("%s ,", Main[i][j]);
      }
      System.out.println("");
    }
  }

  public static String[][] SelectionSort(String[][] v, int coluna) {
    for (int i = 1; i < v.length; i++) {
		
      int i_menor = i;
      for (int j = i + 1; j < v.length; j++)
        if (Integer.parseInt(v[j][coluna]) < Integer.parseInt(v[i_menor][coluna]))
          i_menor = j;
      
      String[] aux = v[i];
      v[i] = v[i_menor];
      v[i_menor] = aux;
    
    }		
    return v;
  }
}