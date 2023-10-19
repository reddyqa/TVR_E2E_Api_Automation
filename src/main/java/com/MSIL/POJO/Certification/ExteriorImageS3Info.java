package com.MSIL.POJO.Certification;

public class ExteriorImageS3Info 
{
	private String fileName;
    private String fileExtension;
    private String fileType;
    private String documentName;
    private String documentType;
    private String fixedS3PresignedUrl;
	
    public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileExtension() {
		return fileExtension;
	}
	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getFixedS3PresignedUrl() {
		return fixedS3PresignedUrl;
	}
	public void setFixedS3PresignedUrl(String fixedS3PresignedUrl) {
		this.fixedS3PresignedUrl = fixedS3PresignedUrl;
	}


}
