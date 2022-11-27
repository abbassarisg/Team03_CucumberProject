package api.pojos.AfraPojo;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppointmentUserPysician {
    /*
    user": {
            "createdBy": "anonymousUser",
            "createdDate": "2022-11-15T07:22:39.162639Z",
            "id": 300488,
            "login": "lokman",
            "firstName": "lokman",
            "lastName": "lokman",
            "email": "lokman_hekim@gmail.com",
            "activated": true,
            "langKey": "en",
            "imageUrl": null,
            "resetDate": null,
            "ssn": "852-22-2222"
        }
     */

    private String createdBy;
    private String createdDate;
    private int id;
    private String login;
    private String firstName;
    private String lastName;
    private String email;
    private boolean activated;
    private String langKey;
    private Object imageUrl;
    private Object resetDate;
    private String ssn;

    public AppointmentUserPysician(){
    }

    public AppointmentUserPysician(String createdBy, String createdDate, int id, String login, String firstName,
                                   String lastName, String email, boolean activated, String langKey, Object imageUrl,
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

    public String getLangKey() {
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

    public void setLangKey(String langKey) {
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
        return "AppointmentUserPysician{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", activated=" + activated +
                ", langKey='" + langKey + '\'' +
                ", imageUrl=" + imageUrl +
                ", resetDate=" + resetDate +
                ", ssn='" + ssn + '\'' +
                '}';
    }

}
