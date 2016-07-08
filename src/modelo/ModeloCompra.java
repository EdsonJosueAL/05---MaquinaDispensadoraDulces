package modelo;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
/**
 * 
 * @author EDSONJOSUE
 *
 */
public class ModeloCompra{
	private int total = 0;
	/**
	 * constructor por defecto
	 */
	public ModeloCompra() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Método que calcula el total absoluto 
	 * @param val1 valor 1 en tipo int
	 * @param val2 valor 2 en tipo int
	 * @param val3 valor 3 en tipo int
	 * @param val4 valor 4 en tipo int
	 * @return
	 */
	public int sumaTotales(int val1,int val2,int val3,int val4) {
			total = val1+val2+val3+val4;
		return total;
	}
	/**
	 * Asigna un valor a la variable
	 * @param total valor que se asignara a la variable totoal
	 */
	public void setTotal(int total){
		this.total=total;
	}
	
	/**
	 * Devuevle el valor
	 * @return valor devuelto
	 */
	public int getTotal(){
		return total;
	}
}

