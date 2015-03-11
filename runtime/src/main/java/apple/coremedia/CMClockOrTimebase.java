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
public class CMClockOrTimebase 
    extends CFType 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMSyncGetRelativeRate")
    public native double getRelativeRate(CMClockOrTimebase relativeToClockOrTimebase);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMSyncGetRelativeRateAndAnchorTime")
    private native int getRelativeRateAndAnchorTime(CMClockOrTimebase relativeToClockOrTimebase, Todo outRelativeRate, Todo outOfClockOrTimebaseAnchorTime, Todo outRelativeToClockOrTimebaseAnchorTime);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMSyncConvertTime")
    public static native CMTime convertTime(CMTime time, CMClockOrTimebase fromClockOrTimebase, CMClockOrTimebase toClockOrTimebase);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMSyncMightDrift")
    public native boolean mightDrift(CMClockOrTimebase clockOrTimebase2);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMSyncGetTime")
    public native CMTime getTime();
    
}
