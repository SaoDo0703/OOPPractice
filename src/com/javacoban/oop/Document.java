package com.javacoban.oop;

public class Document {
    private String documentCode;
    private String imprint;
    private int releaseNumber;

    public Document(String documentCode, String imprint, int releaseNumber) {
        this.documentCode = documentCode;
        this.imprint = imprint;
        this.releaseNumber = releaseNumber ;
    }

    public Document(){

    }

    public String getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    public String getImprint() {
        return imprint;
    }


    public void setImprint(String imprint) {
        this.imprint = imprint;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
         this.releaseNumber = releaseNumber;
    }
}
