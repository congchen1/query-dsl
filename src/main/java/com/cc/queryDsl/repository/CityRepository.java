package com.cc.queryDsl.repository;

import com.cc.queryDsl.model.City;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City,Long> ,
        QuerydslPredicateExecutor<City> {
}
