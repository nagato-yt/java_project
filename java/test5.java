import java.io.*;
public class test5 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = 
      new BufferedReader(new InputStreamReader(System.in));
      
      String str = br.readLine();
      System.out.println(str+"が入力されました");
  }
}
