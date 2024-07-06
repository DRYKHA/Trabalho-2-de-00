public class Veiculo {

    int ano;
    String modelo, cor;
    float km;

    public Veiculo(int ano, String modelo, String cor, float km) {

        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.km = km;

    }

    public Veiculo(){}

    public String verificarManutencao(){

        if(km <= 25000) {
            return "Tudo ok";
        } else if (this.km >= 25000 && this.km <= 75000){
            return "Precisando Realizar Revisão parcial!";
        }


        return "Precisando Realizar revisão completa!";
    }

    public void mudarCor(String cor) {

        this.cor = cor;
    }

    public String exibirCor(){

        return this.cor;
    }

}