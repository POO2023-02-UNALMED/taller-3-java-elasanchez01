package taller3.televisores;

public class Control {
	private TV tv;

	public void encender() {
		tv.turnOn.TV();
	}
	
	public void apagar() {
		tv.turnOff.TV();
	}
	
	public void upCanal() {
		tv.canalUp.TV();
	}
	
	public void downCanal() {
		tv.canalDown.TV();
	}
	
	public void upVolumen() {
		tv.volumenUp.TV();
	}
	
	public void downVolumen() {
		tv.volumenDown.TV();	
	}
	
	public void setCanal (int a_canal) {
		canal = a_canal ;
	}
	
	public void setCanal (int a_volumen) {
		canal = a_volumen ;
	}
	
	public void enlazar (TV televisor, Control control) {
		tv = televisor ;
		this.control = control ;
	}
}
	