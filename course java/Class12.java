
class Calculator {

  int a;

  public int add(int n1, int n2) {
    int r = n1 + n2;
    return 0;
  }

}

/**
 * Class12
 */
public class Class12 {

  public static void main(String a[]) {
    int num1 = 34;
    int num2 = 45;
    Calculator obj = new Calculator();
    int result = obj.add(num1, num2);
    System.out.println(result);
  }
}
