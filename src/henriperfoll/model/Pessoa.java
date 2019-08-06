package henriperfoll.model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Pessoa {

	private String nome = "joão";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String cadastrar() {
		return "index";
	}

}
