import java.io.*;
public class FizzBuzz1 {
  public static void main(String[] args)throws IOException{
    System.out.println("整数を入力してください");
    BufferedReader br = 
      new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    
    int num1 = Integer.parseInt(str1);
    if(num1%3==0 && num1%5==0){
      System.out.println("FizzBuzz");
    }else if(num1%3==0){
      System.out.println("Fizz");
    }else if(num1%5==0){
      System.out.println("Buzz");
    }else{
      System.out.println(num1);
    }
  }
}
