package edu.ncsu.monopoly;

public class GoCell extends Cell {
	public GoCell() {
		super.setName("Go");
		setAvailable(false);
	}

	public Boolean playAction(String msg) {
		return true;
	}
	
	void setName(String name) {
	}
}
