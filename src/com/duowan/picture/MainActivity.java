package com.duowan.picture;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.duowan.util.CustomImageView;

public class MainActivity extends Activity {
	private CustomImageView mImageView;
	private ImageView mImageViewOne;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mImageView = (CustomImageView) this.findViewById(R.id.img);
		mImageViewOne = (ImageView) this.findViewById(R.id.img_one);
		BitmapFactory.Options options = new BitmapFactory.Options();
		options.inPreferredConfig = Bitmap.Config.RGB_565;
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
				R.drawable.aa, options);
		Bitmap bitmapGoal = Bitmap.createBitmap(bitmap, 0, 0, 600, 1800);
		// mImageView.setBitmap(bitmapGoal);
		mImageView.setImageBitmap(bitmapGoal);
		// mImageViewOne.setImageBitmap(bitmap);
		// mImageView.setVisibility(View.GONE);
		mImageViewOne.setVisibility(View.GONE);

	}

}
