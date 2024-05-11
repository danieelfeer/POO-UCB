package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somar(3, 4);
        calculadora.somar(2.2, 3.1);
        
        Animal animal = new Animal();
        animal.fazerSom();

        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();
        
        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.acelerar();
        moto.acelerar();

        acelerarVeiculo(carro);
        acelerarVeiculo(moto);
        
    }

    public static void acelerarVeiculo(Veiculo veiculo){
        veiculo.acelerar();
    }

}
