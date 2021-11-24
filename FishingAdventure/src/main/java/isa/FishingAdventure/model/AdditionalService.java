package isa.FishingAdventure.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class AdditionalService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private double price;

    @ManyToMany(mappedBy = "chosenServices")
    private Set<Appointment> appointments = new HashSet<Appointment>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "serviceProfileId")
    private ServiceProfile serviceProfiles;


    public AdditionalService(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public AdditionalService() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Set<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(Set<Appointment> appointments) {
        this.appointments = appointments;
    }

    public ServiceProfile getServiceProfiles() {
        return serviceProfiles;
    }

    public void setServiceProfiles(ServiceProfile serviceProfiles) {
        this.serviceProfiles = serviceProfiles;
    }
}