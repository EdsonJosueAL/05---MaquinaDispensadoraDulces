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
public class VistaDetalleGalletas extends JFrame{
	
	private String url = "C:/Users/EDSONJOSUE/Documents/WokspaceEdsonEclipse/05-MaquinaDispensadoraDulces/src/imgs";
	private JPanel panel = new JPanel(); //Declaramos el panel que contendr√° los contorles 
	private JScrollPane scrollPane = new JScrollPane(); //declaramos el panel con scrolls
	
	private JLabel lblGalletaProducto1 = new JLabel();
	private TitledBorder titGalletaProducto1;
	private ImageIcon imgGalletaProducto1;
	
	private JLabel lblGalletaProducto2 = new JLabel();
	private TitledBorder titGalletaProducto2;
	private ImageIcon imgGalletaProducto2;

	private JLabel lblGalletaProducto3 = new JLabel();
	private TitledBorder titGalletaProducto3;
	private ImageIcon imgGalletaProducto3;
	
	private JLabel lblGalletaProducto4 = new JLabel();
	private TitledBorder titGalletaProducto4;
	private ImageIcon imgGalletaProducto4;
	
	private JCheckBox checkGalletaProdu1;
	private JCheckBox checkGalletaProdu2;
	private JCheckBox checkGalletaProdu3;
	private JCheckBox checkGalletaProdu4;
	
	JButton btnComprar = new JButton("Comprar");
	
