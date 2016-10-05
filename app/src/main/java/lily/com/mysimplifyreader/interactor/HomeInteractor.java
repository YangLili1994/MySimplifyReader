package lily.com.mysimplifyreader.interactor;

import android.content.Context;

import com.github.obsessive.library.base.BaseLazyFragment;

import java.util.List;

import lily.com.mysimplifyreader.entitiy.NavigationEntity;

/**
 * Created by Administrator on 2016/10/5.
 */

public interface HomeInteractor {

    List<BaseLazyFragment> getPagerFragments();

    List<NavigationEntity> getNavigationListData(Context context);


}
