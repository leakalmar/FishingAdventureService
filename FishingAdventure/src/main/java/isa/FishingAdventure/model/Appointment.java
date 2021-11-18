package isa.FishingAdventure.model;
import java.time.Duration;
import java.util.*;

public class Appointment {
   private int appointmentId;
   private double discount;
   private boolean isReserved;
   private Date startDate;
   private Date endDate;
   private Duration duration;
   private int maxPersons;
   private double price;
   
   public Set<AdditionalService> chosenServices;
   

   public Appointment(int appointmentId, double discount, boolean isReserved, Date startDate, Date endDate, Duration duration, int maxPersons, double price, Set<AdditionalService> chosenServices) {
      this.appointmentId = appointmentId;
      this.discount = discount;
      this.isReserved = isReserved;
      this.startDate = startDate;
      this.endDate = endDate;
      this.duration = duration;
      this.maxPersons = maxPersons;
      this.price = price;
      this.chosenServices = chosenServices;
   }

   public int getAppointmentId() {
      return this.appointmentId;
   }

   public void setAppointmentId(int appointmentId) {
      this.appointmentId = appointmentId;
   }

   public double getDiscount() {
      return this.discount;
   }

   public void setDiscount(double discount) {
      this.discount = discount;
   }

   public boolean isIsReserved() {
      return this.isReserved;
   }

   public boolean getIsReserved() {
      return this.isReserved;
   }

   public void setIsReserved(boolean isReserved) {
      this.isReserved = isReserved;
   }

   public Date getStartDate() {
      return this.startDate;
   }

   public void setStartDate(Date startDate) {
      this.startDate = startDate;
   }

   public Date getEndDate() {
      return this.endDate;
   }

   public void setEndDate(Date endDate) {
      this.endDate = endDate;
   }

   public Duration getDuration() {
      return this.duration;
   }

   public void setDuration(Duration duration) {
      this.duration = duration;
   }

   public int getMaxPersons() {
      return this.maxPersons;
   }

   public void setMaxPersons(int maxPersons) {
      this.maxPersons = maxPersons;
   }

   public double getPrice() {
      return this.price;
   }

   public void setPrice(double price) {
      this.price = price;
   }
   
}