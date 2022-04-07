package com.yujun.quizapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.yujun.quizapp.databinding.ActivityQuestionAnsBinding;

public class QuestionAnsActivity extends AppCompatActivity {

    private ActivityQuestionAnsBinding binding;
    private int[] layouts;
    private MyViewPagerAdapter myViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuestionAnsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // layouts array in asc
        layouts = new int[]{
                R.layout.quiz_one,
                R.layout.ans_one,
                R.layout.quiz_two,
                R.layout.ans_two,
                R.layout.quiz_three,
                R.layout.ans_three,
                R.layout.quiz_four,
                R.layout.ans_four,
                R.layout.quiz_five,
                R.layout.ans_five
        };

        myViewPagerAdapter = new MyViewPagerAdapter();
        binding.viewPager.setAdapter(myViewPagerAdapter);
        binding.viewPager.addOnPageChangeListener(viewPagerPageChangeListener);

        Log.d("posTotalNum", String.valueOf(layouts.length));
        Log.d("posCurrent", String.valueOf(binding.viewPager.getCurrentItem()));
//        binding.viewPager.setUserInputEnabled(false);
    }

    /**
     * viewpager change listener
     */
    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int position) {
            if (position == (layouts.length - 10)) {
                Button submitQOne = (Button) findViewById(R.id.submitQOne);
                submitQOne.setOnClickListener(view -> {
                    Log.d("position", String.valueOf(position));
//                    int current = getItem();
//                    if (current < layouts.length) {
//                        // move to next screen
//                        binding.viewPager.setCurrentItem(current);
//                    }
                    int currentPage = binding.viewPager.getCurrentItem();
                    if (currentPage == layouts.length - 1) {
                        currentPage = - 1;
                    }
                    binding.viewPager.setCurrentItem(currentPage + 1, true);
                });
            } else if (position == layouts.length - 9) {
                Button nextOne = (Button) findViewById(R.id.nextOne);
                nextOne.setOnClickListener(view -> {
                    Log.d("position", String.valueOf(position));
                    int currentPage = binding.viewPager.getCurrentItem();
                    if (currentPage == layouts.length - 1) {
                        currentPage = -1;
                    }
                    binding.viewPager.setCurrentItem(currentPage + 1, false);
                });
            } else if (position == layouts.length - 8) {
                Button submitTwo = (Button) findViewById(R.id.submitTwo);
                submitTwo.setOnClickListener(view -> {
                    Log.d("position", String.valueOf(position));
                    int currentPage = binding.viewPager.getCurrentItem();
                    if (currentPage == layouts.length - 1) {
                        currentPage = -1;
                    }
                    binding.viewPager.setCurrentItem(currentPage + 1, false);
                });
            } else if (position == layouts.length - 7) {
                Button nextTwo = (Button) findViewById(R.id.nextTwo);
                nextTwo.setOnClickListener(view -> {
                    Log.d("position", String.valueOf(position));
                    int currentPage = binding.viewPager.getCurrentItem();
                    if (currentPage == layouts.length - 1) {
                        currentPage = -1;
                    }
                    binding.viewPager.setCurrentItem(currentPage + 1, false);
                });
            } else if (position == layouts.length - 6) {
                Button submitThree = (Button) findViewById(R.id.submitThree);
                submitThree.setOnClickListener(view -> {
                    Log.d("position", String.valueOf(position));
                    int currentPage = binding.viewPager.getCurrentItem();
                    if (currentPage == layouts.length - 1) {
                        currentPage = -1;
                    }
                    binding.viewPager.setCurrentItem(currentPage + 1, false);
                });
            } else if (position == layouts.length - 5) {
                Button nextThree = (Button) findViewById(R.id.nextThree);
                nextThree.setOnClickListener(view -> {
                    Log.d("position", String.valueOf(position));
                    int currentPage = binding.viewPager.getCurrentItem();
                    if (currentPage == layouts.length - 1) {
                        currentPage = -1;
                    }
                    binding.viewPager.setCurrentItem(currentPage + 1, false);
                });
            } else if (position == layouts.length - 4) {
                Button submitFour = (Button) findViewById(R.id.submitFour);
                submitFour.setOnClickListener(view -> {
                    Log.d("position", String.valueOf(position));
                    int currentPage = binding.viewPager.getCurrentItem();
                    if (currentPage == layouts.length - 1) {
                        currentPage = -1;
                    }
                    binding.viewPager.setCurrentItem(currentPage + 1, false);
                });
            } else if (position == layouts.length - 3) {
                Button nextFour = (Button) findViewById(R.id.nextFour);
                nextFour.setOnClickListener(view -> {
                    Log.d("position", String.valueOf(position));
                    int currentPage = binding.viewPager.getCurrentItem();
                    if (currentPage == layouts.length - 1) {
                        currentPage = -1;
                    }
                    binding.viewPager.setCurrentItem(currentPage + 1, false);
                });
            } else if (position == layouts.length - 2) {
                Button submitFive = (Button) findViewById(R.id.submitFive);
                submitFive.setOnClickListener(view -> {
                    Log.d("position", String.valueOf(position));
                    int currentPage = binding.viewPager.getCurrentItem();
                    if (currentPage == layouts.length - 1) {
                        currentPage = -1;
                    }
                    binding.viewPager.setCurrentItem(currentPage + 1, false);
                });
            } else if (position == layouts.length - 1) {
                Button viewScore = (Button) findViewById(R.id.viewScore);
                viewScore.setOnClickListener(view -> {
                    Log.d("position", String.valueOf(position));
                    Intent j = new Intent(QuestionAnsActivity.this, MainActivity.class);
                    startActivity(j);
                });
            }
//            else {
//                Button submitQOne = (Button) findViewById(R.id.submitQOne);
//                submitQOne.setOnClickListener(view -> {
//                    int currentPage = binding.viewPager.getCurrentItem();
//                    if (currentPage == layouts.length - 1) {
//                        currentPage = + 1;
//                    }
//                    binding.viewPager.setCurrentItem(currentPage + 1, true);
//                });
//            }
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {
        }

        @Override
        public void onPageScrollStateChanged(int arg0) {
        }
    };

    private int getItem() {
        return binding.viewPager.getCurrentItem() + 1;
    }

    /**
     * View pager adapter
     */
    public class MyViewPagerAdapter extends PagerAdapter {

        public MyViewPagerAdapter() {
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View view = layoutInflater.inflate(layouts[position], container, false);
            container.addView(view);

            return view;
        }

        @Override
        public int getCount() {
            return layouts.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }


        @Override
        public void destroyItem(ViewGroup container, int position, @NonNull Object object) {
            View view = (View) object;
            container.removeView(view);
        }
    }
}