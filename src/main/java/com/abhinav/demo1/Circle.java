package com.abhinav.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

//@Component
//@Service
//@Controller
//@Repository
public class Circle implement Shape {

    private Point center;

    @Override
    public void draw(){
        System.out.println("Drawing Circle");
        System.out.println("Circle: Point is: (" + center.getX() +","+center.getY() + ")");

    }

    public Point getCenter() {
        return center;
    }
    //@Required
    //@Resource(name="pointC")
    @Autowired
    @Qualifier("circleRelated")
    public void setCenter(Point center) {
        this.center = center;
    }

    @PostConstruct
    public void initializeCircle(){
        System.out.println("Init of Circle");
    }


}
