package businesslogic;

import entity.Appointment;
import entity.Doctor;
import entity.Patient;
import java.util.Date;
import java.util.Map;

public class AppointmentBO {

    public void createAppointment(Long patientId, Map<Long, Patient> patientMap, Long doctorId, Map<Long, Doctor> doctorMap, Date d, String purposeOfVisit, Map<Long, Appointment> appointmentMap) throws Exception {

        if (patientId == null || patientId.longValue() == 0)
            throw new Exception();

        Boolean isPatientIdExist = false;
        for (Map.Entry<Long, Appointment> appointmentEntry : appointmentMap.entrySet()) {
            if (appointmentEntry.getValue().getPatient().getPatientId().equals(patientId)) {
                isPatientIdExist = true;
                Appointment appointment = new Appointment();

                appointment.setAppointmentId(16l);
                appointment.setPatient(patientMap.get(patientId));
                appointment.setPurposeOfVisit(purposeOfVisit);
                appointment.setDoctor(doctorMap.get(doctorId));
                appointment.setDateOfVisit(d);
                appointment.setIsFirstVisit(false);
                appointmentMap.put(appointment.getAppointmentId(), appointment);

            }
            if (!patientMap.containsKey(patientId)) {
                Patient patient = new Patient();
                patient.setPatientId(patientId);
                patient.setPatientName("Ravi");
                patient.setPatientType("OP");
                patient.setAddress("chennai");
                patient.setPhoneNumber("9876545980");

                patientMap.put(patient.getPatientId(), patient);

            }
        }
    }
}
