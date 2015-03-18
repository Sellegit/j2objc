package apple.corefoundation;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.dispatch.*;
import apple.foundation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreFoundation/CoreFoundation.h")
public class CFPreferences 
    extends Object 
     {

    
    
    
    
    
    @GlobalFunction("CFPreferencesCopyAppValue")
    public static native CFType getAppValue(String key, String applicationID);
    @GlobalFunction("CFPreferencesGetAppBooleanValue")
    public static native boolean getAppBooleanValue(String key, String applicationID, Todo keyExistsAndHasValidFormat);
    @GlobalFunction("CFPreferencesGetAppIntegerValue")
    public static native @MachineSizedSInt long getAppIntegerValue(String key, String applicationID, Todo keyExistsAndHasValidFormat);
    @GlobalFunction("CFPreferencesSetAppValue")
    public static native void setAppValue(String key, CFType value, String applicationID);
    @GlobalFunction("CFPreferencesAddSuitePreferencesToApp")
    public static native void addSuitePreferencesToApp(String applicationID, String suiteID);
    @GlobalFunction("CFPreferencesRemoveSuitePreferencesFromApp")
    public static native void removeSuitePreferencesFromApp(String applicationID, String suiteID);
    @GlobalFunction("CFPreferencesAppSynchronize")
    public static native boolean appSynchronize(String applicationID);
    @GlobalFunction("CFPreferencesCopyValue")
    public static native CFType getValue(String key, String applicationID, String userName, String hostName);
    @GlobalFunction("CFPreferencesCopyMultiple")
    public static native Map<String, ?> getMultiple(CFArray keysToFetch, String applicationID, String userName, String hostName);
    @GlobalFunction("CFPreferencesSetValue")
    public static native void setValue(String key, CFType value, String applicationID, String userName, String hostName);
    @GlobalFunction("CFPreferencesSetMultiple")
    public static native void setMultiple(CFDictionary keysToSet, CFArray keysToRemove, String applicationID, String userName, String hostName);
    @GlobalFunction("CFPreferencesSynchronize")
    public static native boolean synchronize(String applicationID, String userName, String hostName);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CFPreferencesCopyApplicationList")
    public static native List<String> getApplicationList(String userName, String hostName);
    @GlobalFunction("CFPreferencesCopyKeyList")
    public static native List<String> getKeyList(String applicationID, String userName, String hostName);
    @GlobalFunction("CFPreferencesAppValueIsForced")
    public static native boolean appValueIsForced(String key, String applicationID);
    
}
