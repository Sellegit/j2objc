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
@Mapping("CFRunLoopRef") @Library("CoreFoundation/CoreFoundation.h")
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
    public static native CFString getCurrentMode(CFRunLoop rl);
    @GlobalFunction("CFRunLoopCopyAllModes")
    public static native List<String> getAllModes(CFRunLoop rl);
    @GlobalFunction("CFRunLoopAddCommonMode")
    public static native void addCommonMode(CFRunLoop rl, CFString mode);
    @GlobalFunction("CFRunLoopGetNextTimerFireDate")
    public static native double getNextTimerFireDate(CFRunLoop rl, CFString mode);
    @GlobalFunction("CFRunLoopRun")
    public static native void run();
    @GlobalFunction("CFRunLoopRunInMode")
    public static native CFRunLoopExitReason runInMode(CFString mode, double seconds, boolean returnAfterSourceHandled);
    @GlobalFunction("CFRunLoopIsWaiting")
    public static native boolean isWaiting(CFRunLoop rl);
    @GlobalFunction("CFRunLoopWakeUp")
    public static native void wakeUp(CFRunLoop rl);
    @GlobalFunction("CFRunLoopStop")
    public static native void stop(CFRunLoop rl);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFRunLoopPerformBlock")
    public static native void performBlock(CFRunLoop rl, CFType mode, @Block Runnable block);
    @GlobalFunction("CFRunLoopContainsSource")
    public static native boolean containsSource(CFRunLoop rl, CFRunLoopSource source, CFString mode);
    @GlobalFunction("CFRunLoopAddSource")
    public static native void addSource(CFRunLoop rl, CFRunLoopSource source, CFString mode);
    @GlobalFunction("CFRunLoopRemoveSource")
    public static native void removeSource(CFRunLoop rl, CFRunLoopSource source, CFString mode);
    @GlobalFunction("CFRunLoopContainsObserver")
    public static native boolean containsObserver(CFRunLoop rl, CFRunLoopObserver observer, CFString mode);
    @GlobalFunction("CFRunLoopAddObserver")
    public static native void addObserver(CFRunLoop rl, CFRunLoopObserver observer, CFString mode);
    @GlobalFunction("CFRunLoopRemoveObserver")
    public static native void removeObserver(CFRunLoop rl, CFRunLoopObserver observer, CFString mode);
    @GlobalFunction("CFRunLoopContainsTimer")
    public static native boolean containsTimer(CFRunLoop rl, CFRunLoopTimer timer, CFString mode);
    @GlobalFunction("CFRunLoopAddTimer")
    public static native void addTimer(CFRunLoop rl, CFRunLoopTimer timer, CFString mode);
    @GlobalFunction("CFRunLoopRemoveTimer")
    public static native void removeTimer(CFRunLoop rl, CFRunLoopTimer timer, CFString mode);
    
}
