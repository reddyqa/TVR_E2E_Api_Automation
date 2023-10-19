package com.MSIL.POJO.Certification;

import java.util.List;

public class CertExterior 
{
	private List<Image> images;
    private List<CertExteriorImage> exteriorImages;
    private String repaintDone;
    private String rePaintListMode;
    private String actualRefurbishmentCost;
    private String frontRight;
    private String frontLeft;
    private String rearRight;
    private String rearLeft;
    private String spare;
    private String wheelType;

    
    public List<Image> getImages() {
		return images;
	}
	public void setImages(List<Image> images) {
		this.images = images;
	}
	public List<CertExteriorImage> getExteriorImages() {
		return exteriorImages;
	}
	public void setExteriorImages(List<CertExteriorImage> exteriorImages) {
		this.exteriorImages = exteriorImages;
	}
	public String getRepaintDone() {
		return repaintDone;
	}
	public void setRepaintDone(String value) {
		this.repaintDone = value;
	}
	public String getRePaintListMode() {
		return rePaintListMode;
	}
	public void setRePaintListMode(String value) {
		this.rePaintListMode = value;
	}
	public String getActualRefurbishmentCost() {
		return actualRefurbishmentCost;
	}
	public void setActualRefurbishmentCost(String actualRefurbishmentCost) {
		this.actualRefurbishmentCost = actualRefurbishmentCost;
	}
	public String getFrontRight() {
		return frontRight;
	}
	public void setFrontRight(String frontRight) {
		this.frontRight = frontRight;
	}
	public String getFrontLeft() {
		return frontLeft;
	}
	public void setFrontLeft(String frontLeft) {
		this.frontLeft = frontLeft;
	}
	public String getRearRight() {
		return rearRight;
	}
	public void setRearRight(String rearRight) {
		this.rearRight = rearRight;
	}
	public String getRearLeft() {
		return rearLeft;
	}
	public void setRearLeft(String rearLeft) {
		this.rearLeft = rearLeft;
	}
	public String getSpare() {
		return spare;
	}
	public void setSpare(String spare) {
		this.spare = spare;
	}
	public String getWheelType() {
		return wheelType;
	}
	public void setWheelType(String wheelType) {
		this.wheelType = wheelType;
	}

}
