package com.example.cfit010.androidapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        ImageView image = (ImageView) findViewById(R.id.image);

        Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(image);


        //imageView.setImageBitmap(bmp);
        /* URL url = null;
        try {
            url = new URL("https://www.google.co.in/imgres?imgurl=http%3A%2F%2Fwww.queness.com%2Fresources%2Fimages%2Fpng%2Fapple_ex.png&imgrefurl=http%3A%2F%2Fwww.queness.com%2Fpost%2F2507%2Fmost-effective-method-to-reduce-and-optimize-png-images&docid=g-f4fe1OSQHe1M&tbnid=qTzR8CKjT90UsM%3A&w=305&h=314&client=ubuntu&bih=990&biw=1855&ved=0ahUKEwj-q_OxpafNAhVie6YKHfoDDAMQMwgxKAEwAQ&iact=mrc&uact=8");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Bitmap bmp = null;
        try {
            bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }*/



        /*final ImageView imageView = new ImageView(this);

        imageView.setImageBitmap(bmp);

        //imageView.setImageResource(R.drawable.index);

        setContentView(imageView);*/
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
