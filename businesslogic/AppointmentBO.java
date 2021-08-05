package businesslogic;

import entity.Appointment;
import entity.Doctor;
import entity.Patient;

import java.util.*;

public class AppointmentBO {


    public Appointment createAppointment(Long patientId, Map<Long, Patient> patientMap, Long doctorId,
                                         Map<Long, Doctor> doctorMap, Date d, String purposeOfVisit,
                                         Map<Long, Appointment> appointmentMap) {

        Appointment newAppointment = new Appointment();
        newAppointment.setPurposeOfVisit(purposeOfVisit);
        newAppointment.setDoctor(doctorMap.get(doctorId));
        newAppointment.setPatient(patientMap.get(patientId));

        appointmentMap.put(newAppointment.getAppointmentId(), newAppointment);

        Iterator<Long> itr = appointmentMap.keySet().iterator();
        Long appointmentId = 0l;
        while (itr.hasNext()) {
            appointmentId = itr.next();
            newAppointment = appointmentMap.get(appointmentId);
            if (newAppointment.getPatient() != null && newAppointment.getPatient().getPatientId() == appointmentId) {
                newAppointment.setIsFirstVisit(false);
            } else {
                newAppointment.setIsFirstVisit(true);
            }
        }

        return newAppointment;
    }

}
