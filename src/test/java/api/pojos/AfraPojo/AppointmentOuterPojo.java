package api.pojos.AfraPojo;

import io.cucumber.messages.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppointmentOuterPojo {
    //her key icin privite variable olustur

    /*
    {
    "createdBy": "hasta_team03",
    "createdDate": "2022-11-17T10:35:59.986727Z",
    "id": 306003,
    "startDate": "2022-11-18T00:00:00Z",
    "endDate": "2022-11-18T01:00:00Z",
    "status": "PENDING",
    "anamnesis": null,
    "treatment": null,
    "diagnosis": null,
    "prescription": null,
    "description": null,
    "physician": {
        }
    "patient": {
    },
    "ctests": null
}
     */
    public String createdBy;
    public String createdDate;
    public int id;
    public String startDate;
    public String endDate;
    public String status;
    public Object anamnesis;
    public Object treatment;
    public Object diagnosis;
    public Object prescription;
    public Object description;
    public AppointmentPysician physician;
    public AppointmentPtient patient;
    public Object ctests;

    public AppointmentOuterPojo() {
    }

    public AppointmentOuterPojo( int id, String startDate, String endDate, String status,
                                AppointmentPysician physician) {

        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.physician = physician;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public int getId() {
        return id;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getStatus() {
        return status;
    }

    public Object getAnamnesis() {
        return anamnesis;
    }

    public Object getTreatment() {
        return treatment;
    }

    public Object getDiagnosis() {
        return diagnosis;
    }

    public Object getPrescription() {
        return prescription;
    }

    public Object getDescription() {
        return description;
    }

    public AppointmentPysician getPhysician() {
        return physician;
    }

    public AppointmentPtient getPatient() {
        return patient;
    }

    public Object getCtests() {
        return ctests;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAnamnesis(Object anamnesis) {
        this.anamnesis = anamnesis;
    }

    public void setTreatment(Object treatment) {
        this.treatment = treatment;
    }

    public void setDiagnosis(Object diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setPrescription(Object prescription) {
        this.prescription = prescription;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setPhysician(AppointmentPysician physician) {
        this.physician = physician;
    }

    public void setPatient(AppointmentPtient patient) {
        this.patient = patient;
    }

    public void setCtests(Object ctests) {
        this.ctests = ctests;
    }

    @Override
    public String toString() {
        return "AppointmentOuterPojo{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", status='" + status + '\'' +
                ", anamnesis=" + anamnesis +
                ", treatment=" + treatment +
                ", diagnosis=" + diagnosis +
                ", prescription=" + prescription +
                ", description=" + description +
                ", physician=" + physician +
                ", patient=" + patient +
                ", ctests=" + ctests +
                '}';
    }
}
