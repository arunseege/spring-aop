package com.justcode.aop.firstspringaop.firstaopproject.service;

import com.justcode.aop.firstspringaop.firstaopproject.model.Circle;
import com.justcode.aop.firstspringaop.firstaopproject.model.Triangle;

public class ShapeService {
 private Triangle triangle;
 private Circle circle;
public Triangle getTriangle() {
	return triangle;
}
public void setTriangle(Triangle triangle) {
	this.triangle = triangle;
}
public Circle getCircle() {
	return circle;
}
public void setCircle(Circle circle) {
	this.circle = circle;
}
 
 
}
