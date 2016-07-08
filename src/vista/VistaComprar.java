package vista;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.Desktop.Action;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;
/**
 * 
 * @author EDSONJOSUE
 *
 */
public class VistaComprar extends JFrame{

		private String url = "/home/juanbg/Documentos/workspace/05-MaquinaDispensadora/src/recursos";
		private JPanel panel = new JPanel(); //Declaramos el panel que contendr· los contorles 
		private JScrollPane scrollPane = new JScrollPane(); //declaramos el panel con scrolls
		
		private JLabel lblTotal = new JLabel("Total: ");
		private JButton btnPagar = new JButton("Pagar");
		
		private JLabel lblPago = new JLabel("Moto de  su pago: ");
		private JTextField txtPago = new JTextField();
		
		private Container c= getContentPane(); //declaramos un contenedor 

		/**
		 * Constructor de la clase
		 */
	public VistaComprar(){
			getContentPane().setBackground(SystemColor.scrollbar);
		super.setTitle("Compra");
		super.setSize(320, 480);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
			cargarControles();
	}

/**
 * MÈtodo que carga los controlles
 */
	private void cargarControles() {
		c.setLayout(null);
		scrollPane.setBounds(10, 11, 300, 300);//al panel con scrolls se le da un tama√±p y posici√≥n
		scrollPane.setViewportView(panel); //agregamos el panel normal al panel con scrolls
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		panel.setPreferredSize(new Dimension(250, 800)); //le damos una dimensi√≥n al panel 
		panel.setLayout(null);//se declara el absolutelayout 
		lblTotal.setBackground(SystemColor.text);
		
		
		lblTotal.setBounds(10, 330, 100, 30);
		lblPago.setBounds(10, 370, 150, 30);
		txtPago.setBounds(160, 370, 100, 30);
		btnPagar.setBackground(Color.ORANGE);
		btnPagar.setBounds(83, 411, 150, 30);
		
		
		
		c.add(scrollPane);
		c.add(btnPagar);
		c.add(lblTotal);
		c.add(lblPago);
		c.add(txtPago);
		
	}

	public void onClickPagar(ActionListener l){
		btnPagar.addActionListener(l);
	}

	public void onLoadVentana(WindowListener l){
		this.addWindowListener(l);
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JPanel getPanel() {
		return panel;
	}

	/**
	 * Asigna un Action listener al boton
	 * @param l action listeneer
	 */
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JLabel getlblTotal(){
		return lblTotal;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public JButton getBtn(){
		return btnPagar;
	}
	/**
	 * Retorna un valor 
	 * @return retorna el valor 
	 */
	public int getPago(){
			int a = Integer.parseInt(txtPago.getText());
			return a;
//		}
		
	}
	

}


