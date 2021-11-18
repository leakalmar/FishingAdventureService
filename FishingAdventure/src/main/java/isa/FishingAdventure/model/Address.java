package isa.FishingAdventure.model;

public class Address {
   private int adressId;
   private String country;
   private String city;
   private String street;


   public Address(int adressId, String country, String city, String street) {
      this.adressId = adressId;
      this.country = country;
      this.city = city;
      this.street = street;
   }

   public int getAdressId() {
      return this.adressId;
   }

   public void setAdressId(int adressId) {
      this.adressId = adressId;
   }

   public String getCountry() {
      return this.country;
   }

   public void setCountry(String country) {
      this.country = country;
   }

   public String getCity() {
      return this.city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getStreet() {
      return this.street;
   }

   public void setStreet(String street) {
      this.street = street;
   }

}