package api.pojos.AfraPojo;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppointmentCountryPysician {
    public int id;
    public String name;

    public AppointmentCountryPysician() {
    }

    public AppointmentCountryPysician(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "AppointmentCountryPysician{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
