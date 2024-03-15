package atividade02.entities;

import java.util.Date;

public class Locacao {

	private Date dataInicio = new Date();
	private Date dataFim = new Date();
	private Imovel imovel = new Imovel();

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

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	@Override
	public String toString() {
		return "Loca��o [data de �nicio da loca��o= " + dataInicio.toLocaleString().substring(0, 18)
				+ ", data de fim da loca��o= " + dataFim.toLocaleString().substring(0, 18) + imovel + "]";
	}

}