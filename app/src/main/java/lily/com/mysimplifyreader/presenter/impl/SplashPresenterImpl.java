package lily.com.mysimplifyreader.presenter.impl;

import android.content.Context;
import android.view.animation.Animation;

import lily.com.mysimplifyreader.interactor.SplashInteractor;
import lily.com.mysimplifyreader.interactor.impl.SplashInteractorImpl;
import lily.com.mysimplifyreader.presenter.Presenter;
import lily.com.mysimplifyreader.view.SplashView;

/**
 * Created by Administrator on 2016/10/4.
 */

public class SplashPresenterImpl implements Presenter{

    private Context mContext = null;
    private SplashInteractor mSplashInteractor = null;
    private SplashView mSplashView = null;

    public SplashPresenterImpl(Context mContext, SplashView mSplashView) {
        if (null == mSplashView) {
            throw new IllegalArgumentException("Constructor's parameters must not be Null");
        }

        this.mContext = mContext;
        this.mSplashView = mSplashView;
        this.mSplashInteractor = new SplashInteractorImpl();
    }

    @Override
    public void initialized() {
        mSplashView.initializeViews(mSplashInteractor.getVersionName(mContext),
                mSplashInteractor.getCopyright(mContext),
                mSplashInteractor.getBackgroundImageResID());

        Animation animation = mSplashInteractor.getBackgroundImageAnimation(mContext);

        mSplashView.animateBackgroundImage(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                mSplashView.navigateToHomePage();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}
