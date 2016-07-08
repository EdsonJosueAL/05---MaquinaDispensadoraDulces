package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.Position.Bias;

import modelo.ModeloChoco;
import modelo.ModeloCompra;
import modelo.ModeloDulces;
import modelo.ModeloGalleta;
import modelo.ModeloRegresco;
import vista.VistaCambio;
import vista.VistaComprar;
import vista.VistaDetalleChocolate;
import vista.VistaDetalleDulces;
import vista.VistaDetalleGalletas;
import vista.VistaDetalleRefresco;
import vista.VistaOperaciones;
/**
 * 
 * @author EDSONJOSUE
 *
 */
public class ControladorCompra implements ActionListener, WindowListener{

	VistaComprar vCompra = new VistaComprar();
	
	ModeloDulces mDulces = new ModeloDulces();
	ModeloChoco mChoco = new ModeloChoco();
	ModeloGalleta mGalleta = new ModeloGalleta();
	ModeloRegresco mRefre = new ModeloRegresco();
	ModeloCompra mComprar = new ModeloCompra();
	
	
	/**
	 * Constructor de la clase 
	 * @param vCompra Vista de la clase compra
	 * @param mDulces Modelo de la clase Dulces
	 * @param mChoco Modelo de la clase Chocolate
	 * @param mGalleta Modelo de la clase Galleta
	 * @param mRefre Modelo de la clase Refresco
	 */
	public ControladorCompra(VistaComprar vCompra,ModeloDulces mDulces, ModeloChoco mChoco,ModeloGalleta mGalleta, ModeloRegresco mRefre) {
		
		this.vCompra = vCompra;
		this.mDulces = mDulces;
		this.mChoco = mChoco;
		this.mGalleta = mGalleta;
		this.mRefre = mRefre;
		
		vCompra.onClickPagar(this);
		vCompra.onLoadVentana(this);
	}

	/**
	 * Método que se ejecturá al abrir el JFrame
	 */
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("...Bajar y subir Scroll");
		int contador = 0;
		JLabel[] bD;
		bD = mDulces.getB();
		JCheckBox[] aD;
		aD = mDulces.getA();
		boolean totalPDul[];
		totalPDul = mDulces.getTotalP();

		JLabel[] bC;
		bC = mChoco.getB();
		JCheckBox[] aC;
		aC = mChoco.getA();
		boolean totalPChoco[];
		totalPChoco = mChoco.getTotalP();

		JLabel[] bG;
		bG = mGalleta.getB();
		JCheckBox[] aG;
		aG = mGalleta.getA();
		boolean totalPGalle[];
		totalPGalle = mGalleta.getTotalP();

		JLabel[] bR;
		bR = mRefre.getB();
		JCheckBox[] aR;
		aR = mRefre.getA();
		boolean totalPRefre[];
		totalPRefre = mRefre.getTotalP();

		int val1 = 0;
		for (int i = 0; i < totalPDul.length; i++) {
			if (totalPDul[i]) {
//				System.out.println(aD[i].getText());
				val1 = val1 + (int)Double.parseDouble(aD[i].getText().substring(1));
				JLabel lbl1 = new JLabel(aD[i].getText());
				bD[i].setBounds(10, 10 * (contador * 10), 220, 100);
				lbl1.setBounds(228, 10 * (contador * 10), 50, 30);
				vCompra.getPanel().add(bD[i]);
				vCompra.getPanel().add(lbl1);
				contador = contador + 1;

			}
		}
		int val2 = 0;
		for (int i = 0; i < totalPChoco.length; i++) {
			if (totalPChoco[i]) {
				val2 = val2 + (int)Double.parseDouble(aC[i].getText().substring(1));
				JLabel lbl1 = new JLabel(aC[i].getText());
				bC[i].setBounds(10, 10 * (contador * 10), 220, 100);
				lbl1.setBounds(228, 10 * (contador * 10), 50, 30);
				vCompra.getPanel().add(bC[i]);
				vCompra.getPanel().add(lbl1);
				contador = contador + 1;
			}
		}
		int val3 = 0;
		for (int i = 0; i < totalPGalle.length; i++) {
			if (totalPGalle[i]) {
				val3 = val3 + (int)Double.parseDouble(aG[i].getText().substring(1));
				JLabel lbl1 = new JLabel(aG[i].getText());
				bG[i].setBounds(10, 10 * (contador * 10), 220, 100);
				lbl1.setBounds(228, 10 * (contador * 10), 50, 30);
				vCompra.getPanel().add(bG[i]);
				vCompra.getPanel().add(lbl1);
				contador = contador + 1;
			}
		}
		int val4 = 0;
		for (int i = 0; i < totalPRefre.length; i++) {
			if (totalPRefre[i]) {
				val4 = val4 + (int)Double.parseDouble(aR[i].getText().substring(1));
				JLabel lbl1 = new JLabel(aR[i].getText());
				bR[i].setBounds(10, 10 * (contador * 10), 220, 100);
				lbl1.setBounds(228, 10 * (contador * 10), 50, 30);
				vCompra.getPanel().add(bR[i]);
				vCompra.getPanel().add(lbl1);
				contador = contador + 1;
			}
		}

