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
 * @since Available in iOS 7.0 and later.
 */

@Library("Foundation") @Mapping("NSProgress")
public class NSProgress 
    extends NSObject 
     {

    
    
    public NSProgress() {}
    @Mapping("initWithParent:userInfo:")
    public NSProgress(NSProgress parentProgressOrNil, NSDictionary<?, ?> userInfoOrNil) { }
    
    
    @Mapping("totalUnitCount")
    public native long getTotalUnitCount();
    public native void setTotalUnitCount(long v);
    @Mapping("completedUnitCount")
    public native long getCompletedUnitCount();
    public native void setCompletedUnitCount(long v);
    @Mapping("localizedDescription")
    public native String getLocalizedDescription();
    public native void setLocalizedDescription(String v);
    @Mapping("localizedAdditionalDescription")
    public native String getLocalizedAdditionalDescription();
    public native void setLocalizedAdditionalDescription(String v);
    @Mapping("isCancellable")
    public native boolean isCancellable();
    public native void setCancellable(boolean v);
    @Mapping("isPausable")
    public native boolean isPausable();
    public native void setPausable(boolean v);
    @Mapping("isCancelled")
    public native boolean isCancelled();
    @Mapping("isPaused")
    public native boolean isPaused();
    @Mapping("cancellationHandler")
    public native @Block Runnable getCancellationHandler();
    public native void setCancellationHandler(@Block Runnable v);
    @Mapping("pausingHandler")
    public native @Block Runnable getPausingHandler();
    public native void setPausingHandler(@Block Runnable v);
    @Mapping("isIndeterminate")
    public native boolean isIndeterminate();
    @Mapping("fractionCompleted")
    public native double getFractionCompleted();
    @Mapping("userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Mapping("kind")
    public native NSProgressKind getKind();
    public native void setKind(NSProgressKind v);
    
    
    
    @Mapping("becomeCurrentWithPendingUnitCount:")
    public native void becomeCurrent(long unitCount);
    @Mapping("resignCurrent")
    public native void resignCurrent();
    @Mapping("setUserInfoObject:forKey:")
    protected native void setUserInfoObject(Object objectOrNil, NSString key);
    @Mapping("cancel")
    public native void cancel();
    @Mapping("pause")
    public native void pause();
    @Mapping("currentProgress")
    public static native NSProgress getCurrentProgress();
    @Mapping("progressWithTotalUnitCount:")
    public static native NSProgress create(long unitCount);
    
}
