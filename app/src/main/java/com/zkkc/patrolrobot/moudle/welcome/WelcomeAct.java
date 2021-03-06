package com.zkkc.patrolrobot.moudle.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.zkkc.patrolrobot.R;
import com.zkkc.patrolrobot.base.BaseActivity;
import com.zkkc.patrolrobot.base.BasePresenter;
import com.zkkc.patrolrobot.base.BaseView;
import com.zkkc.patrolrobot.moudle.home.activity.MainAct;

import butterknife.BindView;

/**
 * Created by ShiJunRan on 2019/2/28
 */
public class WelcomeAct extends BaseActivity {
    @BindView(R.id.ivShow)
    ImageView ivShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fullscreen(true);
    }

    @Override
    public int getLayoutId() {
        return R.layout.welcome_act;
    }

    @Override
    public BasePresenter createPresenter() {
        return null;
    }

    @Override
    public BaseView createView() {
        return null;
    }

    @Override
    public void init() {
        ivShow.setBackgroundResource(R.mipmap.icon_wel);

        //初始化渐变动画
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.welcome_anim);
        //设置动画监听器
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
//                Intent intent = new Intent(WelcomeAct.this, HomeAct.class);
                Intent intent = new Intent(WelcomeAct.this, MainAct.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {


            }
        });
        ivShow.startAnimation(animation);
    }
}
