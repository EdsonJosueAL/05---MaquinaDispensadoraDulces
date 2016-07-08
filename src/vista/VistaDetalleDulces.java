package vista;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop.Action;
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
public class VistaDetalleDulces extends JFrame{
	
		private String url = "C:/Users/EDSONJOSUE/Documents/WokspaceEdsonEclipse/05-MaquinaDispensadoraDulces/src/imgs";
		private JPanel panel = new JPanel(); //Declaramos el panel que contendrá los contorles 
		private JScrollPane scrollPane = new JScrollPane(); //declaramos el panel con scrolls
		
		private JLabel lblDulceProducto1 = new JLabel();
		private TitledBorder titDulceProducto1;
		private ImageIcon imgDulceProducto1;
		
		private JLabel lblDulceProducto2 = new JLabel();
		private TitledBorder titDulceProducto2;
		private ImageIcon imgDulceProducto2;
	
		private JLabel lblDulceProducto3 = new JLabel();
		private TitledBorder titDulceProducto3;
		private ImageIcon imgDulceProducto3;
		
		private JLabel lblDulceProducto4 = new JLabel();
		private TitledBorder titDulceProducto4;
		private ImageIcon imgDulceProducto4;
		
		private JCheckBox checkDulceProdu1;
		private JCheckBox checkDulceProdu2;
		private JCheckBox checkDulceProdu3;
		private JCheckBox checkDulceProdu4;
		
		JButton btnComprar = new JButton("Comprar");
	
		private Container c= getContentPane(); //declaramos un contenedor 
		/**
		 * Constructor de la clase
		 */
	public VistaDetalleDulces(){
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
	
		btnComprar.setBounds(60, 410, 203, 30);
		
		titDulceProducto1 = new TitledBorder("Gomilocas");
		titDulceProducto2 = new TitledBorder("Hamburguesa");
		titDulceProducto3 = new TitledBorder("Juice-Gumm");
		titDulceProducto4 = new TitledBorder("Panditas");
		
		imgDulceProducto1 = new ImageIcon(String.format("%s/Gomilocas.png", url));
		imgDulceProducto2 = new ImageIcon(String.format("%s/Hamburguesa.png", url));
		imgDulceProducto3 = new ImageIcon(String.format("%s/JuiceGumm.png", url));
		imgDulceProducto4 = new ImageIcon(String.format("%s/Panditas.png", url));
		
		checkDulceProdu1 = new JCheckBox("$10.00", false);
		checkDulceProdu2 = new JCheckBox("$15.00", false);
		checkDulceProdu3 = new JCheckBox("$30.00", false);
		checkDulceProdu4 = new JCheckBox("$15.00", false);
		
		lblDulceProducto1.setBorder(titDulceProducto1);
		lblDulceProducto1.setText("<html><body>Gomita en forma <br>de dentadura</body></html>");
		lblDulceProducto1.setBounds(10, 10, 260, 100);
		lblDulceProducto1.setIcon(new ImageIcon(imgDulceProducto1.getImage()
				.getScaledInstance(50, 60, Image.SCALE_SMOOTH)));
		checkDulceProdu1.setBounds(10, 110, 100, 30);
		checkDulceProdu1.setOpaque(false);
		
		lblDulceProducto2.setBorder(titDulceProducto2);
		lblDulceProducto2.setText("<html><body>Gomita en forma  <br>de hamburguesa</body></html>");
		lblDulceProducto2.setBounds(10, 140, 260, 100);
		lblDulceProducto2.setIcon(new ImageIcon(imgDulceProducto2.getImage()
				.getScaledInstance(50, 60, Image.SCALE_SMOOTH)));
		checkDulceProdu2.setBounds(10, 240, 100, 30);
		checkDulceProdu2.setOpaque(false);
		
		
		lblDulceProducto3.setBorder(titDulceProducto3);
		lblDulceProducto3.setText("<html><body>RGomita \u00E1cida en forma <br>de viborita</body></html>");
		lblDulceProducto3.setBounds(10, 270, 260, 100);
		lblDulceProducto3.setIcon(new ImageIcon(imgDulceProducto3.getImage()
				.getScaledInstance(50, 60, Image.SCALE_SMOOTH)));
		checkDulceProdu3.setBounds(10, 370, 100, 30);
		checkDulceProdu3.setOpaque(false);
		
		
		lblDulceProducto4.setBorder(titDulceProducto4);
		lblDulceProducto4.setText("<html><body>Gomita en forma de <br>panditas de sabores</body></html>");
		lblDulceProducto4.setBounds(10, 400, 260, 100);
		lblDulceProducto4.setIcon(new ImageIcon(imgDulceProducto4.getImage()
				.getScaledInstance(50, 60, Image.SCALE_SMOOTH)));
		checkDulceProdu4.setBounds(10, 500, 100, 30);
		checkDulceProdu4.setOpaque(false);
		
		c.add(scrollPane);
		c.add(btnComprar);
		
		panel.add(lblDulceProducto1);
		panel.add(checkDulceProdu1);
		panel.add(lblDulceProducto2);
		panel.add(checkDulceProdu2);
		panel.add(lblDulceProducto3);
		panel.add(checkDulceProdu3);
		panel.add(lblDulceProducto4);
		panel.add(checkDulceProdu4);
				
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
	public JLabel getLblDulceProducto1() {
		return lblDulceProducto1;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JLabel getLblDulceProducto2() {
		return lblDulceProducto2;
	}	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */

	public JLabel getLblDulceProducto3() {
		return lblDulceProducto3;
	}

	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JLabel getLblDulceProducto4() {
		return lblDulceProducto4;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */

	public JCheckBox getCheckDulceProdu1() {
		return checkDulceProdu1;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JCheckBox getCheckDulceProdu2() {
		return checkDulceProdu2;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JCheckBox getCheckDulceProdu3() {
		return checkDulceProdu3;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JCheckBox getCheckDulceProdu4() {
		return checkDulceProdu4;
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
		checkDulceProdu1.addActionListener(l);
	}
	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public void onClickProducto2(ActionListener l){
		checkDulceProdu2.addActionListener(l);
	}
	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public void onClickProducto3(ActionListener l){
		checkDulceProdu3.addActionListener(l);
	}
	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public void onClickProducto4(ActionListener l){
		checkDulceProdu4.addActionListener(l);
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JCheckBox[] lol(){
		JCheckBox[] a= {checkDulceProdu1,checkDulceProdu2,checkDulceProdu3,checkDulceProdu4};
		return a;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JLabel[] productosDulces(){
		JLabel[] b = {lblDulceProducto1,lblDulceProducto2,lblDulceProducto3,lblDulceProducto4};
		return b;
	}
	/**
	 * Muestra error
	 * @param error Mensaje
	 * @param c Contenedor
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

