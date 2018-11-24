package com.swing.spring.element;

import java.awt.Shape;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceRemote {

	// Uso de Spring Inyeccion de dependencias

	@Value("${author}")
	private String author;
	
	@Value("${title}")
	private String title;
	
	@Value("${date}")
	private String date;

	@Autowired
	private GraphicElement line;

	@Autowired
	private GraphicElement circle;

	@Autowired
	private GraphicElement rectangle;
	
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public GraphicElement getLine() {
		return line;
	}

	public void setLine(GraphicElement line) {
		this.line = line;
	}

	public GraphicElement getCircle() {
		return circle;
	}

	public void setCircle(GraphicElement circle) {
		this.circle = circle;
	}

	public GraphicElement getRectangle() {
		return rectangle;
	}

	public void setRectangle(GraphicElement rectangle) {
		this.rectangle = rectangle;
	}

	public List<Shape> getShapes() {
		List<Shape> shapes = new ArrayList<>();
		
		shapes.add(line.getElement());
		shapes.add(circle.getElement());
		shapes.add(rectangle.getElement());
		
		return shapes;
		
	}

}