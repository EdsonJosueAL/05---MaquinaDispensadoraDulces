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
public class ControladorDetalleGalleta implements ActionListener, WindowListener{
	VistaDetalleGalletas vistaGalleta = new VistaDetalleGalletas();
	ModeloDulces mDulces = new ModeloDulces();
	ModeloChoco mChoco = new ModeloChoco();
	ModeloGalleta mGalleta = new ModeloGalleta();
	ModeloRegresco mRefre = new ModeloRegresco();
	VistaOperaciones vOperaciones = new VistaOperaciones();
	/**
	 * Constructor de la clase 
	 * @param vistaGalleta Vista de la clase Galleta
	 * @param mDulces Modelo de la clase Dulces
	 * @param mChoco Modelo de la clase Chocolate
	 * @param mGalleta Modelo de la clase Galleta
	 * @param mRefre Modelo de la clase Refresco
	 */
	public ControladorDetalleGalleta(VistaOperaciones vOperaciones, VistaDetalleGalletas vistaGalleta, ModeloGalleta mGalleta, ModeloChoco mChoco, ModeloDulces mDulces, ModeloRegresco mRefre) {
		this.vOperaciones = vOperaciones;
		this.vistaGalleta = vistaGalleta;
		this.mDulces = mDulces;
		this.mChoco = mChoco;
		this.mGalleta = mGalleta;
		this.mRefre = mRefre;
		
		vistaGalleta.onClickComprar(this);
		vistaGalleta.onClickProducto1(this);
		vistaGalleta.onClickProducto2(this);
		vistaGalleta.onClickProducto3(this);
		vistaGalleta.onClickProducto4(this);
		vistaGalleta.onLoadVentana(this);
	
	}
	
	/**
	 * Método que se ejecutará al hacer click sobre un botón del JFrame
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == vistaGalleta.getCheckGalletaProdu1()){
			mGalleta.setProd1(vistaGalleta.getCheckGalletaProdu1().isSelected());
		}else if(e.getSource() == vistaGalleta.getCheckGalletaProdu2()){
			mGalleta.setProd2(vistaGalleta.getCheckGalletaProdu2().isSelected());
		}else if(e.getSource() == vistaGalleta.getCheckGalletaProdu3()){
			mGalleta.setProd3(vistaGalleta.getCheckGalletaProdu3().isSelected());
		}else if(e.getSource() == vistaGalleta.getCheckGalletaProdu4()){
			mGalleta.setProd4(vistaGalleta.getCheckGalletaProdu4().isSelected());
		}else if(e.getSource() == vistaGalleta.getBtnComprar()){
			boolean totalP[];
				totalP = mGalleta.getTotalP();
				int contador = 0;
			for (int i = 0; i < totalP.length; i++) {
				if(totalP[i]){
					contador=contador+1;
				}else if(mDulces.getTotalP()[i]){
					contador = contador + 1;
				}else if(mChoco.getTotalP()[i]){
					contador = contador + 1;
				}else if(mRefre.getTotalP()[i]){
					contador = contador + 1;
				}
			}
			if(contador != 0){
//				System.out.println("Okey Entra");
					mGalleta.setA(vistaGalleta.lol());
					mGalleta.setB(vistaGalleta.productosGalleta());
					VistaComprar vCompra = new VistaComprar();
					ControladorCompra cCompra = new ControladorCompra(vCompra, mDulces, mChoco, mGalleta, mRefre);
					vCompra.setVisible(true);
					vistaGalleta.setVisible(false);
					vOperaciones.setVisible(false);
					}else{
						vistaGalleta.mostrarError("Tiene que seleccionar al menos un prododucto", vistaGalleta);
					}
				
			}
	}

	/**
	 * Método que se ejecutará al abrir el JFrame
	 */
	@Override
	public void windowOpened(WindowEvent e) {
		if(mGalleta.isProd1()){
			vistaGalleta.getCheckGalletaProdu1().setSelected(true);
		}if(mGalleta.isProd2()){
			vistaGalleta.getCheckGalletaProdu2().setSelected(true);
		}if(mGalleta.isProd3()){
			vistaGalleta.getCheckGalletaProdu3().setSelected(true);
		}if(mGalleta.isProd4()){
			vistaGalleta.getCheckGalletaProdu4().setSelected(true);
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
