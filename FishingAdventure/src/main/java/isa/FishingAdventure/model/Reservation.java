package isa.FishingAdventure.model;

public class Reservation {
   private int reservationId;
   private String place;
   
   public Appointment appointment;
   public Client client;

   public Reservation(int reservationId, String place, Appointment appointment, Client client) {
      this.reservationId = reservationId;
      this.place = place;
      this.appointment = appointment;
      this.client = client;
   }

   public int getReservationId() {
      return this.reservationId;
   }

   public void setReservationId(int reservationId) {
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