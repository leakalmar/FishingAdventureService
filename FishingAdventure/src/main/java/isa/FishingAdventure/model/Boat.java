package isa.FishingAdventure.model;
import java.util.*;

public class Boat extends ServiceProfile {
   private String type;
   private int length;
   private int motorNumber;
   private double motorPower;
   private double maxSpeed;
   private int capacity;
   
   public BoatOwner boatOwner;
   
   public Set<NavigationEquipment> navigationEquipment;
   public Set<FishingEquipment> fishingEquipment;
   
   
   public Set<NavigationEquipment> getNavigationEquipment() {
      if (navigationEquipment == null)
         navigationEquipment = new java.util.HashSet<NavigationEquipment>();
      return navigationEquipment;
   }
   
   public java.util.Iterator getIteratorNavigationEquipment() {
      if (navigationEquipment == null)
         navigationEquipment = new java.util.HashSet<NavigationEquipment>();
      return navigationEquipment.iterator();
   }
   
   public void setNavigationEquipment(Set<NavigationEquipment> newNavigationEquipment) {
      removeAllNavigationEquipment();
      for (java.util.Iterator iter = newNavigationEquipment.iterator(); iter.hasNext();)
         addNavigationEquipment((NavigationEquipment)iter.next());
   }
   
   public void addNavigationEquipment(NavigationEquipment newNavigationEquipment) {
      if (newNavigationEquipment == null)
         return;
      if (this.navigationEquipment == null)
         this.navigationEquipment = new java.util.HashSet<NavigationEquipment>();
      if (!this.navigationEquipment.contains(newNavigationEquipment))
         this.navigationEquipment.add(newNavigationEquipment);
   }
   
   public void removeNavigationEquipment(NavigationEquipment oldNavigationEquipment) {
      if (oldNavigationEquipment == null)
         return;
      if (this.navigationEquipment != null)
         if (this.navigationEquipment.contains(oldNavigationEquipment))
            this.navigationEquipment.remove(oldNavigationEquipment);
   }
   
   public void removeAllNavigationEquipment() {
      if (navigationEquipment != null)
         navigationEquipment.clear();
   }
   public Set<FishingEquipment> getFishingEquipment() {
      if (fishingEquipment == null)
         fishingEquipment = new java.util.HashSet<FishingEquipment>();
      return fishingEquipment;
   }
   
   public java.util.Iterator getIteratorFishingEquipment() {
      if (fishingEquipment == null)
         fishingEquipment = new java.util.HashSet<FishingEquipment>();
      return fishingEquipment.iterator();
   }
   
   public void setFishingEquipment(Set<FishingEquipment> newFishingEquipment) {
      removeAllFishingEquipment();
      for (java.util.Iterator iter = newFishingEquipment.iterator(); iter.hasNext();)
         addFishingEquipment((FishingEquipment)iter.next());
   }
   
   public void addFishingEquipment(FishingEquipment newFishingEquipment) {
      if (newFishingEquipment == null)
         return;
      if (this.fishingEquipment == null)
         this.fishingEquipment = new java.util.HashSet<FishingEquipment>();
      if (!this.fishingEquipment.contains(newFishingEquipment))
         this.fishingEquipment.add(newFishingEquipment);
   }
   
   public void removeFishingEquipment(FishingEquipment oldFishingEquipment) {
      if (oldFishingEquipment == null)
         return;
      if (this.fishingEquipment != null)
         if (this.fishingEquipment.contains(oldFishingEquipment))
            this.fishingEquipment.remove(oldFishingEquipment);
   }
   
   public void removeAllFishingEquipment() {
      if (fishingEquipment != null)
         fishingEquipment.clear();
   }

}