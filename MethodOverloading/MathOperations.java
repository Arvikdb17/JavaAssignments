package MethodOverloading;



public class MathOperations {
    public static void main(String[] args){
       System.out.println(add(1,2));
       System.out.println(add(1.1,2.2));
       System.out.println(sub(1,2));
       System.out.println(sub(1.1,2.2));
       System.out.println(multiply(1,2));
       System.out.println(multiply(1.1,2.2));
       System.out.println(divide(1,2));
       System.out.println(divide(1.1,2.2));


    }
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static double sub(double a,double b){
        return a-b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }
    public static double multiply(double a,double b){
        return a*b;
    }
    public static int divide(int a,int b){
        if(b==0)
            throw new ArithmeticException("Cannot divide by zero");

        return a/b;
    }
    public static double divide(double a,double b){
        if(b==0)
            throw new ArithmeticException("Cannot divide by zero");

        return a/b;
    }
}
