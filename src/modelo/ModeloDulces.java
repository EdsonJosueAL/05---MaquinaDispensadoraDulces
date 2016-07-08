
package modelo;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
/**
 * 
 * @author EDSONJOSUE
 *
 */
public class ModeloDulces {
	private JLabel[] b;
	private int total = 0;
	private JCheckBox[] a;
	
	boolean prod1  = false;
	boolean prod2  = false;
	boolean prod3  = false;
	boolean prod4  = false;
	
	boolean totalP[] = {prod1,prod2,prod3,prod4};
	/**
	 * Constructor por defecto
	 */
	public ModeloDulces() {
	}
	/**
	 * Constructor con parametros
	 * @param b arreglo de JLabels
	 * @param a arreglo de CheckBox
	 */
	public ModeloDulces(JLabel[] b, JCheckBox[] a) {
		super();
		this.b = b;
		this.a = a;
	}
	/**
	 * Método get que devuelve un arreglo
	 * @return devuelve el arreglo totalP en tipo boolean
	 */
	public boolean[] getTotalP(){
		boolean totalP[] = {prod1,prod2,prod3,prod4};
		return totalP;
	}

	/**
	 * Método get que devuelve un arreglo
	 * @return devuelve el arreglo b en tipo JLabel
	 */
	public JLabel[] getB() {
		return b;
	}
	
	/**
	 * Método get que devuelve un arreglo
	 * @return devuelve el arreglo a en tipo CheckBox
	 */
	public JCheckBox[] getA() {
		return a;
	}

	

	/**
	 * Método get que devuelve un valor int
	 * @return devuelve el valor total de las comoras en tipo Int
	 */
	public int getTotal(JCheckBox[] a) {
		for(int i = 0; i < 3; i++){
			if(a[i].isSelected()){
				System.out.println(Double.parseDouble(a[i].getText().substring(1)));
				total = total + (int)Double.parseDouble(a[i].getText().substring(1));
			}
		}
		return total;
	}

	/**
	 * Método  el valor boolean 
	 * @return devuelbe el valor de la variable boolean T/F
	 */
	public boolean isProd1() {
		return prod1;
	}

	/**
	 * Asigna valor boolean
	 * @param prod6 asigna un valor boleano a la variable T/F
	 */
	public void setProd1(boolean prod1) {
		this.prod1 = prod1;
	}

	/**
	 * Devuelve  el valor boolean 
	 * @return devuelbe el valor de la variable boolean T/F
	 */
	public boolean isProd2() {
		return prod2;
	}

	/**
	 * Asigna valor boolean
	 * @param prod6 asigna un valor boleano a la variable T/F
	 */
	public void setProd2(boolean prod2) {
		this.prod2 = prod2;
	}
	/**
	 * Devuelve  el valor boolean 
	 * @return Devuelve el valor de la variable boolean T/F
	 */

	public boolean isProd3() {
		return prod3;
	}

	/**
	 * Asigna valor boolean
	 * @param prod6 asigna un valor boleano a la variable T/F
	 */
	public void setProd3(boolean prod3) {
		this.prod3 = prod3;
	}

	/**
	 * Devuelve  el valor boolean 
	 * @return devuelbe el valor de la variable boolean T/F
	 */
	public boolean isProd4() {
		return prod4;
	}

	/**
	 * Asigna valor boolean
	 * @param prod6 asigna un valor boleano a la variable T/F
	 */
	public void setProd4(boolean prod4) {
		this.prod4 = prod4;
	}

	/**
	 * Asigna un valor al arreglo  	
	 * @param a valor que se asiganarà al arreglo
	 */
	public void setA(JCheckBox[] a) {
		this.a = a;
	}
	/**
	 * Asigna un valor al arreglo  	
	 * @param a valor que se asiganarà al arreglo
	 */
	public void setB(JLabel[] b) {
		this.b = b;
	}
}

	