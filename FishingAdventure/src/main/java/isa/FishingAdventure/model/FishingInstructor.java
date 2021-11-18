package isa.FishingAdventure.model;

public class FishingInstructor extends User {

   private String biography;

   public FishingInstructor(int userId, String email, String password, String name, String surname, String phoneNumber,
         UserType userType, double points, UserCategory category, boolean activated, Address address) {
      super(userId, email, password, name, surname, phoneNumber, userType, points, category, activated, address);
   }

   public String getBiography() {
      return this.biography;
   }

   public void setBiography(String biography) {
      this.biography = biography;
   }

}