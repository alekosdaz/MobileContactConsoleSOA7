package gr.aueb.cf.mobilecontacts.serializer;

import gr.aueb.cf.mobilecontacts.dto.MobileContactReadOnlyDTO;

public class Serializer {

    private Serializer() {

    }

    public static String serializeDTO(MobileContactReadOnlyDTO readOnlyDTO) {
        return "ID:" + readOnlyDTO.getId() + ", Onoma: " + readOnlyDTO.getFirstname() + ", Epwnymo: "+ readOnlyDTO.getLastname() + ", Thl. : "+readOnlyDTO.getPhoneNumber();
    }
}
