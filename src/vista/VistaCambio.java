package vista;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.Desktop.Action;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import modelo.ModeloChoco;
import modelo.ModeloDulces;
import modelo.ModeloGalleta;
import modelo.ModeloRegresco;
import java.awt.SystemColor;
import java.awt.Color;
/**
 * 
 * @author EDSONJOSUE
 *
 */
public class VistaCambio extends JFrame{
	private JLabel lblCien = new JLabel("Cien..............................................");
	private JLabel lblCincuenta = new JLabel("Cincuenta...................................");
	private JLabel lblVeinte = new JLabel("Veinte...........................................");
	private JLabel lblDiez = new JLabel("Diez...............................................");
	private JLabel lblCinco = new JLabel("Cinco............................................");
	private JLabel lblPeso = new JLabel("Peso.............................................");
	
	
	private int cambioCien=0;
	private int cambioCincuenta=0;
	private int cambioVeinte=0;
	private int cambioDiez=0;
	private int cambioCinco=0;
	private int cambioUno=0;
	
	private JButton btnAceptarComprarMas = new JButton("Comprar M\u00E1s");
	private JButton btnAceptarYSalir = new JButton("Salir");
	private Container c = getContentPane();
	
	/**
	 * Contructor de la clase CambioView
	 */
	public  VistaCambio() {
		getContentPane().setBackground(SystemColor.scrollbar);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Cambio");
		this.setBounds(100, 100, 320, 480);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		c.setLayout(null);
		lblCien.setFont(new Font("Arial", Font.BOLD, 16));
		lblCien.setBounds(10, 32, 294, 31);
		lblCincuenta.setFont(new Font("Arial", Font.BOLD, 16));
		lblCincuenta.setBounds(10, 32, 294, 31);
		lblVeinte.setFont(new Font("Arial", Font.BOLD, 16));
		lblVeinte.setBounds(10, 92, 294, 31);
		lblDiez.setFont(new Font("Arial", Font.BOLD, 16));
		lblDiez.setBounds(10, 152, 294, 31);
		lblCinco.setFont(new Font("Arial", Font.BOLD, 16));
		lblCinco.setBounds(10, 212, 294, 31);
		lblPeso.setFont(new Font("Arial", Font.BOLD, 16));
		lblPeso.setBounds(10, 272, 294, 31);
		btnAceptarComprarMas.setBackground(Color.ORANGE);

		btnAceptarComprarMas.setBounds(60,320, 200,30);
		btnAceptarComprarMas.setFont(new Font("Arial", Font.BOLD, 12));
		btnAceptarYSalir.setBackground(Color.ORANGE);
		btnAceptarYSalir.setBounds(60,370, 200,30);
		btnAceptarYSalir.setFont(new Font("Arial", Font.BOLD, 12));
		
		c.add(lblCincuenta);
		c.add(lblVeinte);
		c.add(lblDiez);
		c.add(lblCinco);
		c.add(lblPeso);
		
		c.add(btnAceptarComprarMas);
		c.add(btnAceptarYSalir);
	}

	/**
	 * @return the lblCincuenta
	 */
	public JLabel getLblCincuenta() {
		return lblCincuenta;
	}

	/**
	 * @return the lblVeinte
	 */
	public JLabel getLblVeinte() {
		return lblVeinte;
	}

	/**
	 * @return the lblDiez
	 */
	public JLabel getLblDiez() {
		return lblDiez;
	}

	/**
	 * @return the lblCinco
	 */
	public JLabel getLblCinco() {
		return lblCinco;
	}
	
	/**
	 * @return the cambioCincuenta
	 */
	public int getCambioCincuenta() {
		return cambioCincuenta;
	}

	/**
	 * @param cambioCincuenta the cambioCincuenta to set
	 */
	public void setCambioCincuenta(int cambioCincuenta) {
		this.cambioCincuenta = cambioCincuenta;
	}

	/**
	 * @return the cambioVeinte
	 */
	public int getCambioVeinte() {
		return cambioVeinte;
	}

	/**
	 * @param cambioVeinte the cambioVeinte to set
	 */
	public void setCambioVeinte(int cambioVeinte) {
		this.cambioVeinte = cambioVeinte;
	}

	/**
	 * @return the cambioDiez
	 */
	public int getCambioDiez() {
		return cambioDiez;
	}

	/**
	 * @param cambioDiez the cambioDiez to set
	 */
	public void setCambioDiez(int cambioDiez) {
		this.cambioDiez = cambioDiez;
	}

	/**
	 * @return the cambioCinco
	 */
	public int getCambioCinco() {
		return cambioCinco;
	}

	/**
	 * @param cambioCinco the cambioCinco to set
	 */
	public void setCambioCinco(int cambioCinco) {
		this.cambioCinco = cambioCinco;
	}

	/**
	 * @return the cambioUno
	 */
	public int getCambioUno() {
		return cambioUno;
	}

	/**
	 * @param cambioUno the cambioUno to set
	 */
	public void setCambioUno(int cambioUno) {
		this.cambioUno = cambioUno;
	}

	public void onClickAceptarMas(ActionListener l){
		btnAceptarComprarMas.addActionListener(l);
	}
	
	public void onClickAceptarSalir(ActionListener l){
		btnAceptarYSalir.addActionListener(l);
	}
	/**
	 * Mètodo para mostrar el cambio en la ventana
	 */
	public void mostrarCambio(){
		lblCien.setText(lblCien.getText()+cambioCien);
		lblCincuenta.setText(lblCincuenta.getText()+cambioCincuenta);
		lblVeinte.setText(lblVeinte.getText()+cambioVeinte);
		lblDiez.setText(lblDiez.getText()+cambioDiez);
		lblCinco.setText(lblCinco.getText()+cambioCinco);
		lblPeso.setText(lblPeso.getText()+cambioUno);
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JButton getBtnAceptarComprarMas(){

		return btnAceptarComprarMas;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JButton getBtnAceptarYSalir(){
		return btnAceptarYSalir;
	}
}