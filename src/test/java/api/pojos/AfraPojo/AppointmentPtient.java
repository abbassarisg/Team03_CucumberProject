package api.pojos.AfraPojo;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppointmentPtient {
    public String createdBy;
    public String createdDate;
    public int id;
    public String firstName;
    public String lastName;
    public Object birthDate;
    public String phone;
    public Object gender;
    public Object bloodGroup;
    public Object adress;
    public String email;
    public Object description;
    public AppointmentUserPatient user;
    public Object inPatients;
    public Object country;
    public Object cstate;

    public AppointmentPtient() {
    }

    public AppointmentPtient(String createdBy, String createdDate, int id, String firstName, String lastName,
                             Object birthDate, String phone, Object gender, Object bloodGroup, Object adress, String email,
                             Object description, AppointmentUserPatient user, Object inPatients, Object country,
                             Object cstate) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.adress = adress;
        this.email = email;
        this.description = description;
        this.user = user;
        this.inPatients = inPatients;
        this.country = country;
        this.cstate = cstate;
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Object getBirthDate() {
        return birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public Object getGender() {
        return gender;
    }

    public Object getBloodGroup() {
        return bloodGroup;
    }

    public Object getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }

    public Object getDescription() {
        return description;
    }

    public AppointmentUserPatient getUser() {
        return user;
    }

    public Object getInPatients() {
        return inPatients;
    }

    public Object getCountry() {
        return country;
    }

    public Object getCstate() {
        return cstate;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(Object birthDate) {
        this.birthDate = birthDate;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public void setBloodGroup(Object bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setAdress(Object adress) {
        this.adress = adress;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public void setUser(AppointmentUserPatient user) {
        this.user = user;
    }

    public void setInPatients(Object inPatients) {
        this.inPatients = inPatients;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public void setCstate(Object cstate) {
        this.cstate = cstate;
    }

    @Override
    public String toString() {
        return "AppointmentPtient{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", phone='" + phone + '\'' +
                ", gender=" + gender +
                ", bloodGroup=" + bloodGroup +
                ", adress=" + adress +
                ", email='" + email + '\'' +
                ", description=" + description +
                ", user=" + user +
                ", inPatients=" + inPatients +
                ", country=" + country +
                ", cstate=" + cstate +
                '}';
    }
}
