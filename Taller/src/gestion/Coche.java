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
	int caballos;
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setCaballos (int aCaballos){
		this.caballos = aCaballos ;
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
