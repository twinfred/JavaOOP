package com.timwinfred.phone;

public class PhoneTest {
	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ringading... ding!");
		IPhone i10 = new IPhone("X", 100, "AT&T", "Zinnnnng ziiiinnnnnng!!!");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		i10.displayInfo();
		System.out.println(i10.ring());
		System.out.println(i10.unlock());
	}
}
