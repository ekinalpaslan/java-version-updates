import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("How to access a constant");

        Currency c = Currency.DIME;
        System.out.println(c);      //prints hashcode if it is not overridden

        System.out.println("How to get all constant");
        Currency[] currencies = Currency.values();

        System.out.println(Arrays.toString(currencies));

        for (Currency each : currencies) {
            System.out.println(each);
        }


        System.out.println("How to use switch-case with enums");

        switch (Currency.PENNY){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKEL:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;
        }


        System.out.println("----------------------------------------------------------");

        System.out.println("MathOperation Task");
        calculate(3,5,MathOperations.PLUS);


        System.out.println("How to retrieve the constant value");
        System.out.println(Currency.PENNY.getValue());      //1
        System.out.println(Currency.QUARTER.getValue());    //25
        System.out.println(Currency.QUARTER.ordinal());     //3






    }
    public static void calculate(double x, double y, MathOperations operation){
        switch (operation){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;
            }
        }

}
