package com.swing.spring.element;

import java.awt.Shape;
import java.awt.geom.Line2D;

import org.springframework.stereotype.Service;

@Service
public class Line implements GraphicElement {

	@Override
	public Shape getElement() {
		return new Line2D.Double(50, 50, 250, 250);
	}
}
