package isa.FishingAdventure.model;
import java.util.*;

public class Client extends User {
   private int penalties;
   
   public Set<ServiceProfile> subscriptions;
   
   
   public Set<ServiceProfile> getSubscriptions() {
      if (subscriptions == null)
         subscriptions = new java.util.HashSet<ServiceProfile>();
      return subscriptions;
   }
   
   public java.util.Iterator getIteratorSubscriptions() {
      if (subscriptions == null)
         subscriptions = new java.util.HashSet<ServiceProfile>();
      return subscriptions.iterator();
   }
   
   public void setSubscriptions(Set<ServiceProfile> newSubscriptions) {
      removeAllSubscriptions();
      for (java.util.Iterator iter = newSubscriptions.iterator(); iter.hasNext();)
         addSubscriptions((ServiceProfile)iter.next());
   }
   
   public void addSubscriptions(ServiceProfile newServiceProfile) {
      if (newServiceProfile == null)
         return;
      if (this.subscriptions == null)
         this.subscriptions = new java.util.HashSet<ServiceProfile>();
      if (!this.subscriptions.contains(newServiceProfile))
         this.subscriptions.add(newServiceProfile);
   }
   
   public void removeSubscriptions(ServiceProfile oldServiceProfile) {
      if (oldServiceProfile == null)
         return;
      if (this.subscriptions != null)
         if (this.subscriptions.contains(oldServiceProfile))
            this.subscriptions.remove(oldServiceProfile);
   }
   
   public void removeAllSubscriptions() {
      if (subscriptions != null)
         subscriptions.clear();
   }

}