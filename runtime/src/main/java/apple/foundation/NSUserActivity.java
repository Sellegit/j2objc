package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


/**
 * @since Available in iOS 8.0 and later.
 */
@Library("Foundation/Foundation.h") @Mapping("NSUserActivity")
public class NSUserActivity 
    extends NSObject 
     {

    
    
    public NSUserActivity() {}
    @Mapping("initWithActivityType:")
    public NSUserActivity(String activityType) { }

    
    @Mapping("activityType")
    public native String getActivityType();
    @Mapping("title")
    public native String getTitle();
    @Mapping("setTitle:")
    public native void setTitle(String v);
    @Mapping("userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Mapping("setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> v);
    @Mapping("needsSave")
    public native boolean needsSave();
    @Mapping("setNeedsSave:")
    public native void setNeedsSave(boolean v);
    @Mapping("webpageURL")
    public native NSURL getWebpageURL();
    @Mapping("setWebpageURL:")
    public native void setWebpageURL(NSURL v);
    @Mapping("supportsContinuationStreams")
    public native boolean supportsContinuationStreams();
    @Mapping("setSupportsContinuationStreams:")
    public native void setSupportsContinuationStreams(boolean v);
    @Mapping("delegate")
    public native NSUserActivityDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(NSUserActivityDelegate v);

    
    
    @Mapping("addUserInfoEntriesFromDictionary:")
    public native void addUserInfoEntries(NSDictionary<?, ?> otherDictionary);
    @Mapping("becomeCurrent")
    public native void becomeCurrent();
    @Mapping("invalidate")
    public native void invalidate();
    @Mapping("getContinuationStreamsWithCompletionHandler:")
    public native void getContinuationStreams(@Block VoidBlock3<NSInputStream, NSOutputStream, NSError> completionHandler);

}
