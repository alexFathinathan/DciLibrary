package com.dci.ipassdcilib;

import android.content.Context;
import android.util.Log;

import com.ipass.smartconnect.SMCCore;
import com.ipass.smartconnect.SMCException;

public class DciIpassUtil {

        private static final String Tag = DciIpassUtil.class.getName();

        private static DciIpassUtil dciIpassUtil = null;

        private DciIpassUtil() {
        }

        public static DciIpassUtil getInstance() {
            if (dciIpassUtil == null)
                dciIpassUtil = new DciIpassUtil();
            return dciIpassUtil;
        }

        public boolean initSdk(Context context, String ipassSdkKey) {
            try {
                SMCCore.initialize(ipassSdkKey, context);
                Log.d(Tag, "Init method called successfully");
                return true;
            } catch (SMCException e) {
                Log.d(Tag, "Init method failed");
                return false;
            }
        }
}
