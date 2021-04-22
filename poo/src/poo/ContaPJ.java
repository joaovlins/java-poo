package poo;

public class ContaPJ extends Conta{
	
	private Integer cnpj;
	
	public ContaPJ(Integer numero, String nome, Double saldo) {
		super(numero, nome, saldo);
	}
	
	public ContaPJ(Integer numero, String nome, Double saldo, Integer cnpj) {
		super(numero, nome, saldo);
		this.cnpj=cnpj;
	}
	
	public Integer getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(Integer cnpj) {
		this.cnpj=cnpj;
	}
	
	
	@Override
	public Double sacar(Double saque) {
		saldo-=saque + 5;
		return saldo;
	}

	
}
