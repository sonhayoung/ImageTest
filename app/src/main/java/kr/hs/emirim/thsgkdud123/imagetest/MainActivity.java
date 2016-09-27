package kr.hs.emirim.thsgkdud123.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    MyImage mImg;
    static final int ORIGINAL=0;
    static final int ROTATE=1;
    static final int TRANSLATE=2;
    static final int SCALE=3;
    static final int SKEW=4;
    int choose=ORIGINAL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linear1=(LinearLayout)findViewById(R.id.linear1);
        mImg=new MyImage(getApplicationContext());
        linear1.addView(mImg);
        //또는 setContentView(new MyImage(getApplicationCantext()));
    }

    public void transformImage(View v) {
        switch (v.getId()) {
            case R.id.but_rotate:
                choose = ROTATE;
                break;
            case R.id.but_translate:
                choose = TRANSLATE;
                break;
            case R.id.but_scale:
                choose = SCALE;
                break;
            case R.id.but_skew:
                choose = SKEW;
                break;
        }
        mImg.setChoose(choose);
        mImg.invalidate();
    }
//
//    class MyImage extends View{
//        MyImage(Context context){
//            super(context);//뷰를 상속 받을 때 이 문장이 없으면 에러가 난다.
//        }
//        protected void onDraw(Canvas canvas){
//            super.onDraw(canvas);
//
//            Bitmap picture= BitmapFactory.decodeResource(getResources(), R.drawable.astro);
//            float cx=getWidth()/2.0f;
//            float cy=getHeight()/2.0f;
//            float x=(getWidth()-picture.getWidth())/2.0f;//현재 뷰의 넓이,둘중에 하나는 실수로 계산해 주어야 한다.
//            float y=(getHeight()-picture.getHeight())/2.0f;
//           // canvas.rotate(45,cx,cy);//이미지 회전
//          //  canvas.translate(-150,200)//이미지 이동
//          //  canvas.scale(2,2,cx,cy);//이미지 크기
//            canvas.skew(0.4f,0.4f);//비틀기
//             canvas.drawBitmap(picture,x,y,null);
//        }
        //}
    }
