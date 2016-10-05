package lily.com.mysimplifyreader.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import lily.com.mysimplifyreader.entitiy.BaseEntity;

/**
 * Created by Administrator on 2016/10/5.
 */

public class ImagesContainerPagerAdapter extends FragmentPagerAdapter {

    private List<BaseEntity> categoryList = null;

    public ImagesContainerPagerAdapter(FragmentManager fm, List<BaseEntity> categoryList) {
        super(fm);
        this.categoryList = categoryList;
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return null == categoryList ? 0 : categoryList.size();
    }

    //获取标题名
    @Override
    public CharSequence getPageTitle(int position) {
        return null == categoryList ? null : categoryList.get(position).getName();
    }
}
