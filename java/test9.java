import java.io.*;
public class test9 {
  public static void main(String[] args) throws IOException{
    System.out.println("科目1~５の点数を入力してください");
    BufferedReader br = 
      new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    String str2 = br.readLine();
    String str3 = br.readLine();
    String str4 = br.readLine();
    String str5 = br.readLine();
    
    int num1 = Integer.parseInt(str1);
    int num2 = Integer.parseInt(str2);
    int num3 = Integer.parseInt(str3);
    int num4 = Integer.parseInt(str4);
    int num5 = Integer.parseInt(str5);
    
    int ans1 = num1+num2+num3+num4+num5;
    double ans2 = (num1+num2+num3+num4+num5)/5.0;
    
    System.out.println("合計得点は"+ans1+"です");
    System.out.println("平均点は"+ans2+"です");
  }
}
