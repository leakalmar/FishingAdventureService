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

   public Boat(int serviceId, String name, int description, double cancellationRule, double rating, Location location,
         Set<Appointment> appointments, Set<Rule> rules, Set<AdditionalService> additionalServices) {
      super(serviceId, name, description, cancellationRule, rating, location, appointments, rules, additionalServices);

   }

   public String getType() {
      return this.type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public int getLength() {
      return this.length;
   }

   public void setLength(int length) {
      this.length = length;
   }

   public int getMotorNumber() {
      return this.motorNumber;
   }

   public void setMotorNumber(int motorNumber) {
      this.motorNumber = motorNumber;
   }

   public double getMotorPower() {
      return this.motorPower;
   }

   public void setMotorPower(double motorPower) {
      this.motorPower = motorPower;
   }

   public double getMaxSpeed() {
      return this.maxSpeed;
   }

   public void setMaxSpeed(double maxSpeed) {
      this.maxSpeed = maxSpeed;
   }

   public int getCapacity() {
      return this.capacity;
   }

   public void setCapacity(int capacity) {
      this.capacity = capacity;
   }

   public BoatOwner getBoatOwner() {
      return this.boatOwner;
   }

   public void setBoatOwner(BoatOwner boatOwner) {
      this.boatOwner = boatOwner;
   }

}