package hotel;

public class Funcionario {

	private int id;
	private Integer cod;
	private String nome;
	private String cargo;
	private String fone;

	public Funcionario(int id, Integer cod, String nome, String cargo, String fone) {
		this.id = id;
		this.cod = cod;
		this.nome = nome;
		this.cargo = cargo;
		this.fone = fone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

}
