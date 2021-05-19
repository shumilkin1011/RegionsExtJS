package com.bft.shumilkin.RegionsExtJS.Recipient;

import lombok.Data;

@Data
public class RecipientDTO {

    private String snils;
    private String lastName;
    private String firstName;
    private String middleName;
    private String gender;
    private String birthDate;
    private String serviceRegion;
    private String citizenship;
    private String docTypeCode;
    private String serDoc;
    private String numDoc;
    private String whoIssued;
    private String dateIssued;
    private String email;

    public RecipientDTO() {
    }




}
