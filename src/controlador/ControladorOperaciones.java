package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
public class ControladorOperaciones implements ActionListener{
	VistaOperaciones vOperaciones = new VistaOperaciones();
	ModeloDulces mDulces = new ModeloDulces();
	ModeloChoco mChoco = new ModeloChoco();
	ModeloGalleta mGalleta = new ModeloGalleta();
	ModeloRegresco mRefre = new ModeloRegresco();
	
	VistaDetalleDulces vDulces = new VistaDetalleDulces();
	VistaDetalleChocolate vChoco = new VistaDetalleChocolate();
	VistaDetalleGalletas vGalleta = new VistaDetalleGalletas();
	VistaDetalleRefresco vRefresco = new VistaDetalleRefresco();
	VistaComprar vCompra = new VistaComprar();
	

	/**
	 * Constructor de la clase 
	 * @param vOperaciones Clase vista de Operaciones
	 * @param mDulces Clase modelo de Dulces
	 * @param mChoco Clase modelo de Chocolate
	 * @param mGalleta Clase modelo de Galleta
	 * @param mRefre Clase modelo de Refresco
	 */
	public ControladorOperaciones(VistaOperaciones vOperaciones, ModeloDulces mDulces, ModeloChoco mChoco,ModeloGalleta mGalleta, ModeloRegresco mRefre) {
		this.vOperaciones = vOperaciones;
		this.mDulces = mDulces;
		this.mChoco = mChoco;
		this.mGalleta = mGalleta;
		this.mRefre = mRefre;
		
			vOperaciones.onClickDulces(this);
			vOperaciones.onClickChoco(this);
			vOperaciones.onClickGalleta(this);
			vOperaciones.onClickRefresco(this);
	}

	/**
	 * Método que se ejecutará al hacer click sobre un botón del JFrame
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("Action");
		if(e.getSource() == vOperaciones.getBtnDulces()){
			VistaDetalleDulces vDulces = new VistaDetalleDulces();
			ControladorDetalleDulces cDulces = new ControladorDetalleDulces(vOperaciones,vDulces,mDulces, mChoco, mGalleta, mRefre); 
			vDulces.setVisible(true);
		}else if(e.getSource() == vOperaciones.getBtnChoco()){
			VistaDetalleChocolate vChoco = new VistaDetalleChocolate();
			ControladorDetalleChoco cChoco = new ControladorDetalleChoco(vOperaciones,vChoco,mChoco, mDulces, mGalleta, mRefre);
			vChoco.setVisible(true);
		}else if(e.getSource() == vOperaciones.getBtnGalletas()){
			VistaDetalleGalletas vGalleta = new VistaDetalleGalletas();
			ControladorDetalleGalleta cGalleta = new ControladorDetalleGalleta(vOperaciones,vGalleta, mGalleta,mChoco,mDulces,mRefre);
			vGalleta.setVisible(true);
		}else if(e.getSource() == vOperaciones.getBtnRefresco()){
			VistaDetalleRefresco vRefresco = new VistaDetalleRefresco();
			ControladorDetalleRefresco cRefre = new ControladorDetalleRefresco(vOperaciones,vRefresco, mRefre, mChoco, mDulces, mGalleta); 
			vRefresco.setVisible(true);

		}
		
	}

}
