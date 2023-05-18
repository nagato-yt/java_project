public class test11 {
  public static void main(String[] args){
    int[] test1;
    test1 = new int[3];
    System.out.println("test1を宣言しました");
    System.out.println("配列要素を確保しました");
    
    test1[0] = 60;
    test1[1] = 40;
    test1[2] = 50;
    
    int[] test2;
    System.out.println("test2を宣言しました");
    
    test2 = test1;
    System.out.println("test2にtest1を代入しました");
    
    for(int i=0;i<3;i++){
      System.out.println("test1が指す"+(i+1)+"番目の人のテストの点数は"+test1[i]+"です");
    }
    
    for(int i=0;i<3;i++){
      System.out.println("test2が指す"+(i+1)+"番目の人のテストの点数は"+test2[i]+"です");
    }
    
    test1[2] = 100;
    System.out.println("test1が指す3番目の人の点数を変更します");
    
    for(int i=0;i<3;i++){
      System.out.println("test1が指す"+(i+1)+"番目の人のテストの点数は"+test1[i]+"です");
    }
    
    for(int i=0;i<3;i++){
      System.out.println("test2が指す"+(i+1)+"番目の人のテストの点数は"+test2[i]+"です");
    }
  }
}
