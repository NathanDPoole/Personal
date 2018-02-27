package com.revature.day6;

public class SweetFactory {

	public Sweets getSweets(String SweetType) {
		
		if(SweetType == null) return null;
		else {
			if(SweetType.equalsIgnoreCase("candy")) {
				return new Candy();
			}else {
				if(SweetType.equalsIgnoreCase("Hot Coco")) { return new HotCoco();
			}else {
				if(SweetType.equalsIgnoreCase("wipped")) return new MarshMalow();
			}
			}
		}
	}
}
