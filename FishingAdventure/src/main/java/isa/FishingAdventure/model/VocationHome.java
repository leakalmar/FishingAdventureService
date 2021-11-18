package isa.FishingAdventure.model;
import java.util.*;

public class VocationHome extends ServiceProfile {
   private Date availabilityStart;
   private Date availabilityEnd;
   
   public VocationHomeOwner vocationHomeOwner;
   public Set<Room> rooms;
   
   
   public Set<Room> getRooms() {
      if (rooms == null)
         rooms = new java.util.HashSet<Room>();
      return rooms;
   }
   
   public java.util.Iterator getIteratorRooms() {
      if (rooms == null)
         rooms = new java.util.HashSet<Room>();
      return rooms.iterator();
   }
   
   public void setRooms(Set<Room> newRooms) {
      removeAllRooms();
      for (java.util.Iterator iter = newRooms.iterator(); iter.hasNext();)
         addRooms((Room)iter.next());
   }
   
   public void addRooms(Room newRoom) {
      if (newRoom == null)
         return;
      if (this.rooms == null)
         this.rooms = new java.util.HashSet<Room>();
      if (!this.rooms.contains(newRoom))
         this.rooms.add(newRoom);
   }
   
   public void removeRooms(Room oldRoom) {
      if (oldRoom == null)
         return;
      if (this.rooms != null)
         if (this.rooms.contains(oldRoom))
            this.rooms.remove(oldRoom);
   }
   
   public void removeAllRooms() {
      if (rooms != null)
         rooms.clear();
   }

}