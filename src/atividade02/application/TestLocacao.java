package atividade02.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import atividade02.entities.Cidade;
import atividade02.entities.Endereco;
import atividade02.entities.Imovel;
import atividade02.entities.Locacao;
import atividade02.entities.Proprietario;

public class TestLocacao {

	public static void main(String[] args) {

		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

		Cidade cid = new Cidade();
		cid.setCodCid(200);
		cid.setNomeCid("Porto Alegre");

		Endereco end = new Endereco();
		end.setRua("Rua Asssis Brasil");
		end.setNum(209);

		Imovel imo = new Imovel();
		imo.setTipoMaterial("Madeira");
		imo.setValAluguel(500);

		Proprietario pro = new Proprietario();
		pro.setCpfProp(621333333);
		pro.setNomeProp("Rafael de Luca");

		Locacao loc = new Locacao();
		try {
			loc.setDataInicio(formato.parse("10/12/2023"));
			loc.setDataFim(formato.parse("17/12/2023"));

		} catch (ParseException e) {

			e.printStackTrace();
		}

		System.out.println(cid);
		System.out.println(end);
		System.out.println(imo);
		System.out.println(pro);
		System.out.println(loc);

	}

}
