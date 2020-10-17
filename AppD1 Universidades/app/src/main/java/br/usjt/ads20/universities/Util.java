package br.usjt.ads20.universities;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Nome: Mateus Santos Carvalho
 * RA: 818229525
 */

public class Util {
    public static Bitmap criaAvatar(Context context, String txt){
        Paint textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setColor(Color.WHITE);
        float size = 50.0f;
        textPaint.setTextSize(size);

        Paint circlePaint = new Paint();
        int[] cores = {context.getResources().getColor(R.color.darkBlue, null),
                context.getResources().getColor(R.color.darkGreen, null),
                context.getResources().getColor(R.color.darkRed, null),
                context.getResources().getColor(R.color.darkPurple, null),
                context.getResources().getColor(R.color.darkOrange, null),
                context.getResources().getColor(R.color.navyBlue, null),
        };
        int cor = (int)(1000*Math.random())%6;
        circlePaint.setColor(cores[cor]);

        int w = 120;  // Width of profile picture
        int h = 120;  // Height of profile picture
        Bitmap bitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawCircle(w/2, h/2, w/2, circlePaint);
        canvas.drawText(txt, w/2, h/2+0.3f*size, textPaint);

        return bitmap;
    }
}
