package poo;

public class Conta {
	
	private Integer numero;
	private String nome;
	protected Double saldo;
	
	public Conta() {
	}
	
	public Conta(Integer numero, String nome, Double saldo) {
		
		this.numero=numero;
		this.nome=nome;
		this.saldo=saldo;
	}
	
	public Integer getNumero(){
		return numero;
	}
	
	public String getNome(){
		return nome;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public Double depositar(Double deposito){
		saldo+=deposito;
		return saldo;
	}
	
	public Double sacar(Double saque) {
		saldo-=saque;
		return saldo;
	}
	
	
	
}
