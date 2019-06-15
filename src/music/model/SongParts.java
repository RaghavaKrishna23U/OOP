package music.model;

import music.interfaces.SongPartsInter;

public class SongParts implements SongPartsInter{

	private String melody;
	private String beat;
	private String lyrics;
	private String tempo;
	
	public String getTempo() {
		return tempo;
	}
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	public String getMelody() {
		return melody;
	}
	public void setMelody(String melody) {
		this.melody = melody;
	}
	public String getBeat() {
		return beat;
	}
	public void setBeat(String beat) {
		this.beat = beat;
	}
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	
}
