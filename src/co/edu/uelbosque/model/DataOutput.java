package co.edu.uelbosque.model;

public class DataOutput {
	private int resultNum;
	private String resultLetter;
	private String result;
	
	// Constructor de la clase DataOutput para generar objetos dados los atributos
	public DataOutput(int resultNum, String resultLetter, String result) {
		super();
		this.resultNum = resultNum;
		this.resultLetter = resultLetter;
		this.result = result;
	}
	
	// Constructor de la clase DataOutput para generar objetos vacios
	public DataOutput() {
		super();
	}
	
	
	// Metodos accesores (getters y setters)
	public int getResultNum() {
		return resultNum;
	}
	public void setResultNum(int resultNum) {
		this.resultNum = resultNum;
	}
	public String getResultLetter() {
		return resultLetter;
	}
	public void setResultLetter(String resultLetter) {
		this.resultLetter = resultLetter;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "DataOutput [resultNum=" + resultNum + ", resultLetter=" + resultLetter + ", result=" + result + "]";
	}

}
