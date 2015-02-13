package kr.co.itwise.device.core;

public class DeviceTypeParser {
	
	private int deviceWidth;
	private int deviceHeight;
	private int deviceRatio;
	private String deviceType;
	
	public DeviceTypeParser(){
		
	}

	public DeviceTypeParser(int deviceWidth, int deviceHeight, int deviceRatio) {
		super();
		this.deviceWidth = deviceWidth;
		this.deviceHeight = deviceHeight;
		this.deviceRatio = deviceRatio;
		
		//TODO : 너비, 높이, 배율로 DeviceType값을 계산해 주는 로직 추가
		this.deviceType = "WIDE";
	}
	public int getDeviceWidth() {
		return deviceWidth;
	}
	public void setDeviceWidth(int deviceWidth) {
		this.deviceWidth = deviceWidth;
	}
	public int getDeviceHeight() {
		return deviceHeight;
	}
	public void setDeviceHeight(int deviceHeight) {
		this.deviceHeight = deviceHeight;
	}
	public int getDeviceRatio() {
		return deviceRatio;
	}
	public void setDeviceRatio(int deviceRatio) {
		this.deviceRatio = deviceRatio;
	}
	
	public String getDeviceType(){
		return this.deviceType;
	}
	
	public void setDeviceType(String deviceType){
		this.deviceType = deviceType;
	}

	@Override
	public String toString() {
		return "DeviceTypeParser [deviceWidth=" + deviceWidth
				+ ", deviceHeight=" + deviceHeight + ", deviceRatio="
				+ deviceRatio + ", deviceType=" + deviceType + "]";
	}

}
