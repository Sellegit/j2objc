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





@Library("Foundation") @Mapping("NSRunLoop")
public class NSRunLoop 
    extends NSObject 
     {

    
    
    public NSRunLoop() {}
    
    
    @Mapping("currentMode")
    public native String getCurrentMode();
    
    
    
    @Mapping("getCFRunLoop")
    public native CFRunLoop asCFRunLoop();
    @Mapping("addTimer:forMode:")
    private native void addTimer0(NSTimer timer, String mode);
    @Mapping("addPort:forMode:")
    private native void addPort0(NSPort aPort, String mode);
    @Mapping("removePort:forMode:")
    private native void removePort0(NSPort aPort, String mode);
    @Mapping("limitDateForMode:")
    public native NSDate getDateLimit(String mode);
    @Mapping("acceptInputForMode:beforeDate:")
    public native void acceptInputUntil(String mode, NSDate limitDate);
    @Mapping("currentRunLoop")
    public static native NSRunLoop getCurrent();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("mainRunLoop")
    public static native NSRunLoop getMain();
    @Mapping("run")
    public native void run();
    @Mapping("runUntilDate:")
    public native void runUntil(NSDate limitDate);
    @Mapping("runMode:beforeDate:")
    public native boolean runUntil(String mode, NSDate limitDate);
    @Mapping("performSelector:target:argument:order:modes:")
    public native void perform(Selector aSelector, Object target, Object arg, @MachineSizedUInt long order, List<String> modes);
    @Mapping("cancelPerformSelector:target:argument:")
    public native void cancel(Selector aSelector, Object target, Object arg);
    @Mapping("cancelPerformSelectorsWithTarget:")
    public native void cancel(Object target);
    
}
