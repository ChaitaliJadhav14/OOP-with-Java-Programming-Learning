package org.ycpait.geometryapp;

public interface I1 {
	void show();

	default void display() {
		System.out.println("Display in display I1 ");
	}

}
