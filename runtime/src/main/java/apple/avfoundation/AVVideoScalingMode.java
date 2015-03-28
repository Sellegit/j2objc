package apple.avfoundation;


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
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("AVFoundation/AVFoundation.h")
public class AVVideoScalingMode 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVVideoScalingModeFit")
    public static native NSString FitValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVVideoScalingModeResize")
    public static native NSString ResizeValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVVideoScalingModeResizeAspect")
    public static native NSString ResizeAspectValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVVideoScalingModeResizeAspectFill")
    public static native NSString ResizeAspectFillValue();

}
