package isa.FishingAdventure.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Date;

import javax.transaction.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import isa.FishingAdventure.dto.NewReservationDto;

import com.fasterxml.jackson.annotation.JsonInclude;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReservationControllerTest {
    private static final String URL_PREFIX = "/reservation";

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype());

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    @Transactional
    @Rollback(true)
    @WithMockUser(authorities = "ROLE_VACATION_HOME_OWNER")
    public void testSaveNewAppointmentByAdvertiser() throws Exception {
        NewReservationDto dto = new NewReservationDto();
        dto.setChosenServices(new ArrayList<>());
        dto.setClientEmail("client1@gmail.com");
        dto.setEndDate(new Date());
        dto.setOwnersPresence(true);
        dto.setPersons(2);
        dto.setPrice(200);
        dto.setServiceId(113);
        dto.setStartDate(new Date());
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        String json = mapper.writeValueAsString(dto);
        this.mockMvc.perform(post(URL_PREFIX + "/newByAdvertiser").contentType(contentType).content(json))
                .andExpect(status().isOk());
    }
}
