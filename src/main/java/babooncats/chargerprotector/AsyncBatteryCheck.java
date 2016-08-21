package babooncats.chargerprotector;

import android.os.AsyncTask;

/**
 * Created by bao xuchan on 2016-08-18.
 */
public class AsyncBatteryCheck extends AsyncTask<Void, String, Void>{
    @Override
    protected Void doInBackground(Void... params) {
        String msg = "Alert!!! Somebody disconnected your charger!";
        boolean isCharging = true;
        /*
        while isCharging (or not cancelled) {
            // check battery status
        }
        */
        publishProgress(msg);
        return null;
    }


