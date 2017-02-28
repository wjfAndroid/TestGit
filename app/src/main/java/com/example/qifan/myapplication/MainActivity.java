package com.example.qifan.myapplication;

        import android.app.Activity;
        import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    
    public void branch2(){
        System.out.println(" = ");
    }
}
