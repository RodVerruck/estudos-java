
public class Carro extends Veiculo{ //A palavra reservada "extends" serve para herdar caracter�sticas
	public void ligar() {			//de uma classe mais gen�rica. Leia-se: Carro herda Ve�culo.
		confereCambio();
		confereCombustivel();
		System.out.println("CARRO LIGADO");
	}
	private void confereCombustivel() {  //encapsulando os m�todos, ou seja, deixando eles privados, somente a classe carro consegue visualiz�-los
		System.out.println("CONFERINDO COMBUST�VEL");
	}
	private void confereCambio() {
		System.out.println("CONFERINDO CAMBIO EM P");
	}
}
