package lily.com.mysimplifyreader.interactor.impl;

import android.content.Context;

import com.github.obsessive.library.base.BaseLazyFragment;

import java.util.ArrayList;
import java.util.List;

import lily.com.mysimplifyreader.R;
import lily.com.mysimplifyreader.entitiy.NavigationEntity;
import lily.com.mysimplifyreader.interactor.HomeInteractor;
import lily.com.mysimplifyreader.ui.fragment.ImagesContainerFragment;

/**
 * Created by Administrator on 2016/10/5.
 */

public class HomeInteractorImpl implements HomeInteractor {

    @Override
    public List<NavigationEntity> getNavigationListData(Context context) {

        List<NavigationEntity> navigationEntities = new ArrayList<>();

        String[] navigationArrays = context.getResources().getStringArray(R.array.navigation_list);

        navigationEntities.add(new NavigationEntity("",navigationArrays[0],R.drawable.ic_picture));
        navigationEntities.add(new NavigationEntity("",navigationArrays[1],R.drawable.ic_video));
        navigationEntities.add(new NavigationEntity("",navigationArrays[2],R.drawable.ic_music));

        return navigationEntities;
    }

    @Override
    public List<BaseLazyFragment> getPagerFragments() {

        List<BaseLazyFragment> fragments = new ArrayList<>();
        fragments.add(new ImagesContainerFragment());

        return fragments;
    }
}
