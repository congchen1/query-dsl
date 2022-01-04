package com.cc.queryDsl.run;

import com.cc.queryDsl.model.City;
import com.cc.queryDsl.repository.CityRepository;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.jpa.impl.JPAQuery;
import javafx.beans.binding.BooleanExpression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
@SuppressWarnings({ "rawtypes", "unchecked" })
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private CityRepository cityRepository;
    @Override
    public void run(String... args) throws Exception {
//        City qCity = QCity.city;
//
//        JPAQuery query = new JPAQuery(entityManager);
//
//        query.from(qCity).where(qCity.name.eq("Bratislava")).distinct();
//        List<City> c1 = query.fetch();
//
//        logger.info("{}", c1);
//
//        JPAQuery query2 = new JPAQuery(entityManager);
//        query2.from(qCity).where(qCity.name.endsWith("est").and(qCity.population.lt(1800000)));
//        List<City> cities = query2.fetch();
//
//        logger.info("{}", cities);
//
//        BooleanExpression booleanExpression = qCity.population.goe(2_000_000);
//        OrderSpecifier<String> orderSpecifier = qCity.name.asc();
//        Object cities2 = cityRepository.findAll(booleanExpression, orderSpecifier);

//        logger.info("{}", cities2);
    }
}
