// クラスの基本
  class Car{
    int num;
    double gas;
    
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
    void show()
    {
      System.out.println("車のナンバーは"+num+"です");
      System.out.println("ガソリン量は"+gas+"です");
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
    void setNumGas(int n, double g)
    {
     num = n;
     gas = g;
     System.out.println("車のナンバーを"+num+"にガソリン量を"+gas+"にしました。");
    }
  }
  class Sample2
  {
    public static void main(String[] args){
      Car car1;
      car1 = new Car();
      car1.num = 1234;
      car1.gas = 20.5;
      
     car1.show();
    }
  }
  class Sample3
  {
    public static void main(String[] args){
      Car car1;
      car1 = new Car();
      car1.num = 1234;
      car1.gas = 20.5;
      
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
