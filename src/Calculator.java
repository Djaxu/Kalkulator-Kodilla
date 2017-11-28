public class Calculator {

    int a = 1;
    int b = 9;

    public int addMethod( int a, int b) {
        return b + a;
    }

    public int substractMethod(int a, int b) {
        return b - a;
    }
    public static void main(String args[]) {

        Calculator calculator = new Calculator();
         int resoult=calculator.addMethod(9,4);
         int subresoult=calculator.substractMethod(50,23);
    System.out.println("wynik dodawania " + resoult+ "\n" + "wynik odejmowania " +subresoult);
    }
}
