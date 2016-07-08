package app;

import javax.swing.JCheckBox;
import javax.swing.JLabel;

import controlador.ControladorVistaInicio;
import modelo.ModeloChoco;
import modelo.ModeloCompra;
import modelo.ModeloDulces;
import modelo.ModeloGalleta;
import modelo.ModeloRegresco;
import vista.VistaDetalleChocolate;
import vista.VistaDetalleDulces;
import vista.VistaDetalleGalletas;
import vista.VistaDetalleRefresco;
import vista.VistaInicio;
/**
 * 
 * @author EDSONJOSUE
 *
 */
public class Maquinita {
/**
 * Método encargado de correr el programa
 * @param args
 */
	public static void main(String[] args) {
		VistaDetalleDulces vD = new VistaDetalleDulces();
		VistaDetalleChocolate vC = new VistaDetalleChocolate();
		VistaDetalleGalletas vG = new VistaDetalleGalletas();
		VistaDetalleRefresco vR = new VistaDetalleRefresco();
		
		
		JCheckBox[] ad;
			ad = vD.lol();
		JLabel[] bd;
			bd = vD.productosDulces();
			
		JCheckBox[] ac;
			ac = vC.lol();
		JLabel[] bc;
			bc = vC.productosChoco();
			
		JCheckBox[] ag;
			ag = vG.lol();
		JLabel[] bg;
			bg = vG.productosGalleta();
			
		JCheckBox[] ar;
			ar = vR.lol();
		JLabel[] br;
			br = vR.productosRefresco();
			
			
			
		VistaInicio vInicio = new VistaInicio();
		
		ModeloDulces mDulces = new ModeloDulces(bd, ad);
		ModeloChoco mChoco = new ModeloChoco(bc, ac);
		ModeloGalleta mGalleta = new ModeloGalleta(bg, ag);
		ModeloRegresco mRefre = new ModeloRegresco(br, ar);
		
		ControladorVistaInicio cPrincipal = new ControladorVistaInicio(vInicio,mDulces, mChoco, mGalleta, mRefre);
			vInicio.setVisible(true);
	}

}
