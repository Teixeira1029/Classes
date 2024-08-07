package Dia07do08;

public class ObjetosPessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.setNome("Tom Cruise");
		pessoa1.setIdade(60);
		pessoa1.setEndereco("California,USA");
		pessoa1.setProfissao("Ator");
		pessoa1.setCPF("478.019.298-61");
		pessoa1.setRg("321-654-876");
		
		
		
		pessoa2.setNome("Messi");
		pessoa2.setIdade(35);
		pessoa2.setEndereco("Miami, USA");
		pessoa2.setProfissao("Jogador de Futebol");
		pessoa2.setCPF("479.876.345-81");
		pessoa2.setRg("123-456-678");
		
		
		System.out.println("----- OBJETO 1-----");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.profissao());
		System.out.println(pessoa1.getCpf());
		System.out.println(pessoa1.getRg());
		
		
		
		
		System.out.println("----- OBJETO 2-----");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.profissao());
		System.out.println(pessoa2.getCpf());


	}

}
