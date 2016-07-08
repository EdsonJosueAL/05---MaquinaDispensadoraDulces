package controlador;

import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import modelo.ModeloChoco;
import modelo.ModeloCompra;
import modelo.ModeloDulces;
import modelo.ModeloGalleta;
import modelo.ModeloRegresco;
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

public class ControladorDetalleChoco implements ActionListener, WindowListener{
	VistaDetalleChocolate vistaChoco = new VistaDetalleChocolate();
	ModeloDulces mDulces = new ModeloDulces();
	ModeloChoco mChoco = new ModeloChoco();
	ModeloGalleta mGalleta = new ModeloGalleta();
	ModeloRegresco mRefre = new ModeloRegresco();
	VistaComprar vCompra = new VistaComprar();
	VistaOperaciones vOperaciones = new VistaOperaciones();
	
	/**
	 * Constructor de la clase 
	 * @param vistaChoco Vista de la clase Chocolate
	 * @param mDulces Modelo de la clase Dulces
	 * @param mChoco Modelo de la clase Chocolate
	 * @param mGalleta Modelo de la clase Galleta
	 * @param mRefre Modelo de la clase Refresco
	 */
	public ControladorDetalleChoco(VistaOperaciones vOperaciones,VistaDetalleChocolate vistaChoco, ModeloChoco mChoco, ModeloDulces mDulces, ModeloGalleta mGalleta, ModeloRegresco mRefre) {
		this.vistaChoco = vistaChoco;
		this.vOperaciones = vOperaciones;
		this.mChoco = mChoco;
		this.mDulces = mDulces;
		this.mGalleta = mGalleta;
		this.mRefre = mRefre;

		vistaChoco.onClickComprar(this);
		vistaChoco.onClickProducto1(this);
		vistaChoco.onClickProducto2(this);
		vistaChoco.onClickProducto3(this);
		vistaChoco.onClickProducto4(this);
		vistaChoco.onLoadVentana(this);
	
	}

	/**
	 * Método que se ejecutará al hacer click sobre un botón del JFrame
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vistaChoco.getCheckChocoProdu1()) {
			mChoco.setProd1(vistaChoco.getCheckChocoProdu1().isSelected());
		} else if (e.getSource() == vistaChoco.getCheckChocoProdu2()) {
			mChoco.setProd2(vistaChoco.getCheckChocoProdu2().isSelected());
		} else if (e.getSource() == vistaChoco.getCheckChocoProdu3()) {
			mChoco.setProd3(vistaChoco.getCheckChocoProdu3().isSelected());
		} else if (e.getSource() == vistaChoco.getCheckChocoProdu4()) {
			mChoco.setProd4(vistaChoco.getCheckChocoProdu4().isSelected());
		} else if (e.getSource() == vistaChoco.getBtnCompra()) {
			boolean totalP[];
			totalP = mChoco.getTotalP();
			int contador = 0;
			for (int i = 0; i < totalP.length; i++) {
				if (totalP[i]) {
					contador = contador + 1;
				}else if(mDulces.getTotalP()[i]){
					contador = contador + 1;
				}else if(mGalleta.getTotalP()[i]){
					contador = contador + 1;
				}else if(mRefre.getTotalP()[i]){
					contador = contador + 1;
				}
			}

			if (contador != 0) {
//				System.out.println("Okey Entra");
				mChoco.setA(vistaChoco.lol());
				mChoco.setB(vistaChoco.productosChoco());
				VistaComprar vCompra = new VistaComprar();
				ControladorCompra cCompra = new ControladorCompra(vCompra, mDulces, mChoco, mGalleta, mRefre);
				vCompra.setVisible(true);
				vistaChoco.setVisible(false);
				vOperaciones.setVisible(false);
			} else {
				vistaChoco.mostrarError("Tiene que seleccionar al menos un prododucto", vistaChoco);
			}

		}
	}

	/**
	 * Método que se ejecutará al abrir el JFrame
	 */
	@Override
	public void windowOpened(WindowEvent e) {
		if(mChoco.isProd1()){
			vistaChoco.getCheckChocoProdu1().setSelected(true);
		}if(mChoco.isProd2()){
			vistaChoco.getCheckChocoProdu2().setSelected(true);
		}if(mChoco.isProd3()){
			vistaChoco.getCheckChocoProdu3().setSelected(true);
		}if(mChoco.isProd4()){
			vistaChoco.getCheckChocoProdu4().setSelected(true);
		}
	}

	/**
	 * Método que se ejecutará al estar cerrando el JFrame
	 */
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Método que se ejecutará al cerrar el JFrame
	 */
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Método que se ejecutará al abrir el JFrame
	 */
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Método que se ejecutará al abrir el JFrame
	 */
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Método que se ejecutará cuando se ponga el foco en la ventana
	 */
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Método que se ejecutará cuando se quite el foco en la ventana	
	 */
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
