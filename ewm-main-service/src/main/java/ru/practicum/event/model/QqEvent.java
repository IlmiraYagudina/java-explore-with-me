package ru.practicum.event.model;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.*;
import ru.practicum.category.model.QqCategory;
import ru.practicum.user.model.QqUser;

import javax.annotation.processing.Generated;
import java.time.LocalDateTime;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QqEvent extends EntityPathBase<Event> {

    private static final long serialVersionUID = -299444598L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QqEvent event = new QqEvent("event");

    public final StringPath annotation = createString("annotation");

    public final QqCategory category;

    public final NumberPath<Integer> confirmedRequests = createNumber("confirmedRequests", Integer.class);

    public final DateTimePath<LocalDateTime> createdOn = createDateTime("createdOn", java.time.LocalDateTime.class);

    public final StringPath description = createString("description");

    public final DateTimePath<java.time.LocalDateTime> eventDate = createDateTime("eventDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QqUser initiator;

    public final QqLocation location;

    public final BooleanPath paid = createBoolean("paid");

    public final NumberPath<Integer> participantLimit = createNumber("participantLimit", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> publishedOn = createDateTime("publishedOn", java.time.LocalDateTime.class);

    public final BooleanPath requestModeration = createBoolean("requestModeration");

    public final EnumPath<ru.practicum.enums.State> state = createEnum("state", ru.practicum.enums.State.class);

    public final StringPath title = createString("title");

    public final NumberPath<Integer> views = createNumber("views", Integer.class);

    public QqEvent(String variable) {
        this(Event.class, forVariable(variable), INITS);
    }

    public QqEvent(Path<? extends Event> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QqEvent(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QqEvent(PathMetadata metadata, PathInits inits) {
        this(Event.class, metadata, inits);
    }

    public QqEvent(Class<? extends Event> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.category = inits.isInitialized("category") ? new QqCategory(forProperty("category")) : null;
        this.initiator = inits.isInitialized("initiator") ? new QqUser(forProperty("initiator")) : null;
        this.location = inits.isInitialized("location") ? new QqLocation(forProperty("location")) : null;
    }

}