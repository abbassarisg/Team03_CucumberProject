package api.pojos.AfraPojo;

import io.cucumber.messages.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppointmentUserPatient {
    /*
    "user": {
            "createdBy": "hasta_team03",
            "createdDate": "2022-11-17T10:35:59.986156Z",
            "id": 305956,
            "login": "user_112233445_56677889991668681359877",
            "firstName": "afra",
            "lastName": "hasta",
            "email": "hastaafra@gmail.com",
            "activated": false,
            "langKey": null,
            "imageUrl": null,
            "resetDate": null,
            "ssn": "567-87-7654"
        }
     */
    public String createdBy;
    public String createdDate;
    public int id;
    public String login;
    public String firstName;
    public String lastName;
    public String email;
    public boolean activated;
    public Object langKey;
    public Object imageUrl;
    public Object resetDate;
    public String ssn;

    public AppointmentUserPatient() {
    }

    public AppointmentUserPatient(String createdBy, String createdDate, int id, String login, String firstName,
                                  String lastName, String email, boolean activated, Object langKey, Object imageUrl,
                                  Object resetDate, String ssn) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.activated = activated;
        this.langKey = langKey;
        this.imageUrl = imageUrl;
        this.resetDate = resetDate;
        this.ssn = ssn;
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

    public String getLogin() {
        return login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActivated() {
        return activated;
    }

    public Object getLangKey() {
        return langKey;
    }

    public Object getImageUrl() {
        return imageUrl;
    }

    public Object getResetDate() {
        return resetDate;
    }

    public String getSsn() {
        return ssn;
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

    public void setLogin(String login) {
        this.login = login;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public void setLangKey(Object langKey) {
        this.langKey = langKey;
    }

    public void setImageUrl(Object imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setResetDate(Object resetDate) {
        this.resetDate = resetDate;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "AppointmentUserPatient{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", activated=" + activated +
                ", langKey=" + langKey +
                ", imageUrl=" + imageUrl +
                ", resetDate=" + resetDate +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
