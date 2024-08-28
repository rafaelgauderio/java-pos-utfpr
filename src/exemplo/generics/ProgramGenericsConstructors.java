package exemplo.generics;

class Sum {
	private int sum;

	// construtor do tipo gen�rico
	public <N extends Number> Sum(N summation) {
		sum = 0;
		for (int i = 0; i <= summation.intValue(); i++) {
			sum = sum + i;
			System.out.println("Somando + " + i + " ao somat�rio");
			
		}
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

}

class ProgramGenericsConstructors {

	public static void main(String[] args) {

		// double extends de number
		Sum objectSum = new Sum(6.00004);

		System.out.println("Somat�rio dos 6 primeiros � " + objectSum.getSum());
	}

}
