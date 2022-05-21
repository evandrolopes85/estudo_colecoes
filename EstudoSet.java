import java.util.Set;
import java.util.HashSet;
import java.util.*;
import java.util.stream.*;

public class EstudoSet{


	public static void main(String[] args){

		Pessoa evandro = new Pessoa(0, "Evandro", "evandrocwd@gmail.com", "1234");
		Pessoa pedro = new Pessoa(1, "Pedro", "pedro@gmail.com", "1234");
		Pessoa rogerio = new Pessoa(2, "Rogerio", "rogerio@gmail.com", "1234");

		List<Pessoa> list = new ArrayList<Pessoa>();

		list.add(evandro);
		list.add(pedro);
		list.add(rogerio);
		list.add(evandro);

		exibirLista(list, "Exibir colecao List");

		Set<Pessoa> set = new HashSet<Pessoa>();

		set.add(evandro);
		set.add(pedro);
		set.add(rogerio);
		set.add(evandro);

		exibirLista(set, "Exibir colecao Set/HashSet");

	}

	public static void exibirLista(Collection<Pessoa> pessoa, String titulo){
		System.out.println(titulo);
		for(Pessoa p : pessoa){
			System.out.println(p + "\n");
		}
	}
}