import java.io.*;

public class test8 {
  public static void main(String[] args) throws IOException{
    System.out.println("三角形の辺、高さを入力してください");
    BufferedReader br = 
      new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    String str2 = br.readLine();
    
    int bottom = Integer.parseInt(str1);
    int height = Integer.parseInt(str2);
    double ans = bottom*height/2;
    System.out.println("三角形の面積は"+ans+"です");
  }
}