package calculadora;

public class IMC {
	private String nome;
	private double altura;
	private double peso;
	private double imc;
	
	public IMC(String nome, double altura, double peso) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public double getImc() {
		return imc;
	}

	public void calcularIMC() {
		this.imc = peso / (altura * altura);
	}
	
	public String resultadoIMC() {
		if (imc < 18.5) {
			return "abaixo do peso";
		} else if (imc >=  18.5 && imc < 25) {
			return "peso normal";
		} else if (imc >=  25 && imc < 30) {
			return "sobrepeso";
		} else if (imc >=  30 && imc < 35) {
			return "obesidade grau 1";
		}else if (imc >=  35 && imc < 40) {
			return "obesidade grau 2";
		} else {
			return "obesidade grau 3";
		}
	}
	
	public String toString() {
		return nome +
				" tem imc de valor "
				+ String.format("%.2f", imc)
				+" e está com "
				+ resultadoIMC()
				+".";
				
	}
}
