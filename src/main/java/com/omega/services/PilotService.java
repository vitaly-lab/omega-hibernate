package com.omega.services;

import com.omega.dao.PilotDaoImpl;
import com.omega.models.Pilot;

import java.util.List;

public class PilotService {

    public PilotService() {
    }

    private PilotDaoImpl pilotDao = new PilotDaoImpl();

    public void savePilot(Pilot pilot) {
        pilotDao.save(pilot);
    }

    public List<Pilot> findAllPilots() {
        return pilotDao.findAll();
    }
}
