package kr.hs.emirim.thsgkdud123.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by appcreator13 on 2016. 9. 26..
 */
public class MyImage extends View{
    MyImage(Context context){
        super(context);//뷰를 상속 받을 때 이 문장이 없으면 에러가 난다.
    }
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        Bitmap picture= BitmapFactory.decodeResource(getResources(), R.drawable.astro);
        float cx=getWidth()/2.0f;
        float cy=getHeight()/2.0f;
        float x=(getWidth()-picture.getWidth())/2.0f;//현재 뷰의 넓이,둘중에 하나는 실수로 계산해 주어야 한다.
        float y=(getHeight()-picture.getHeight())/2.0f;
        // canvas.rotate(45,cx,cy);//이미지 회전
        //  canvas.translate(-150,200)//이미지 이동
        //  canvas.scale(2,2,cx,cy);//이미지 크기
        canvas.skew(0.4f,0.4f);//비틀기
        canvas.drawBitmap(picture,x,y,null);
    }
}
