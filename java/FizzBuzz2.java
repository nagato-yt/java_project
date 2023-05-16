import java.io.*;
public class FizzBuzz2 {
  public static void main(String[] args)throws IOException{
    System.out.println("回数を指定してください");
    BufferedReader br = 
      new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    int num1 = Integer.parseInt(str1);
    for(int i=1; i<=num1;i++){
      if(i%3==0 && i%5==0){
        System.out.println("FizzBuzz");
      }else if(i%3==0){
        System.out.println("Fizz");
      }else if(i%5==0){
        System.out.println("Buzz");
      }
      else{
        System.out.println(i);
      }
    }
    System.out.println("プログラム終了");
  }
}
