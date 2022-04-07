package com.yujun.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

import androidx.appcompat.app.AppCompatActivity;

import com.yujun.quizapp.databinding.ActivityStartBinding;

public class StartActivity extends AppCompatActivity {

    private ActivityStartBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        if (userName == null) {
            binding.userName.setText("");
        } else {
            binding.userName.setText(userName);
        }

        binding.startButton.setOnClickListener(view -> {
            if (TextUtils.isEmpty(binding.userName.getText().toString().trim())) {
                binding.userName.setError("Name required!");
            } else {
                String name = binding.userName.getText().toString().trim();
                Intent i = new Intent(StartActivity.this, QuizAnsActivity.class);
                i.putExtra("userName", name);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        System.exit(0);
    }
}