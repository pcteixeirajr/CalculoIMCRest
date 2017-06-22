package jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/calcularimc")
public class CalculoIMCJaxRs {

	@GET
	@Path("/calcular")
	@Produces("application/json")
	public RetornarIMC calcular(@QueryParam("altura") float altura, @QueryParam("peso") float peso) {
		
		RetornarIMC retorno = new RetornarIMC();
		CalcularIMC calcular = new CalcularIMC();
		
		try{
			
		retorno.setImc(calcular.calcularimc(altura, peso));
		retorno.setCondicao(calcular.condicaoIMC(retorno.getImc()));
		
		}catch(Exception e){
			retorno.setMsgdeErro("Erro no calculo do IMC, repita a operacao");
			return retorno;
		}
	  return retorno;
	}
}