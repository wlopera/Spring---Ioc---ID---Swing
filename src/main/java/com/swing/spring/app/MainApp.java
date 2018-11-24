package com.swing.spring.app;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.swing.spring.element.ServiceRemote;

@SuppressWarnings("serial")
public class MainApp extends JFrame {

	private ServiceRemote serviceRemote;
	
	public static void main(String[] arg) {
		new MainApp().drawShapes();
	}

	public void drawShapes() {
		// Contaxto IoC Spring - basada en Anotaciones
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				SpringConfiguration.class);

		// Consultar y dibujar elementos graficos
		ServiceRemote service = ctx.getBean(ServiceRemote.class);

		@SuppressWarnings("serial")
		JPanel panel = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Graphics2D g2D = (Graphics2D) g;
				List<Shape> shapes = new ArrayList<>();


				// Lista de Benas creados
				for (String name : ctx.getBeanDefinitionNames()) {
					System.out.println(name);
				}
				
				// Consultar y dibujar elementos graficos
				for (Shape shape : service.getShapes()) {
					g2D.draw(shape);
				}

				g2D.drawString(service.getAuthor() + " -- " + service.getDate(), 100, 400);
				
				ctx.close();
			}
		};

		setSize(new Dimension(600, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle(service.getTitle()+ " -- " + service.getAuthor() + " -- " + service.getDate());
	
		this.getContentPane().add(panel);
	}
}
