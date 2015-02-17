package kr.co.itwise.device.core;

public class UAStringParser {
	private static String[] pcFlags = new String[] {"Windows 95", "Windows 98"
			, "Windows NT", "Intel Mac OS X", "PC Mac OS"};
	
	private static String[] tabletFlags = new String[] { "SHW-M180L/S", "SHW-M380W/S", "SHW-M480W", "ipad", "tablet"};
	private static String[] mobileFlags = new String[] { "mobile", "android"
		, "iphone", "ipod", "phone" };
	
	public static String parse(String userAgentString){
		
		//윈도우 웹 또는 맥 웹 환경인지 체크
		for (String pcFlag : pcFlags) {
			if(userAgentString.matches(".*(?i)" + pcFlag + ".*")){
				return "W";
			}
		}
		//리눅스 환경인지 체크
		if(userAgentString.matches(".*(?i)linux.*") && !userAgentString.matches(".*(?i)android.*")){
			return "W";
		}
		
		//GS Tablet 식별코드
		for(String tabletFlag : tabletFlags){
			if(userAgentString.matches(".*(?i)" + tabletFlag + ".*")){
				return "M";
			}
		}
		
		//Mobile 식별 코드
		for(String mobileFlag : mobileFlags){
			if(userAgentString.matches(".*(?i)" + mobileFlag + ".*")){
				return "N";
			}
		}
		
		return "";
	}
	
}
