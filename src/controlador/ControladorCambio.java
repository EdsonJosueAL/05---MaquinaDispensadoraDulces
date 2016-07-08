package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.ModeloChoco;
import modelo.ModeloCompra;
import modelo.ModeloDulces;
import modelo.ModeloGalleta;
import modelo.ModeloRegresco;
import vista.VistaCambio;
import vista.VistaComprar;
import vista.VistaOperaciones;
/**
 * 
 * @author EDSONJOSUE
 *
 */
public class ControladorCambio implements ActionListener{
	private VistaCambio vistaCambio;
	private int total;
	private int pago;
	private int cambio;
	
	
	VistaComprar vCompra = new VistaComprar();
	
	ModeloDulces mDulces = new ModeloDulces();
	ModeloChoco mChoco = new ModeloChoco();
	ModeloGalleta mGalleta = new ModeloGalleta();
	ModeloRegresco mRefre = new ModeloRegresco();
	ModeloCompra mComprar = new ModeloCompra();
	
	
	public ControladorCambio(VistaCambio vistaCambio, int total, int pago, VistaComprar vCompra,ModeloDulces mDulces, ModeloChoco mChoco,ModeloGalleta mGalleta, ModeloRegresco mRefre) {
		
		
		this.vCompra = vCompra;
		this.mDulces = mDulces;
		this.mChoco = mChoco;
		this.mGalleta = mGalleta;
		this.mRefre = mRefre;
		
		
		this.vistaCambio = vistaCambio;
		this.total = total;
		this.pago = pago;		
		
		vistaCambio.onClickAceptarMas(this);
		vistaCambio.onClickAceptarSalir(this);
		
		calcularCambio();

	}
	
	/**
	 * Constructor de la clase
	 */
	private void calcularCambio() {
		cambio = pago-total;
		
		while (cambio != 0) {
			if(cambio >= 50){
				vistaCambio.setCambioCincuenta((vistaCambio.getCambioCincuenta()+1));
				cambio -= 50;
			}else if(cambio >= 20){
				vistaCambio.setCambioVeinte((vistaCambio.getCambioVeinte()+1));
				cambio -= 20;
			}else if(cambio >= 10){
				vistaCambio.setCambioDiez((vistaCambio.getCambioDiez()+1));
				cambio -= 10;
			}else if(cambio >= 5){
				vistaCambio.setCambioCinco((vistaCambio.getCambioCinco()+1));
				cambio -= 5;
			}else if(cambio >= 1){
				vistaCambio.setCambioUno((vistaCambio.getCambioUno()+1));
				cambio -= 1;
			}
		}
		
		vistaCambio.mostrarCambio();
		
	}
	/**
	 * Mètodo que se ejecutarÃ¡ al hacer click sobre un botón del JFrame
	 */
	@Override	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == vistaCambio.getBtnAceptarComprarMas()){
//			System.out.println("MÃ¡s");
			VistaOperaciones vistaOperaciones = new VistaOperaciones();
			ControladorOperaciones controladorOperaciones = new ControladorOperaciones(vistaOperaciones, mDulces, mChoco, mGalleta, mRefre);
			vistaCambio.setVisible(false);
			vistaOperaciones.setVisible(true);
		}else if(e.getSource() == vistaCambio.getBtnAceptarYSalir()){
			
			
			JOptionPane.showMessageDialog(null, "Saliendo...","Saliendo",JOptionPane.WARNING_MESSAGE);
			VistaOperaciones vistaOperaciones = new VistaOperaciones();
			ModeloDulces  mDulces = new ModeloDulces();
			ModeloChoco mChocolates = new ModeloChoco();
			ModeloGalleta mGalletas = new ModeloGalleta();
			ModeloRegresco mRefrescos = new ModeloRegresco();
			ControladorOperaciones controladorOperaciones = new ControladorOperaciones(vistaOperaciones, mDulces, mChocolates, mGalletas, mRefrescos); 
			vistaCambio.setVisible(false);
			vistaOperaciones.setVisible(true);
		}
	}


	

	
	
	
	
}
