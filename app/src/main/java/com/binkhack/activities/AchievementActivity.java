package com.binkhack.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.binkhack.R;
import com.binkhack.databinding.ActivityAchievementsBinding;

/*
 * Created by philltaylor on 29/09/2017.
 */

public class AchievementActivity extends AppCompatActivity {

    private ActivityAchievementsBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_achievements);

        setSupportActionBar(binding.toolbar);
        binding.toolbar.setTitle("Achievements");

        setupView();
    }

    private void setupView() {
        binding.trophy1.setColor(ContextCompat.getColor(this, R.color.blue));
        binding.trophy1.setBackgroundColor(ContextCompat.getColor(this, R.color.color_light_grey));
        binding.trophy1.setProgressBarWidth(getResources().getDimension(R.dimen.circle_progress_width));
        binding.trophy1.setBackgroundProgressBarWidth(getResources().getDimension(R.dimen.circle_progress_width_togo));
        int animationDuration = 2500; // 2500ms = 2,5s
        binding.trophy1.setProgressWithAnimation(50, animationDuration);

        binding.trophy2.setColor(ContextCompat.getColor(this, R.color.blue));
        binding.trophy2.setBackgroundColor(ContextCompat.getColor(this, R.color.color_light_grey));
        binding.trophy2.setProgressBarWidth(getResources().getDimension(R.dimen.circle_progress_width));
        binding.trophy2.setBackgroundProgressBarWidth(getResources().getDimension(R.dimen.circle_progress_width_togo));
        binding.trophy2.setProgressWithAnimation(25, animationDuration);

        binding.trophy3.setColor(ContextCompat.getColor(this, R.color.blue));
        binding.trophy3.setBackgroundColor(ContextCompat.getColor(this, R.color.color_light_grey));
        binding.trophy3.setProgressBarWidth(getResources().getDimension(R.dimen.circle_progress_width));
        binding.trophy3.setBackgroundProgressBarWidth(getResources().getDimension(R.dimen.circle_progress_width_togo));
        binding.trophy3.setProgressWithAnimation(0, animationDuration);

        binding.trophy4.setColor(ContextCompat.getColor(this, R.color.blue));
        binding.trophy4.setBackgroundColor(ContextCompat.getColor(this, R.color.color_light_grey));
        binding.trophy4.setProgressBarWidth(getResources().getDimension(R.dimen.circle_progress_width));
        binding.trophy4.setBackgroundProgressBarWidth(getResources().getDimension(R.dimen.circle_progress_width_togo));
        binding.trophy4.setProgressWithAnimation(80, animationDuration);

        binding.trophy5.setColor(ContextCompat.getColor(this, R.color.blue));
        binding.trophy5.setBackgroundColor(ContextCompat.getColor(this, R.color.color_light_grey));
        binding.trophy5.setProgressBarWidth(getResources().getDimension(R.dimen.circle_progress_width));
        binding.trophy5.setBackgroundProgressBarWidth(getResources().getDimension(R.dimen.circle_progress_width_togo));
        binding.trophy5.setProgressWithAnimation(100, animationDuration);

        binding.trophy6.setColor(ContextCompat.getColor(this, R.color.blue));
        binding.trophy6.setBackgroundColor(ContextCompat.getColor(this, R.color.color_light_grey));
        binding.trophy6.setProgressBarWidth(getResources().getDimension(R.dimen.circle_progress_width));
        binding.trophy6.setBackgroundProgressBarWidth(getResources().getDimension(R.dimen.circle_progress_width_togo));
        binding.trophy6.setProgressWithAnimation(100, animationDuration);
    }
}
