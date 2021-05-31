pacote atv4 ;

public  class  Vendedor  extends  Funcionario {

	@SuppressWarnings ( " não utilizado " )
	private  String nome;
	@SuppressWarnings ( " não utilizado " )
	 comisao dupla privada ;
	 duplo salão privado ;

	 Vendedor público ( String  nome , String  cpf , String  sexo , double  salario , double  comisao ) {
		super (nome, cpf, sexo, salario);
		isso . nome = nome;
		isso . comisao = comisao;
		isso . salario = salario;
	}

	 comissão dupla  pública ( comissão dupla ) { 
		devolva  isso . salario + comisao;
	}


	}
