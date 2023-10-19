package com.MSIL.POJO.Certification;

public class InteriorPics 
{
	public String type;
    public String name;
    public String presignedURL;
    public InteriorImageS3info intimageS3Info;
	
    public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public String getPresignedURL() {
		return presignedURL;
	}
	public InteriorImageS3info getIntimageS3Info() {
		return intimageS3Info;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPresignedURL(String presignedURL) {
		this.presignedURL = presignedURL;
	}
	public void setIntimageS3Info(InteriorImageS3info intimageS3Info) {
		this.intimageS3Info = intimageS3Info;
	}


}
