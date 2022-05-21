 // Classe que será usada para mostrar como utilizar os métodos de ArrayList
public class Pessoa{

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
	public int hashCode(){
		return this.getId() + this.getNome().length() + this.getEmail().length() + this.getSenha().length();
	}

	@Override
	public boolean equals(Object o){
		if(o == null) return false;
		if(this == o) return true;
		if(this.getClass() != o.getClass()) return false;

		Pessoa p = (Pessoa)o;

		return this.getId() == p.getId() && this.getNome().equals(p.getNome()) && this.getEmail().equals(p.getEmail());
	}

	@Override
	public String toString() {
		return "[Pessoa Id: " + this.id + " Nome: " + this.nome + " Email: " + this.email + " Senha: " + this.senha + "]";
	}
}