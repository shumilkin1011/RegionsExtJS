package com.bft.shumilkin.RegionsExtJS.Recipient;

import ru.fss.integration.types.rpu.recipient.v01.RecipientDocType;
import ru.fss.integration.types.rpu.recipient.v01.RecipientInfoType;

public class RecipientConverter {

    public static RecipientDTO convertToDTO(RecipientInfoType info) {
        RecipientDTO dto = new RecipientDTO();
        RecipientDocType doc = info.getRecipientDocList().getRecipientDoc().get(0);
        dto.setCitizenship(info.getCitizenship());
        dto.setBirthDate(info.getBirthDate().toString());
        // TODO: MULTIPLE DOC-S
        dto.setDateIssued(doc.getDateIssued().toString());
        dto.setEmail(info.getEmail());
        dto.setGender(info.getGender().value());
        dto.setFirstName(info.getFirstName());
        dto.setLastName(info.getLastName());
        dto.setMiddleName(info.getMiddleName());
        dto.setNumDoc(doc.getNumDoc());
        dto.setDocTypeCode(doc.getDocTypeCode());
        dto.setSnils(info.getSnils());
        dto.setSerDoc(doc.getSerDoc());
        dto.setWhoIssued(doc.getWhoIssued());
        dto.setServiceRegion(info.getServiceRegion());
        return dto;
    }
}
