package music.model;

import music.interfaces.ModelInter;

public class Instruments implements ModelInter {

	private String guitar;
	private String midiKeyboard;
	
	public String getGuitar() {
		return guitar;
	}
	public void setGuitar(String guitar) {
		this.guitar = guitar;
	}
	public String getMidiKeyboard() {
		return midiKeyboard;
	}
	public void setMidiKeyboard(String midiKeyboard) {
		this.midiKeyboard = midiKeyboard;
	}
	
}
