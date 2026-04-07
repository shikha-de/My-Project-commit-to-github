import java.util.*;
class Calc {
    public void add()
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a:");
        a = sc.nextInt();
        System.out.println("Enter the value of b:");
        b = sc.nextInt();

        System.out.println("sum = "+ (a+b));

    }
    public int Product()
    {
      Scanner sc = new Scanner(System.in);
      int a,b;
      System.out.println("PROD:Enter the value of a:");
      a = sc.nextInt();
      System.out.println("PROD:Enter the value of b:");
      b = sc.nextInt(); 

      System.out.println("Product" + (a+b));

      return a*b;

    }
}
public class Demo {
    public static void main(String[] args)
    {
        System.out.println("hello world");
        Calc Ob1 = new Calc();
        Ob1.add();
        System.out.println("Bye Bye");
        

    }
}