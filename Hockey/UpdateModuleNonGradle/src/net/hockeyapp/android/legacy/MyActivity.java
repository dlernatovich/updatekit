package net.hockeyapp.android.legacy;//package net.hockeyapp.android.legacy;
//
//import android.app.Activity;
//import android.os.Bundle;
//
//import net.hockeyapp.android.async.CheckUpdateTask;
//import net.hockeyapp.android.helpers.UpdateHelper;
//
//import test.server.com.testserverapplication.R;

//<uses-permission android:name="android.permission.INTERNET" />
//<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
//
//
//public class MyActivity extends Activity {
//
//    private CheckUpdateTask checkUpdateTask;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_my);
//
////        UpdateActivity.iconDrawableId = R.drawable.ic_launcher;
//
//        // Check for updates
////        checkForUpdates();
//        UpdateHelper.setCheckUpdateParameters(this,
//                R.drawable.ic_launcher,
//                checkUpdateTask,
//                "https://field-apps.magnet.com/",
//                "magnet",
//                "magnetwin123");
//    }
//
//    private void checkForUpdates() {
//        checkUpdateTask = (CheckUpdateTask) getLastNonConfigurationInstance();
//        if (checkUpdateTask != null) {
//            checkUpdateTask.attach(this);
//        } else {
//            checkUpdateTask = new CheckUpdateTask(this, "https://field-apps.magnet.com/");
//            checkUpdateTask.setUserName("magnet");
//            checkUpdateTask.setUserPassword("magnetwin123");
//            checkUpdateTask.execute();
//        }
//    }
//
//    @Override
//    public Object onRetainNonConfigurationInstance() {
//        checkUpdateTask.detach();
//        return checkUpdateTask;
//    }
//
//}
