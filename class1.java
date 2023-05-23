// クラスの基本
  class Car{
    private int num;
    private double gas;
    
    public Car()
    {
      num = 0;
      gas = 0.0;
      System.out.println("車を作成しました。");
    }
    public Car(int n, double g)
    {
      this();
      num = n;
      gas = g;
      System.out.println("ナンバーは"+num+"にガソリン量を"+gas+"にしました");
    }
    public void setNumGas(int n,double g)
    {
      if(g>0 && g<1000){
        num = n;
        gas = g;
        System.out.println("ナンバーを"+num+"にガソリン量を"+gas+"にしました");
      }
      else{
        System.out.println(g+"は正しいガソリン量ではありません");
        System.out.println("ガソリン量を変更できませんでした");
      }
    }
    public void show()
    {
      System.out.println("車のナンバーは"+num+"です");
      System.out.println("ガソリン量は"+gas+"です");
    }
    int getNum()
    {
      System.out.println("ナンバーをしらべました。");
      return num;
    }
    double getGas()
    {
      System.out.println("ガソリン量を調べました。");
      return gas;
    }
    void showCar()
    {
      System.out.println("これから車の情報を表示します");
      this.show();
    }
    void setNum(int n)
    {
      num = n;
      System.out.println("ナンバーを"+num+"にしました。");
    }
    void setGas(double g)
    {
      gas = g;
      System.out.println("ガソリン量を"+gas+"にしました。");
    }
  }
  class Sample2
  {
    public static void main(String[] args){
      Car car1;
      car1 = new Car();
      // car1.num = 1234;
      // car1.gas = 20.5;
      car1.setNumGas(1234, 20.5);
      car1.show();
      
      System.out.println("正しくないガソリン量(-10.0)を指定してみます");
      car1.setNumGas(1234, -10.0);
      car1.show();
    }
  }
  class Sample3
  {
    public static void main(String[] args){
      Car car1;
      car1 = new Car();
      // car1.num = 1234;
      // car1.gas = 20.5;
      car1.setNumGas(1234, 20.5);
      car1.showCar();
    }
  }
  class Sample4
  {
    public static void main(String[] args)
    {
      Car car1;
      car1 = new Car();
      
      car1.setNum(1234);
      car1.setGas(30.5);
      
    }
  }
  class Sample5
  {
    public static void main(String[] args)
    {
      Car car1;
      car1 = new Car();
      
      int number = 1234;
      double gasoline = 40.5;
      
      car1.setNumGas(number,gasoline);
    }
  }
  class Sample6
  {
    public static void main(String[] args)
    {
      Car car1;
      car1 = new Car();
      
      car1.setNumGas(1234, 50.5);
      
      int number = car1.getNum();
      double gasoline = car1.getGas();
      
      System.out.println("サンプルから調べたところ");
      System.out.println("ナンバーは"+number+",ガソリン量は"+gasoline+"でした");
    }
  }
  class Sample7
  {
    public static void main(String[] args)
    {
      Car car1 = new Car();
      car1.show();
      
      Car car2 = new Car(1234, 20.5);
      car2.show();
      
    }
    // コンストラクタ
  }
  
