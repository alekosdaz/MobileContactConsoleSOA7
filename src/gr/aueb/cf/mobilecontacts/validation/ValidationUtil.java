package gr.aueb.cf.mobilecontacts.validation;

import gr.aueb.cf.mobilecontacts.dto.MobileContactInsertDTO;
import gr.aueb.cf.mobilecontacts.dto.MobileContactUpdateDTO;

public class ValidationUtil {


    private ValidationUtil() {

    }

    public static String validateDTO (MobileContactInsertDTO insertDTO) {
        String errorResponse = "";

        if (insertDTO.getPhoneNumber().length() <= 5)
            errorResponse += "Phone number must be greater than 5 digits";
        if (insertDTO.getFirstname().length() < 2)
            errorResponse += "To onoma prepei na periexei 2 h perisoteroys xaraktires";
        if (insertDTO.getLastname().length() < 2)
            errorResponse += "To eponymo prepei na periexei 2 h perisoterous xaraktires";

        return errorResponse;

    }

    public static String validateDTO (MobileContactUpdateDTO updateDTO) {
        String errorResponse = "";

        if (updateDTO.getPhoneNumber().length() <= 5)
            errorResponse += "Phone number must be greater than 5 digits.\n";
        if (updateDTO.getFirstname().length() < 2)
            errorResponse += "To onoma prepei na periexei 2 h perisoteroys xaraktires.\n";
        if (updateDTO.getLastname().length() < 2)
            errorResponse += "To eponymo prepei na periexei 2 h perisoterous xaraktires.\n";

        return errorResponse;

    }
}
