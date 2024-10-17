import java.util.Scanner;

public class Store {
    public static void main(String args[]) {

        /*
         * byte a = 9, b = 12;
         * byte c;
         * c = (byte) (a << 4);
         * c = (byte) (c | b);
         * System.out.println((c & 0b00001111));
         * 
         */

        /*
         * String s = "Hello.Guys";
         * String s1 = "    Hi How Are You   ";
         * String s2 = s.substring(2, 6);
         * System.out.println(s.indexOf("Guys", 3));
         */

        /*
         * Scanner sc = new Scanner(System.in);
         * int l, b, h;
         * float area, volume;
         * 
         * System.out.println("Enter the Length Breadth and Height=");
         * l = sc.nextInt();
         * b = sc.nextInt();
         * h = sc.nextInt();
         * area = 2 * ((l * b) + (b * h) + (h * l));
         * volume = (l * b * h);
         * System.out.println("The Area of Cubloid =" + area);
         * System.out.println("The Volume of Cuboid= " + volume);
         */

        /*
         * int a = -0b1010;
         * int b = 0b0101;
         * int c = a >>> 1;
         * System.out.println(String.format("%s", Integer.toBinaryString(a)));
         * System.out.println(String.format("%s", Integer.toBinaryString(c)));
         */

        /*
         * String str1 = "a";
         * System.out.println(str1.matches("[abc]*"));
         */

        /*
         * (IF CONDITION):
         * int age;
         * Scanner sc = new Scanner(System.in);
         * age = sc.nextInt();
         * if (age >= 14 && age <= 35) {
         * System.out.println("The person is young");
         * 
         * } else {
         * if (age < 14) {
         * System.out.print("He is  Very Young");
         * } else {
         * System.out.println("He is to Old");
         * }
         * }
         */

        /*
         * GRADE CALC PROGRAM:
         * 
         * int m1, m2, m3, tot;
         * float avg;
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter the marks of your subjects");
         * m1 = sc.nextInt();
         * m2 = sc.nextInt();
         * m3 = sc.nextInt();
         * 
         * tot = m1 + m2 + m3;
         * avg = (tot / 3);
         * if (avg >= 79) {
         * System.out.println("GRADE A");
         * } else if (avg >= 65 && avg <= 78) {
         * System.out.println("GRADE B");
         * } else if (avg >= 55 && avg <= 64) {
         * System.out.println("GRADE C");
         * } else if (avg >= 45 && avg <= 54) {
         * System.out.println("GRADE D");
         * } else {
         * System.out.println("IDIOT YOU ARE FAILED ATLEAST STUDY FROM NOW");
         * }
         */

        /*
         * String str = "programmer@gmail.com";
         * int l = (str.length());
         * int i = (str.indexOf("@"));
         * String s2 = (str.substring(0, i));
         * String s3 = (str.substring(i + 1, l));
         * System.out.println("ADMIN NAME = " + s2);
         * System.out.println("domain name = " + s3);
         * int j = s3.indexOf(".");
         * String s4 = (s3.substring(0, j));
         * System.out.println(s4.equals("gmail"));
         */

        /*
         * int b = 000001;
         * String s1 = String.valueOf(b);
         * System.out.println(s1.matches("[01]*"));
         */

        /*
         * String s1 = "ABC ASD DFSV FFZF";
         * System.out.println(s1.replaceAll("[^0-9a-zA-Z]", ""));
         */

        /*
         * RADIX OF A NUMBER:
         * String num;
         * System.out.println("Enter the string to find the radix= ");
         * Scanner sv = new Scanner(System.in);
         * num = sv.nextLine();
         * if (num.matches("[01]+")) {
         * System.out.println("It is Binary Radix = 2");
         * 
         * } else if (num.matches("[0-7]+")) {
         * System.out.println("It is OCTAL Radix = 8");
         * 
         * } else if (num.matches("[0-9]+")) {
         * System.out.println("It is DECIMAL Radix = 10");
         * 
         * } else if (num.matches("[0-9A-F]+")) {
         * System.out.println("It is HEXA DECIMAL Radix = 16");
         * 
         * } else {
         * System.out.println("The given string is invalid");
         * 
         * }
         */

        /*
         * LEAP YEAR:
         * int num;
         * Scanner sv = new Scanner(System.in);
         * System.out.println("Enter the year to check = ");
         * num = sv.nextInt();
         * if (num % 4 == 0) {
         * if (num % 100 == 0) {
         * if (num % 400 == 0) {
         * System.out.printf("\nYes %d is an Leap Year\n", num);
         * 
         * } else {
         * System.out.printf("\nNo %d is not an Leap Year\n", num);
         * }
         * } else {
         * System.out.printf("\nYes %d is an Leap Year\n", num);
         * }
         * } else {
         * System.out.printf("\nNo %d is an not Leap Year\n", num);
         * }
         */

        /*
         * PROTOCOL CHECKER:
         * String s;
         * System.out.println("ENTER YOUR PROTOCOL=");
         * Scanner sc = new Scanner(System.in);
         * s = sc.nextLine();
         * int l = s.length();
         * int i = s.indexOf(":");
         * String s2 = s.substring(0, i);
         * if (s2.equals("http")) {
         * System.out.println("It is a http protocol");
         * } else if (s2.equals("ftp")) {
         * System.out.println("It is a ftp protocol");
         * } else if (s2.equals("https")) {
         * System.out.println("It is a https protocol");
         * } else {
         * System.out.println("It is Invalid protocol");
         * }
         * 
         * String s4 = s.substring(s.lastIndexOf("."));
         * if (s4.equals(".com")) {
         * System.out.println("It is an Commecial website");
         * } else if (s4.equals(".org")) {
         * System.out.println("It is an Organizational website");
         * } else if (s4.equals(".gov")) {
         * System.out.println("It is an Government website");
         * } else if (s4.equals(".edu")) {
         * System.out.println("It is an Educational website");
         * } else if (s4.equals(".biz")) {
         * System.out.println("It is an Bussiness website");
         * } else {
         * System.out.println("IT IS INVALID");
         * }
         */

        /*
         * SWITCH CONCEPT (WEBSITE CHECKER):-
         * 
         * Scanner sc = new Scanner(System.in);
         * String s;
         * System.out.println("Enter the type of website=");
         * s = sc.nextLine();
         * String s1 = s.substring(s.lastIndexOf("."));
         * switch (s1) {
         * case ".com":
         * System.out.println("It is Commercial Webiste");
         * break;
         * case ".org":
         * System.out.println("It is Organizational Webiste");
         * break;
         * case ".gov":
         * System.out.println("It is Government Webiste");
         * break;
         * case ".edu":
         * System.out.println("It is Educational Webiste");
         * break;
         * case ".net":
         * System.out.println("It is Network Webiste");
         * break;
         * case ".biz":
         * System.out.println("It is Bussiness Webiste");
         * break;
         * 
         * default:
         * System.out.println("It is Invalid");
         * break;
         * }
         */

        /*
         * CALCULATION (USING SWITCH):
         * Scanner sc = new Scanner(System.in);
         * int a, b;
         * String option;
         * System.out.println("--MENU-- ");
         * System.out.println("1.ADD ");
         * System.out.println("2.SUB ");
         * System.out.println("3.MUL ");
         * System.out.println("4.DIV ");
         * System.out.println("5.REM ");
         * System.out.println("ENTER THE 2 NUMBERS");
         * System.out.println("ENTER THE 1st Num=");
         * a = sc.nextInt();
         * System.out.println("ENTER THE 2nd Num=");
         * b = sc.nextInt();
         * System.out.println("ENTER THE OPERATION THAT YOU WANT TO PERFORM=");
         * option = sc.nextLine();
         * option = sc.nextLine();
         * option = option.toUpperCase();
         * switch (option) {
         * 
         * case "ADD":
         * System.out.println("THE ADDITION = " + (a + b));
         * break;
         * case "SUB":
         * System.out.println("THE SUBSTRACTION = " + (a - b));
         * break;
         * case "MUL":
         * System.out.println("THE MULTIPLICATION = " + (a * b));
         * break;
         * case "DIV":
         * System.out.println("THE DIVISION = " + (a / b));
         * break;
         * case "REM":
         * System.out.println("THE REMAINDER = " + (a % b));
         * break;
         * 
         * default:
         * System.out.println("PLEASE SELECT CORRECT OPTION");
         * break;
         */

        /*
         * int i, j;
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter the table that you want to print =");
         * i = sc.nextInt();
         * 
         * System.out.println("Enter Number Upto Which you want to print=");
         * j = sc.nextInt();
         * 
         * System.out.println("The " + i + " th table is ");
         * for (int k = 0; k <= j; k++) {
         * int l = i * k;
         * System.out.println(i + " * " + k + " = " + l);
         * }
         */

        /*
         * int i, sum = 0;
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter the number=");
         * i = sc.nextInt();
         * for (int j = 1; j <= i; j++) {
         * sum = sum + j;
         * System.out.println("The addition= " + sum);
         * }
         */

        /*
         * (Factorial=)
         * int i, sum = 1;
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter the number=");
         * i = sc.nextInt();
         * for (int j = 1; j <= i; j++) {
         * sum = sum * j;
         * 
         * }
         * System.out.println("The Factorial= " + sum);
         */

        /*
         * int n = 0, j, r;
         * Scanner sc = new Scanner(System.in);
         * n = sc.nextInt();
         * for (; n == 0;) {
         * 
         * r = n % 10;
         * r = n / 10;
         * System.out.println(r);
         */

        /*
         * Pattern1
         * for (int i = 0; i <= 5; i++) {
         * for (int j = 0; j <= 5; j++) {
         * System.out.print("  " + j + "  ");
         * }
         * System.out.println();
         * }
         */

        /*
         * for (int i = 1; i <= 5; i++) {
         * for (int j = 1; j <= 5; j++) {
         * System.out.printf(" " + i + " ");
         * }
         * System.out.println();
         * }
         */

        /*
         * Count the numbers:
         * int n, count = 0, j;
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter the Number = ");
         * n = sc.nextInt();
         * while (n > 0) {
         * n = n / 10;
         * count++;
         * 
         * }
         * System.out.println("The Count of the number is = " + count);
         */

        /*
         * ARMSTRONG NUMBER :
         * int n, r, sum = 0;
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter the Number= ");
         * n = sc.nextInt();
         * int m = n;
         * while (n != 0) {
         * 
         * r = n % 10;
         * sum = sum + r * r * r * r;
         * n = n / 10;
         * 
         * }
         * if (m == sum) {
         * System.out.println("The Number is Armstrong nUmber = " + sum);
         * } else {
         * System.out.println("The Number is not an Armstrong nUmber = " + sum);
         * }
         */

        /*
         * REVERSE OF A NUMBER:
         * int n, r, sum = 0;
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter the number= ");
         * n = sc.nextInt();
         * while (n != 0) {
         * r = n % 10;
         * sum = sum * 10 + r;
         * n = n / 10;
         * 
         * }
         * System.out.println("The reverse number = " + sum);
         */

        /*
         * Palindrome checker:
         * 
         * int n, r, sum = 0, pal;
         * 
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter the number= ");
         * n = sc.nextInt();
         * pal = n;
         * while (n != 0) {
         * r = n % 10;
         * sum = sum * 10 + r;
         * n = n / 10;
         * 
         * }
         * if (pal == sum) {
         * System.out.println("The given number is an Palindrome " + sum);
         * } else {
         * System.out.println("It is not an palindrom = " + sum);
         * }
         */

        /*
         * NUMBER TO TEXT(USING SWITCH:)
         * int i, n, r;
         * String str = "";
         * char c;
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter the number = ");
         * n = sc.nextInt();
         * while (n != 0) {
         * r = n % 10;
         * str = str + r;
         * n = n / 10;
         * }
         * for (i = str.length() - 1; i >= 0; i--) {
         * c = str.charAt(i);
         * switch (c) {
         * 
         * case '0':
         * System.out.println("ZERO");
         * break;
         * case '1':
         * System.out.println("ONE");
         * break;
         * case '2':
         * System.out.println("TWO");
         * break;
         * case '3':
         * System.out.println("Three");
         * break;
         * case '4':
         * System.out.println("FOUR");
         * break;
         * case '5':
         * System.out.println("FIVE");
         * break;
         * case '6':
         * System.out.println("SIX");
         * break;
         * case '7':
         * System.out.println("SEVEN");
         * break;
         * 
         * case '8':
         * System.out.println("EIGHT");
         * break;
         * 
         * case '9':
         * System.out.println("NINE");
         * break;
         * 
         * default:
         * System.out.println("NO NUMBER");
         * break;
         * 
         * }
         * 
         * }
         */

        /*
         * AP SERIES:
         * int n = 0, d = 0, a = 0;
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter the Starting Number=");
         * n = sc.nextInt();
         * System.out.println("Enter the Common difference=");
         * d = sc.nextInt();
         * System.out.println("Enter the Term upto which you want=");
         * a = sc.nextInt();
         * for (int i = 0; i < a; i++) {
         * 
         * System.out.print(n + ",");
         * n = n + d;
         * 
         * }
         */

        /*
         * GP SERIES:
         * int n = 0, d = 0, a = 0, term = 0;
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter the Starting Number=");
         * n = sc.nextInt();
         * System.out.println("Enter the Common Ratio=");
         * d = sc.nextInt();
         * System.out.println("Enter the Term upto which you want=");
         * a = sc.nextInt();
         * term = n;
         * for (int i = 0; i < a; i++) {
         * 
         * System.out.print(term + ",");
         * term = term * d;
         * 
         * }
         */

        /*
         * FIBNOCCI SERIES :
         * int a = 0, b = 1, c, n = 0, i;
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.println("Enter the no of terms = ");
         * n = sc.nextInt();
         * System.out.print(a + "," + b + ",");
         * for (i = 0; i < n; i++) {
         * c = a + b;
         * a = b;
         * b = c;
         * System.out.print(c + ",");
         * }
         */

        /*
         * PATTERN 3:
         * for (int i = 1; i <= 5; i++) {
         * for (int j = 1; j <= 5; j++) {
         * System.out.print(i + j + " ");
         * }
         * System.out.println();
         */

        /*
         * PATTERN 4:
         * int count = 0;
         * for (int i = 1; i <= 5; i++) {
         * for (int j = 1; j <= 5; j++) {
         * ++count;
         * System.out.print(" " + count + "  ");
         * }
         * System.out.println();
         * }
         */

        /*
         * PATTERN 5:
         * int count = 0;
         * for (int i = 1; i <= 5; i++) {
         * for (int j = 1; j <= i; j++) {
         * ++count;
         * System.out.format("%02d ", count);
         * }
         * System.out.println("");
         * }
         */

        /*
         * PATTERN 6:
         * for (int i = 1; i <= 5; i++) {
         * for (int j = 1; j <= 5; j++) {
         * if (i + j > 5) {
         * System.out.print("*");
         * } else {
         * System.out.print(" ");
         * }
         * }
         * System.out.println();
         * for (int k = 1; k <= 5; k++) {
         * for (int l = 1; l < k; l++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * 
         * }
         * 
         */

        /*
         * SEARCHING AN ELEMENT IN AN ARRAY:
         * 
         * Scanner sc = new Scanner(System.in);
         * int n, i;
         * int A[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
         * System.out.println("Enter the element you want to search for =");
         * n = sc.nextInt();
         * for (int x : A) {
         * if (n == x) {
         * System.out.println("The element is found =");
         * System.exit(0);
         * }
         * }
         * System.out.println("The searched element is not found");
         * }
         */

        /*
         * int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, };
         * int max1 = a[0], max2 = a[0];
         * for (int i = 0; i < a.length; i++) {
         * if (a[i] > max1) {
         * max2 = max1;
         * max1 = a[i];
         * 
         * } else if (a[i] > max2) {
         * max2 = a[i];
         * }
         * 
         * }
         * System.err.println("First largest element is " + max1);
         * System.err.println("Second largest element is " + max2);
         * }
         */

        /*
         * ROTATING AN ARRAY:
         * int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
         * int temp = 0;
         * temp = a[0];
         * 
         * System.out.println("Before rotating= ");
         * for (int x : a)
         * System.out.print(x + " ");
         * System.out.println(" ");
         * 
         * System.out.println("After rotating= ");
         * 
         * for (int i = 1; i < a.length; i++) {
         * a[i - 1] = a[i];
         * }
         * a[a.length - 1] = temp;
         * for (int y : a)
         * System.out.print(y + " ");
         * System.out.println(" ");
         */

        /*
         * INSERTION IN ARRAY:
         * 
         * int a[] = new int[10];
         * int n, b = 6, ind;
         * a[0] = 5;
         * a[1] = 9;
         * a[2] = 6;
         * a[3] = 10;
         * a[4] = 12;
         * a[5] = 7;
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter the element to insert=");
         * n = sc.nextInt();
         * System.out.println("Enter the index at which you insert=");
         * ind = sc.nextInt();
         * for (int i = b; i > ind; i--) {
         * a[i] = a[i - 1];
         * }
         * a[ind] = n;
         * System.out.println("After insertion = ");
         * for (int x : a) {
         * System.out.print(x + ",");
         * }
         * System.out.println("");
         */

        /*
         * DELETING ELEMENTS IN AN ARRAY:
         * int a[] = new int[10];
         * int temp = 0, b = 5, ind;
         * a[0] = 5;
         * a[1] = 9;
         * a[2] = 6;
         * a[3] = 10;
         * a[4] = 12;
         * a[5] = 7;
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter the index at which you delete=");
         * ind = sc.nextInt();
         * temp = a[ind];
         * for (int i = ind; i < b; i++) {
         * a[i] = a[i + 1];
         * }
         * 
         * System.out.println("After Deletion = ");
         * for (int x : a) {
         * System.out.print(x + ",");
         * }
         * System.out.println("");
         */

        /*
         * REVERSE COPY:
         * int a[] = new int[10];
         * int b[] = new int[10];
         * int temp = 0, i, j;
         * a[0] = 5;
         * a[1] = 9;
         * a[2] = 6;
         * a[3] = 10;
         * a[4] = 12;
         * a[5] = 7;
         * a[6] = 7;
         * a[7] = 7;
         * a[8] = 7;
         * a[9] = 7;
         * for (i = a.length - 1, j = 0; i >= 0; i--, j++) {
         * b[j] = a[i];
         * 
         * }
         * for (int y : b) {
         * System.out.print(b + "'");
         * }
         */

        /*
         * MULTIPLICATION OF ARRAY:
         * int A[][] = { { 3, 5, 9 }, { 7, 6, 2 }, { 4, 3, 5 } };
         * int B[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
         * int C[][] = new int[3][3];
         * for (int i = 0; i < A.length; i++) {
         * for (int j = 0; j < A[0].length; j++) {
         * C[i][j] = 0;
         * for (int k = 0; k < 3; k++) {
         * C[i][j] = C[i][j] + A[i][k] * B[k][j];
         * }
         * }
         * }
         * for (int x[] : C) {
         * for (int y : x) {
         * System.out.print(y + " ");
         * }
         * System.out.println("");
         * 
         * }
         */

        /*
         * SORTING OF AN ARRAY:
         * String arr[] = { "java", "python", "pascal", "smalltalk", "ada", "basic" };
         * 
         * java.util.Arrays.sort(arr);
         * 
         * for (String x : arr)
         * System.out.println(x);
         */

        /*
         * PARAMETERS PASSING:
         * public class Udemy {
         * static void incre(int x) {
         * x++;
         * System.out.println(x);
         * 
         * }
         * 
         * public static void main(String args[]) {
         * 
         * int a = 9;
         * incre(a);
         * 
         * System.out.println(a);
         * }
         * }
         */

        /*
         * static void change(int arr[]) {
         * arr[0] = 45;
         * }
         * /* METHODS CONCEPT
         */
        /*
         * public static void main(String args[]) {
         * int b[] = { 1, 2, 3, 7, 4, 5, 6 };
         * change(b);
         * System.out.println(b[0]);
         */

        /*
         * NESTED INTERFACE
         * class A {
         * public interface ONE {
         * boolean isNotNegative(int x);
         * }
         * }
         * 
         * class B implements A.ONE {
         * public boolean isNotNegative(int x) {
         * return x < 0 ? false : true;
         * }
         * }
         * 
         * public class Udemy {
         * public static void main(String args[]) {
         * B obj = new B();
         * if (obj.isNotNegative(10)) {
         * System.out.println("It is positive");
         * } else {
         * System.out.println("It is positive");
         * }
         * }
         * }
         */

        // DEFAULT METHOD IN JAVA
        /*
         * interface A {
         * void display();
         * 
         * default void show() {
         * System.out.println("This is default method of interface A");
         * }
         * 
         * }
         * 
         * interface B {
         * default void show() {
         * System.out.println("This is default method of interface B");
         * }
         * }
         * 
         * class C implements A, B {
         * 
         * public void display() {
         * System.out.println("This is default method of Class C");
         * }
         * 
         * public void show() {
         * System.out.println("This is Overridden method of Class C");
         * 
         * }
         * }
         * 
         * public class Udemy {
         * public static void main(String[] args) {
         * C obj = new C();
         * obj.display();
         * obj.show();
         * }
         * }
         */
        /*
         * FUNCTIONAL INTERFACE
         * 
         * @FunctionalInterface
         * interface Demo {
         * void a();
         * 
         * }
         * 
         * class B implements Demo {
         * 
         * public void a() {
         * System.out.println("In Show method");
         * }
         * }
         * 
         * public class Udemy {
         * public static void main(String args[]) {
         * B obj = new B();
         * obj.a();
         * }
         * }
         */

    }
}