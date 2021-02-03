
//Contrato autenticável que define obrigações.
//Quem assina esse contrato precisa implementar os métodos: setSenha e autentica.

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
	
}
