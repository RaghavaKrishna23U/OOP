package music.composition;

import music.interfaces.ModelInter;
import music.model.Instruments;
import music.model.SongParts;

public class Melody {

	public ModelInter makeMelody(String part) {

		Instruments instrument = new Instruments();
		if ("verse".equals(part)) {
			instrument.setGuitar("Yamaha-Acoustic");
			instrument.setMidiKeyboard("Rhodes");
			return instrument;
		} else {
			instrument.setGuitar("Ibanez-electric");
			instrument.setMidiKeyboard("Grand-Piano");
			return instrument;
		}
	}

	public SongParts makeBeat(String part) {

		SongParts beat = new SongParts();
		if ("verse".equals(part)) {
			beat.setTempo("120bpm");
			beat.setMelody("Soft-Alt");
			return beat;
		} else {
			beat.setTempo("120bpm");
			beat.setMelody("Heavy-Alt");
			return beat;
		}

	}

	public SongParts writeLyrics(String part) {

		SongParts lyrics = new SongParts();
		if ("verse".equals(part)) {
			lyrics.setLyrics("These are the lines for the verse");
			return lyrics;
		} else {
			lyrics.setLyrics("These are the lines for the chorus");
			return lyrics;
		}
	}
}
