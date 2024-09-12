package Enum;

public enum PeriodoCurso {
			NOTURNO ("ter e qua", 2500., 40), 
			INTEGRAL ("seg e sex", 1800., 20),
			TARDE ("qui e sex", 3200., 80);
			
			private final String dia;
			private final Double valor;
			private final Integer cargaHoraria;
			
			private PeriodoCurso(String dia, Double valor, Integer cargaHoraria) {
				this.dia = dia;
				this.valor = valor;
				this.cargaHoraria = cargaHoraria;
			}

			public String getDia() {
				return dia;
			}

			public Double getValor() {
				return valor;
			}

			public Integer getCargaHoraria() {
				return cargaHoraria;
			}
	

}
