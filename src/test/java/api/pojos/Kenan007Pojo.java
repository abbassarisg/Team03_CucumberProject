package api.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Kenan007Pojo {
    private int id;
    private int start_date;
    private int end_date;
    private String status;
    private String anamnesis;
    private String treatment;
    private String diagnosis;
    private String prescription;
    private String description;
    private int created_date;
    private String physician_id;
    private int patient_id;
    private String created_by;
    private String last_modified_by;
    private int last_modified_date;

    public Kenan007Pojo() {
    }

    public Kenan007Pojo(int id, int start_date, int end_date, String status, String anamnesis, String treatment, String diagnosis, String prescription, String description, int created_date, String physician_id, int patient_id, String created_by, String last_modified_by, int last_modified_date) {
        this.id = id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.status = status;
        this.anamnesis = anamnesis;
        this.treatment = treatment;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.description = description;
        this.created_date = created_date;
        this.physician_id = physician_id;
        this.patient_id = patient_id;
        this.created_by = created_by;
        this.last_modified_by = last_modified_by;
        this.last_modified_date = last_modified_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStart_date() {
        return start_date;
    }

    public void setStart_date(int start_date) {
        this.start_date = start_date;
    }

    public int getEnd_date() {
        return end_date;
    }

    public void setEnd_date(int end_date) {
        this.end_date = end_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCreated_date() {
        return created_date;
    }

    public void setCreated_date(int created_date) {
        this.created_date = created_date;
    }

    public String getPhysician_id() {
        return physician_id;
    }

    public void setPhysician_id(String physician_id) {
        this.physician_id = physician_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getLast_modified_by() {
        return last_modified_by;
    }

    public void setLast_modified_by(String last_modified_by) {
        this.last_modified_by = last_modified_by;
    }

    public int getLast_modified_date() {
        return last_modified_date;
    }

    public void setLast_modified_date(int last_modified_date) {
        this.last_modified_date = last_modified_date;
    }

    @Override
    public String toString() {
        return "Kenan007Pojo{" +
                "id=" + id +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", status='" + status + '\'' +
                ", anamnesis='" + anamnesis + '\'' +
                ", treatment='" + treatment + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", prescription='" + prescription + '\'' +
                ", description='" + description + '\'' +
                ", created_date=" + created_date +
                ", physician_id='" + physician_id + '\'' +
                ", patient_id=" + patient_id +
                ", created_by='" + created_by + '\'' +
                ", last_modified_by='" + last_modified_by + '\'' +
                ", last_modified_date=" + last_modified_date +
                '}';
    }



}

