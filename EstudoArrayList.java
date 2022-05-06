import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;

// Classe para realizar testes
public class EstudoArrayList {

	public static void main(String[] args) {
		
		// Criando ArrayList definindo a capacidade no construtor
		/*ArrayList<Pessoa> p2 = new ArrayList<Pessoa>(30);

		// Criando um Collection para passar no construtor do Arraylist
		Collection<Pessoa> c = new ArrayList<Pessoa>();

		// Criando ArrayList com a lista da Collection
		ArrayList<Pessoa> p1 = new ArrayList<Pessoa>(c);*/

		// Cria três pessoas para adicionar a lista
		Pessoa p1 = new Pessoa(0, "Evandro", "evandrocwd@gmail.com", "1234");
		Pessoa p2 = new Pessoa(1, "Pedro", "pedro@gmail.com", "1234");
		Pessoa p3 = new Pessoa(2, "Rogerio", "rogerio@gmail.com", "1234");

		// Cria um ArrayList sem passar nada no construtor
		// Assim ele é criado com capacidade de 10
		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

		// Adicionando objeto no final da lista com o método add
		// Ele retorna um true se o objeto for adicionado na lista com sucesso.
		if(lista.add(p1))
			System.out.println("Objecto adicionado com sucesso");
		lista.add(p2);
		lista.add(p3);

		// Método que exibe a lista
		//exibirLista(lista, "Exibir lista apos adicionar objetos no final");

		// Cria mais uma Pessoa
		Pessoa p4 = new Pessoa(3, "Rafael", "rafael@gmail.com", "1234");

		// Adiciona objeto na lista com o método add sobrecarregado,
		// onde a gente passa o indice onde deseja adicionar o objeto,
		// e no segundo argumento passamos o objeto
		// Se passar um indice fora do tamanho do ArrayList ou menor que zero
		// ele gera uma exceção
		lista.add(0, p4);

		// Método que exibe a lista
		// exibirLista(lista, "Exibir lista apos adicionar objetos em um determinada posicao");		

		// Remove um Objeto da lista com o método remove, ele recebe o objeto que será removido
		// E retorna um true se o objetofor removido com sucesso
		//if(lista.remove(p4))
		//	System.out.println("Objeto removido com sucesso");
		
		// Remove um objeto da lista, passando o indice do objeto
		// Se passar um indice fora do tamanho do ArrayList ou menor que zero
		// ele gera uma exceção
		//System.out.println(lista.remove(1));

		//exibirLista(lista, "Exibir lista apos remover objeto");

		// Recuperando objeto da lista com o método get
		// onde passamos como argumento o indice do objeto que queremos recuperar
		//System.out.println(lista.get(1));

		// Verifica se um determinado objeto existe na lista com o método contains
		// Ele retorna um true se o objeto existir na lista
		//if(lista.contains(p2))
		//	System.out.println(lista.get(lista.indexOf(p2))); // O indexOf retorna o indice do objeto na lista

		// Percorre a lista com o for
		// o método size() recupera o tamanho da lista
		//for(int i=0; i < lista.size(); i++){
			//System.out.println(lista.get(i).getNome());
		//}
		
		lista.set(1, new Pessoa(0, "Evandro Lopes", "evandrocwd@gmail.com", "1234"));
		exibirLista(lista, "Mostrando lista");

		// Limpar a lista
		//lista.clear();

		// Exibir lista vazia
		//exibirLista(lista, "Lista Vazia");

		// Verificando se a lista esta vazia
		//if(lista.isEmpty()){
		//	System.out.println("Lista Vazia");
		//}else{
		//	System.out.println("Lista com dados");
		//}

		// Criando uma sub lista
		//List<Pessoa> sublista = lista.subList(0, 2);
		//exibirLista(sublista, "Exibindo sub-lista");

		// Recuperando um Array de Object da nossa lista
		//Object[] arrayDaLista = lista.toArray();
		//for(Object o : arrayDaLista){
		//	Pessoa p = (Pessoa)o;
		//	System.out.println(p.getNome());
		//}

		// Percorrendo a lista com o Iterator
		// Recuperando uma lista de Iterator com o método iterator
		// Iterator<Pessoa> iterator = lista.iterator();

		// Percorrendo a lista utilizando o metodo hasNext()
		// Ele retorna verdadeiro enquanto exibir elementos na nossa lista
		//while(iterator.hasNext()){
			//Pessoa p = (Pessoa) iterator.next();
			//System.out.println(p.getNome() + " / " + p.getEmail());
		//	Pessoa pessoa = iterator.next(); // Metodo next(), recupera objetos da lista
		//	if(pessoa.getNome().equals("Rafael"))
		//		iterator.remove();
		//}

		//exibirLista(lista, "Exibindo lista apos remover objeto com o Iterator");


		// Percorrendo a lista com stream (fluxo de dados)
		lista.stream()
			.filter((Pessoa e) -> e.getNome().equals("Rafael"))
			.forEach(e -> System.out.println(e.getNome() + " / " + e.getEmail()));


	}

	public static void exibirLista( List<Pessoa> p, String label ) {
		System.out.println( label );
		
		for ( Pessoa pessoa : p ) {
			System.out.println( "ID: " + pessoa.getId() +
					" Nome: " + pessoa.getNome() + 
					" Email: " + pessoa.getEmail() +
					" Senha: " + pessoa.getSenha() );
		}
		
		System.out.println();
	}
}
