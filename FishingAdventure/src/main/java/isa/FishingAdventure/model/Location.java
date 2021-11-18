package isa.FishingAdventure.model;

public class Location {
   private int locationId;
   private double longitude;
   private double latitude;
   
   public Address address;

   public Location(int locationId, double longitude, double latitude, Address address) {
      this.locationId = locationId;
      this.longitude = longitude;
      this.latitude = latitude;
      this.address = address;
   }

   public int getLocationId() {
      return this.locationId;
   }

   public void setLocationId(int locationId) {
      this.locationId = locationId;
   }

   public double getLongitude() {
      return this.longitude;
   }

   public void setLongitude(double longitude) {
      this.longitude = longitude;
   }

   public double getLatitude() {
      return this.latitude;
   }

   public void setLatitude(double latitude) {
      this.latitude = latitude;
   }

   public Address getAddress() {
      return this.address;
   }

   public void setAddress(Address address) {
      this.address = address;
   }

}