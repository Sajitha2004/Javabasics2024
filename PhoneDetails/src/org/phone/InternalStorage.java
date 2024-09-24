package org.phone;
public class InternalStorage {
	private void processorName() {
		System.out.println("Snapdragon");
	}
	private void ramSize() {
		System.out.println("256GB");
	}
	public static void main (String[] args) {
		ExternalStorage a = new ExternalStorage();
		InternalStorage b = new InternalStorage();
		a.size();
		b.processorName();
		b.ramSize();
	}
}
