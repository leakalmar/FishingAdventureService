package isa.FishingAdventure.model;

public class BoatOwner extends User {

    public BoatOwner(int userId, String email, String password, String name, String surname, String phoneNumber,
            UserType userType, double points, UserCategory category, boolean activated, Address address) {
        super(userId, email, password, name, surname, phoneNumber, userType, points, category, activated, address);
    }
}