package com.duowan.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

public class CustomImageView extends ImageView {

	private Bitmap originalBitmap;

	public CustomImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public CustomImageView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public CustomImageView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public void setBitmap(Bitmap bitmap) {
		this.originalBitmap = bitmap;
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
//		Rect src = new Rect(0, 0, 297, 640);
//		Rect dst = new Rect(0, 0, 594, 1020);
//		canvas.drawBitmap(originalBitmap, src, dst, null);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:

			break;
		case MotionEvent.ACTION_MOVE:

			break;
		case MotionEvent.ACTION_UP:
		case MotionEvent.ACTION_CANCEL:

			break;
		default:
			break;
		}
		return super.onTouchEvent(event);
	}

}
