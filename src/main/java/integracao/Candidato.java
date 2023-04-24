package integracao;

public class Candidato {
	
	private int idade;
	private Boolean contratado;
	private FuncionarioCargaHoraria cargaHoraria;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Boolean isContratado() {
		return this.contratado;
	}

	public FuncionarioCargaHoraria getCargaHoraria() {
		return this.cargaHoraria;
	}

	public Boolean contratar() {
		int idade = this.idade;
		
		if (idade < 16 || idade > 55) { // 1
			this.contratado = false;
			return false; // 2
		}
		
		this.contratado = true;
		
		this.cargaHoraria = idade >= 18
				? FuncionarioCargaHoraria.INTEGRAL // 3
				: FuncionarioCargaHoraria.PARCIAL; // 4
		
		return true; // 5
	} // 6

}
