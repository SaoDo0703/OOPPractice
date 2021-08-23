package com.javacoban.opp_optional;

import com.javacoban.opp_optional.Document;

public class Main2 {
    public static void main(String[] args) {
        Document document = new Document();
        document.setDocumentCode("123ab");
        document.setImprint("DO THI SAO");
        document.setReleaseNumber(100);

        String documentCode = document.getDocumentCode();
        String imprint = document.getImprint();
        int releaseNumber = document.getReleaseNumber();
        System.out.println("Document Code : " + documentCode);
        System.out.println("Imprint : " + imprint);
        System.out.println("Release Number : " + releaseNumber);
    }
}
