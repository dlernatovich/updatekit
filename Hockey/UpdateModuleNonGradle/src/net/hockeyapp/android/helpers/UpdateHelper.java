package net.hockeyapp.android.helpers;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import net.hockeyapp.android.async.CheckUpdateTask;
import net.hockeyapp.android.ui.activities.UpdateActivity;

/**
 * Created by dlernatovich on 9/5/14.
 */
public class UpdateHelper {
    public static void setCheckUpdateParameters(Context context,
                                                Drawable currentIcon,
                                                CheckUpdateTask checkUpdateTask,
                                                String url,
                                                String userName,
                                                String password) {
        UpdateActivity.iconDrawableId = currentIcon;
        checkUpdateTask = (CheckUpdateTask) ((Activity) context).getLastNonConfigurationInstance();
        if (checkUpdateTask != null) {
            checkUpdateTask.attach((Activity) context);
        } else {
            checkUpdateTask = new CheckUpdateTask((Activity) context, url);
            checkUpdateTask.setUserName(userName);
            checkUpdateTask.setUserPassword(password);
            checkUpdateTask.execute();
        }

    }
}
