package com.omega.dao;

import com.omega.models.Pilot;

import java.util.List;

public interface PilotDao {

    void save(Pilot pilot);

    List<Pilot> findAll();
}
