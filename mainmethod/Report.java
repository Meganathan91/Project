package mainmethod;

import businesslogic.AppointmentBO;
import businesslogic.VisitInformation;
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

    private static Map<Long, Patient> patientDetails;
    private static Patient patientSelvam;
    private static Patient patientRagu;
    private static Patient patientVimal;
    private static Patient patientAnu;
    private static Patient patientMohan;
    private static Patient patientRajini;
    private static Patient patientSomu;
    private static Patient patientSelvi;

    private static Map<Long, Appointment> appointmentDetails;
    private static Appointment appointmentOne;
    private static Appointment appointmentTwo;
    private static Appointment appointmentThree;
    private static Appointment appointmentFour;
    private static Appointment appointmentFive;
    private static Appointment appointmentSix;
    private static Appointment appointmentSeven;
    private static Appointment appointmentEight;
    private static Appointment appointmentNine;
    private static Appointment appointmentTen;
    private static Appointment appointmentEleven;
    private static Appointment appointmentTwelve;
    private static Appointment appointmentThirteen;
    private static Appointment appointmentFourteen;

    private static Map<Long, Medicine> medicineDetails;
    private static Medicine medicineForCardiologist;
    private static Medicine medicineForOrthopedic;
    private static Medicine medicineForDentist;
    private static Medicine medicineForNeurologist;
    private static Medicine medicineForPulmonologist;

    private static Map<Long, VisitLogInformation> visitDetails;
    private static VisitLogInformation heartCheckUp;
    private static VisitLogInformation boneCheckUp;
    private static VisitLogInformation teethCheckUp;
    private static VisitLogInformation brainCheckUp;
    private static VisitLogInformation lungCheckUp;

    private static List<Medicine> medicineList;
    private static Medicine medicine;

    static Date d = new Date();

    static {

        hospitalDetails = new HashMap<>();

        hospital = new Hospital();
        hospital.setHospitalId(1l);
        hospital.setHospitalName("Kauvery");
        hospital.setHospitalLocation("Chennai");

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

        Date d1 = new Date(2323278232L);
        patientSelvam = new Patient();
        patientSelvam.setPatientId(1l);
        patientSelvam.setPatientName("Selvam");
        patientSelvam.setDob(d1);
        patientSelvam.setPhoneNumber("9870654320");
        patientSelvam.setAddress("trichy");
        patientSelvam.setPatientType("OP");

        Date d2 = new Date(2335234543L);
        patientRagu = new Patient();
        patientRagu.setPatientId(2l);
        patientRagu.setPatientName("Ragu");
        patientRagu.setDob(d2);
        patientRagu.setPhoneNumber("7639238764");
        patientRagu.setAddress("Chennai");
        patientRagu.setPatientType("OP");


        Date d3 = new Date(2323032323L);
        patientVimal = new Patient();
        patientVimal.setPatientId(3l);
        patientVimal.setPatientName("Vimal");
        patientVimal.setDob(d3);
        patientVimal.setPhoneNumber("9790654302");
        patientVimal.setAddress("Salem");
        patientVimal.setPatientType("OP");

        Date d4 = new Date(2322381323L);
        patientAnu = new Patient();
        patientAnu.setPatientId(4l);
        patientAnu.setPatientName("Anu");
        patientAnu.setDob(d4);
        patientAnu.setPhoneNumber("9790654320");
        patientAnu.setAddress("Thanjavur");
        patientAnu.setPatientType("OP");

        Date d5 = new Date(2367223877L);
        patientMohan = new Patient();
        patientMohan.setPatientId(5l);
        patientMohan.setPatientName("Mohan");
        patientMohan.setDob(d5);
        patientMohan.setPhoneNumber("9500768912");
        patientMohan.setAddress("kumbakonam");
        patientMohan.setPatientType("OP");

        Date d6 = new Date(230753223232L);
        patientRajini = new Patient();
        patientRajini.setPatientId(6l);
        patientRajini.setPatientName("Rajini");
        patientRajini.setDob(d6);
        patientRajini.setPhoneNumber("6345876301");
        patientRajini.setAddress("Madurai");
        patientRajini.setPatientType("OP");

        Date d7 = new Date(2309122332L);
        patientSomu = new Patient();
        patientSomu.setPatientId(7l);
        patientSomu.setPatientName("Somu");
        patientSomu.setDob(d7);
        patientSomu.setAddress("Ariyalur");
        patientSomu.setPhoneNumber("9790238764");
        patientSomu.setPatientType("OP");

        Date d8 = new Date(2123223232L);
        patientSelvi = new Patient();
        patientSelvi.setPatientId(8l);
        patientSelvi.setPatientName("Selvi");
        patientSelvi.setDob(d8);
        patientSelvi.setAddress("Karur");
        patientSelvi.setPhoneNumber("7639128707");
        patientSelvi.setPatientType("OP");

        patientDetails = new HashMap<>();
        patientDetails.put(patientSelvam.getPatientId(), patientSelvam);
        patientDetails.put(patientRagu.getPatientId(), patientRagu);
        patientDetails.put(patientVimal.getPatientId(), patientVimal);
        patientDetails.put(patientAnu.getPatientId(), patientAnu);
        patientDetails.put(patientMohan.getPatientId(), patientMohan);
        patientDetails.put(patientRajini.getPatientId(), patientRajini);
        patientDetails.put(patientSomu.getPatientId(), patientSomu);
        patientDetails.put(patientSelvi.getPatientId(), patientSelvi);

        appointmentOne = new Appointment();
        appointmentOne.setAppointmentId(1l);
        appointmentOne.setDoctor(doctorDetails.get(1l));
        appointmentOne.setPatient(patientDetails.get(1l));
        appointmentOne.setDateOfVisit(new Date(2021 / 05 / 10));
        appointmentOne.setPurposeOfVisit("HeartPain");
        appointmentOne.setBp(120.5);
        appointmentOne.setTemperature(90.5);
        appointmentOne.setIsFirstVisit(false);

        appointmentTwo = new Appointment();
        appointmentTwo.setAppointmentId(2l);
        appointmentTwo.setDoctor(doctorDetails.get(2l));
        appointmentTwo.setPatient(patientDetails.get(2l));
        appointmentTwo.setDateOfVisit(new Date(2021 / 06 / 15));
        appointmentTwo.setPurposeOfVisit("BonesPain");
        appointmentTwo.setBp(140.7);
        appointmentTwo.setTemperature(89.1);
        appointmentTwo.setIsFirstVisit(false);

        appointmentThree = new Appointment();
        appointmentThree.setAppointmentId(3l);
        appointmentThree.setDoctor(doctorDetails.get(3l));
        appointmentThree.setPatient(patientDetails.get(3l));
        appointmentThree.setDateOfVisit(new Date(2021 / 04 / 17));
        appointmentThree.setPurposeOfVisit("TeethPain");
        appointmentThree.setBp(135.3);
        appointmentThree.setTemperature(81.4);
        appointmentThree.setIsFirstVisit(true);

        appointmentFour = new Appointment();
        appointmentFour.setAppointmentId(4l);
        appointmentFour.setDoctor(doctorDetails.get(4l));
        appointmentFour.setPatient(patientDetails.get(4l));
        appointmentFour.setDateOfVisit(new Date(2021 / 01 / 07));
        appointmentFour.setPurposeOfVisit("Headaches");
        appointmentFour.setBp(154.4);
        appointmentFour.setTemperature(79.5);
        appointmentFour.setIsFirstVisit(false);

        appointmentFive = new Appointment();
        appointmentFive.setAppointmentId(5l);
        appointmentFive.setDoctor(doctorDetails.get(5l));
        appointmentFive.setPatient(patientDetails.get(5l));
        appointmentFive.setDateOfVisit(new Date(2021 / 03 / 19));
        appointmentFive.setPurposeOfVisit("LungCancer");
        appointmentFive.setBp(120.5);
        appointmentFive.setTemperature(90.5);
        appointmentFive.setIsFirstVisit(true);

        appointmentSix = new Appointment();
        appointmentSix.setAppointmentId(6l);
        appointmentSix.setDoctor(doctorDetails.get(1l));
        appointmentSix.setPatient(patientDetails.get(1l));
        appointmentSix.setDateOfVisit(new Date(2021 / 05 / 17));
        appointmentSix.setPurposeOfVisit("HeartPain");
        appointmentSix.setBp(110.5);
        appointmentSix.setTemperature(80.5);
        appointmentSix.setIsFirstVisit(false);

        appointmentSeven = new Appointment();
        appointmentSeven.setAppointmentId(7l);
        appointmentSeven.setDoctor(doctorDetails.get(1l));
        appointmentSeven.setPatient(patientDetails.get(1l));
        appointmentSeven.setDateOfVisit(new Date(2021 / 05 / 25));
        appointmentSeven.setPurposeOfVisit("HeartPain");
        appointmentSeven.setBp(120.7);
        appointmentSeven.setTemperature(76.1);
        appointmentSeven.setIsFirstVisit(false);

        appointmentEight = new Appointment();
        appointmentEight.setAppointmentId(8l);
        appointmentEight.setDoctor(doctorDetails.get(1l));
        appointmentEight.setPatient(patientDetails.get(1l));
        appointmentEight.setDateOfVisit(new Date(2021 / 06 / 05));
        appointmentEight.setPurposeOfVisit("HeartPain");
        appointmentEight.setBp(135.3);
        appointmentEight.setTemperature(81.4);
        appointmentEight.setIsFirstVisit(false);

        appointmentNine = new Appointment();
        appointmentNine.setAppointmentId(9l);
        appointmentNine.setDoctor(doctorDetails.get(2l));
        appointmentNine.setPatient(patientDetails.get(2l));
        appointmentNine.setDateOfVisit(new Date(2021 / 06 / 22));
        appointmentNine.setPurposeOfVisit("BonesPain");
        appointmentNine.setBp(154.4);
        appointmentNine.setTemperature(79.5);
        appointmentNine.setIsFirstVisit(false);

        appointmentTen = new Appointment();
        appointmentTen.setAppointmentId(10l);
        appointmentTen.setDoctor(doctorDetails.get(2l));
        appointmentTen.setPatient(patientDetails.get(2l));
        appointmentTen.setDateOfVisit(new Date(2021 / 07 / 02));
        appointmentTen.setPurposeOfVisit("BonesPain");
        appointmentTen.setBp(120.5);
        appointmentTen.setTemperature(90.5);
        appointmentTen.setIsFirstVisit(false);

        appointmentEleven = new Appointment();
        appointmentEleven.setAppointmentId(11l);
        appointmentEleven.setDoctor(doctorDetails.get(2l));
        appointmentEleven.setPatient(patientDetails.get(2l));
        appointmentEleven.setDateOfVisit(new Date(2021 / 05 / 10));
        appointmentEleven.setPurposeOfVisit("BonesPain");
        appointmentEleven.setBp(135.5);
        appointmentEleven.setTemperature(76.5);
        appointmentEleven.setIsFirstVisit(false);

        appointmentTwelve = new Appointment();
        appointmentTwelve.setAppointmentId(12l);
        appointmentTwelve.setDoctor(doctorDetails.get(2l));
        appointmentTwelve.setPatient(patientDetails.get(2l));
        appointmentTwelve.setDateOfVisit(new Date(2021 / 06 / 15));
        appointmentTwelve.setPurposeOfVisit("BonesPain");
        appointmentTwelve.setBp(140.7);
        appointmentTwelve.setTemperature(89.1);
        appointmentTwelve.setIsFirstVisit(false);

        appointmentThirteen = new Appointment();
        appointmentThirteen.setAppointmentId(13l);
        appointmentThirteen.setDoctor(doctorDetails.get(3l));
        appointmentThirteen.setPatient(patientDetails.get(3l));
        appointmentThirteen.setDateOfVisit(new Date(2021 / 04 / 17));
        appointmentThirteen.setPurposeOfVisit("TeethPain");
        appointmentThirteen.setBp(135.3);
        appointmentThirteen.setTemperature(81.4);
        appointmentThirteen.setIsFirstVisit(false);

        appointmentFourteen = new Appointment();
        appointmentFourteen.setAppointmentId(14l);
        appointmentFourteen.setDoctor(doctorDetails.get(4l));
        appointmentFourteen.setPatient(patientDetails.get(4l));
        appointmentFourteen.setDateOfVisit(new Date(2021 / 01 / 07));
        appointmentFourteen.setPurposeOfVisit("Headaches");
        appointmentFourteen.setBp(154.4);
        appointmentFourteen.setTemperature(79.5);
        appointmentFourteen.setIsFirstVisit(false);

        appointmentDetails = new HashMap<>();
        appointmentDetails.put(appointmentOne.getAppointmentId(), appointmentOne);
        appointmentDetails.put(appointmentTwo.getAppointmentId(), appointmentTwo);
        appointmentDetails.put(appointmentThree.getAppointmentId(), appointmentThree);
        appointmentDetails.put(appointmentFour.getAppointmentId(), appointmentFour);
       // appointmentDetails.put(appointmentFive.getAppointmentId(), appointmentFive);
        appointmentDetails.put(appointmentSix.getAppointmentId(), appointmentSix);
        appointmentDetails.put(appointmentSeven.getAppointmentId(), appointmentSeven);
        appointmentDetails.put(appointmentEight.getAppointmentId(), appointmentEight);
        appointmentDetails.put(appointmentNine.getAppointmentId(), appointmentNine);
        appointmentDetails.put(appointmentTen.getAppointmentId(), appointmentTen);
        appointmentDetails.put(appointmentEleven.getAppointmentId(), appointmentEleven);
        appointmentDetails.put(appointmentTwelve.getAppointmentId(), appointmentTwelve);
        appointmentDetails.put(appointmentThirteen.getAppointmentId(), appointmentThirteen);
        appointmentDetails.put(appointmentFourteen.getAppointmentId(), appointmentFourteen);

        Date d9 = new Date(2723223232l);
        medicineForCardiologist = new Medicine();
        medicineForCardiologist.setMedicineId(1l);
        medicineForCardiologist.setPurposeOfMedicine("HeartPain");
        medicineForCardiologist.setMedicineName("Aspirin");
        medicineForCardiologist.setBatchNumber("a01");
        medicineForCardiologist.setExpiryDate(d9);

        Date d10 = new Date(2323289232l);
        medicineForOrthopedic = new Medicine();
        medicineForOrthopedic.setMedicineId(2l);
        medicineForOrthopedic.setPurposeOfMedicine("BonesPain");
        medicineForOrthopedic.setMedicineName("Methocarbamol");
        medicineForOrthopedic.setBatchNumber("m02");
        medicineForOrthopedic.setExpiryDate(d10);

        Date d11 = new Date(2323223232l);
        medicineForDentist = new Medicine();
        medicineForDentist.setMedicineId(3l);
        medicineForDentist.setPurposeOfMedicine("TeethPain");
        medicineForDentist.setMedicineName("Clindamycin");
        medicineForDentist.setBatchNumber("c03");
        medicineForDentist.setExpiryDate(d11);

        Date d12 = new Date(23786223232l);
        medicineForNeurologist = new Medicine();
        medicineForNeurologist.setMedicineId(4l);
        medicineForNeurologist.setPurposeOfMedicine("BrainPain");
        medicineForNeurologist.setMedicineName("Lamotrigine");
        medicineForNeurologist.setBatchNumber("l04");
        medicineForNeurologist.setExpiryDate(d12);

        String d13 = "12/09/2000";
        medicineForPulmonologist = new Medicine();
        medicineForPulmonologist.setMedicineId(5l);
        medicineForPulmonologist.setPurposeOfMedicine("lung cancer");
        medicineForPulmonologist.setMedicineName("ciclesonide");
        medicineForPulmonologist.setBatchNumber("c05");
        medicineForPulmonologist.setExpiryDate(new Date(d13));

        medicineDetails = new HashMap<>();
        medicineDetails.put(medicineForCardiologist.getMedicineId(), medicineForCardiologist);
        medicineDetails.put(medicineForOrthopedic.getMedicineId(), medicineForOrthopedic);
        medicineDetails.put(medicineForDentist.getMedicineId(), medicineForDentist);
        medicineDetails.put(medicineForNeurologist.getMedicineId(), medicineForNeurologist);
        medicineDetails.put(medicineForPulmonologist.getMedicineId(), medicineForPulmonologist);

    }

    static public List<Medicine> getMedicine() {

        medicineList = new ArrayList<>();

        Random random = new Random();
        int randomNumber;
        for (int i = 0; i < 3; i++) {
            randomNumber = random.nextInt(5);
            if (medicineDetails.containsKey(new Long(randomNumber)))
                medicineList.add(medicineDetails.get(new Long(randomNumber)));
        }

        return medicineList;
    }

    static public void populateVisitInformation() {
        heartCheckUp = new VisitLogInformation();
        heartCheckUp.setVisitId(1l);
        heartCheckUp.setAppointment(appointmentDetails.get(1l));
        heartCheckUp.setDoctorRecommendation("any little pain visit again");
        heartCheckUp.setFollowUpNeed(true);
        heartCheckUp.setListOfMedicine(getMedicine());

        boneCheckUp = new VisitLogInformation();
        boneCheckUp.setVisitId(2l);
        boneCheckUp.setAppointment(appointmentDetails.get(2l));
        boneCheckUp.setDoctorRecommendation("Every week come for check up");
        boneCheckUp.setFollowUpNeed(true);
        boneCheckUp.setListOfMedicine(getMedicine());

        teethCheckUp = new VisitLogInformation();
        teethCheckUp.setVisitId(3l);
        teethCheckUp.setAppointment(appointmentDetails.get(3l));
        teethCheckUp.setDoctorRecommendation("Brush carefully and gently along your gum line");
        teethCheckUp.setFollowUpNeed(false);
        teethCheckUp.setListOfMedicine(getMedicine());

        brainCheckUp = new VisitLogInformation();
        brainCheckUp.setVisitId(4l);
        brainCheckUp.setAppointment(appointmentDetails.get(4l));
        brainCheckUp.setDoctorRecommendation("Seek immediately take scan");
        brainCheckUp.setFollowUpNeed(true);
        brainCheckUp.setListOfMedicine(getMedicine());

        lungCheckUp = new VisitLogInformation();
        lungCheckUp.setVisitId(5l);
        lungCheckUp.setAppointment(appointmentDetails.get(5l));
        lungCheckUp.setDoctorRecommendation("breathe issue visit immediately and take scan");
        lungCheckUp.setFollowUpNeed(true);
        lungCheckUp.setListOfMedicine(getMedicine());

        visitDetails = new HashMap<>();
        visitDetails.put(heartCheckUp.getVisitId(), heartCheckUp);
        visitDetails.put(boneCheckUp.getVisitId(), boneCheckUp);
        visitDetails.put(teethCheckUp.getVisitId(), teethCheckUp);
        visitDetails.put(brainCheckUp.getVisitId(), brainCheckUp);
        visitDetails.put(lungCheckUp.getVisitId(), lungCheckUp);

    }

    public static void main(String[] args) {

        populateVisitInformation();

        AppointmentBO appointmentBO = new AppointmentBO();
        try {
            Appointment appointment = appointmentBO.createAppointment(5l, patientDetails, 5l, doctorDetails,
                    Calendar.getInstance().getTime(), "Bone Pain", appointmentDetails);

            System.out.println(" New Appointment Details : " + appointment);
        } catch (Exception e) {
            System.out.println(" Patient id is null: "+e.getMessage());
        }

        VisitInformation visitInformation = new VisitInformation();
        visitInformation.checkPatientNoOfFVisit(2l, appointmentDetails, visitDetails, medicineList,
                                                "TeethPain", true);
    }
}
