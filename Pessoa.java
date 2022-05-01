 // Classe que será usada para mostrar como utilizar os métodos de ArrayList
public class Pessoa {

	private int id;
	private String nome;
	private String email;
	private String senha;

	public Pessoa( int id, String nome, String email, String senha ) {
		this.id    = id;
		this.nome  = nome;
		this.email = email;
		this.senha = senha;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setEmail( String email ) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setSenha( String senha ) {
		this.senha = senha;
	}

	public String getSenha() {
		return this.senha;
	}

	@Override
	public String toString() {
		return "[Pessoa Id: " + this.id + "\nNome: " + this.nome + "\nEmail: " + this.email + "\nSenha: " + this.senha + "]";
	}
}