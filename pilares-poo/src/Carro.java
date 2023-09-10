
public class Carro extends Veiculo{ //A palavra reservada "extends" serve para herdar características
	public void ligar() {			//de uma classe mais genérica. Leia-se: Carro herda Veículo.
		confereCambio();
		confereCombustivel();
		System.out.println("CARRO LIGADO");
	}
	private void confereCombustivel() {  //encapsulando os métodos, ou seja, deixando eles privados, somente a classe carro consegue visualizá-los
		System.out.println("CONFERINDO COMBUSTÍVEL");
	}
	private void confereCambio() {
		System.out.println("CONFERINDO CAMBIO EM P");
	}
}
