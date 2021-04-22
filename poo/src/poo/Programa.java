package poo;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		
		List<ContaPF> clientes = new ArrayList<>();
		
		ContaPF cliente1=new ContaPF(1235, "João", 1000.00, 130234);
		ContaPF cliente2=new ContaPF(1234, "Vinicius", 100.00, 543453);
		
		clientes.add(cliente1);
		clientes.add(cliente2);
		
		
		for(int i=0; i<clientes.size();i++) {
		System.out.println("Dados do clientes "+i);
		System.out.println("Nome: "+clientes.get(i).getNome());
		System.out.println("Saldo da conta: R$"+clientes.get(i).saldo);
		System.out.println("Número da conta: "+clientes.get(i).getNumero());
		System.out.println("---------------------------------------------");
		}
		
		
		
		System.out.println("-------------Depósito de R$10 em cada conta----------");
		
		cliente1.depositar(10.00);
		cliente2.depositar(10.00);
		
		
		for(int i=0; i<clientes.size();i++) {
			System.out.println("Dados do clientes "+i);
			System.out.println("Nome: "+clientes.get(i).getNome());
			System.out.println("Saldo da conta: R$"+clientes.get(i).saldo);
			System.out.println("Número da conta: "+clientes.get(i).getNumero());
			System.out.println("---------------------------------------------");
		}
		
		System.out.println("-------------Deletando o cliente 1----------");
		
		clientes.remove(cliente1);
		
		System.out.println("--------------------------------------------");
		
		for(int i=0; i<clientes.size();i++) {
			System.out.println("Dados do clientes "+i);
			System.out.println("Nome: "+clientes.get(i).getNome());
			System.out.println("Saldo da conta: R$"+clientes.get(i).saldo);
			System.out.println("Número da conta: "+clientes.get(i).getNumero());
			System.out.println("---------------------------------------------");
		}
		
		
		

	}

}
