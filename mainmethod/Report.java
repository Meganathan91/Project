package mainmethod;
import entity.*;
import java.util.*;

public class Report {

    private static Map<Long, Hospital> hospitalDetails;
    private static Hospital hospital;

    private static Map<Long, Doctor> doctorDetails;
    private static Doctor cardiologistDoctor;
    private static Doctor orthopedicDoctor;
    private static Doctor dentistDoctor;
    private static Doctor neurologistDoctor;
    private static Doctor pulmonologistDoctor;

    private static Map<Long, Patient> patientDetail;
    private static Patient patientSelvam;
    private static Patient patientRagu;
    private static Patient patientVimal;
    private static Patient patientAnu;
    private static Patient patientMohan;
    private static Patient patientRajini;
    private static Patient patientSomu;
    private static Patient patientSelvi;

    private static Map<Long,Appointment> appointmentDetails;
    private static Appointment appointmentOne;
    private static Appointment appointmentTwo;
    private static Appointment appointmentThree;
    private static Appointment appointmentFour;
    private static Appointment appointmentFive;

    private static Map<Long, Medicine> medicineDetails;
    private static Medicine medicineForCardiologist;
    private static Medicine medicineForOrthopedic;
    private static Medicine medicineForDentist;
    private static Medicine medicineForNeurologist;
    private static Medicine medicineForPulmonologist;

