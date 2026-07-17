public class Practical2{
    public static void main(String[] args){
         
        int a = 10;
        int b = 5;

        System.out.println("Arithmetic Operators");
        System.out.println("Addition =" + (a+b));
        System.out.println("Subtraction =" + (a-b));
        System.out.println("Multiplication =" + (a*b));
        System.out.println("Division =" + (a/b));
        System.out.println("Modulus =" + (a%b));

        System.out.println();

        System.out.println("Relational Operators");
        System.out.println(" a==b:" + (a==b));
        System.out.println("a!=b:" + (a!=b));
        System.out.println("a>b:" + (a>b));
        System.out.println("a<b: "+ (a<b));
        System.out.println("a>=b:" + (a>=b));
        System.out.println("a<=b:" + (a<=b));

        System.out.println();

        boolean x = true;
        boolean y = false;

        System.out.println("Logical Operators");
        System.out.println("x && y =" +(x && y));
        System.out.println("x || y =" +(x || y));
        System.out.println("!x = " +(!x));

        System.out.println();

        int c = 10;

        System.out.println("Unary Operators");
        System.out.println("Original Value =" +c);
        System.out.println("Unary Plus=" +(+c));
        System.out.println("Unary Minus=" +(-c));


    }
}
