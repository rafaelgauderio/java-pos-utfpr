package atividade02.entities;

import java.util.Date;

public class Locacao {

	private Date dataInicio = new Date();
	private Date dataFim = new Date();

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	@Override
	public String toString() {
		return "Locacao [data de ínicio da locação= " + dataInicio.toLocaleString().substring(0, 18)
				+ ", data de fim da locação= " + dataFim.toLocaleString().substring(0, 18) + "]";
	}

}