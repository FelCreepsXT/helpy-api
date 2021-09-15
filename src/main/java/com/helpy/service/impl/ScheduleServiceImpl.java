package com.helpy.service.impl;

import com.helpy.model.Schedule;
import com.helpy.repository.GenericRepository;
import com.helpy.repository.ScheduleRepository;
import com.helpy.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleServiceImpl extends CrudServiceImpl<Schedule, Long> implements ScheduleService {
    @Autowired
    private ScheduleRepository scheduleRepository;

    @Override
    protected GenericRepository<Schedule, Long> getRepository() {
        return scheduleRepository;
    }
}
