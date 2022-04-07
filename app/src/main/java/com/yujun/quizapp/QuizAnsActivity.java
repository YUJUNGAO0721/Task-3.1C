package com.yujun.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.yujun.quizapp.databinding.ActivityQuizAnsBinding;

import java.util.ArrayList;

public class QuizAnsActivity extends AppCompatActivity {

    private ActivityQuizAnsBinding binding;
    ArrayList<Integer> mainData = new ArrayList<>();
    ArrayList<String> rpData = new ArrayList<>();
    boolean doubleBackToExitPressedOnce = false;

    ActivityResultLauncher<String> mGetContent = registerForActivityResult(
            new ActivityResultContracts.GetContent(),
            new ActivityResultCallback<Uri>() {
                @Override
                public void onActivityResult(Uri uri) {
                    // Handle the returned Uri
                    Log.d("url", uri.toString());
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuizAnsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");

        binding.quizOne.welcomeText.setText(String.format("Welcome %s", userName));

        // q1
        binding.quizOne.btnOneA.setOnClickListener(view -> {
            rpData.clear();
            binding.quizOne.btnOneA.setBackgroundColor(getResources().getColor(R.color.color_green));
            binding.quizOne.btnOneB.setBackgroundColor(getResources().getColor(R.color.white));
            binding.quizOne.btnOneC.setBackgroundColor(getResources().getColor(R.color.white));
            rpData.add("A");
        });
        binding.quizOne.btnOneB.setOnClickListener(view -> {
            rpData.clear();
            binding.quizOne.btnOneA.setBackgroundColor(getResources().getColor(R.color.white));
            binding.quizOne.btnOneB.setBackgroundColor(getResources().getColor(R.color.color_green));
            binding.quizOne.btnOneC.setBackgroundColor(getResources().getColor(R.color.white));
            rpData.add("B");
        });
        binding.quizOne.btnOneC.setOnClickListener(view -> {
            rpData.clear();
            binding.quizOne.btnOneA.setBackgroundColor(getResources().getColor(R.color.white));
            binding.quizOne.btnOneB.setBackgroundColor(getResources().getColor(R.color.white));
            binding.quizOne.btnOneC.setBackgroundColor(getResources().getColor(R.color.color_green));
            rpData.add("C");
        });
        binding.quizOne.submitQOne.setOnClickListener(view -> {
            Log.d("rpData", rpData.toString());
            Log.d("rpDataGet", rpData.get(0));
            binding.lq1.setVisibility(View.GONE);
            binding.lAns1.setVisibility(View.VISIBLE);
            switch (rpData.get(0)) {
                case "A":
                    binding.ansOne.btnOneA.setBackgroundColor(getResources().getColor(R.color.color_red));
                    break;
                case "B":
                    mainData.add(1);
                    break;
                case "C":
                    binding.ansOne.btnOneC.setBackgroundColor(getResources().getColor(R.color.color_red));
                    break;
            }
        });
        binding.ansOne.nextOne.setOnClickListener(view -> {
            rpData.clear();
            binding.lAns1.setVisibility(View.GONE);
            binding.lq2.setVisibility(View.VISIBLE);
            Log.d("rpDataMain", mainData.toString());
        });

        // Q2
        binding.quizTwo.btnTwoA.setOnClickListener(view -> {
            rpData.clear();
            binding.quizTwo.btnTwoA.setBackgroundColor(getResources().getColor(R.color.color_green));
            binding.quizTwo.btnTwoB.setBackgroundColor(getResources().getColor(R.color.white));
            binding.quizTwo.btnTwoC.setBackgroundColor(getResources().getColor(R.color.white));
            rpData.add("A");
        });
        binding.quizTwo.btnTwoB.setOnClickListener(view -> {
            rpData.clear();
            binding.quizTwo.btnTwoA.setBackgroundColor(getResources().getColor(R.color.white));
            binding.quizTwo.btnTwoB.setBackgroundColor(getResources().getColor(R.color.color_green));
            binding.quizTwo.btnTwoC.setBackgroundColor(getResources().getColor(R.color.white));
            rpData.add("B");
        });
        binding.quizTwo.btnTwoC.setOnClickListener(view -> {
            rpData.clear();
            binding.quizTwo.btnTwoA.setBackgroundColor(getResources().getColor(R.color.white));
            binding.quizTwo.btnTwoB.setBackgroundColor(getResources().getColor(R.color.white));
            binding.quizTwo.btnTwoC.setBackgroundColor(getResources().getColor(R.color.color_green));
            rpData.add("C");
        });
        binding.quizTwo.submitTwo.setOnClickListener(view -> {
            binding.lq2.setVisibility(View.GONE);
            binding.lAns2.setVisibility(View.VISIBLE);
            switch (rpData.get(0)) {
                case "A":
                    mainData.add(1);
                    break;
                case "B":
                    binding.ansTwo.btnTwoB.setBackgroundColor(getResources().getColor(R.color.color_red));
                    break;
                case "C":
                    binding.ansTwo.btnTwoC.setBackgroundColor(getResources().getColor(R.color.color_red));
                    break;
            }
        });
        binding.ansTwo.nextTwo.setOnClickListener(view -> {
            rpData.clear();
            binding.lAns2.setVisibility(View.GONE);
            binding.lq3.setVisibility(View.VISIBLE);
            Log.d("rpDataMain", mainData.toString());
        });

        // Q3
        binding.quizThree.btnThreeA.setOnClickListener(view -> {
            rpData.clear();
            binding.quizThree.btnThreeA.setBackgroundColor(getResources().getColor(R.color.color_green));
            binding.quizThree.btnThreeB.setBackgroundColor(getResources().getColor(R.color.white));
            binding.quizThree.btnThreeC.setBackgroundColor(getResources().getColor(R.color.white));
            binding.quizThree.btnThreeD.setBackgroundColor(getResources().getColor(R.color.white));
            rpData.add("A");
        });
        binding.quizThree.btnThreeB.setOnClickListener(view -> {
            rpData.clear();
            binding.quizThree.btnThreeA.setBackgroundColor(getResources().getColor(R.color.white));
            binding.quizThree.btnThreeB.setBackgroundColor(getResources().getColor(R.color.color_green));
            binding.quizThree.btnThreeC.setBackgroundColor(getResources().getColor(R.color.white));
            binding.quizThree.btnThreeD.setBackgroundColor(getResources().getColor(R.color.white));
            rpData.add("B");
        });
        binding.quizThree.btnThreeC.setOnClickListener(view -> {
            rpData.clear();
            binding.quizThree.btnThreeA.setBackgroundColor(getResources().getColor(R.color.white));
            binding.quizThree.btnThreeB.setBackgroundColor(getResources().getColor(R.color.white));
            binding.quizThree.btnThreeC.setBackgroundColor(getResources().getColor(R.color.color_green));
            binding.quizThree.btnThreeD.setBackgroundColor(getResources().getColor(R.color.white));
            rpData.add("C");
        });
        binding.quizThree.btnThreeD.setOnClickListener(view -> {
            rpData.clear();
            binding.quizThree.btnThreeA.setBackgroundColor(getResources().getColor(R.color.white));
            binding.quizThree.btnThreeB.setBackgroundColor(getResources().getColor(R.color.white));
            binding.quizThree.btnThreeC.setBackgroundColor(getResources().getColor(R.color.white));
            binding.quizThree.btnThreeD.setBackgroundColor(getResources().getColor(R.color.color_green));
            rpData.add("D");
        });
        binding.quizThree.submitThree.setOnClickListener(view -> {
            binding.lq3.setVisibility(View.GONE);
            binding.lAns3.setVisibility(View.VISIBLE);
            switch (rpData.get(0)) {
                case "A":
                    binding.ansThree.btnThreeA.setBackgroundColor(getResources().getColor(R.color.color_red));
                    break;
                case "B":
                    binding.ansThree.btnThreeB.setBackgroundColor(getResources().getColor(R.color.color_red));
                    break;
                case "C":
                    mainData.add(1);
                    break;
                case "D":
                    binding.ansThree.btnThreeD.setBackgroundColor(getResources().getColor(R.color.color_red));
                    break;
            }
        });
        binding.ansThree.nextThree.setOnClickListener(view -> {
            rpData.clear();
            binding.lAns3.setVisibility(View.GONE);
            binding.lq4.setVisibility(View.VISIBLE);
            Log.d("rpDataMain", mainData.toString());
        });

        // Q4
        binding.quizFour.btnFourA.setOnClickListener(view -> {
            rpData.clear();
            binding.quizFour.btnFourA.setBackgroundColor(getResources().getColor(R.color.color_green));
            binding.quizFour.btnFourB.setBackgroundColor(getResources().getColor(R.color.white));
            rpData.add("A");
        });
        binding.quizFour.btnFourB.setOnClickListener(view -> {
            rpData.clear();
            binding.quizFour.btnFourA.setBackgroundColor(getResources().getColor(R.color.white));
            binding.quizFour.btnFourB.setBackgroundColor(getResources().getColor(R.color.color_green));
            rpData.add("B");
        });
        binding.quizFour.submitFour.setOnClickListener(view -> {
            binding.lq4.setVisibility(View.GONE);
            binding.lAns4.setVisibility(View.VISIBLE);
            switch (rpData.get(0)) {
                case "A":
                    binding.ansFour.btnFourA.setBackgroundColor(getResources().getColor(R.color.color_red));
                    break;
                case "B":
                    mainData.add(1);
                    break;
            }
        });
        binding.ansFour.nextFour.setOnClickListener(view -> {
            rpData.clear();
            binding.lAns4.setVisibility(View.GONE);
            binding.lq5.setVisibility(View.VISIBLE);
            Log.d("rpDataMain", mainData.toString());
        });

        // Q5
        binding.quizFive.btnFiveA.setOnClickListener(view -> {
            rpData.clear();
            binding.quizFive.btnFiveA.setBackgroundColor(getResources().getColor(R.color.color_green));
            binding.quizFive.btnFiveB.setBackgroundColor(getResources().getColor(R.color.white));
            rpData.add("A");
        });
        binding.quizFive.btnFiveB.setOnClickListener(view -> {
            rpData.clear();
            binding.quizFive.btnFiveA.setBackgroundColor(getResources().getColor(R.color.white));
            binding.quizFive.btnFiveB.setBackgroundColor(getResources().getColor(R.color.color_green));
            rpData.add("B");
        });
        binding.quizFive.submitFive.setOnClickListener(view -> {
            binding.lq5.setVisibility(View.GONE);
            binding.lAns5.setVisibility(View.VISIBLE);
            switch (rpData.get(0)) {
                case "A":
                    mainData.add(1);
                    break;
                case "B":
                    binding.ansFive.btnFiveB.setBackgroundColor(getResources().getColor(R.color.color_red));
                    break;
            }
            Log.d("rpDataMain", mainData.toString());
        });
        binding.ansFive.viewScore.setOnClickListener(view -> {
            // calculate Score
            int sum = 0;
            for (int i = 0; i < mainData.size(); i++) {
                sum += mainData.get(i);
            }

            Log.d("sum", String.valueOf(sum));
            Intent i = new Intent(QuizAnsActivity.this, MainActivity.class);
            i.putExtra("score", String.valueOf(sum));
            i.putExtra("userName", userName);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(i);
            finish();
        });
    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            System.exit(0);
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit",
                Toast.LENGTH_SHORT).show();
        finish();
    }
}