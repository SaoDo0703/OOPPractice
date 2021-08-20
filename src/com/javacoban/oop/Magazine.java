package com.javacoban.oop;

public class Magazine extends Document{
    private int issueNumber;
    private int releaseMonth;

    public Magazine(String documentCode, String imprint, int releaseNumber,int issueNumber, int releaseMonth){
        super(documentCode, imprint, releaseNumber);
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    public Magazine(){

    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }
}
