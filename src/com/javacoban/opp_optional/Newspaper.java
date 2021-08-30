package com.javacoban.opp_optional;

import com.javacoban.opp_optional.Document;

public class Newspaper extends Document {
    private int releaseDate  ;

    public Newspaper(String documentCode, String imprint, int releaseNumber, int releaseDate){
       super(documentCode, imprint, releaseNumber);
       this.releaseDate = releaseDate;
    }

    public Newspaper(){

    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
