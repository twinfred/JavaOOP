package com.timwinfred.phone;

public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		this.setVersionNumber(versionNumber);
		this.setBatteryPercentage(batteryPercentage);
		this.setCarrier(carrier);
		this.setRingTone(ringTone);
	}
	
	@Override
	public String ring() {
		return "Galaxy ringing: " + this.getRingTone();
	}
	
	@Override
	public String unlock() {
		return "Unlocking your Galaxy...";
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Galaxy " + this.getVersionNumber() + " from" + this.getCarrier() + ", Current Battery Level: " + this.getBatteryPercentage() + "%");
	}
	
}
