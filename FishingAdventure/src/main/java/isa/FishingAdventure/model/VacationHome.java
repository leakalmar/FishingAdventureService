package isa.FishingAdventure.model;
import java.util.*;

public class VacationHome extends ServiceProfile {
   
   private Date availabilityStart;
   private Date availabilityEnd;
   
   public VacationHomeOwner vocationHomeOwner;
   public Set<Room> rooms;
   
   public VacationHome(int serviceId, String name, int description, double cancellationRule, double rating,
         Location location, Set<Appointment> appointments, Set<Rule> rules, Set<AdditionalService> additionalServices) {
      super(serviceId, name, description, cancellationRule, rating, location, appointments, rules, additionalServices);
   }
   

   public Date getAvailabilityStart() {
      return this.availabilityStart;
   }

   public void setAvailabilityStart(Date availabilityStart) {
      this.availabilityStart = availabilityStart;
   }

   public Date getAvailabilityEnd() {
      return this.availabilityEnd;
   }

   public void setAvailabilityEnd(Date availabilityEnd) {
      this.availabilityEnd = availabilityEnd;
   }

   public VacationHomeOwner getVocationHomeOwner() {
      return this.vocationHomeOwner;
   }

   public void setVocationHomeOwner(VacationHomeOwner vocationHomeOwner) {
      this.vocationHomeOwner = vocationHomeOwner;
   }

   public Set<Room> getRooms() {
      return this.rooms;
   }

   public void setRooms(Set<Room> rooms) {
      this.rooms = rooms;
   }

}