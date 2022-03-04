package br.gov.emprel.models;


public class CpfUsuario {
	
	//Atributos
		private boolean resultado;
		private int soma1 = 0;
		private int soma2 = 0;
		private int resto1;
		private int resto2;
		private int validador1;
		private int validador2;
		private int multiplica1 = 1;
		private int multiplica2 = 1;
		private int i;
		private int j;
		private int x = 0;
		
		
		//Getters and Setters
		public boolean getResultado() {
			return resultado;
		}

		public void setResultado(boolean resultado) {
			this.resultado = resultado;
		}

		

		//Método validar cpf
		public boolean validarCpf(String cpf) {
		String[] conv = cpf.split("");
		
		
		//Verifica se CPF possuí 11 dígitos
		while(conv.length != 11) {
			resultado = false;
			break;
		}
		
				
		//Verifica se a String cpf somente contém números
		if(cpf.matches("[+-]?\\d*(\\.\\d+)?") != true) {
			String[] aux = {"1" , "1" ,  "1" , "1" , "1" , "1" , "1" , "1" , "1" , "1" , "1" };
			conv = aux;
		}
		

		//Digitos validadores
		validador1 = Integer.parseInt(conv[9]);
		validador2 = Integer.parseInt(conv[10]);

		
		//Valida primeiro dígito
		for(i=0;i<(cpf.length()-2);i++) {
		soma1 = soma1 + (i+1)*Integer.parseInt(conv[i]);
		}

		resto1 = soma1%11;

		if(resto1 == 10) {
		resto1 = 0;
		}

		
		//Valida segundo dígito
		for(i=0;i<(cpf.length()-1);i++) {
		soma2 = soma2 + (i)*Integer.parseInt(conv[i]);
		}

		resto2 = soma2%11;

		if(resto2 == 10) {
		resto2 = 0;
		}

		
		//Método verificar se CPF é válido

		//Escolhe o primeiro algarismo diferente de zero
		while(x == 0) {
		x = Integer.parseInt(conv[j]);
		j++;
		}

		
		//Verifica se usuário não colocou todos os algarismo iguais
		for(i=0;i<cpf.length();i++) {
		multiplica1 = (multiplica1)*(Integer.parseInt(conv[i]));
		multiplica2 = multiplica2*(Integer.parseInt(conv[j-1]));
		}


		//Verificar se o cpf é valido
		if(multiplica1 == multiplica2) {
		resultado = false;
		} else if(resto1 == validador1 && resto2 == validador2) {
		resultado = true;
		} else {
		resultado = false;
		}
		System.out.println(resultado);
		return resultado;
		
		}

}
