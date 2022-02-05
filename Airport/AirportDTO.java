package com.xworkz.collection.Airport;

public class AirportDTO {
	
	private String FName;
	private  String Ftimings;
	private byte noOfPass;
	private byte capacity;
	private String Destination ;
	
	public AirportDTO() {
		
	}
	
	
	public String getFName() {
		return FName;
	}


	public void setFName(String fName) {
		FName = fName;
	}


	public String getFtimings() {
		return Ftimings;
	}


	public void setFtimings(String ftimings) {
		Ftimings = ftimings;
	}


	public byte getNoOfPass() {
		return noOfPass;
	}


	public void setNoOfPass(byte noOfPass) {
		this.noOfPass = noOfPass;
	}


	public byte getCapacity() {
		return capacity;
	}


	public void setCapacity(byte capacity) {
		this.capacity = capacity;
	}


	public String getDestination() {
		return Destination;
	}


	public void setDestination(String destination) {
		Destination = destination;
	}


	
	public String toString() {
		return "AirportDTO [FName=" + FName + ", Ftimings=" + Ftimings + ", noOfPass=" + noOfPass + ", capacity="
				+ capacity + ", Destination=" + Destination + "]";
	}


	
	
	
	
}
