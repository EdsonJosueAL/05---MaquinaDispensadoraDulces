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

public class ControladorDetalleRefresco implements ActionListener, WindowListener{
	VistaDetalleRefresco vRefresco = new VistaDetalleRefresco();
	ModeloDulces mDulces = new ModeloDulces();
	ModeloChoco mChoco = new ModeloChoco();
	ModeloGalleta mGalleta = new ModeloGalleta();
	ModeloRegresco mRefre = new ModeloRegresco();
	VistaOperaciones vOperaciones = new VistaOperaciones();
	/**
	 * Constructor de la clase 
	 * @param vistaRefresco Vista de la clase Refresco
	 * @param mDulces Modelo de la clase Dulces
	 * @param mChoco Modelo de la clase Chocolate
	 * @param mGalleta Modelo de la clase Galleta
	 * @param mRefre Modelo de la clase Refresco
	 */
	public ControladorDetalleRefresco(VistaOperaciones vOperaciones, VistaDetalleRefresco vRefresco,ModeloRegresco mRefre, ModeloChoco mChoco, ModeloDulces mDulces, ModeloGalleta mGalleta) {
		this.vRefresco = vRefresco;
		this.mDulces = mDulces;
		this.mChoco = mChoco;
		this.mGalleta= mGalleta;
		this.mRefre = mRefre;
		this.vOperaciones = vOperaciones;
		vRefresco.onClickComprar(this);
		vRefresco.onClickProducto1(this);
		vRefresco.onClickProducto2(this);
		vRefresco.onClickProducto3(this);
		vRefresco.onClickProducto4(this);
		vRefresco.onLoadVentana(this);
	
	}

	/**
	 * Método que se ejecutará al hacer click sobre un botón del JFrame
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == vRefresco.getCheckRefrescoProdu1()){
			mRefre.setProd1(vRefresco.getCheckRefrescoProdu1().isSelected());
		}else if(e.getSource() == vRefresco.getCheckRefrescoProdu2()){
			mRefre.setProd2(vRefresco.getCheckRefrescoProdu2().isSelected());
		}else if(e.getSource() == vRefresco.getCheckRefrescoProdu3()){
			mRefre.setProd3(vRefresco.getCheckRefrescoProdu3().isSelected());
		}else if(e.getSource() == vRefresco.getCheckRefrescoProdu4()){
			mRefre.setProd4(vRefresco.getCheckRefrescoProdu4().isSelected());
		}else if(e.getSource() == vRefresco.getBtnComprar()){
			boolean totalP[];
				totalP = mRefre.getTotalP();
				int contador = 0;
			for (int i = 0; i < totalP.length; i++) {
				if(totalP[i]){
					contador=contador+1;
				}else if(mDulces.getTotalP()[i]){
					contador = contador + 1;
				}else if(mGalleta.getTotalP()[i]){
					contador = contador + 1;
				}else if(mChoco.getTotalP()[i]){
					contador = contador + 1;
				}
			}
			
			if(contador != 0){
//				System.out.println("Okey Entra");
					mRefre.setA(vRefresco.lol());
					mRefre.setB(vRefresco.productosRefresco());
					VistaComprar vCompra = new VistaComprar();
					ControladorCompra cCompra = new ControladorCompra(vCompra, mDulces, mChoco, mGalleta, mRefre);
					vCompra.setVisible(true);
					vRefresco.setVisible(false);
					vOperaciones.setVisible(false);
					}else{
						vRefresco.mostrarError("Tiene que seleccionar al menos un prododucto", vRefresco);
					}
				
			}
	
	}

	/**
	 * Método que se ejecutará al abrir el JFrame
	 */
	@Override
	public void windowOpened(WindowEvent e) {
		if(mRefre.isProd1()){
			vRefresco.getCheckRefrescoProdu1().setSelected(true);
		}if(mRefre.isProd2()){
			vRefresco.getCheckRefrescoProdu2().setSelected(true);
		}if(mRefre.isProd3()){
			vRefresco.getCheckRefrescoProdu3().setSelected(true);
		}if(mRefre.isProd4()){
			vRefresco.getCheckRefrescoProdu4().setSelected(true);
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
