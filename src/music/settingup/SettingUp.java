package music.settingup;

import music.interfaces.ModelInter;
import music.model.Instruments;
import music.model.RecordingEquipment;;

public class SettingUp {

	public RecordingEquipment eqipmentSetup() {
		RecordingEquipment recEquip = new RecordingEquipment();
		recEquip.setScarlett2i2("On");
		recEquip.setMic("C24");
		recEquip.setLaptop("Session-ready");
		return recEquip;
	}
	
	
}

