package teste;

public class Carro extends Veiculo{
	
	private String tipoDeCambio;

	public String getTipoDeCambio() {
		return tipoDeCambio;
	}

	public void setTipoDeCambio(String tipoDeCambio) {
		this.tipoDeCambio = tipoDeCambio;
	}
	
	public void exibirOiCarro () {
		System.out.println("Ola vc esta na classe Carro");
	}

}
