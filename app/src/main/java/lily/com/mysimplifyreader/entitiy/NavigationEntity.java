package lily.com.mysimplifyreader.entitiy;

/**
 * Created by Administrator on 2016/10/5.
 */

public class NavigationEntity extends BaseEntity {

    private int iconResIs;

    public NavigationEntity(String id, String name, int iconResIs) {
        super(id, name);
        this.iconResIs = iconResIs;
    }

    public int getIconResIs() {
        return iconResIs;
    }

    public void setIconResIs(int iconResIs) {
        this.iconResIs = iconResIs;
    }
}
