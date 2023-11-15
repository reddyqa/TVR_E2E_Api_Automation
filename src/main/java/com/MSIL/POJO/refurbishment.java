package com.MSIL.POJO;

import java.util.ArrayList;
import java.util.List;

public class refurbishment {
	
	    public void addVehicleImage(vehicleImages vehicleImage1) {
	        vehicleImages.add(vehicleImage1);
	    }
	
public List<summaryDetails> summaryDetails;

public List<vehicleImages> vehicleImages;

public List<summaryDetails> getSummaryDetails() {
	return summaryDetails;
}
public void setSummaryDetails(List<summaryDetails> summaryDetails) {
	this.summaryDetails = summaryDetails;
}
public List<vehicleImages> getVehicleImages() {
	return vehicleImages;
}
public void setVehicleImages(List<vehicleImages> vehicleImages) {
	this.vehicleImages = vehicleImages;
}

	
	

}
