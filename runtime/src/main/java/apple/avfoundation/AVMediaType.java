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
public class AVMediaType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMediaTypeVideo")
    public static native String VideoValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMediaTypeAudio")
    public static native String AudioValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMediaTypeText")
    public static native String TextValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMediaTypeClosedCaption")
    public static native String ClosedCaptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMediaTypeSubtitle")
    public static native String SubtitleValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMediaTypeTimecode")
    public static native String TimecodeValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("AVMediaTypeMetadata")
    public static native String MetadataValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMediaTypeMuxed")
    public static native String MuxedValue();

}
