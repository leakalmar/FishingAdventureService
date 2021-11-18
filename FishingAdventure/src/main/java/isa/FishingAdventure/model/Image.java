package isa.FishingAdventure.model;

public class Image {
   private int id;
   private String path;
   
   public ServiceProfile serviceProfile;

   public Image(int id, String path, ServiceProfile serviceProfile) {
      this.id = id;
      this.path = path;
      this.serviceProfile = serviceProfile;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getPath() {
      return this.path;
   }

   public void setPath(String path) {
      this.path = path;
   }

   public ServiceProfile getServiceProfile() {
      return this.serviceProfile;
   }

   public void setServiceProfile(ServiceProfile serviceProfile) {
      this.serviceProfile = serviceProfile;
   }

}