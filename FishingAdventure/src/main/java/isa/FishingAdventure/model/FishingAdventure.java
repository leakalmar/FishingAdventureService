package isa.FishingAdventure.model;

import java.util.Set;

public class FishingAdventure extends ServiceProfile {

   public FishingInstructor fishingInstructor;

   public FishingAdventure(int serviceId, String name, int description, double cancellationRule, double rating,
         Location location, Set<Appointment> appointments, Set<Rule> rules, Set<AdditionalService> additionalServices) {
      super(serviceId, name, description, cancellationRule, rating, location, appointments, rules, additionalServices);
   }
}