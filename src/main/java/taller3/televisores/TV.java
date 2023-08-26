package taller3.televisores;

public class TV { 
	private Marca marca ;
	private int canal ;
	private int precio ;
	private boolean estado ;
	private int volumen ; 
	private Control control ;
	
	public TV (Marca marca, boolean estado) {
		canal = 1;
		volumen = 1;
		precio = 500;
	}
	
	public Marca getMarca() {
		return marca ;	
	}
	
	public int getCanal() {
		return canal ;	
	}
	
	public int getPrecio() {
		return precio ;	
	}
	
	public int getVolumen() {
		return volumen ;	
	}
	
	public Control getControl() {
		return control ;	
	}
	
	public void setMarca (Marca a_marca) {
		marca = a_marca ;
	}
	
	public void setCanal (int a_canal) {
		canal = a_canal ;
	}
	public void setPrecio (int a_precio) {
		precio = a_precio ;
	}
	
	public void setVolumnes (int a_volumen) {
		volumen = a_volumen ;
	}
	
	public void setControl (Control a_control) {
		control = a_control ;
	}
	

}
