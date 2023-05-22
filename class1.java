// クラスの基本
  class Car{
    int num;
    double gas;
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
  
