package isa.FishingAdventure.model;

public class Room {
   private int roomId;
   private int bedNumber;

   public Room(int roomId, int bedNumber) {
      this.roomId = roomId;
      this.bedNumber = bedNumber;
   }

   public int getRoomId() {
      return this.roomId;
   }

   public void setRoomId(int roomId) {
      this.roomId = roomId;
   }

   public int getBedNumber() {
      return this.bedNumber;
   }

   public void setBedNumber(int bedNumber) {
      this.bedNumber = bedNumber;
   }

}