package com.ti2cc;
public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		//Inserir um elemento na tabela
		Carro carro = new Carro(7, "honda", "civic si",2015);
		if(dao.inserirCarro(carro) == true) {
			System.out.println("Inserção com sucesso -> " + carro.toString());
		}
		
		//Mostrar carro da mesma marca		
		System.out.println("==== Mostrar carros da mesma marca	=== ");
		Carro[] carros = dao.getCarrosMarca();
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}

		//Atualizar carro
		carro.setModelo("novo modelo");
		dao.atualizarCarro(carro);

		//Mostrar carros
		System.out.println("==== Mostrar Carros === ");
		carros = dao.getCarros();
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}
		
		//Excluir carro
		dao.excluirCarro(carro.getCodigo());
		
		//Mostrar carros
		carros = dao.getCarros();
		System.out.println("==== Mostrar Carros === ");		
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}
		
		dao.close();
	}
}