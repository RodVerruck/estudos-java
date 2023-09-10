package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {
	public void copiar() {
		System.out.println("copiando via equipamento multifuncional");
		
	}

	public void digitalizar() {
		System.out.println("digitalizando via equipamento multifuncional");
		
	}

	public void Imprimir() {
		System.out.println("imprimindo via equipamento multifuncional");
		
	}

}
