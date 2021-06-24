package com.agnes.ConnectionSearchEngine.service;

import com.agnes.ConnectionSearchEngine.model.Route;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.*;

public class RouteService {

    private static EntityManager entityManager;

    public List<Route> filterRoute  (Date departureDate, String startStop, String endStop) {
        TypedQuery<Route> query = entityManager.createQuery
                ("select r from Route r where r.date = :departureDate and where r.busStopsOnRoute like :startStop% and where r.busStopsOnRoute like %:endStop", Route.class);
        query.setParameter("departureDate", departureDate);
        query.setParameter("startStop", startStop);
        query.setParameter("endStop", endStop);

        List<Route> routes = query.getResultList();
        return routes;

    }
}
