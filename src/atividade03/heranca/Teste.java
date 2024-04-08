package atividade03.heranca;

public class Teste {

	public static void main(String[] args) {
	
		Passeio p1 = new Passeio ();
		p1.setMarca("Nissan");
		p1.setModelo("HB 20");
		p1.setPlaca("HXJ 1034");
		p1.setCor("preto");
		p1.setVelocMax(200);
		p1.setQdtRodas(4);		
		p1.getMotor().setPotencia(60);
		p1.getMotor().setQtdPist(7);
		p1.setQtdPassageiros(5);
		
		System.out.println(p1);
		
		Carga q1 = new Carga ();
		q1.setMarca("Fiat");
		q1.setModelo("Toro");
		q1.setPlaca("ILJ 2099");
		q1.setCor("branca");
		q1.setVelocMax(180);
		q1.setQdtRodas(4);		
		q1.getMotor().setPotencia(70);
		q1.getMotor().setQtdPist(7);
		q1.setCargaMax(2000);
		q1.setTara(912);
		
		System.out.println(q1);
		

	}

}
