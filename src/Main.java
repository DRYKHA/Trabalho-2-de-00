public class Main {
    public static void main(String[] args) {

        Veiculo carro = new Veiculo(2024,"Camaro","Amarelo",123);


        System.out.println("Seu carro está: "+carro.verificarManutencao()+" e sua cor e "+ carro.exibirCor());
        carro.mudarCor ("Azul");
        System.out.println("A cor do seu carro agora e "+ carro.exibirCor());

    }
}