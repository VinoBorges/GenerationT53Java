package Encapsulamento;

public class ControleTV implements Controle {//implements = obriga a seguir o padrão da interface Controle
			//ADD metodos não aplicados
	private boolean ligado;
	private int vol;
	
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	@Override
	public void ligar() {
		this.ligado=true;
		
	}
	@Override
	public void desligar() {
		this.ligado=false;
		
	}
	@Override
	public void maisVol() {
		this.vol++;
		
	}
	@Override
	public void menosVol() {
		this.vol--;
		
	}
	@Override
	public void mudo() {
		this.vol=0;
		
	}
	

}
