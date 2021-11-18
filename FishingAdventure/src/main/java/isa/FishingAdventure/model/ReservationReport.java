package isa.FishingAdventure.model;

public class ReservationReport {
   private String report;
   
   public Reservation reservation;

   public ReservationReport(String report, Reservation reservation) {
      this.report = report;
      this.reservation = reservation;
   }

   public String getReport() {
      return this.report;
   }

   public void setReport(String report) {
      this.report = report;
   }

   public Reservation getReservation() {
      return this.reservation;
   }

   public void setReservation(Reservation reservation) {
      this.reservation = reservation;
   }

}