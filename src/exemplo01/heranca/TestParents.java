package exemplo01.heranca;

public class TestParents {
	
	public static void main (String  [] args) {
		
		Father fa = new Father();
		fa.setParentsId(25);
		fa.setParentsName("Dad Rafael de Luca");
		fa.getParentsSon().setSonId(35);
		fa.getParentsSon().setSonName("Athur Junior de Luca");
		fa.setPantsColor("black");
		
		System.out.println(fa);
		
		Mother mo = new Mother(17, "Mother Laura de Luca", new Son(12, "Claudinha de Luca"),"white");
		System.out.println(mo);
		
		
	}

}
