package com.omega;

import com.omega.models.Pilot;
import com.omega.services.PilotService;

import java.util.List;

public class App 
{
    public static void main( String[] args ){

        PilotService pilotService = new PilotService();
        Pilot pilot = new Pilot("George", 35, "1234GHS", "george@inbox.com");
        pilotService.savePilot(pilot);

        List<Pilot> pilots= pilotService.findAllPilots();

        for (Pilot pilotMember : pilots) {
            System.out.println(pilotMember);
        }
    }
}
