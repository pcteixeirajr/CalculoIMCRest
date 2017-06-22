package jaxrs;


public class CalcularIMC {
        

	public float calcularimc(float altura, float peso) {
             
            Float imc = peso/ (altura*altura);
		
		 if (peso <=0 || altura <=0){
			
			return 0;
		 }
          else {
               return imc;
	     }
		
     }   
        public String condicaoIMC (float imc){ 
		 
        	String condicao = "";
		
		 if (imc <=0){
			condicao = "IMC invalido, digite novamente";	
            }
            else if(imc > 0 && imc < 18.5)  { 
                 condicao = "Voce esta abaixo do peso"; 
            
               
            }
            else  if(imc >= 18.5 && imc < 25) {  
                 condicao = "Voce esta no peso normal"; 
                
            }  
            else  if(imc >= 25 && imc < 30)  {  
                 condicao = "Voce esta acima do peso";  
                   
            }  
            else  if(imc >= 30)  {  
                 condicao = "Voce esta obeso";  
                        
            }
               return condicao;    
        }
           
       
}
