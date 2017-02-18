package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Ejercicio1 extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("Master-Shifu-icon_icon-icons.com_76132.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0.5f, 1, 0, 1);//Para cambiar el color del fondo.
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);// Para limpiar la tarjeta gráfica.
		batch.begin();

		batch.draw(img, 200, 200,250,250);//Cambia posición y tamaño de la imagen.

		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
