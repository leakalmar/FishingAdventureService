package isa.FishingAdventure.model;

public class Review {
   private String content;
   private int rating;
   
   public Reservation reservation;

   public Review(String content, int rating, Reservation reservation) {
      this.content = content;
      this.rating = rating;
      this.reservation = reservation;
   }

   public String getContent() {
      return this.content;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public int getRating() {
      return this.rating;
   }

   public void setRating(int rating) {
      this.rating = rating;
   }

   public Reservation getReservation() {
      return this.reservation;
   }

   public void setReservation(Reservation reservation) {
      this.reservation = reservation;
   }

}