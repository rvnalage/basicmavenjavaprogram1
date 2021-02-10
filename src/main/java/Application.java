public class Application {
    public static void main(String args[]) {

        System.out.println("Hello Java github7");
        Calculator cal = new Calculator();
        int m = cal.multiply(10,2);
        System.out.println(m);

        int d = Calculator.division(10,2);
        System.out.println(d);
    }


}
