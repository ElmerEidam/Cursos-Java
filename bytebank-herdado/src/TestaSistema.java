
public class TestaSistema {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setSenha(222);

		Administrador adm = new Administrador();
		adm.setSenha(555);
		
		Cliente cliente = new Cliente();
        cliente.setSenha(222);
		
		SistemaInterno s1 = new SistemaInterno();
		s1.autentica(g1);
		s1.autentica(adm);
		s1.autentica(cliente);
	}

}