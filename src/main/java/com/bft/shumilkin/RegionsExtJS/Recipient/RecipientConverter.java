package com.bft.shumilkin.RegionsExtJS.Recipient;

import org.modelmapper.ModelMapper;
import ru.fss.integration.types.rpu.recipient.v01.RecipientInfoType;

public class RecipientConverter {

    public static RecipientDTO convertToDTO(RecipientInfoType info) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(info,RecipientDTO.class);
    }
}
