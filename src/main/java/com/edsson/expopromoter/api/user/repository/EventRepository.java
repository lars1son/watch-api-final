package com.edsson.expopromoter.api.user.repository;

import com.edsson.expopromoter.api.user.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, String> {
}
