package poo;
import java.lang.Integer;
public class ContaPF extends Conta {

	private Integer cpf;
	
	public ContaPF(Integer numero, String nome, Double saldo) {
		super(numero, nome, saldo);
	}
	
	public ContaPF(Integer numero, String nome, Double saldo, Integer cpf) {
		super(numero, nome, saldo);
		this.cpf=cpf;
	}
	
	public Integer getCpf() {
		return cpf;
	}
	
	public void setCpf(Integer cpf){
		this.cpf=cpf;
	}
	
	
	
	
	
}
