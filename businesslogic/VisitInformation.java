package businesslogic;

import entity.Appointment;
import entity.Medicine;
import entity.VisitLogInformation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class VisitInformation {

    public void checkPatientNoOfFVisit(Long appointmentId, Map<Long, Appointment> appointmentMap,
                                       Map<Long, VisitLogInformation> visitDetails,
                                       List<Medicine> medicines, String doctorRecommendation,
                                       boolean followUpNeed) {

        VisitLogInformation visitInfo = new VisitLogInformation();
        visitInfo.setVisitId(GenerateVisitId.getVisitId(new ArrayList<Long>(visitDetails.keySet())));

        Iterator<Long> itr = visitDetails.keySet().iterator();
        VisitLogInformation visitLog = new VisitLogInformation();
        Long visit = 0l;
        while (itr.hasNext()) {
            visitLog = visitDetails.get(itr.next());

        }

    }
}
