package net.hockeyapp.android.helpers;

import android.app.Activity;
import android.content.Context;

import net.hockeyapp.android.async.CheckUpdateTask;
import net.hockeyapp.android.ui.activities.UpdateActivity;

/**
 * Created by dlernatovich on 9/5/14.
 */
public class UpdateHelper {
    public static void setCheckUpdateParameters(Context context,
                                                int iconDrawableId,
                                                CheckUpdateTask checkUpdateTask,
                                                String url,
                                                String userName,
                                                String password) {
        UpdateActivity.iconDrawableId = iconDrawableId;
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
