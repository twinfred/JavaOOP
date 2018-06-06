package com.timwinfred.phone;

public class IPhone extends Phone implements Ringable {
	
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		this.setVersionNumber(versionNumber);
		this.setBatteryPercentage(batteryPercentage);
		this.setCarrier(carrier);
		this.setRingTone(ringTone);
	}
	
	@Override
	public String ring() {
		return "iPhone ringing: " + this.getRingTone();
	}
	
	@Override
	public String unlock() {
		return "Unlocking your iPhone...";
	}
	
	@Override
	public void displayInfo() {
		System.out.println("iPhone " + this.getVersionNumber() + " from " + this.getCarrier() + ", Current Battery Level: " + this.getBatteryPercentage() + "%");
	}
	
}
