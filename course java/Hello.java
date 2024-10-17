
/*class Calculator {

    public int add(int n1, int n2) {
        int r = n1 + n2;
        return 0;
    }

}

class Hello {

    public static void main(String a[]) {

        int num1 = 34;
        int num2 = 45;
        Calculator obj = new Calculator();
        int result = obj.add(num1, num2);
        System.out.println(result);
    }
}*/
/**
 * Hello
 */

public class Hello {

    public static void main(String args[]) {
        /*int a[] = { 10, 20, 30, 40, 50 }; // Initializtion
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        float sum = 0, avg = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            avg = sum / a.length;
            
        }
        System.out.println("Average" + avg);

    }*/

    int tdarr [][][] = new int[3][4][5];
    int i,j,k;
    for(i=0;i<3;i++)
    
        for(j=0;j<4;j++)
        
            for(k=0;k<5;k++)

                    tdarr[i][j][k] = i * j * k;


    for(i=0;i<3;i++)
    {
        for(j=0;j<4;j++)
        {
            for(k=0;k<5;k++)
            {
                    System.out.println(tdarr[i][j][k] + " ");
                    System.out.println();

            }
        }
    }
    
}
