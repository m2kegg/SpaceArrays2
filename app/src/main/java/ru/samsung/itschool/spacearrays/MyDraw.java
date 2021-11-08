package ru.samsung.itschool.spacearrays;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MyDraw extends View {

	public MyDraw(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	Paint paint = new Paint();
	Bitmap rocketImage = BitmapFactory.decodeResource(getResources(), R.drawable.rocket);

	Rocket rocket = new Rocket(300f, 300f, 0.5f, -0.5f, rocketImage);
	Sky sky1 = new Sky();
	@Override
	protected void onDraw(Canvas canvas) {

		sky1.draw(canvas);
		rocket.move();
		rocket.draw(canvas);
		// Запрос на перерисовку экрана
		invalidate();
	}
}
