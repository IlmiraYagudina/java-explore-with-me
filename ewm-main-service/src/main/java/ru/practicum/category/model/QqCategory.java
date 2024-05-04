package ru.practicum.category.model;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;

import javax.annotation.processing.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QqCategory extends EntityPathBase<Category> {

    private static final long serialVersionUID = 823197404L;

    public static final QqCategory category = new QqCategory("category");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QqCategory(String variable) {
        super(Category.class, forVariable(variable));
    }

    public QqCategory(Path<? extends Category> path) {
        super(path.getType(), path.getMetadata());
    }

    public QqCategory(PathMetadata metadata) {
        super(Category.class, metadata);
    }

}