	private Container c= getContentPane(); //declaramos un contenedor 
	/**
	 * Constructor de la clase
	 */
	public VistaDetalleGalletas(){
		getContentPane().setBackground(SystemColor.scrollbar);
		super.setTitle("Detalle Galletas");
		super.setSize(320, 480);
		super.setLocationRelativeTo(null);
		super.setResizable(false);
			cargarControles();
	}
	/**
	 * MÈtodo que carga los controles al Frame
	 */
	private void cargarControles() {
		c.setLayout(null); //Declarar absolute layout
		
		scrollPane.setBounds(10, 11, 300, 380);//al panel con scrolls se le da un tama√±p y posici√≥n
		scrollPane.setViewportView(panel); //agregamos el panel normal al panel con scrolls
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		panel.setPreferredSize(new Dimension(250, 550)); //le damos una dimensi√≥n al panel 
		panel.setLayout(null);//se declara el absolutelayout 
		btnComprar.setBackground(Color.ORANGE);
	
		btnComprar.setBounds(60, 410, 202, 30);
		
		titGalletaProducto1 = new TitledBorder("Canelitas");
		titGalletaProducto2 = new TitledBorder("Emperador");
		titGalletaProducto3 = new TitledBorder("Oreo");
		titGalletaProducto4 = new TitledBorder("Principe");
		
		imgGalletaProducto1 = new ImageIcon(String.format("%s/Canelitas.png", url));
		imgGalletaProducto2 = new ImageIcon(String.format("%s/Emperador.png", url));
		imgGalletaProducto3 = new ImageIcon(String.format("%s/Oreo.png", url));
		imgGalletaProducto4 = new ImageIcon(String.format("%s/Principe.png", url));
		
		checkGalletaProdu1 = new JCheckBox("$10.00", false);
		checkGalletaProdu2 = new JCheckBox("$5.00", false);
		checkGalletaProdu3 = new JCheckBox("$5.00", false);
		checkGalletaProdu4 = new JCheckBox("$15.00", false);
		
		lblGalletaProducto1.setBorder(titGalletaProducto1);
		lblGalletaProducto1.setText("<html><body>Galleta baÒada <br>de az˙car</body></html>");
		lblGalletaProducto1.setBounds(10, 10, 260, 100);
		lblGalletaProducto1.setIcon(new ImageIcon(imgGalletaProducto1.getImage()
				.getScaledInstance(50, 60, Image.SCALE_SMOOTH)));
		checkGalletaProdu1.setBounds(10, 110, 100, 30);
		checkGalletaProdu1.setOpaque(false);
		
		lblGalletaProducto2.setBorder(titGalletaProducto2);
		lblGalletaProducto2.setText("<html><body>Galleta rellena  <br>de chocolate</body></html>");
		lblGalletaProducto2.setBounds(10, 140, 260, 100);
		lblGalletaProducto2.setIcon(new ImageIcon(imgGalletaProducto2.getImage()
				.getScaledInstance(50, 60, Image.SCALE_SMOOTH)));
		checkGalletaProdu2.setBounds(10, 240, 100, 30);
		checkGalletaProdu2.setOpaque(false);
		
		
		lblGalletaProducto3.setBorder(titGalletaProducto3);
		lblGalletaProducto3.setText("<html><body>Galleta de chocolate <br>rellena de vainilla</body></html>");
		lblGalletaProducto3.setBounds(10, 270, 260, 100);
		lblGalletaProducto3.setIcon(new ImageIcon(imgGalletaProducto3.getImage()
				.getScaledInstance(50, 60, Image.SCALE_SMOOTH)));
		checkGalletaProdu3.setBounds(10, 370, 100, 30);
		checkGalletaProdu3.setOpaque(false);
		
		
		lblGalletaProducto4.setBorder(titGalletaProducto4);
		lblGalletaProducto4.setText("<html><body>Galleta de chocolate<br> rellena de m·s <br>chocolate</body></html>");
		lblGalletaProducto4.setBounds(10, 400, 260, 100);
		lblGalletaProducto4.setIcon(new ImageIcon(imgGalletaProducto4.getImage()
				.getScaledInstance(50, 60, Image.SCALE_SMOOTH)));
		checkGalletaProdu4.setBounds(10, 500, 100, 30);
		checkGalletaProdu4.setOpaque(false);
		
		c.add(scrollPane);
		c.add(btnComprar);
		
		panel.add(lblGalletaProducto1);
		panel.add(checkGalletaProdu1);
		panel.add(lblGalletaProducto2);
		panel.add(checkGalletaProdu2);
		panel.add(lblGalletaProducto3);
		panel.add(checkGalletaProdu3);
		panel.add(lblGalletaProducto4);
		panel.add(checkGalletaProdu4);
	}	
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JLabel getLblGalletaProducto1() {
		return lblGalletaProducto1;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */

	public JLabel getLblGalletaProducto2() {
		return lblGalletaProducto2;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */

	public JLabel getLblGalletaProducto3() {
		return lblGalletaProducto3;
	}

	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JLabel getLblGalletaProducto4() {
		return lblGalletaProducto4;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JCheckBox getCheckGalletaProdu1() {
		return checkGalletaProdu1;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JCheckBox getCheckGalletaProdu2() {
		return checkGalletaProdu2;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JCheckBox getCheckGalletaProdu3() {
		return checkGalletaProdu3;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JCheckBox getCheckGalletaProdu4() {
		return checkGalletaProdu4;
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
		checkGalletaProdu1.addActionListener(l);
	}
	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public void onClickProducto2(ActionListener l){
		checkGalletaProdu2.addActionListener(l);
	}
	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public void onClickProducto3(ActionListener l){
		checkGalletaProdu3.addActionListener(l);
	}
	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public void onClickProducto4(ActionListener l){
		checkGalletaProdu4.addActionListener(l);
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JButton getBtnComprar(){
		return btnComprar;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JCheckBox[] lol(){
		JCheckBox[] a= {checkGalletaProdu1,checkGalletaProdu2,checkGalletaProdu3,checkGalletaProdu4};
		return a;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JLabel[] productosGalleta(){
		JLabel[] b = {lblGalletaProducto1,lblGalletaProducto2,lblGalletaProducto3,lblGalletaProducto4};
		return b;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public void mostrarError(String error, Container c) {
		JOptionPane.showMessageDialog(c, error, "Error", JOptionPane.ERROR_MESSAGE);
		
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */   
	public void onLoadVentana(WindowListener l) {
		this.addWindowListener(l);
		
	}
}