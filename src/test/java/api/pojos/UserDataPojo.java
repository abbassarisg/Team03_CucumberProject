package api.pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDataPojo {

    private String login;
    private String firstName;
    private String lastName;
    private String email;
    private Object activated;
    private String langKey;
    private Object imageUrl;
    private Object resetDate;
    private String ssn;

    public UserDataPojo() {

    }

    public UserDataPojo(String login, String firstName, String lastName, String email, Object activated,
                        String langKey, Object imageUrl, Object resetDate, String ssn) {

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

    public String getLogin() {

        return login;
    }

    public void setLogin(String login) {

        this.login = login;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public Object getActivated() {

        return activated;
    }

    public void setActivated(Object activated) {

        this.activated = activated;
    }

    public String getLangKey() {

        return langKey;
    }

    public void setLangKey(String langKey) {

        this.langKey = langKey;
    }

    public Object getImageUrl() {

        return imageUrl;
    }

    public void setImageUrl(Object imageUrl) {

        this.imageUrl = imageUrl;
    }

    public Object getResetDate() {

        return resetDate;
    }

    public void setResetDate(Object resetDate) {

        this.resetDate = resetDate;
    }

    public String getSsn() {

        return ssn;
    }

    public void setSsn(String ssn) {

        this.ssn = ssn;
    }

    @Override
    public String toString() {

        return "UserDataPojo{" +
                "login='" + login + '\'' +
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
