package teste;

public class Aviao extends Veiculo {
	
	private String tipoDeUso;

	public String getTipoDeUso() {
		return tipoDeUso;
	}

	public void setTipoDeUso(String tipoDeUso) {
		this.tipoDeUso = tipoDeUso;
	}
	
	public void exibirOiAviao() {
		System.out.println("Ola vc esta na classe Aviao");
	}

}
