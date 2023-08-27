package taller3.televisores;

public class TV { 
	private Marca marca ;
	private int canal ;
	private int precio ;
	private boolean estado ;
	private int volumen ; 
	private Control control ;
	private static int numTV ;
	
	public TV (Marca marca, boolean estado) {
		canal = 1;
		volumen = 1;
		precio = 500;
		numTV++;
	}
	
	public void volumenDown() {
		if (estado == true && volumen > 0 && volumen <= 7) {
				volumen--;
			} 	
		}

	public void volumenUp() {
		if (estado == true && volumen >= 0 && volumen < 7) {
				volumen--;
			} 	
		}
	
	public void canalDown() {
		if (estado == true && canal > 1 && canal <= 120) {
				canal--;
			} 	
		}
	
	public void canalUp() {
		if (estado == true && canal >= 1 && canal < 120) {
				canal++;
			} 	
		}
	
	public void turnOn () {
		estado = true;
	}
	
	public void turnOff () {
		estado = false;
	}
	
	public boolean getEstado() {
		return estado ;	
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
	
	public static int getNumTV() {
		return numTV ;
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
