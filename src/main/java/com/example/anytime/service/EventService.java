package com.example.anytime.service;

import com.example.anytime.model.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventService extends CrudRepository<Event,Integer> {

    @Query("select e from Event e where e.allevent.idevent = :idevent")
    List<Event> findByEvent(@Param("idevent") int idevent);

    @Query("select e from Event e where e.user.iduser = :iduser")
    List<Event> findByUser(@Param("iduser") int iduser);

    @Query("select e.id from Event e where e.user.iduser = :iduser and e.allevent.idevent = :idevent")
    List<Integer> findIdByUserAndEvent(@Param("iduser") int iduser, @Param("idevent") int idevent);

    @Query("select e.id from Event e where e.user.iduser = :iduser")
    List<Integer> findIdByUser(@Param("iduser") int iduser);

    @Query("select e.id from Event e where e.allevent.idevent = :idevent")
    List<Integer> findIdByEvent(@Param("idevent") int idevent);

}