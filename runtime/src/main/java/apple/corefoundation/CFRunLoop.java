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
public class CFRunLoop 
    extends CFType 
     {

    
    
    protected CFRunLoop() {}
    
    
    
    
    @GlobalFunction("CFRunLoopGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    @GlobalFunction("CFRunLoopGetCurrent")
    public static native CFRunLoop getCurrent();
    @GlobalFunction("CFRunLoopGetMain")
    public static native CFRunLoop getMain();
    @GlobalFunction("CFRunLoopCopyCurrentMode")
    public native String getCurrentMode();
    @GlobalFunction("CFRunLoopCopyAllModes")
    public native List<String> getAllModes();
    @GlobalFunction("CFRunLoopAddCommonMode")
    public native void addCommonMode(String mode);
    @GlobalFunction("CFRunLoopGetNextTimerFireDate")
    public native double getNextTimerFireDate(String mode);
    @GlobalFunction("CFRunLoopRun")
    public static native void run();
    @GlobalFunction("CFRunLoopRunInMode")
    public static native CFRunLoopExitReason runInMode(String mode, double seconds, boolean returnAfterSourceHandled);
    @GlobalFunction("CFRunLoopIsWaiting")
    public native boolean isWaiting();
    @GlobalFunction("CFRunLoopWakeUp")
    public native void wakeUp();
    @GlobalFunction("CFRunLoopStop")
    public native void stop();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFRunLoopPerformBlock")
    private native void performBlock(CFType mode, @Block Runnable block);
    @GlobalFunction("CFRunLoopContainsSource")
    public native boolean containsSource(CFRunLoopSource source, String mode);
    @GlobalFunction("CFRunLoopAddSource")
    public native void addSource(CFRunLoopSource source, String mode);
    @GlobalFunction("CFRunLoopRemoveSource")
    public native void removeSource(CFRunLoopSource source, String mode);
    @GlobalFunction("CFRunLoopContainsObserver")
    public native boolean containsObserver(CFRunLoopObserver observer, String mode);
    @GlobalFunction("CFRunLoopAddObserver")
    public native void addObserver(CFRunLoopObserver observer, String mode);
    @GlobalFunction("CFRunLoopRemoveObserver")
    public native void removeObserver(CFRunLoopObserver observer, String mode);
    @GlobalFunction("CFRunLoopContainsTimer")
    public native boolean containsTimer(CFRunLoopTimer timer, String mode);
    @GlobalFunction("CFRunLoopAddTimer")
    public native void addTimer(CFRunLoopTimer timer, String mode);
    @GlobalFunction("CFRunLoopRemoveTimer")
    public native void removeTimer(CFRunLoopTimer timer, String mode);
    
}