    static {
        hospital = new Hospital();
        hospital.setHospitalId(1l);
        hospital.setHospitalName("Kauvery");
        hospital.setHospitalLocation("Chennai");

        hospitalDetails = new HashMap<>();
        hospitalDetails.put(hospital.getHospitalId(), hospital);

        cardiologistDoctor = new Doctor();
        cardiologistDoctor.setDoctorId(1l);
        cardiologistDoctor.setDoctorName("Rahim");
        cardiologistDoctor.setSpecialisation("Cardiologists");

        orthopedicDoctor = new Doctor();
        orthopedicDoctor.setDoctorId(2l);
        orthopedicDoctor.setDoctorName("Vishal");
        orthopedicDoctor.setSpecialisation("Orthopedic");

        dentistDoctor = new Doctor();
        dentistDoctor.setDoctorId(3l);
        dentistDoctor.setDoctorName("Suganya");
        dentistDoctor.setSpecialisation("Dentist");

        neurologistDoctor = new Doctor();
        neurologistDoctor.setDoctorId(4l);
        neurologistDoctor.setDoctorName("Anu");
        neurologistDoctor.setSpecialisation("Neurologist");

        pulmonologistDoctor = new Doctor();
        pulmonologistDoctor.setDoctorId(5l);
        pulmonologistDoctor.setDoctorName("VelRaj");
        pulmonologistDoctor.setSpecialisation("Pulmonologist");

        doctorDetails = new HashMap<>();
        doctorDetails.put(cardiologistDoctor.getDoctorId(), cardiologistDoctor);
        doctorDetails.put(orthopedicDoctor.getDoctorId(), orthopedicDoctor);
        doctorDetails.put(dentistDoctor.getDoctorId(), dentistDoctor);
        doctorDetails.put(neurologistDoctor.getDoctorId(), neurologistDoctor);
        doctorDetails.put(pulmonologistDoctor.getDoctorId(), pulmonologistDoctor);

        patientSelvam = new Patient();
        patientSelvam.setPatientId(1l);
        patientSelvam.setPatientName("Selvam");
        patientSelvam.setDob(new Date(1999/10/29));
        patientSelvam.setPhoneNumber("9870654320");
        patientSelvam.setAddress("trichy");
        patientSelvam.setPatientType("OP");

        patientRagu = new Patient();
        patientRagu.setPatientId(2l);
        patientRagu.setPatientName("Ragu");
        patientRagu.setDob(new Date(1989/07/23));
        patientRagu.setPhoneNumber("7639238764");
        patientRagu.setAddress("Chennai");
        patientRagu.setPatientType("OP");

        patientVimal = new Patient();
        patientVimal.setPatientId(3l);
        patientVimal.setPatientName("Vimal");
        patientVimal.setDob(new Date(1978/02/20));
        patientVimal.setPhoneNumber("9790654302");
        patientVimal.setAddress("Salem");
        patientVimal.setPatientType("OP");

        patientAnu = new Patient();
        patientAnu.setPatientId(4l);
        patientAnu.setPatientName("Anu");
        patientAnu.setDob(new Date(2000/07/10));
        patientAnu.setPhoneNumber("9790654320");
        patientAnu.setAddress("Thanjavur");
        patientAnu.setPatientType("OP");

        patientMohan = new Patient();
        patientMohan.setPatientId(5l);
        patientMohan.setPatientName("Mohan");
        patientMohan.setDob(new Date(1991/01/01));
        patientMohan.setPhoneNumber("9500768912");
        patientMohan.setAddress("kumbakonam");
        patientMohan.setPatientType("IP");

        patientRajini = new Patient();
        patientRajini.setPatientId(6l);
        patientRajini.setPatientName("Rajini");
        patientRajini.setDob(new Date(1996/06/19));
        patientRajini.setPhoneNumber("6345876301");
        patientRajini.setAddress("Madurai");
        patientRajini.setPatientType("IP");

        patientSomu = new Patient();
        patientSomu.setPatientId(7l);
        patientSomu.setPatientName("Somu");
        patientSomu.setDob(new Date(2000/02/11));
        patientSomu.setAddress("Ariyalur");
        patientSomu.setPhoneNumber("9790238764");
        patientSomu.setPatientType("IP");

        patientSelvi = new Patient();
        patientSelvi.setPatientId(8l);
        patientSelvi.setPatientName("Selvi");
        patientSelvi.setDob(new Date(1990/11/18));
        patientSelvi.setAddress("Karur");
        patientSelvi.setPhoneNumber("7639128707");
        patientSelvi.setPatientType("IP");

        patientDetail = new HashMap<>();
        patientDetail.put(patientSelvam.getPatientId(),patientSelvam);
        patientDetail.put(patientRagu.getPatientId(),patientRagu);
        patientDetail.put(patientVimal.getPatientId(),patientVimal);
        patientDetail.put(patientAnu.getPatientId(),patientAnu);
        patientDetail.put(patientMohan.getPatientId(),patientMohan);
        patientDetail.put(patientRajini.getPatientId(),patientRajini);
        patientDetail.put(patientSomu.getPatientId(),patientSomu);
        patientDetail.put(patientSelvi.getPatientId(),patientSelvi);

        appointmentOne = new Appointment();
        appointmentOne.setAppointmentId(1l);
        appointmentOne.setDoctor(doctorDetails.get(1));
        appointmentOne.setPatient(patientDetail.get(1));
        appointmentOne.setDateOfVisit(new Date(2021/01/10));
        appointmentOne.setPurposeOfVisit("HeartPain");
        appointmentOne.setBp(120.5);
        appointmentOne.setTemperature(90.5);
        appointmentOne.setIsFirstVisit(true);

        appointmentTwo = new Appointment();
        appointmentTwo.setAppointmentId(2l);
        appointmentTwo.setDoctor(doctorDetails.get(2));
        appointmentTwo.setPatient(patientDetail.get(2));
        appointmentTwo.setDateOfVisit(new Date(2021/06/15));
        appointmentTwo.setPurposeOfVisit("PonesPain");
        appointmentTwo.setBp(140.7);
        appointmentTwo.setTemperature(89.1);
        appointmentTwo.setIsFirstVisit(true);

        appointmentThree = new Appointment();
        appointmentThree.setAppointmentId(3l);
        appointmentThree.setDoctor(doctorDetails.get(3));
        appointmentThree.setPatient(patientDetail.get(3));
        appointmentThree.setDateOfVisit(new Date(2021/01/10));
        appointmentThree.setPurposeOfVisit("TeethPain");
        appointmentThree.setBp(135.3);
        appointmentThree.setTemperature(81.4);
        appointmentThree.setIsFirstVisit(true);

        appointmentFour = new Appointment();
        appointmentFour.setAppointmentId(4l);
        appointmentFour.setDoctor(doctorDetails.get(4));
        appointmentFour.setPatient(patientDetail.get(4));
        appointmentFour.setDateOfVisit(new Date(2021/01/10));
        appointmentFour.setPurposeOfVisit("Headaches");
        appointmentFour.setBp(154.4);
        appointmentFour.setTemperature(79.5);
        appointmentFour.setIsFirstVisit(true);

        appointmentFive = new Appointment();
        appointmentFive.setAppointmentId(5l);
        appointmentFive.setDoctor(doctorDetails.get(5));
        appointmentFive.setPatient(patientDetail.get(5));
        appointmentFive.setDateOfVisit(new Date(2021/01/10));
        appointmentFive.setPurposeOfVisit("HeartPain");
        appointmentFive.setBp(120.5);
        appointmentFive.setTemperature(90.5);
        appointmentFive.setIsFirstVisit(true);

        appointmentDetails = new HashMap<>();
        appointmentDetails.put(appointmentOne.getAppointmentId(), appointmentOne);
        appointmentDetails.put(appointmentTwo.getAppointmentId(), appointmentTwo);
        appointmentDetails.put(appointmentThree.getAppointmentId(), appointmentThree);
        appointmentDetails.put(appointmentFour.getAppointmentId(), appointmentFour);
        appointmentDetails.put(appointmentFive.getAppointmentId(), appointmentFive);

        medicineForCardiologist = new Medicine();
        medicineForCardiologist.setMedicineId(1l);
        medicineForCardiologist.setPurposeOfMedicine("HeartPain");
        medicineForCardiologist.setBatchNumber("ASPN23");
        medicineForCardiologist.setMedicineName("Aspirin");
        medicineForCardiologist.setExpiryDate(new Date(2025/05/31));



    }
}
