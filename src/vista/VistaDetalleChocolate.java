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
public class VistaDetalleChocolate extends JFrame{
	
	private String url = "C:/Users/EDSONJOSUE/Documents/WokspaceEdsonEclipse/05-MaquinaDispensadoraDulces/src/imgs";
	private JPanel panel = new JPanel(); //Declaramos el panel que contendrá los contorles 
	private JScrollPane scrollPane = new JScrollPane(); //declaramos el panel con scrolls
	
	private JLabel lblChocoProducto1 = new JLabel();
	private TitledBorder titChocoProducto1;
	private ImageIcon imgChocoProducto1;
	
	private JLabel lblChocoProducto2 = new JLabel();
	private TitledBorder titChocoProducto2;
	private ImageIcon imgChocoProducto2;
	
	private JLabel lblChocoProducto3 = new JLabel();
	private TitledBorder titChocoProducto3;
	private ImageIcon imgChocoProducto3;
	
	private JLabel lblChocoProducto4 = new JLabel();
	private TitledBorder titChocoProducto4;
	private ImageIcon imgChocoProducto4;
	
	private JCheckBox checkChocoProdu1;
	private JCheckBox checkChocoProdu2;
	private JCheckBox checkChocoProdu3;
	private JCheckBox checkChocoProdu4;
	
	JButton btnComprar = new JButton("Comprar");
	
	private Container c= getContentPane(); //declaramos un contenedor 
	/**
	 * Constructor de la clase
	 */
	public VistaDetalleChocolate(){
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
		
		scrollPane.setBounds(10, 0, 300, 380);//al panel con scrolls se le da un tamañp y posición
		scrollPane.setViewportView(panel); //agregamos el panel normal al panel con scrolls
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		panel.setPreferredSize(new Dimension(250, 550)); //le damos una dimensión al panel 
		panel.setLayout(null);//se declara el absolutelayout 
		btnComprar.setBackground(Color.ORANGE);
	
		btnComprar.setBounds(69, 410, 185, 30);
		
		titChocoProducto1 = new TitledBorder("Carlos V");
		titChocoProducto2 = new TitledBorder("Crunch");
		titChocoProducto3 = new TitledBorder("Kit Kat");
		titChocoProducto4 = new TitledBorder("Snicker");
		
		imgChocoProducto1 = new ImageIcon(String.format("%s/Carlosv.png", url));
		imgChocoProducto2 = new ImageIcon(String.format("%s/Crunch.png", url));
		imgChocoProducto3 = new ImageIcon(String.format("%s/KitKat.png", url));
		imgChocoProducto4 = new ImageIcon(String.format("%s/Snicker.png", url));
		
		checkChocoProdu1 = new JCheckBox("$10.00", false);
		checkChocoProdu2 = new JCheckBox("$15.00", false);
		checkChocoProdu3 = new JCheckBox("$10.00", false);
		checkChocoProdu4 = new JCheckBox("$10.00", false);
		
		lblChocoProducto1.setBorder(titChocoProducto1);
		lblChocoProducto1.setText("<html><body>Chocolate con<br> almendras</body></html>");
		lblChocoProducto1.setBounds(10, 10, 260, 100);
		lblChocoProducto1.setIcon(new ImageIcon(imgChocoProducto1.getImage()
				.getScaledInstance(50, 60, Image.SCALE_SMOOTH)));
		checkChocoProdu1.setBounds(10, 110, 100, 30);
		checkChocoProdu1.setOpaque(false);
		
		lblChocoProducto2.setBorder(titChocoProducto2);
		lblChocoProducto2.setText("<html><body>Barra de chocolate <br> estilo americano</body></html>");
		lblChocoProducto2.setBounds(10, 140, 260, 100);
		lblChocoProducto2.setIcon(new ImageIcon(imgChocoProducto2.getImage()
				.getScaledInstance(50, 60, Image.SCALE_SMOOTH)));
		checkChocoProdu2.setBounds(10, 240, 100, 30);
		checkChocoProdu2.setOpaque(false);
		
		
		lblChocoProducto3.setBorder(titChocoProducto3);
		lblChocoProducto3.setText("<html><body>Galleta ba�ada<br> de chocolate</body></html>");
		lblChocoProducto3.setBounds(10, 270, 260, 100);
		lblChocoProducto3.setIcon(new ImageIcon(imgChocoProducto3.getImage()
				.getScaledInstance(50, 60, Image.SCALE_SMOOTH)));
		checkChocoProdu3.setBounds(10, 370, 100, 30);
		checkChocoProdu3.setOpaque(false);
		
		
		lblChocoProducto4.setBorder(titChocoProducto4);
		lblChocoProducto4.setText("<html><body>Barra de chocolate <br>rellena de nuez</body></html>");
		lblChocoProducto4.setBounds(10, 400, 260, 100);
		lblChocoProducto4.setIcon(new ImageIcon(imgChocoProducto4.getImage()
				.getScaledInstance(50, 60, Image.SCALE_SMOOTH)));
		checkChocoProdu4.setBounds(10, 500, 100, 30);
		checkChocoProdu4.setOpaque(false);
		
		c.add(scrollPane);
		c.add(btnComprar);
		
		panel.add(lblChocoProducto1);
		panel.add(checkChocoProdu1);
		panel.add(lblChocoProducto2);
		panel.add(checkChocoProdu2);
		panel.add(lblChocoProducto3);
		panel.add(checkChocoProdu3);
		panel.add(lblChocoProducto4);
		panel.add(checkChocoProdu4);
				
	}	
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JButton getBtnCompra(){
		return btnComprar;
	}	
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JLabel getLblChocoProducto1() {
		return lblChocoProducto1;
	}	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */

	public JLabel getLblChocoProducto2() {
		return lblChocoProducto2;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JLabel getLblChocoProducto3() {
		return lblChocoProducto3;
	}

	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */

	public JLabel getLblChocoProducto4() {
		return lblChocoProducto4;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JCheckBox getCheckChocoProdu1() {
		return checkChocoProdu1;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JCheckBox getCheckChocoProdu2() {
		return checkChocoProdu2;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JCheckBox getCheckChocoProdu3() {
		return checkChocoProdu3;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JCheckBox getCheckChocoProdu4() {
		return checkChocoProdu4;
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
		checkChocoProdu1.addActionListener(l);
	}
	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public void onClickProducto2(ActionListener l){
		checkChocoProdu2.addActionListener(l);
	}
	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public void onClickProducto3(ActionListener l){
		checkChocoProdu3.addActionListener(l);
	}
	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public void onClickProducto4(ActionListener l){
		checkChocoProdu4.addActionListener(l);
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JCheckBox[] lol(){
		JCheckBox[] a= {checkChocoProdu1,checkChocoProdu2,checkChocoProdu3,checkChocoProdu4};
		return a;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JLabel[] productosChoco(){
		JLabel[] b = {lblChocoProducto1,lblChocoProducto2,lblChocoProducto3,lblChocoProducto4};
		return b;
	}
	/**
	 * Muestra un error en la ventana 
	 * @param error Mensaje de error tipo String
	 * @param c
	 */
	public void mostrarError(String error, Container c) {
		JOptionPane.showMessageDialog(c, error, "Error", JOptionPane.ERROR_MESSAGE);
		
	}
	/**
	 * Asigna ojeto
	 * @param l windowsLoad
	 */
	public void onLoadVentana(WindowListener l) {
		this.addWindowListener(l);
		
	}
				
}

