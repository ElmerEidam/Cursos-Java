package br.com.bytebank.banco.model;

public class SaldoInsuficienteException extends RuntimeException{
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
	
}
