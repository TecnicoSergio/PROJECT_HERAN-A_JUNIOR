package teste;

import java.util.Scanner;

public class Fabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro carro;
		carro = new Carro();
		
		Aviao aviao;
		aviao = new Aviao();
		
		Veiculo veiculo;
		veiculo = new Veiculo();
		
		aviao.setNome("AIRBUS NATIONAL");
		aviao.setModelo("Modelo Airbus");
		aviao.setTipoDeUso("Uso para passeio e comerciais");
		
		carro.setNome("Toyota");
		carro.setTipoDeCambio("Automatico e Manual");
		
		veiculo.setPassageiros(5);
		veiculo.setVelocidade(200);
		veiculo.setNome("Toyota");
		
		System.out.println("Ola vc esta na classe Aviao:" + "\n" + "\n " + "Nome: " 
		+ aviao.getNome() + "\n" + "Modelo: " + aviao.getModelo() + "\n" 
				+ "Tipo de Uso :" 
				+ aviao.getTipoDeUso() + "\n");
		
		System.out.println("Ola vc esta na classe Carro:" + "\n" + "\n" + "Nome: " 
				+ carro.getNome() + "\n" + "Tipo do Cambio: " + carro.getTipoDeCambio() 
				+ "\n");
		System.out.println("Ola vc esta na classe Veiculo" + "\n" + "\n" 
				+ "Quantidades de Passageiros:" + veiculo.getPassageiros() 
				+ "\n" + "Velocidade: " + veiculo.getVelocidade() + "\n" 
				+ "Nome: " + veiculo.getNome() + "\n");
		
		
		Scanner sc = new Scanner(System.in);
		
		String tipoDeCarro;
		System.out.println("Digite o nome do Carro:");
		tipoDeCarro = sc.nextLine();
		System.out.println("O carro é : " + tipoDeCarro);
		
		String tipoDeUso;
		System.out.println("Digite o tipo de Uso do Aviao:");
		tipoDeUso = sc.nextLine();
		System.out.println("O tipo do aviao é : " + tipoDeUso);
		
		
		
		
		
	
		

	}

}
