package aplicacao;

public class Loja {

	public static void main(String[] args) {
		int farenheit;
		double celsius;
		for( farenheit=100; farenheit<=150;farenheit++){
			celsius = (double) 5/9 * (farenheit - 32);
			//System.out.println("farenheit: "+  farenheit+ "\t celcius: " +celsius);
			System.out.printf("Fahrenheit: %d\t Celsius: %.2f\n", farenheit, celsius);

		}
	}
}
