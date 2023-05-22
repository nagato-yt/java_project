// 多次元配列
public class test13 {
  public static void main(String[] args){
    int [] [] test;
    test = new int [2][5];
    
    test[0][0] = 80;
    test[0][1] = 50;
    test[0][2] = 40;
    test[0][3] = 20;
    test[0][4] = 90;
    test[1][0] = 30;
    test[1][1] = 40;
    test[1][2] = 60;
    test[1][3] = 70;
    test[1][4] = 90;
    
    for(int i=0;i<5;i++){
      System.out.println((i+1)+"番目の人の国語の点数は"+test[0][i]+"です");
      System.out.println((i+1)+"番目の人の算数の点数は"+test[1][i]+"です");
    }
  }
}
