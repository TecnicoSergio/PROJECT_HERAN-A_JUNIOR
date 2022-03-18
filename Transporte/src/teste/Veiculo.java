package teste;

public class Veiculo {
	
	private String nome;
	private String modelo;
	private double velocidade;
	private int passageiros;
	private double combustivel;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	public double getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}
	
	public void exibirOiVeiculo () {
		System.out.println("Ola vc esta na classe Veiculo");
	}
	
	

}
