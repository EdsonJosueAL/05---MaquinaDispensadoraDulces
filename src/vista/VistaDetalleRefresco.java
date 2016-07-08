package vista;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import java.awt.SystemColor;
/**
 * 
 * @author EDSONJOSUE
 *
 */
public class VistaDetalleRefresco extends JFrame{
	
	private String url = "C:/Users/EDSONJOSUE/Documents/WokspaceEdsonEclipse/05-MaquinaDispensadoraDulces/src/imgs";
	private JPanel panel = new JPanel(); //Declaramos el panel que contendrá los contorles 
	private JScrollPane scrollPane = new JScrollPane(); //declaramos el panel con scrolls
	
	private JLabel lblRefrescoProducto1 = new JLabel();
	private TitledBorder titRefrescoProducto1;
	private ImageIcon imgRefrescoProducto1;
	
	private JLabel lblRefrescoProducto2 = new JLabel();
	private TitledBorder titRefrescoProducto2;
	private ImageIcon imgRefrescoProducto2;

	private JLabel lblRefrescoProducto3 = new JLabel();
	private TitledBorder titRefrescoProducto3;
	private ImageIcon imgRefrescoProducto3;
	
	private JLabel lblRefrescoProducto4 = new JLabel();
	private TitledBorder titRefrescoProducto4;
	private ImageIcon imgRefrescoProducto4;
	
	private JCheckBox checkRefrescoProdu1;
	private JCheckBox checkRefrescoProdu2;
	private JCheckBox checkRefrescoProdu3;
	private JCheckBox checkRefrescoProdu4;
	
	JButton btnComprar = new JButton("Comprar");
	
