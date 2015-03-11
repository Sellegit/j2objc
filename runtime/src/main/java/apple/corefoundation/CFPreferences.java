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
@Library("CoreFoundation")
public class CFPreferences 
    extends Object 
     {

    
    
    
    
    
    @GlobalFunction("CFPreferencesCopyAppValue")
    protected static native CFType getAppValue(String key, String applicationID);
    @GlobalFunction("CFPreferencesGetAppBooleanValue")
    protected static native boolean getAppBooleanValue(String key, String applicationID, Todo keyExistsAndHasValidFormat);
    @GlobalFunction("CFPreferencesGetAppIntegerValue")
    protected static native @MachineSizedSInt long getAppIntegerValue(String key, String applicationID, Todo keyExistsAndHasValidFormat);
    @GlobalFunction("CFPreferencesSetAppValue")
    protected static native void setAppValue(String key, CFType value, String applicationID);
    @GlobalFunction("CFPreferencesAddSuitePreferencesToApp")
    protected static native void addSuitePreferencesToApp(String applicationID, String suiteID);
    @GlobalFunction("CFPreferencesRemoveSuitePreferencesFromApp")
    protected static native void removeSuitePreferencesFromApp(String applicationID, String suiteID);
    @GlobalFunction("CFPreferencesAppSynchronize")
    protected static native boolean appSynchronize(String applicationID);
    @GlobalFunction("CFPreferencesCopyValue")
    protected static native CFType getValue(String key, String applicationID, String userName, String hostName);
    @GlobalFunction("CFPreferencesCopyMultiple")
    protected static native Map<String, ?> getMultiple(List<String> keysToFetch, String applicationID, String userName, String hostName);
    @GlobalFunction("CFPreferencesSetValue")
    protected static native void setValue(String key, CFType value, String applicationID, String userName, String hostName);
    @GlobalFunction("CFPreferencesSetMultiple")
    protected static native void setMultiple(Map<String, ?> keysToSet, List<String> keysToRemove, String applicationID, String userName, String hostName);
    @GlobalFunction("CFPreferencesSynchronize")
    protected static native boolean synchronize(String applicationID, String userName, String hostName);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CFPreferencesCopyApplicationList")
    protected static native List<String> getApplicationList(String userName, String hostName);
    @GlobalFunction("CFPreferencesCopyKeyList")
    protected static native List<String> getKeyList(String applicationID, String userName, String hostName);
    @GlobalFunction("CFPreferencesAppValueIsForced")
    protected static native boolean appValueIsForced(String key, String applicationID);
    
}
