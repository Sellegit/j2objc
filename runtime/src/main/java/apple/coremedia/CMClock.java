package apple.coremedia;


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
import apple.foundation.*;
import apple.dispatch.*;
import apple.coreaudio.*;
import apple.coreanimation.*;
import apple.corevideo.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreMedia")
public class CMClock 
    extends CMClockOrTimebase 
     {

    
    
    protected CMClock() {}
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMClockGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMClockGetHostTimeClock")
    public static native CMClock getHostTimeClock();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMClockConvertHostTimeToSystemUnits")
    public static native long convertHostTimeToSystemUnits(CMTime hostTime);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMClockMakeHostTimeFromSystemUnits")
    public static native CMTime createHostTimeFromSystemUnits(long hostTime);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMClockGetTime")
    public native CMTime getTime();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMClockGetAnchorTime")
    protected native int getAnchorTime(CMTime outClockTime, CMTime outReferenceClockTime);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMClockMightDrift")
    public native boolean mightDrift(CMClock otherClock);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMClockInvalidate")
    public native void invalidate();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMAudioClockCreate")
    protected static native int createAudioClock(CFAllocator allocator, Todo clockOut);
    
}
