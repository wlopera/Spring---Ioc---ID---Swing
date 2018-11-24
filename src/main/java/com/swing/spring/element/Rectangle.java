package com.swing.spring.element;

import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import org.springframework.stereotype.Service;

@Service
public class Rectangle implements GraphicElement {

	@Override
	public Shape getElement() {
		return new RoundRectangle2D.Double(350, 350, 100, 100, 5, 25);
	}

}
