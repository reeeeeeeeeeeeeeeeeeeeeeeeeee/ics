package com.game.src.main.bullets;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import com.game.src.main.Controller;
import com.game.src.main.Game;
import com.game.src.main.GameObjectBullets;
import com.game.src.main.Player;
import com.game.src.main.classes.EntityC;
import com.game.src.main.graphics.Textures;

public class GilBullets extends GameObjectBullets implements EntityC {

	public GilBullets(double x, double y, Textures tex, Player p, Controller c, int movePattern) {
		super(x,y,tex,p,c, movePattern);
		this.movePattern=movePattern;
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
		g.drawImage(tex.gilsword, (int)x, (int)y, null);
        g2d.rotate(-getAngle(),x+32,y+32);
	
	
	
	}
	
	public void aim() {
		xVel=-(x-p.getX())*5/(Math.pow(Math.pow(x-p.getX(),2)+Math.pow(y-p.getY(),2),0.5));
		yVel=-(y-p.getY())*(5/(Math.pow(Math.pow(x-p.getX(),2)+Math.pow(y-p.getY(),2),0.5)));
	}


}
