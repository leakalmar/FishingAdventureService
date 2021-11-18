package isa.FishingAdventure.model;

import java.util.*;

public class Client extends User {

   private int penalties;

   public Set<ServiceProfile> subscriptions;

   public Client(int userId, String email, String password, String name, String surname, String phoneNumber,
         UserType userType, double points, UserCategory category, boolean activated, Address address) {
      super(userId, email, password, name, surname, phoneNumber, userType, points, category, activated, address);
   }

   public int getPenalties() {
      return this.penalties;
   }

   public void setPenalties(int penalties) {
      this.penalties = penalties;
   }

   public Set<ServiceProfile> getSubscriptions() {
      return this.subscriptions;
   }

   public void setSubscriptions(Set<ServiceProfile> subscriptions) {
      this.subscriptions = subscriptions;
   }

}