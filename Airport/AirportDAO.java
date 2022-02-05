package com.xworkz.collection.Airport;

import java.util.LinkedList;

import com.xworkz.collection.ListCRUD.FlowerDTO;

public class AirportDAO {
	
    LinkedList<AirportDTO> list = new LinkedList<AirportDTO>();
    
        public void add(AirportDTO Name) {
		list.add(Name);
		System.out.println("data added to the list----");
	}
        
        public void printAll() {
    		for (AirportDTO airportDTO : list) {
    			System.out.println(airportDTO.toString());
    		}
    	}
     

    	public AirportDTO updateFtimingsbyFName(String Ftimings,String FName) {
    		for (AirportDTO airportDTO : list) {
    			if(FName.equals(airportDTO.getFName())) {
    				airportDTO.setFtimings(Ftimings);
    				return airportDTO;
    			}
    			
    		}
    		return null;
    	}
	

    	public AirportDTO getBynoOfPass( byte noOfPass) {
    		for (AirportDTO airportDTO : list) {
    			if(noOfPass==airportDTO.getNoOfPass()) {
    				list.get(0);
    				return airportDTO;
    			}
    		}
    		return null;
    	}
    	
    	public AirportDTO deleteByDestination(String Destination) {
    		for ( AirportDTO  airportDTO: list) {
    		  if(Destination ==  airportDTO.getDestination()) {
    			  list.remove( airportDTO);
    		  }
    			
    		}
    		return null;
    	}


}
