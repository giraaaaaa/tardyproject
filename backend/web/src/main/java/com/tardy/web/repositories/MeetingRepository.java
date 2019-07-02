package com.tardy.web.repositories;

import com.tardy.web.entities.MeetingRoom;

import org.springframework.data.repository.CrudRepository;

/**
 * MeetingRepository
 */
public interface MeetingRepository extends CrudRepository<MeetingRoom, Long>{
}