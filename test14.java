// 多次元配列
public class test14 {
  public static void main(String[] args){
    int [][] test = {
      {55,44,33,22},{99,88,77,66},{11,12,13}
    };
    for(int i=0; i<test.length;i++){
      System.out.println((i+1)+"番目の要素の長さは"+test[i].length+"です");
    }
  }
}
