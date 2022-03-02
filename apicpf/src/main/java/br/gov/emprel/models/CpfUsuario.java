package br.gov.emprel.models;


public class CpfUsuario {
	
	//Atributos
		private String resultado;
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
		public String getResultado() {
			return resultado;
		}

		public void setResultado(String resultado) {
			this.resultado = resultado;
		}



		//Método validar cpf
		public String validarCpf(String cpf) {
		String[] conv = cpf.split("");
		
		
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
		resultado = "CPF inválido";
		} else if(resto1 == validador1 && resto2 == validador2) {
		resultado = "CPF valido";
		} else {
		resultado = "CPF inválido";
		}
		System.out.println(resultado);
		return resultado;
		
		}

}
