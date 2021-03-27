package br.com.bytebank.banco.tests;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura";//object literal
		//String outro = new String("Alura"); //Funciona também, mas é considerado má prática de programação
		
		String outra = nome.replace("r", "R");
		String outra1 = nome.toLowerCase();
		String outra2 = nome.toUpperCase();
		char c = nome.charAt(2);
		int posicao = nome.indexOf('u');
		String sub = nome.substring(1);
		String vazio = "";
		String outroVazio = " ";
		String outroVazio2 = outroVazio.trim();
		
		System.out.println(nome);
		System.out.println(outra);
		System.out.println(outra1);
		System.out.println(outra2);
		System.out.println(c);
		System.out.println(posicao);
		System.out.println(sub);
		System.out.println(vazio.isEmpty());
		System.out.println(outroVazio.isEmpty());
		System.out.println(outroVazio2.isEmpty());
		System.out.println(nome.contains("Alu"));
	}

}
