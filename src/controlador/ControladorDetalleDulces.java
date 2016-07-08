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
public class ControladorDetalleDulces implements ActionListener, WindowListener{
	VistaDetalleDulces vistaDulces = new VistaDetalleDulces();
	ModeloDulces mDulces = new ModeloDulces();
	ModeloChoco mChoco = new ModeloChoco();
	ModeloGalleta mGalleta = new ModeloGalleta();
	ModeloRegresco mRefre = new ModeloRegresco();
	VistaOperaciones vOperaciones = new VistaOperaciones();
	/**
	 * Constructor de la clase 
	 * @param vistaDulces Vista de la clase Dulces
	 * @param mDulces Modelo de la clase Dulces
	 * @param mChoco Modelo de la clase Chocolate
	 * @param mGalleta Modelo de la clase Galleta
	 * @param mRefre Modelo de la clase Refresco
	 */
	public ControladorDetalleDulces(VistaOperaciones vOperaciones, VistaDetalleDulces vistaDulces,ModeloDulces mDulces, ModeloChoco mChoco, ModeloGalleta mGalleta, ModeloRegresco mRefre) {
		this.vistaDulces = vistaDulces;
		this.vOperaciones = vOperaciones;
		this.mDulces = mDulces;
		this.mChoco = mChoco;
		this.mGalleta = mGalleta;
		this.mRefre = mRefre;
		
		
		vistaDulces.onClickComprar(this);
		vistaDulces.onClickProducto1(this);
		vistaDulces.onClickProducto2(this);
		vistaDulces.onClickProducto3(this);
		vistaDulces.onClickProducto4(this);
		vistaDulces.onLoadVentana(this);
	
	}

	/**
	 * Método que se ejecutará al hacer click sobre un botón del JFrame
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == vistaDulces.getCheckDulceProdu1()){
			mDulces.setProd1(vistaDulces.getCheckDulceProdu1().isSelected());
		}else if(e.getSource() == vistaDulces.getCheckDulceProdu2()){
			mDulces.setProd2(vistaDulces.getCheckDulceProdu2().isSelected());
		}else if(e.getSource() == vistaDulces.getCheckDulceProdu3()){
			mDulces.setProd3(vistaDulces.getCheckDulceProdu3().isSelected());
		}else if(e.getSource() == vistaDulces.getCheckDulceProdu4()){
			mDulces.setProd4(vistaDulces.getCheckDulceProdu4().isSelected());
		}else if(e.getSource() == vistaDulces.getBtnCompra()){
			boolean totalP[];
				totalP = mDulces.getTotalP();
				int contador = 0;
			for (int i = 0; i < totalP.length; i++) {
				if(totalP[i]){
					contador=contador+1;
				}else if(mChoco.getTotalP()[i]){
					contador = contador + 1;
				}else if(mGalleta.getTotalP()[i]){
					contador = contador + 1;
				}else if(mRefre.getTotalP()[i]){
					contador = contador + 1;
				}
			}
			System.out.println(contador);
			if(contador != 0){
//				System.out.println("Okey Entra");
					mDulces.setA(vistaDulces.lol());
					mDulces.setB(vistaDulces.productosDulces());
					VistaComprar vCompra = new VistaComprar();
					ControladorCompra cCompra = new ControladorCompra(vCompra,mDulces, mChoco, mGalleta, mRefre);
					vCompra.setVisible(true);
					vOperaciones.setVisible(false);
					vistaDulces.setVisible(false);
					}else{
						vistaDulces.mostrarError("Tiene que seleccionar al menos un prododucto", vistaDulces);
					}
				
			}
		}
			
	

	/**
	 * Método que se ejecutará al abrir el JFrame
	 */
	@Override
	public void windowOpened(WindowEvent e) {
		if(mDulces.isProd1()){
			vistaDulces.getCheckDulceProdu1().setSelected(true);
		}if(mDulces.isProd2()){
			vistaDulces.getCheckDulceProdu2().setSelected(true);
		}if(mDulces.isProd3()){
			vistaDulces.getCheckDulceProdu3().setSelected(true);
		}if(mDulces.isProd4()){
			vistaDulces.getCheckDulceProdu4().setSelected(true);
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
