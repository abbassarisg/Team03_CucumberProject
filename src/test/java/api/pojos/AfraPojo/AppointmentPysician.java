package api.pojos.AfraPojo;

import io.cucumber.messages.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppointmentPysician {
    public String createdBy;
    public String createdDate;
    public int id;
    public String firstName;
    public String lastName;
    public String birthDate;
    public String phone;
    public String gender;
    public String bloodGroup;
    public String adress;
    public String description;
    public AppointmentUserPysician user;
    public String speciality;
    public AppointmentCountryPysician country;
    public Object cstate;
    public int examFee;
    public String image;
    public Object imageContentType;

    public AppointmentPysician() {
    }

    public AppointmentPysician( String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

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

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getAdress() {
        return adress;
    }

    public String getDescription() {
        return description;
    }

    public AppointmentUserPysician getUser() {
        return user;
    }

    public String getSpeciality() {
        return speciality;
    }

    public AppointmentCountryPysician getCountry() {
        return country;
    }

    public Object getCstate() {
        return cstate;
    }

    public int getExamFee() {
        return examFee;
    }

    public String getImage() {
        return image;
    }

    public Object getImageContentType() {
        return imageContentType;
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

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUser(AppointmentUserPysician user) {
        this.user = user;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setCountry(AppointmentCountryPysician country) {
        this.country = country;
    }

    public void setCstate(Object cstate) {
        this.cstate = cstate;
    }

    public void setExamFee(int examFee) {
        this.examFee = examFee;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setImageContentType(Object imageContentType) {
        this.imageContentType = imageContentType;
    }

    @Override
    public String toString() {
        return "AppointmentPysician{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", adress='" + adress + '\'' +
                ", description='" + description + '\'' +
                ", user=" + user +
                ", speciality='" + speciality + '\'' +
                ", country=" + country +
                ", cstate=" + cstate +
                ", examFee=" + examFee +
                ", image='" + image + '\'' +
                ", imageContentType=" + imageContentType +
                '}'
                ;
    }
}

