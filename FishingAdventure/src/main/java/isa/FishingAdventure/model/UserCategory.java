package isa.FishingAdventure.model;

public class UserCategory {
   private int id;
   private double points;
   private UserCategoryName category;
   private double percentage;

   public UserCategory(int id, double points, UserCategoryName category, double percentage) {
      this.id = id;
      this.points = points;
      this.category = category;
      this.percentage = percentage;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public double getPoints() {
      return this.points;
   }

   public void setPoints(double points) {
      this.points = points;
   }

   public UserCategoryName getCategory() {
      return this.category;
   }

   public void setCategory(UserCategoryName category) {
      this.category = category;
   }

   public double getPercentage() {
      return this.percentage;
   }

   public void setPercentage(double percentage) {
      this.percentage = percentage;
   }

}