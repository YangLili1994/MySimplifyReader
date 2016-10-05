package lily.com.mysimplifyreader.ui.activity;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.util.Log;
import android.view.View;

import com.github.obsessive.library.eventbus.EventCenter;
import com.github.obsessive.library.netstatus.NetUtils;

import butterknife.InjectView;
import lily.com.mysimplifyreader.R;
import lily.com.mysimplifyreader.presenter.Presenter;
import lily.com.mysimplifyreader.presenter.impl.HomePresenterImpl;
import lily.com.mysimplifyreader.ui.activity.base.BaseActivity;
import lily.com.mysimplifyreader.view.HomeView;

/**
 * Created by Administrator on 2016/10/5.
 */

public class HomeActivity extends BaseActivity implements HomeView{

    @InjectView(R.id.home_drawer)
    DrawerLayout mDrawerLayout;


    private ActionBarDrawerToggle actionBarDrawerToggle = null;
    private Presenter homePresenter= null;

    @Override
    protected boolean isApplyKitkatTranslucency() {
        //为状态栏渲染着色
        return true;
    }

    @Override
    protected void getBundleExtras(Bundle extras) {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_home;
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

        homePresenter = new HomePresenterImpl(this,this);

        homePresenter.initialized();

    }

    @Override
    protected void onNetworkConnected(NetUtils.NetType type) {

    }

    @Override
    protected void onNetworkDisConnected() {

    }

    @Override
    protected boolean isApplyStatusBarTranslucency() {
        //设置状态栏透明
        return true;
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
    public void initializeViews() {

        actionBarDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close){
            @Override
            public void onDrawerClosed(View drawerView) {
                Log.d("haha","drawerClosed");
                super.onDrawerClosed(drawerView);
                setTitle(getString(R.string.app_name));
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                Log.d(TAG_LOG,"drawerOpened");
                super.onDrawerOpened(drawerView);
            }
        };

        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        mDrawerLayout.addDrawerListener(actionBarDrawerToggle);

    }
}
