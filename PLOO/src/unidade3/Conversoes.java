package unidade3;

public class Conversoes {
	// Conversão de medidas

	private static final double Milhas_Km = 0.621371;
	private static final double Km_Milhas = 1 / Milhas_Km;
	private static final double Pes_Cm = 0.0328084;
	private static final double Cm_Pe = 1 / Pes_Cm;
	private static final double Polegadas_Cm = 0.393701;
	private static final double Cm_Polegadas = 1 / Polegadas_Cm;
	// Converter Km para Milha
	public static double kmToMilha(double km) {
		return km * Milhas_Km;
		}
		// Converter Milha para Km
	public static double milhaToKm(double milha) {
		return milha * Km_Milhas;
		}
		// Converter Cm para Pés
	public static double cmToPe(double cm) {
		return cm * Pes_Cm;
		}
		// Converter Pés para Cm
	public static double peToCm(double pe) {
		return pe * Cm_Pe;
		}
		//Converter Polegadas para Cm
	public static double polToCm(double polegada) {
		return polegada * Cm_Polegadas;
		}
		// Converter Cm para Polegadas
	public static double cmToPol(double cm) {
		return cm * Polegadas_Cm;
		}
	public static void main(String[] args) {
		// Testando os métodos
		System.out.println("10 km em milhas: " + kmToMilha(10));
		System.out.println("10 milhas em km: " + milhaToKm(10));
		System.out.println("10 pés em cm: " + peToCm(10));
		System.out.println("10 cm em pés: " + cmToPe(10));
		System.out.println("10 polegadas em cm: " + polToCm(10));
		System.out.println("10 cm em polegadas: " + cmToPol(10));
		}}


