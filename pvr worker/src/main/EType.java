package main;

public enum EType {
	BORDER ("Border"),
	MIDDLE ("Middle"),
	BORDER_SINUS ("Border_Sinus");
	
	public String type;
	
	EType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
}