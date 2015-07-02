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
public class AVMetadataKeySpace 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataKeySpaceCommon")
    public static native String CommonValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataKeySpaceQuickTimeUserData")
    public static native String QuickTimeUserDataValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVMetadataKeySpaceISOUserData")
    public static native String ISOUserDataValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataKeySpaceQuickTimeMetadata")
    public static native String QuickTimeMetadataValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataKeySpaceiTunes")
    public static native String iTunesValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataKeySpaceID3")
    public static native String ID3Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataKeySpaceIcy")
    public static native String IcyValue();

}
