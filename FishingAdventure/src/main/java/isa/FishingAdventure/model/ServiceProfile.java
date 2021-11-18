package isa.FishingAdventure.model;
import java.util.*;

public class ServiceProfile {
   private int serviceId;
   private String name;
   private int description;
   private double cancellationRule;
   private double rating;
   
   public Location location;
   public Set<Appointment> appointments;
   public Set<Rule> rules;
   public Set<AdditionalService> additionalServices;
   

   public ServiceProfile(int serviceId, String name, int description, double cancellationRule, double rating, Location location, Set<Appointment> appointments, Set<Rule> rules, Set<AdditionalService> additionalServices) {
      this.serviceId = serviceId;
      this.name = name;
      this.description = description;
      this.cancellationRule = cancellationRule;
      this.rating = rating;
      this.location = location;
      this.appointments = appointments;
      this.rules = rules;
      this.additionalServices = additionalServices;
   }

   public int getServiceId() {
      return this.serviceId;
   }

   public void setServiceId(int serviceId) {
      this.serviceId = serviceId;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getDescription() {
      return this.description;
   }

   public void setDescription(int description) {
      this.description = description;
   }

   public double getCancellationRule() {
      return this.cancellationRule;
   }

   public void setCancellationRule(double cancellationRule) {
      this.cancellationRule = cancellationRule;
   }

   public double getRating() {
      return this.rating;
   }

   public void setRating(double rating) {
      this.rating = rating;
   }

   public Location getLocation() {
      return this.location;
   }

   public void setLocation(Location location) {
      this.location = location;
   }

   public Set<Appointment> getAppointments() {
      return this.appointments;
   }

   public void setAppointments(Set<Appointment> appointments) {
      this.appointments = appointments;
   }

   public Set<Rule> getRules() {
      return this.rules;
   }

   public void setRules(Set<Rule> rules) {
      this.rules = rules;
   }

   public Set<AdditionalService> getAdditionalServices() {
      return this.additionalServices;
   }

   public void setAdditionalServices(Set<AdditionalService> additionalServices) {
      this.additionalServices = additionalServices;
   }
   

}