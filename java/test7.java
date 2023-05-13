import java.io.*;

public class test7 {
  public static void main(String[] args) throws IOException{
    System.out.println("正方形の辺の長さを入力してください");
    BufferedReader br = 
      new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    int num1 = Integer.parseInt(str1);
    
    System.out.println("正方形の面積は"+(num1*num1)+"です");
  }
}

