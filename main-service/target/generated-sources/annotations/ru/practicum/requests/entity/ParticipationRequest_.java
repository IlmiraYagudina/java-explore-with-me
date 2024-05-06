package ru.practicum.requests.entity;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.practicum.events.entity.Event;
import ru.practicum.users.entity.User;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ParticipationRequest.class)
public abstract class ParticipationRequest_ {

	public static volatile SingularAttribute<ParticipationRequest, User> requester;
	public static volatile SingularAttribute<ParticipationRequest, LocalDateTime> created;
	public static volatile SingularAttribute<ParticipationRequest, Long> id;
	public static volatile SingularAttribute<ParticipationRequest, Event> event;
	public static volatile SingularAttribute<ParticipationRequest, ParticipationStatus> status;

	public static final String REQUESTER = "requester";
	public static final String CREATED = "created";
	public static final String ID = "id";
	public static final String EVENT = "event";
	public static final String STATUS = "status";

}

