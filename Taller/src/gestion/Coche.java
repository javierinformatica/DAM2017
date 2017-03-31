package gestion;

/**
 * 
 * @author ProfVespertino
 *Esta clase representa un coche
 */
public class Coche {
	String matricula;
	int motor;
	int ruedas;
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/*
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			System.out.println("HOLA");
			System.out.println("matricula");
		}
	}
	/**
	 * @return the motor
	 */
	public int getMotor() {
		return motor;
	}
	/**
	 * @param motor the motor to set
	 */
	public void setMotor(int motor) {
		this.motor = motor;
	}
	

}
