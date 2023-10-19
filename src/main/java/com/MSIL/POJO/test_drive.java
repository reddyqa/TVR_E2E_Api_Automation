package com.MSIL.POJO;

import java.util.List;

public class test_drive {

	public startLocation getStartLocation() {
		return startLocation;
	}
	public void setStartLocation(startLocation startLocation) {
		this.startLocation = startLocation;
	}
	public endLocation getEndLocation() {
		return endLocation;
	}
	public void setEndLocation(endLocation endLocation) {
		this.endLocation = endLocation;
	}
	public List<travelledPoints> getTravelledPoints() {
		return travelledPoints;
	}
	public void setTravelledPoints(List<travelledPoints> travelledPoints) {
		this.travelledPoints = travelledPoints;
	}
	public String getDistanceTravelled() {
		return distanceTravelled;
	}
	public void setDistanceTravelled(String distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}
	public String getTimeTaken() {
		return timeTaken;
	}
	public void setTimeTaken(String timeTaken) {
		this.timeTaken = timeTaken;
	}
	public String getDrivingExperience() {
		return drivingExperience;
	}
	public void setDrivingExperience(String drivingExperience) {
		this.drivingExperience = drivingExperience;
	}
	public String getSpecifyProblem() {
		return specifyProblem;
	}
	public void setSpecifyProblem(String specifyProblem) {
		this.specifyProblem = specifyProblem;
	}
	public String getIncompleteReason() {
		return incompleteReason;
	}
	public void setIncompleteReason(String incompleteReason) {
		this.incompleteReason = incompleteReason;
	}
	public String getAdditionalRemark() {
		return additionalRemark;
	}
	public void setAdditionalRemark(String additionalRemark) {
		this.additionalRemark = additionalRemark;
	}
	public String getSpecifyProblemDetail() {
		return specifyProblemDetail;
	}
	public void setSpecifyProblemDetail(String specifyProblemDetail) {
		this.specifyProblemDetail = specifyProblemDetail;
	}
	public String getIncompleteReasonDetail() {
		return incompleteReasonDetail;
	}
	public void setIncompleteReasonDetail(String incompleteReasonDetail) {
		this.incompleteReasonDetail = incompleteReasonDetail;
	}
	public String getIsCompleteTestDrive() {
		return isCompleteTestDrive;
	}
	public void setIsCompleteTestDrive(String isCompleteTestDrive) {
		this.isCompleteTestDrive = isCompleteTestDrive;
	}
	private startLocation startLocation;
	private endLocation endLocation;

	private List<travelledPoints> travelledPoints;
	private String  distanceTravelled;

	private String timeTaken;
	private String drivingExperience;
	private String specifyProblem;
	private String incompleteReason;
	private String additionalRemark;
	private String specifyProblemDetail;
	private String incompleteReasonDetail;
	private String isCompleteTestDrive;
	
	
	
}
