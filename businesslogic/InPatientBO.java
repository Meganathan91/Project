package businesslogic;

import entity.Bed;
import entity.InPatient;

import java.util.Map;

public class InPatientBO {

    public void allocateBedForINPatient(Long inPatientId, Map<Long, InPatient> inPatientDetails,
                                        Map<Long, Bed> bedDetails, String simpleBed, String patientRoom) throws Exception {

        if (inPatientId == null) {
            throw new Exception("InValid InPatient Id : ");
        }
        if (inPatientDetails.isEmpty()) {
            throw new Exception("InPatient Details is Empty : ");
        }
        if (bedDetails.isEmpty()) {
            throw new Exception("Bed Is Not Available : ");
        }

        if (simpleBed == null) {
            throw new Exception("given value is null");
        }
        if (patientRoom == null) {
            throw new Exception("given value is null");
        }

        InPatient inPatient = null;
        if (inPatientDetails.containsKey(inPatientId)) {
             inPatient = inPatientDetails.get(inPatientId);
        }

        inPatient.setPatientId(inPatientId);
        //inPatient.setIpIdentificationNumber();


    }

}
