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
    public static native CFPropertyListRef getAppValue(CFString key, CFString applicationID);
    @GlobalFunction("CFPreferencesGetAppBooleanValue")
    public static native boolean getAppBooleanValue(CFString key, CFString applicationID, Todo keyExistsAndHasValidFormat);
    @GlobalFunction("CFPreferencesGetAppIntegerValue")
    public static native @MachineSizedSInt long getAppIntegerValue(CFString key, CFString applicationID, Todo keyExistsAndHasValidFormat);
    @GlobalFunction("CFPreferencesSetAppValue")
    public static native void setAppValue(CFString key, CFPropertyListRef value, CFString applicationID);
    @GlobalFunction("CFPreferencesAddSuitePreferencesToApp")
    public static native void addSuitePreferencesToApp(CFString applicationID, CFString suiteID);
    @GlobalFunction("CFPreferencesRemoveSuitePreferencesFromApp")
    public static native void removeSuitePreferencesFromApp(CFString applicationID, CFString suiteID);
    @GlobalFunction("CFPreferencesAppSynchronize")
    public static native boolean appSynchronize(CFString applicationID);
    @GlobalFunction("CFPreferencesCopyValue")
    public static native CFPropertyListRef getValue(CFString key, CFString applicationID, CFString userName, CFString hostName);
    @GlobalFunction("CFPreferencesCopyMultiple")
    public static native Map<String, ?> getMultiple(CFArray keysToFetch, CFString applicationID, CFString userName, CFString hostName);
    @GlobalFunction("CFPreferencesSetValue")
    public static native void setValue(CFString key, CFPropertyListRef value, CFString applicationID, CFString userName, CFString hostName);
    @GlobalFunction("CFPreferencesSetMultiple")
    public static native void setMultiple(CFDictionary keysToSet, CFArray keysToRemove, CFString applicationID, CFString userName, CFString hostName);
    @GlobalFunction("CFPreferencesSynchronize")
    public static native boolean synchronize(CFString applicationID, CFString userName, CFString hostName);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CFPreferencesCopyApplicationList")
    public static native List<String> getApplicationList(CFString userName, CFString hostName);
    @GlobalFunction("CFPreferencesCopyKeyList")
    public static native List<String> getKeyList(CFString applicationID, CFString userName, CFString hostName);
    @GlobalFunction("CFPreferencesAppValueIsForced")
    public static native boolean appValueIsForced(CFString key, CFString applicationID);

}
