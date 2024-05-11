package ru.practicum.comments.entity;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.practicum.events.entity.Event;
import ru.practicum.users.entity.User;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Comment.class)
public abstract class Comment_ {

	public static volatile SingularAttribute<Comment, Long> id;
	public static volatile SingularAttribute<Comment, String> text;
	public static volatile SingularAttribute<Comment, Event> event;
	public static volatile SingularAttribute<Comment, LocalDateTime> createdOn;
	public static volatile SingularAttribute<Comment, User> user;
	public static volatile SingularAttribute<Comment, CommentStatus> status;

	public static final String ID = "id";
	public static final String TEXT = "text";
	public static final String EVENT = "event";
	public static final String CREATED_ON = "createdOn";
	public static final String USER = "user";
	public static final String STATUS = "status";

}

