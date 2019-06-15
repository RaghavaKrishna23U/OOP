package music.model;

import music.interfaces.RecInter;

public class RecordingEquipment implements RecInter {

	private String mic;
	private String scarlett2i2;
	private String laptop;
	
	public String getMic() {
		return mic;
	}
	public void setMic(String mic) {
		this.mic = mic;
	}
	public String getScarlett2i2() {
		return scarlett2i2;
	}
	public void setScarlett2i2(String scarlett2i2) {
		this.scarlett2i2 = scarlett2i2;
	}
	public String getLaptop() {
		return laptop;
	}
	public void setLaptop(String laptop) {
		this.laptop = laptop;
	}
	
}
