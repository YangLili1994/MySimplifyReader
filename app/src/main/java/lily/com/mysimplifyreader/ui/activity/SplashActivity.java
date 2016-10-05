package lily.com.mysimplifyreader.ui.activity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.obsessive.library.eventbus.EventCenter;
import com.github.obsessive.library.netstatus.NetUtils;

import butterknife.InjectView;
import lily.com.mysimplifyreader.R;
import lily.com.mysimplifyreader.presenter.Presenter;
import lily.com.mysimplifyreader.presenter.impl.SplashPresenterImpl;
import lily.com.mysimplifyreader.ui.activity.base.BaseActivity;
import lily.com.mysimplifyreader.view.SplashView;

/**
 * Created by Administrator on 2016/10/4.
 */

public class SplashActivity extends BaseActivity  implements SplashView{

    @InjectView(R.id.splash_iamge)
    ImageView mSplashImage;

    @InjectView(R.id.splash_copyright)
    TextView mCopyright;

    @InjectView(R.id.splash_version_name)
    TextView mVersionName;

    private Presenter mSplashPresenter = null;

    @Override
    protected void getBundleExtras(Bundle extras) {

    }

    @Override
    protected boolean isApplyKitkatTranslucency() {
        return false;
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_splash;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    @Override
    protected void initViewsAndEvents() {

        mSplashPresenter = new SplashPresenterImpl(this,this);
        mSplashPresenter.initialized();

    }

    @Override
    protected void onNetworkConnected(NetUtils.NetType type) {

    }

    @Override
    protected void onNetworkDisConnected() {

    }

    @Override
    protected boolean isApplyStatusBarTranslucency() {
        return false;
    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

    @Override
    protected boolean toggleOverridePendingTransition() {
        return false;
    }

    @Override
    protected TransitionMode getOverridePendingTransitionMode() {
        return null;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //app开启界面屏蔽back键
        if (event.getKeyCode() == KeyEvent.KEYCODE_BACK){
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    //splashview 实现的方法

    @Override
    public void animateBackgroundImage(Animation animation) {
        mSplashImage.startAnimation(animation);
    }

    @Override
    public void initializeViews(String versionName, String copyright, int backgroundResId) {
        mCopyright.setText(copyright);
        mVersionName.setText(versionName);
        mSplashImage.setImageResource(backgroundResId);

    }

    @Override
    public void navigateToHomePage() {
        readyGoThenKill(HomeActivity.class);

    }
}
