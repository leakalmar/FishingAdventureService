package isa.FishingAdventure.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import isa.FishingAdventure.model.Location;
import isa.FishingAdventure.model.VacationHome;
import isa.FishingAdventure.model.VacationHomeOwner;
import isa.FishingAdventure.repository.VacationHomeRepository;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import javax.transaction.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VacationHomeServiceTest {

    @Mock
    private VacationHomeRepository repositoryMock;

    @Mock
    private VacationHome homeMock;

    @InjectMocks
    private VacationHomeService serviceMock;

    @Test
    public void testGetById() {
        when(repositoryMock.getById(1))
                .thenReturn(homeMock);
        VacationHome home = serviceMock.getById(1);

        assertEquals(homeMock, home);
        verify(repositoryMock, times(1)).getById(1);
        verifyNoMoreInteractions(repositoryMock);
    }

    @Test
    public void testFindAllNonDeleted() {
        VacationHome home1 = new VacationHome();
        home1.setDeleted(false);
        VacationHome home2 = new VacationHome();
        home2.setDeleted(true);
        when(repositoryMock.findAll())
                .thenReturn(Arrays.asList(home1, home2));

        List<VacationHome> homes = serviceMock.findAllNonDeleted();
        assertThat(homes).hasSize(1);
        verify(repositoryMock, times(1)).findAll();
        verifyNoMoreInteractions(repositoryMock);
    }

    @Test
    @Transactional
    @Rollback(true)
    public void testSave() {
        VacationHomeOwner owner = new VacationHomeOwner();
        owner.setName("Ana");
        owner.setUserId(1);

        VacationHome home = new VacationHome();
        home.setAdditionalServices(new HashSet<>());
        home.setAppointments(new HashSet<>());
        home.setCancellationRule(15.0);
        home.setDeleted(false);
        home.setDescription("");
        home.setId(1);
        home.setImages(new HashSet<>());
        home.setLocation(new Location());
        home.setName("New cottage");
        home.setPersons(2);
        home.setPricePerDay(50);
        home.setRating(4.23);
        home.setRooms(new HashSet<>());
        home.setRules(new HashSet<>());
        home.setVacationHomeOwner(owner);

        when(repositoryMock.findByVacationHomeOwner(
                owner))
                        .thenReturn(Arrays.asList(new VacationHome("New cottage", "", 15.0, 4.11, null,
                                new HashSet<>(), new HashSet<>(), 2,
                                owner)));
        when(repositoryMock.save(home)).thenReturn(home);

        int size = serviceMock.findByVacationHomeOwner(owner).size();

        VacationHome home2 = serviceMock.save(home);

        assertThat(home2).isNotNull();

        List<VacationHome> homes = serviceMock.findByVacationHomeOwner(owner);
        assertThat(homes).hasSize(size);

        home2 = homes.get(homes.size() - 1);
        verify(repositoryMock, times(2)).findByVacationHomeOwner(owner);
        verify(repositoryMock, times(1)).save(home);
        verifyNoMoreInteractions(repositoryMock);
    }

}
