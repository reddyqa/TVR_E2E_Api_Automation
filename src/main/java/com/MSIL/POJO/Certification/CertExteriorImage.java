package com.MSIL.POJO.Certification;

public class CertExteriorImage 
{
	private String name;
    private ExteriorImageS3Info imageS3Info;
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ExteriorImageS3Info getImageS3Info() {
		return imageS3Info;
	}
	public void setImageS3Info(ExteriorImageS3Info exts3info) {
		this.imageS3Info = exts3info;
	}


}
