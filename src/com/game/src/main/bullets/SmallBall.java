package com.game.src.main.bullets;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import com.game.src.main.Controller;
import com.game.src.main.Game;
import com.game.src.main.GameObject;
import com.game.src.main.GameObjectBullets;
import com.game.src.main.Player;
import com.game.src.main.classes.EntityC;
import com.game.src.main.graphics.Textures;

public class SmallBall extends GameObjectBullets implements EntityC {

	public SmallBall(double x, double y, Textures tex, Player p, Controller c, int movePattern) {
		super(x,y,tex,p,c, movePattern);
		aim();
	}
	
	
	
	public void tick() {

			bound();
			counter++;
			move();	
	}


	public void render(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g; 
		g2d.rotate(getAngle(),x+32,y+32);
		g.drawImage(tex.smallBall, (int)x, (int)y, null);
        g2d.rotate(-getAngle(),x+32,y+32);
	
	
	
	}



	@Override
	public void aim() {
		
		double angle = p.getAngle();
		int i = 0;
		System.out.println(angle);
		xVel = Math.cos(angle+Math.toRadians(i));
		yVel= Math.sin(angle+Math.toRadians(i));
	}
	


}
