package com.swing.spring.element;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import org.springframework.stereotype.Service;

@Service
public class circle implements GraphicElement {

	@Override
	public Shape getElement() {
		return new Ellipse2D.Double(250, 250, 100, 100);
	}

}
