package isa.FishingAdventure.model;

import javax.persistence.*;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reservationId;

    @Column(name = "place", nullable = false)
    private String place;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "appointmentId", referencedColumnName = "appointmentId")
    public Appointment appointment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clientId")
    public Client client;

    @OneToOne(mappedBy = "reservation")
    public Review review;

    @OneToOne(mappedBy = "reservation")
    private ReservationReport reservationReport;

    public Reservation(Integer reservationId, String place, Appointment appointment, Client client) {
        this.reservationId = reservationId;
        this.place = place;
        this.appointment = appointment;
        this.client = client;
    }

    public Reservation() {
    }

    public Integer getReservationId() {
        return this.reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Appointment getAppointment() {
        return this.appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}