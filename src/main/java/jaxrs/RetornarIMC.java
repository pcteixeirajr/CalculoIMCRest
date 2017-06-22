package jaxrs;

public class RetornarIMC {
	
	float imc;
	String condicao;
	String msgdeErro;
	
	public RetornarIMC(){}

	public String getMsgdeErro() {
		return msgdeErro;
	}

	public void setMsgdeErro(String msgdeErro) {
		this.msgdeErro = msgdeErro;
	}

	public float getImc() {
		return imc;
	}

	public void setImc(float imc) {
		this.imc = imc;
	}

	public String getCondicao() {
		return condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}

}