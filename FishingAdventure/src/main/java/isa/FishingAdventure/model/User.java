package isa.FishingAdventure.model;

public class User {
   private int userId;
   private String email;
   private String password;
   private String name;
   private String surname;
   private String phoneNumber;
   private UserType userType;
   private double points;
   private UserCategory category;
   private boolean activated;
   
   public Address address;

   public User(int userId, String email, String password, String name, String surname, String phoneNumber, UserType userType, double points, UserCategory category, boolean activated, Address address) {
      this.userId = userId;
      this.email = email;
      this.password = password;
      this.name = name;
      this.surname = surname;
      this.phoneNumber = phoneNumber;
      this.userType = userType;
      this.points = points;
      this.category = category;
      this.activated = activated;
      this.address = address;
   }

   public int getUserId() {
      return this.userId;
   }

   public void setUserId(int userId) {
      this.userId = userId;
   }

   public String getEmail() {
      return this.email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPassword() {
      return this.password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getSurname() {
      return this.surname;
   }

   public void setSurname(String surname) {
      this.surname = surname;
   }

   public String getPhoneNumber() {
      return this.phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public UserType getUserType() {
      return this.userType;
   }

   public void setUserType(UserType userType) {
      this.userType = userType;
   }

   public double getPoints() {
      return this.points;
   }

   public void setPoints(double points) {
      this.points = points;
   }

   public UserCategory getCategory() {
      return this.category;
   }

   public void setCategory(UserCategory category) {
      this.category = category;
   }

   public boolean isActivated() {
      return this.activated;
   }

   public boolean getActivated() {
      return this.activated;
   }

   public void setActivated(boolean activated) {
      this.activated = activated;
   }

   public Address getAddress() {
      return this.address;
   }

   public void setAddress(Address address) {
      this.address = address;
   }

}