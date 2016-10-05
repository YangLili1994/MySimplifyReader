package lily.com.mysimplifyreader.ui.fragment;

import android.view.View;

import com.github.obsessive.library.eventbus.EventCenter;
import com.github.obsessive.library.smartlayout.SmartTabLayout;
import com.github.obsessive.library.widgets.XViewPager;

import java.util.List;

import butterknife.InjectView;
import lily.com.mysimplifyreader.R;
import lily.com.mysimplifyreader.entitiy.BaseEntity;
import lily.com.mysimplifyreader.presenter.Presenter;
import lily.com.mysimplifyreader.presenter.impl.ImagesContainerPresenterImpl;
import lily.com.mysimplifyreader.view.CommonContainerView;

/**
 * Created by Administrator on 2016/10/5.
 */

public class ImagesContainerFragment extends BaseFragment implements CommonContainerView {

    @InjectView(R.id.fragment_images_pager)
    XViewPager viewPager;

    @InjectView(R.id.fragment_images_tab_smart)
    SmartTabLayout smartTabLayout;

    private Presenter imagesContainerPresenter = null;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_images;
    }

    @Override
    protected void onFirstUserVisible() {

        imagesContainerPresenter = new ImagesContainerPresenterImpl(mContext,this);
        imagesContainerPresenter.initialized();
    }

    @Override
    protected void onUserVisible() {

    }

    @Override
    protected void onUserInvisible() {

    }

    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    @Override
    protected void initViewsAndEvents() {

    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

    @Override
    public void initializePagerViews(List<BaseEntity> categoryList) {

        if (null != categoryList && !categoryList.isEmpty()){
            //除去当前显示页面以外需要被预加载的页面数。
            viewPager.setOffscreenPageLimit(categoryList.size());
        }

    }
}
