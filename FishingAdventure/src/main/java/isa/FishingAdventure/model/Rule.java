package isa.FishingAdventure.model;

public class Rule {
   private int id;
   private String content;
   private boolean isEnforced;

   public Rule(int id, String content, boolean isEnforced) {
      this.id = id;
      this.content = content;
      this.isEnforced = isEnforced;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getContent() {
      return this.content;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public boolean isIsEnforced() {
      return this.isEnforced;
   }

   public boolean getIsEnforced() {
      return this.isEnforced;
   }

   public void setIsEnforced(boolean isEnforced) {
      this.isEnforced = isEnforced;
   }

}