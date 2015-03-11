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
    @Mapping("setTotalUnitCount:")
    public native void setTotalUnitCount(long v);
    @Mapping("completedUnitCount")
    public native long getCompletedUnitCount();
    @Mapping("setCompletedUnitCount:")
    public native void setCompletedUnitCount(long v);
    @Mapping("localizedDescription")
    public native String getLocalizedDescription();
    @Mapping("setLocalizedDescription:")
    public native void setLocalizedDescription(String v);
    @Mapping("localizedAdditionalDescription")
    public native String getLocalizedAdditionalDescription();
    @Mapping("setLocalizedAdditionalDescription:")
    public native void setLocalizedAdditionalDescription(String v);
    @Mapping("isCancellable")
    public native boolean isCancellable();
    @Mapping("setCancellable:")
    public native void setCancellable(boolean v);
    @Mapping("isPausable")
    public native boolean isPausable();
    @Mapping("setPausable:")
    public native void setPausable(boolean v);
    @Mapping("isCancelled")
    public native boolean isCancelled();
    @Mapping("isPaused")
    public native boolean isPaused();
    @Mapping("cancellationHandler")
    public native @Block Runnable getCancellationHandler();
    @Mapping("setCancellationHandler:")
    public native void setCancellationHandler(@Block Runnable v);
    @Mapping("pausingHandler")
    public native @Block Runnable getPausingHandler();
    @Mapping("setPausingHandler:")
    public native void setPausingHandler(@Block Runnable v);
    @Mapping("isIndeterminate")
    public native boolean isIndeterminate();
    @Mapping("fractionCompleted")
    public native double getFractionCompleted();
    @Mapping("userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Mapping("kind")
    public native NSProgressKind getKind();
    @Mapping("setKind:")
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
