package atividade03.heranca;

public class Teste {

	public static void main(String[] args) {

		Passeio p1 = new Passeio();
		p1.setMarca("Nissan");
		p1.setModelo("HB 20");
		p1.setPlaca("HXJ 1034");
		p1.setCor("Preto");
		p1.setVelocMax(200);
		p1.setQdtRodas(4);
		p1.getMotor().setPotencia(60);
		p1.getMotor().setQtdPist(7);
		p1.setQtdPassageiros(5);

		Passeio p2 = new Passeio("IJV 2619", "Ford", "Escort", "Azul", 190, 4, 6, 85, 5);
		Passeio p3 = new Passeio("IOV 4512", "Woskwagen", "Novo Gol ", "Prata", 180, 4, 6, 95, 5);
		Passeio p4 = new Passeio("ABC 2965", "Woskwagen", "Golf", "Chumbo", 250, 4, 7, 160, 5);
		Passeio p5 = new Passeio("KLO 9025", "Chevrolet", "Cruze", "Vinho", 240, 4, 7, 150, 5);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);

		Carga c1 = new Carga();
		c1.setMarca("Fiat");
		c1.setModelo("Toro");
		c1.setPlaca("ILJ 2099");
		c1.setCor("Branca");
		c1.setVelocMax(200);
		c1.setQdtRodas(4);
		c1.getMotor().setPotencia(70);
		c1.getMotor().setQtdPist(7);
		c1.setCargaMax(2000);
		c1.setTara(912);

		Carga c2 = new Carga("UOL 1536", "Fiat", "Strada", "Prata", 180, 4, 7, 90, 1500, 900);
		Carga c3 = new Carga("IYW 2598", "Ford", "Ranger", "Marrom", 140, 4, 8, 122, 2200, 1600);
		Carga c4 = new Carga("IHN 4458", "Mercedes-Benz", "Sprinter Chassis", "Preto", 120, 4, 9, 130, 3500, 2100);
		Carga c5 = new Carga("JWE 250", "Woskwagen", "Saveiro", "Bege", 160, 4, 8, 110, 1400, 800);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

	}

}
