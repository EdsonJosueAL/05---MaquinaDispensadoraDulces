package vista;

import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.SystemColor;
import java.awt.Color;

/**
 * 
 * @author EDSONJOSUE
 *
 */
public class VistaOperaciones extends JFrame{
	private JButton btnDulces = new JButton("Dulces");
	private JButton btnChoco = new JButton("Chocolates");
	private JButton btnGalletas = new JButton("Galletas");
	private JButton btnRefresco = new JButton("Refrescos");
		Container c = getContentPane();
		/**
		 * Constructor de la clase
		 */
	public VistaOperaciones(){
			getContentPane().setBackground(SystemColor.scrollbar);
		super.setTitle("Operaciones");
		super.setSize(320, 500);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
			cargarControles();
	}
	/**
	 * Método que carga los controles al Frame
	 */
	private void cargarControles() {
		c.setLayout(null);
		btnDulces.setBackground(Color.ORANGE);
		btnDulces.setBounds(60, 90, 200, 30);
		btnChoco.setBackground(Color.ORANGE);
		btnChoco.setBounds(60, 150, 200, 30);
		btnGalletas.setBackground(Color.ORANGE);
		btnGalletas.setBounds(60, 210, 200, 30);
		btnRefresco.setBackground(Color.ORANGE);
		btnRefresco.setBounds(60, 270, 200, 30);
		
		
		c.add(btnDulces);
		c.add(btnChoco);
		c.add(btnGalletas);
		c.add(btnRefresco);
		
	}
	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public void onClickDulces(ActionListener l){
		btnDulces.addActionListener(l);
	}
	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public void onClickChoco(ActionListener l){
		btnChoco.addActionListener(l);
	}
	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public void onClickGalleta(ActionListener l){
		btnGalletas.addActionListener(l);
	}
	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public void onClickRefresco(ActionListener l){
		btnRefresco.addActionListener(l);
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JButton getBtnDulces() {
		return btnDulces;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JButton getBtnChoco() {
		return btnChoco;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JButton getBtnGalletas() {
		return btnGalletas;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JButton getBtnRefresco() {
		return btnRefresco;
	}
	
	
}
