package calculadora;

public class Calculadora {

    int num1,num2,resultado;


    public Calculadora(int num1, int num2) {

        this.num1 = num1;
        this.num2 = num2;

    }

    public Calculadora() {}

    //soma
    public int somar() {

        this.resultado = this.num1 + this.num2;
        return this.resultado;
    }
    //subtração
    public int subtrair() {

        this.resultado = this.num1 - this.num2;

        return this.resultado;
    }
    //multiplicação
    public int multiplicar() {

        this.resultado = this.num1 * this.num2;

        return this.resultado;
    }
    //divisão
    public int dividir() {

        this.resultado = this.num1 / this.num2;

        return this.resultado;
    }
}
