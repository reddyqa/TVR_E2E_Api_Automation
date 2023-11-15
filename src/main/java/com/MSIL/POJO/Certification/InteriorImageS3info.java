package com.MSIL.POJO.Certification;

public class InteriorImageS3info 
{
	
	private String documentCategory;
    private String documentType;
    private String documentName;
    private String fileName;
    private String fileExtension;
    private String fileType;
    private String fixedS3PresignedUrl;
	
    public String getDocumentCategory() {
		return documentCategory;
	}
	public String getDocumentType() {
		return documentType;
	}
	public String getDocumentName() {
		return documentName;
	}
	public String getFileName() {
		return fileName;
	}
	public String getFileExtension() {
		return fileExtension;
	}
	public String getFileType() {
		return fileType;
	}
	public String getFixedS3PresignedUrl() {
		return fixedS3PresignedUrl;
	}
	public void setDocumentCategory(String documentCategory) {
		this.documentCategory = documentCategory;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public void setFixedS3PresignedUrl(String fixedS3PresignedUrl) {
		this.fixedS3PresignedUrl = fixedS3PresignedUrl;
	}


}
