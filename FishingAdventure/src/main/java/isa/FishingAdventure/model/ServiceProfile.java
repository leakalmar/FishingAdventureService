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
   
   
   public Set<Appointment> getAppointments() {
      if (appointments == null)
         appointments = new java.util.HashSet<Appointment>();
      return appointments;
   }
   
   public java.util.Iterator getIteratorAppointments() {
      if (appointments == null)
         appointments = new java.util.HashSet<Appointment>();
      return appointments.iterator();
   }
   
   public void setAppointments(Set<Appointment> newAppointments) {
      removeAllAppointments();
      for (java.util.Iterator iter = newAppointments.iterator(); iter.hasNext();)
         addAppointments((Appointment)iter.next());
   }
   
   public void addAppointments(Appointment newAppointment) {
      if (newAppointment == null)
         return;
      if (this.appointments == null)
         this.appointments = new java.util.HashSet<Appointment>();
      if (!this.appointments.contains(newAppointment))
         this.appointments.add(newAppointment);
   }
   
   public void removeAppointments(Appointment oldAppointment) {
      if (oldAppointment == null)
         return;
      if (this.appointments != null)
         if (this.appointments.contains(oldAppointment))
            this.appointments.remove(oldAppointment);
   }
   
   public void removeAllAppointments() {
      if (appointments != null)
         appointments.clear();
   }
   public Set<Rule> getRules() {
      if (rules == null)
         rules = new java.util.HashSet<Rule>();
      return rules;
   }
   
   public java.util.Iterator getIteratorRules() {
      if (rules == null)
         rules = new java.util.HashSet<Rule>();
      return rules.iterator();
   }
   
   public void setRules(Set<Rule> newRules) {
      removeAllRules();
      for (java.util.Iterator iter = newRules.iterator(); iter.hasNext();)
         addRules((Rule)iter.next());
   }
   
   public void addRules(Rule newRule) {
      if (newRule == null)
         return;
      if (this.rules == null)
         this.rules = new java.util.HashSet<Rule>();
      if (!this.rules.contains(newRule))
         this.rules.add(newRule);
   }
   
   public void removeRules(Rule oldRule) {
      if (oldRule == null)
         return;
      if (this.rules != null)
         if (this.rules.contains(oldRule))
            this.rules.remove(oldRule);
   }
   
   public void removeAllRules() {
      if (rules != null)
         rules.clear();
   }
   public Set<AdditionalService> getAdditionalServices() {
      if (additionalServices == null)
         additionalServices = new java.util.HashSet<AdditionalService>();
      return additionalServices;
   }
   
   public java.util.Iterator getIteratorAdditionalServices() {
      if (additionalServices == null)
         additionalServices = new java.util.HashSet<AdditionalService>();
      return additionalServices.iterator();
   }
   
   public void setAdditionalServices(Set<AdditionalService> newAdditionalServices) {
      removeAllAdditionalServices();
      for (java.util.Iterator iter = newAdditionalServices.iterator(); iter.hasNext();)
         addAdditionalServices((AdditionalService)iter.next());
   }
   
   public void addAdditionalServices(AdditionalService newAdditionalService) {
      if (newAdditionalService == null)
         return;
      if (this.additionalServices == null)
         this.additionalServices = new java.util.HashSet<AdditionalService>();
      if (!this.additionalServices.contains(newAdditionalService))
         this.additionalServices.add(newAdditionalService);
   }
   
   public void removeAdditionalServices(AdditionalService oldAdditionalService) {
      if (oldAdditionalService == null)
         return;
      if (this.additionalServices != null)
         if (this.additionalServices.contains(oldAdditionalService))
            this.additionalServices.remove(oldAdditionalService);
   }
   
   public void removeAllAdditionalServices() {
      if (additionalServices != null)
         additionalServices.clear();
   }

}