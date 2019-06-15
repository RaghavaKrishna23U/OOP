package music.Record;

import music.composition.Melody;
import music.interfaces.ModelInter;
import music.interfaces.RecInter;
import music.interfaces.SongPartsInter;
import music.model.*;
import music.settingup.SettingUp;

public class Recording {
	
	public static void main(String[] args) {
		
		ModelInter instruments = new Instruments();
		SongPartsInter beatParts = new SongParts();
		SongPartsInter lyricParts = new SongParts();
		
		RecInter recordingEquipment =new RecordingEquipment();		
		
		SettingUp settingUp = new SettingUp();
		recordingEquipment = settingUp.eqipmentSetup();

		System.out.println("Getting started with the tracking process-------");
		System.out.println("Equipments/status: \nLaptop: "
				+recordingEquipment.getLaptop()+"\nMic: "
				+ recordingEquipment.getMic()+"\nInterface: "
				+ recordingEquipment.getScarlett2i2()+" \n-------------------");
		
		System.out.println("Tracking Verse....");
		
		Melody melody = new Melody();
		instruments = melody.makeMelody("verse");
		beatParts = melody.makeBeat("verse");
		lyricParts = melody.writeLyrics("verse");
		
		System.out.println("Verse characteristics: \nGuitar used: "
				+instruments.getGuitar()+" \nMidi patch: "
				+instruments.getMidiKeyboard()+" \ntempo: "
				+beatParts.getTempo()+" \nstyle: "
				+beatParts.getMelody()+" \nlyrics: "
				+lyricParts.getLyrics()+" \n-------------------");
		
		System.out.println("Tracking Chorus....");
				
				instruments = melody.makeMelody("chorus");
				beatParts = melody.makeBeat("chorus");
				lyricParts = melody.writeLyrics("chorus");
				
		System.out.println("Chorus characteristics: \nGuitar used: "
				+instruments.getGuitar()+" \nMidi patch: "
				+instruments.getMidiKeyboard()+" \ntempo: "
				+beatParts.getTempo()+" \nstyle: "
				+beatParts.getMelody()+" \nlyrics: "
				+lyricParts.getLyrics()+" \n-------------------");
	}
}
