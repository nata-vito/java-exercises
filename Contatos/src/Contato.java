
public class Contato {

	private String nome;
	private String telefone; 
	private String email; 
	private String endereco; 

	public Contato() {
		this.nome = "";
		this.endereco = "";
		this.email = "";
		this.telefone = "";
	}
	
	public Contato(String nome, String telefone, String email, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}
	
	public void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Endereco: " + endereco);
		System.out.println("E-mail: " + email);
		System.out.println("Telefone: " + telefone);
		System.out.println();
	}


	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    
}


