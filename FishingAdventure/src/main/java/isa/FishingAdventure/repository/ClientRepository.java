package isa.FishingAdventure.repository;

import isa.FishingAdventure.model.Client;
import isa.FishingAdventure.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends UserRepository {

    Client save(Client client);

    Client findByEmail(String email);

    @Query(value = "SELECT * FROM client_subscriptions WHERE subscriptions_id = ?1", nativeQuery = true)
    List<Integer> findClientIdBySubscription(Integer serviceProfileId);

    User getByUserId(Integer id);
}
