package calculadora;

public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora(40,2);

        System.out.println(calc.somar());
        System.out.println(calc.subtrair());
        System.out.println(calc.multiplicar());

/////////////////////////////////////////////////////

        Calculadora calc2 = new Calculadora(40,0);

        System.out.println(calc2.somar());
        System.out.println(calc2.subtrair());
        System.out.println(calc2.multiplicar());

        if (calc2.resultado == 0) {
            System.out.println("nao pode ser dividido por 0 ");
        } else {
            System.out.println("A divisao e: " + calc2.dividir());

        }
    }
}