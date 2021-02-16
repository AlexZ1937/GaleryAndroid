package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.graphics.drawable.Drawable;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.io.Serializable;
        import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    int currentViewID=0;
    ImageView currentview;
    LinkedList<Drawable> drawables=new LinkedList<Drawable>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        currentview=(ImageView)(findViewById(R.id.imageView));


        drawables.add(getDrawable(R.drawable.image1));
        drawables.add(getDrawable(R.drawable.image2));
        drawables.add(getDrawable(R.drawable.image3));
        drawables.add(getDrawable(R.drawable.image4));
        drawables.add(getDrawable(R.drawable.image5));
        drawables.add(getDrawable(R.drawable.image6));
        drawables.add(getDrawable(R.drawable.image7));
        drawables.add(getDrawable(R.drawable.image8));
        drawables.add(getDrawable(R.drawable.image9));
        drawables.add(getDrawable(R.drawable.image10));
        currentview.setBackground(drawables.get(currentViewID));

    }

    public void OnImageClick(View v)
    {


        switch (v.getId())
        {
            case R.id.imageView2:
                currentViewID=9;
                break;
            case R.id.imageView3:
                currentViewID=8;
                break;
            case R.id.imageView4:
                currentViewID=7;
                break;
            case R.id.imageView5:
                currentViewID=6;
                break;
            case R.id.imageView6:
                currentViewID=5;
                break;
            case R.id.imageView7:
                currentViewID=4;
                break;
            case R.id.imageView8:
                currentViewID=3;
                break;
            case R.id.imageView9:
                currentViewID=2;
                break;
            case R.id.imageView10:
                currentViewID=1;
                break;
            case R.id.imageView11:
                currentViewID=0;
                break;


        }
//        Serializable
//    Intent inte=new Intent(getApplicationContext(),ServiceTimer.class);
//        startService(inte);
//

    SetView();
    }

    public void RightClick(View v)
    {
        if(currentViewID<(drawables.size()-1)) {
            currentViewID++;
        }
        else
        {
            currentViewID=0;
        }
        SetView();
    }

    public void LeftClick(View v)
    {
        if(currentViewID>0) {
            currentViewID--;

        }
        else
        {
            currentViewID=drawables.size()-1;
        }
        SetView();
    }

    protected  void SetView()
    {
        ((TextView)findViewById(R.id.textView)).setText( String.valueOf(currentViewID+1));
        currentview.setBackground(drawables.get(currentViewID));
    }
}