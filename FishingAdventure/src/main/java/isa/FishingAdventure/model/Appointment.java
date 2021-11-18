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
   
   
   public Set<AdditionalService> getChosenServices() {
      if (chosenServices == null)
         chosenServices = new java.util.HashSet<AdditionalService>();
      return chosenServices;
   }
   
   public void setChosenServices(Set<AdditionalService> newChosenServices) {
      removeAllChosenServices();
      for (Iterator iter = newChosenServices.iterator(); iter.hasNext();)
         addChosenServices((AdditionalService)iter.next());
   }
   
   public void addChosenServices(AdditionalService newAdditionalService) {
      if (newAdditionalService == null)
         return;
      if (this.chosenServices == null)
         this.chosenServices = new java.util.HashSet<AdditionalService>();
      if (!this.chosenServices.contains(newAdditionalService))
         this.chosenServices.add(newAdditionalService);
   }
   
   public void removeChosenServices(AdditionalService oldAdditionalService) {
      if (oldAdditionalService == null)
         return;
      if (this.chosenServices != null)
         if (this.chosenServices.contains(oldAdditionalService))
            this.chosenServices.remove(oldAdditionalService);
   }
   
   public void removeAllChosenServices() {
      if (chosenServices != null)
         chosenServices.clear();
   }

}