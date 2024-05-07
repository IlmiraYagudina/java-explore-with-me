package ru.practicum.events.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Location.class)
public abstract class Location_ {

	public static volatile SingularAttribute<Location, String> description;
	public static volatile SingularAttribute<Location, Double> lon;
	public static volatile SingularAttribute<Location, Integer> id;
	public static volatile SingularAttribute<Location, Double> lat;

	public static final String DESCRIPTION = "description";
	public static final String LON = "lon";
	public static final String ID = "id";
	public static final String LAT = "lat";

}

