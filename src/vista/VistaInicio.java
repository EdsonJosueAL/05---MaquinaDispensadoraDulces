package vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Dimension;
import java.awt.SystemColor;
/**
 * 
 * @author EDSONJOSUE
 *
 */
public class VistaInicio extends JFrame{
	private String url = "C:/Users/EDSONJOSUE/Documents/WokspaceEdsonEclipse/05-MaquinaDispensadoraDulces/src/imgs";
	private ImageIcon imagenInicio = new ImageIcon(String.format("%s/MaquinaExp.jpg", url));
	private JLabel lblContenedorImg = new JLabel();
	private JLabel lblContenedorImg2 = new JLabel("Fuck Them");
	private JProgressBar pbInicio = new JProgressBar(0,100);
	
	Container c = getContentPane();
	/**
	 * Constructor de la clase
	 */
	public VistaInicio(){
		setBackground(Color.WHITE);
		getContentPane().setBackground(SystemColor.scrollbar);
		super.setTitle("Screen");
		super.setSize(320, 480);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
			cargarControles();
	}
	/**
	 * Mètodo que carga los controles al Frame
	 */
	private void cargarControles() {
		c.setLayout(null);
		
		lblContenedorImg.setBounds(50, 20, 241, 300);
			lblContenedorImg.setIcon(new ImageIcon(imagenInicio.getImage()
					.getScaledInstance(231, 300, Image.SCALE_SMOOTH)));
		pbInicio.setSize(new Dimension(20, 0));
		pbInicio.setStringPainted(true);
		pbInicio.setToolTipText("");
		
		pbInicio.setBounds(40, 350, 240, 30);
		pbInicio.setValue(0);
		pbInicio.setBackground(Color.darkGray);
		pbInicio.setForeground(Color.ORANGE);
		
		c.add(lblContenedorImg);
		c.add(pbInicio);
		
		
	}
	/**
	 * Carga un Windows Listener
	 * @param l Windows Listener
	 */
	public void onLoadVentana(WindowListener l){
		this.addWindowListener(l);
	}
/**
 * retorna elemento
 * @return Boton 
 */
	public JProgressBar getPbInicio() {
		return pbInicio;
	}
	
	

}