	private Container c= getContentPane(); //declaramos un contenedor 
	/**
	 * Constructor de la clase
	 */
	public VistaDetalleRefresco(){
		getContentPane().setBackground(SystemColor.scrollbar);
		super.setTitle("Detalle Galletas");
		super.setSize(320, 480);
		super.setLocationRelativeTo(null);
		super.setResizable(false);
			cargarControles();
	}
	/**
	 * M�todo que carga los controles al Frame
	 */
	private void cargarControles() {
		c.setLayout(null); //Declarar absolute layout
		
		scrollPane.setBounds(10, 11, 300, 380);//al panel con scrolls se le da un tamañp y posición
		scrollPane.setViewportView(panel); //agregamos el panel normal al panel con scrolls
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		panel.setPreferredSize(new Dimension(250, 550)); //le damos una dimensión al panel 
		panel.setLayout(null);//se declara el absolutelayout 
		btnComprar.setBackground(Color.ORANGE);
	
		btnComprar.setBounds(75, 410, 166, 30);
		
		titRefrescoProducto1 = new TitledBorder("Coca-Cola");
		titRefrescoProducto2 = new TitledBorder("Fanta");
		titRefrescoProducto3 = new TitledBorder("Mundet");
		titRefrescoProducto4 = new TitledBorder("Sprite");
		
		imgRefrescoProducto1 = new ImageIcon(String.format("%s/Cocacola.png", url));
		imgRefrescoProducto2 = new ImageIcon(String.format("%s/Fanta.png", url));
		imgRefrescoProducto3 = new ImageIcon(String.format("%s/Mundet.png", url));
		imgRefrescoProducto4 = new ImageIcon(String.format("%s/Sprite.png", url));
		
		checkRefrescoProdu1 = new JCheckBox("$10.00", false);
		checkRefrescoProdu2 = new JCheckBox("$10.00", false);
		checkRefrescoProdu3 = new JCheckBox("$10.00", false);
		checkRefrescoProdu4 = new JCheckBox("$15.00", false);
		
		lblRefrescoProducto1.setBorder(titRefrescoProducto1);
		lblRefrescoProducto1.setText("<html><body>Refresco sabor <br>de cola</body></html>");
		lblRefrescoProducto1.setBounds(10, 10, 260, 100);
		lblRefrescoProducto1.setIcon(new ImageIcon(imgRefrescoProducto1.getImage()
				.getScaledInstance(50, 60, Image.SCALE_SMOOTH)));
		checkRefrescoProdu1.setBounds(10, 110, 100, 30);
		checkRefrescoProdu1.setOpaque(false);
		
		lblRefrescoProducto2.setBorder(titRefrescoProducto2);
		lblRefrescoProducto2.setText("<html><body>Refresco sabor <br>a mandarina</body></html>");
		lblRefrescoProducto2.setBounds(10, 140, 260, 100);
		lblRefrescoProducto2.setIcon(new ImageIcon(imgRefrescoProducto2.getImage()
				.getScaledInstance(50, 60, Image.SCALE_SMOOTH)));
		checkRefrescoProdu2.setBounds(10, 240, 100, 30);
		checkRefrescoProdu2.setOpaque(false);
		
		
		lblRefrescoProducto3.setBorder(titRefrescoProducto3);
		lblRefrescoProducto3.setText("<html><body>Refresco sabor <br>a manzana</body></html>");
		lblRefrescoProducto3.setBounds(10, 270, 260, 100);
		lblRefrescoProducto3.setIcon(new ImageIcon(imgRefrescoProducto3.getImage()
				.getScaledInstance(50, 60, Image.SCALE_SMOOTH)));
		checkRefrescoProdu3.setBounds(10, 370, 100, 30);
		checkRefrescoProdu3.setOpaque(false);
		
		
		lblRefrescoProducto4.setBorder(titRefrescoProducto4);
		lblRefrescoProducto4.setText("<html><body>Refresco sabor <br>a lim�n</body></html>");
		lblRefrescoProducto4.setBounds(10, 400, 260, 100);
		lblRefrescoProducto4.setIcon(new ImageIcon(imgRefrescoProducto4.getImage()
				.getScaledInstance(50, 60, Image.SCALE_SMOOTH)));
		checkRefrescoProdu4.setBounds(10, 500, 100, 30);
		checkRefrescoProdu4.setOpaque(false);
		
		c.add(scrollPane);
		c.add(btnComprar);
		
		panel.add(lblRefrescoProducto1);
		panel.add(checkRefrescoProdu1);
		panel.add(lblRefrescoProducto2);
		panel.add(checkRefrescoProdu2);
		panel.add(lblRefrescoProducto3);
		panel.add(checkRefrescoProdu3);
		panel.add(lblRefrescoProducto4);
		panel.add(checkRefrescoProdu4);
	}	
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JLabel getLblRefrescoProducto1() {
		return lblRefrescoProducto1;
	}

	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JLabel getLblRefrescoProducto2() {
		return lblRefrescoProducto2;
	}

	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JLabel getLblRefrescoProducto3() {
		return lblRefrescoProducto3;
	}

	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JLabel getLblRefrescoProducto4() {
		return lblRefrescoProducto4;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */

	public JCheckBox getCheckRefrescoProdu1() {
		return checkRefrescoProdu1;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JCheckBox getCheckRefrescoProdu2() {
		return checkRefrescoProdu2;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JCheckBox getCheckRefrescoProdu3() {
		return checkRefrescoProdu3;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JCheckBox getCheckRefrescoProdu4() {
		return checkRefrescoProdu4;
	}
	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public void onClickComprar(ActionListener l){
		btnComprar.addActionListener(l);
	}
	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public void onClickProducto1(ActionListener l){
		checkRefrescoProdu1.addActionListener(l);
	}
	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public void onClickProducto2(ActionListener l){
		checkRefrescoProdu2.addActionListener(l);
	}
	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public void onClickProducto3(ActionListener l){
		checkRefrescoProdu3.addActionListener(l);
	}
	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public void onClickProducto4(ActionListener l){
		checkRefrescoProdu4.addActionListener(l);
	}
	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public JButton getBtnComprar(){
		return btnComprar;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JCheckBox[] lol(){
		JCheckBox[] a= {checkRefrescoProdu1,checkRefrescoProdu2,checkRefrescoProdu3,checkRefrescoProdu4};
		return a;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */	
	public JLabel[] productosRefresco(){
		JLabel[] b = {lblRefrescoProducto1,lblRefrescoProducto2,lblRefrescoProducto3,lblRefrescoProducto4};
		return b;
	}
	/**
	 * Muestra error 
	 * @param error mensaje de error
	 * @param c ventana
 	 */
	public void mostrarError(String error, Container c) {
		JOptionPane.showMessageDialog(c, error, "Error", JOptionPane.ERROR_MESSAGE);
		
	}
/**
 * asina objeto
 * @param l objeto
 */
	public void onLoadVentana(WindowListener l) {
		this.addWindowListener(l);
		
	}
	
	
}
