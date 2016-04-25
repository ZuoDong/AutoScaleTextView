package com.zuo.autoscaletextview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class AutoScaleTextViewTest extends Activity implements View.OnClickListener {
        private AutoScaleTextView tv;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            // TODO Auto-generated method stub
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_autoscaletextview);

            findViewById(R.id.autoscaletextview_btn_biger).setOnClickListener(this);
            findViewById(R.id.autoscaletextview_btn_smaller).setOnClickListener(this);
            tv = (AutoScaleTextView) findViewById(R.id.autoscaletextview_textview);

        }

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            switch (v.getId()) {
            case R.id.autoscaletextview_btn_biger:
                tv.setText(tv.getText() + ",我是textview");
                break;
            case R.id.autoscaletextview_btn_smaller:
                String text = tv.getText().toString();
                int index = text.lastIndexOf(",");
                if(index > 0){
                    tv.setText(text.substring(0, index));
                }
                break;

            default:
                break;
            }
        }
    }