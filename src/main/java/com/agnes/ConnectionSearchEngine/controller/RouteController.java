package com.agnes.ConnectionSearchEngine.controller;

import com.agnes.ConnectionSearchEngine.model.Route;
import com.agnes.ConnectionSearchEngine.service.RouteService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class RouteController {

    private RouteService routeService;

    @GetMapping("{date}/{startStop}/{endStop}")
    public ResponseEntity<Iterable<Route>> getRouteByParameters (@PathVariable Date date, @PathVariable String startStop, @PathVariable String endStop) {
        return ResponseEntity.ok(routeService.filterRoute(date,startStop,endStop));
    }
}