		establecerTotal(val1,val2,val3,val4);
		
	}
	/**
	 * Método que se ejecturá al hacer click sobre un botón del JFrame
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		try{
//		System.out.println("Entro al botón pagar ");
		int pago = vCompra.getPago();
		int total = mComprar.getTotal();
		if (pago < total) {
			JOptionPane.showMessageDialog(null, "Debes cubrir el monto a pagar", "Pago insuficiente",
					JOptionPane.ERROR_MESSAGE);
		} else {
			if (pago <= 100) {
				VistaCambio vCamvio = new VistaCambio();
//				System.out.println(" " + total + " " + pago);
				ControladorCambio cCambio = new ControladorCambio(vCamvio, total, pago,vCompra,mDulces,mChoco,mGalleta,mRefre);
				vCompra.setVisible(false);
				vCamvio.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "Sólo se aceptan pagos menores a $100.00 MXM!", "Pago superado",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		}catch(NumberFormatException ex){
			JOptionPane.showMessageDialog(null, "Sólo números enteros", "Formato incorrecto",
					JOptionPane.ERROR_MESSAGE);
		}
	
	}

	/**
	 * Método que se ejecturá el Total del consumo del usuario
	 * @param val1
	 * @param val2
	 * @param val3
	 * @param val4
	 */
	private void establecerTotal(int val1, int val2, int val3, int val4) {
		int maxTotal = mComprar.sumaTotales(val1,val2,val3,val4);
			mComprar.setTotal(maxTotal);
		if(maxTotal > 100){
			JOptionPane.showMessageDialog(null, "Exediste el límite aceptado ($100.00 MXM), se reiniciará tu compra", "Monto Sobrepasado", JOptionPane.ERROR_MESSAGE);
			VistaOperaciones vistaOperaciones = new VistaOperaciones();
			ModeloDulces  mDulces = new ModeloDulces();
			ModeloChoco mChocolates = new ModeloChoco();
			ModeloGalleta mGalletas = new ModeloGalleta();
			ModeloRegresco mRefrescos = new ModeloRegresco();
			ControladorOperaciones controladorOperaciones = new ControladorOperaciones(vistaOperaciones, mDulces, mChocolates, mGalletas, mRefrescos); 
			vCompra.setVisible(false);
			vistaOperaciones.setVisible(true);
		}
		vCompra.getlblTotal().setText(String.format("Total: %d",maxTotal));
		
	}

	/**
	 * Método que se ejecturá cuando la ventana se este cerrando
	 */
	@Override
	public void windowClosing(WindowEvent e) {		

	}

	/**
	 * Método que se ejecturá cuando la ventana se cierre
	 */
	@Override
	public void windowClosed(WindowEvent e) {
	
		
	}

	/**
	 * Método que se ejecturá cuando la ventana se este cerrando
	 */
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Método que se ejecturá cuando la ventana se este cerrando
	 */
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Método que se ejecturá cuando se ponga el foco en la ventana
	 */
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Método que se ejecturá cuando se quite el foco de la ventana
	 */

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
