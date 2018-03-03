package Calculadora;

public class Calculadora {
	
	/*
	 * Este atributo es un número real tipo Double, actúa como primer operador
	 */
	
	public double op1;
	
	/*
	 * Este atributo es un número real tipo Double, actúa como segundo operador 
	 */
	
	public double op2;
	
	/*
	 * Este constructor permite generar objetos de la clase Calculadora para poder llamar a los métodos
	 * @param op1 double (número real)
	 * @param op2 double (número real)
	 */
	
	public Calculadora(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	/*
	 * @return devuelve el resultado de sumar op1+op2
	 */
	
	public double suma() {
		return op1+op2;
	}
	
	/*
	 * @return devuelve el resultado de restar op1-op2
	 */
	
	public double resta() {
		return op1-op2;
	}
	
	/*
	 * @return devuelve el resultado de dividir op1/op2
	 * 
	 * @throws IllegalArgumentException Si op2 es 0
	 */
	
	public double division() {
		if(op2==0) {
			throw new IllegalArgumentException("El divisor es 0");
		}
		return op1/op2;
	}
	
	//TODO: A�adir la operaci�n potencia, que devuelve
	//op1 elevado a op2 con las siguientes reglas: 
	//-Por convenio cualquier n�mero elevado a 0 es igual a 1.
	//-Un n�mero "n" elevado a una potencia negativa "-p" es igual a 1/(n^p)
	//As� 232^0 = 1; y 2^(-3)=1/2^3=1/8
	
	/*
	 * @return devuelve el resultado de elevar op1 a op2
	 */
	
	public double potencia() {
		return Math.pow(op1, op2);
	}
	//TODO: A�adir la operacion toString que devuelva los operandos
	//la cadena:
	//"Calculadora de <vuestroNombre>: "
	//"operando1 = <op1>"
	//"operando2 = <op2>"
	
	@Override
	public String toString() {
		return "Calculadora de Bruno\n"+"operando1 = "+op1+"\n"+"operando2 = "+op2;
	}
	
	
	
}
