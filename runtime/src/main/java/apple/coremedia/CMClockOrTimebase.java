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
@Mapping("CMClockOrTimebaseRef") @Library("CoreMedia/CoreMedia.h")
public class CMClockOrTimebase 
    extends CFType 
     {

    
    
    protected CMClockOrTimebase() {}

    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMSyncGetRelativeRate")
    public static native double getRelativeRate(CMClockOrTimebase ofClockOrTimebase, CMClockOrTimebase relativeToClockOrTimebase);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMSyncGetRelativeRateAndAnchorTime")
    public static native int getRelativeRateAndAnchorTime(CMClockOrTimebase ofClockOrTimebase, CMClockOrTimebase relativeToClockOrTimebase, Todo outRelativeRate, CMTime outOfClockOrTimebaseAnchorTime, CMTime outRelativeToClockOrTimebaseAnchorTime);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMSyncConvertTime")
    public static native CMTime convertTime(CMTime time, CMClockOrTimebase fromClockOrTimebase, CMClockOrTimebase toClockOrTimebase);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMSyncMightDrift")
    public static native boolean mightDrift(CMClockOrTimebase clockOrTimebase1, CMClockOrTimebase clockOrTimebase2);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CMSyncGetTime")
    public static native CMTime getTime(CMClockOrTimebase clockOrTimebase);

}
