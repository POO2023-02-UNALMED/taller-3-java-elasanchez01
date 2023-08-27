package taller3.televisores;

public class TV { 
	private Marca marca ;
	private int canal ;
	private int precio ;
	private boolean estado ;
	private int volumen ; 
	private Control control ;
	private static int numTV=0 ;
	
	public TV (Marca marca, boolean estado) {
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		this.marca = marca;
		this.estado = estado;	
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
	
	public void setCanal (int num) {
		if (this.estado == true && num >=1 && num <=120) {
			canal = num;
		}

	}
	public void setPrecio (int value) {
		precio = value ;
	}
	
	public void setVolumen (int num) {
		if (this.estado == true && num >= 0 && num <= 7 ) {
			volumen = num ;	
		}
		
	}
	
	public void setControl (Control a_control) {
		control = a_control ;
	}
	

}
