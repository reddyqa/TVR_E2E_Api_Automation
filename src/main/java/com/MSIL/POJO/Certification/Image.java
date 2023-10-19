package com.MSIL.POJO.Certification;

import com.MSIL.POJO.ImageS3Info;

public class Image 
{
	private String type;
    private String name;
    private CertImageS3Info imageS3Info;
    
    public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CertImageS3Info getImageS3Info() {
		return imageS3Info;
	}
	public void setImageS3Info(CertImageS3Info newextS3infoInstance) {
		this.imageS3Info = newextS3infoInstance;
	}


}
