package f4.hubby;

import android.graphics.drawable.Drawable;

public class AppDetail {
    private String appName, packageName;
    Drawable icon;

    AppDetail(Drawable icon, String appName, String packageName) {
        this.packageName = packageName;
        this.appName = appName;
        this.icon = icon;
    }

    public String getAppName() {
        return appName;
    }

    public String getPackageName() {
        return packageName;
    }

    public Drawable getIcon() {
        return icon;
    }
}
