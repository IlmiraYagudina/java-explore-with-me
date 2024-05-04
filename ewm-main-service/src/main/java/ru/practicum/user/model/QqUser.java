package ru.practicum.user.model;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;

import javax.annotation.processing.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QqUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 903137340L;

    public static final QqUser user = new QqUser("user");

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QqUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QqUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QqUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}