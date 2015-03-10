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
public class CMClosedCaptionFormatDescription 
    extends CMFormatDescription 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMClosedCaptionFormatDescriptionCreateFromBigEndianClosedCaptionDescriptionData")
    private static native int createFromBigEndianClosedCaptionDescriptionData(CFAllocator allocator, Todo closedCaptionDescriptionData, @MachineSizedUInt long closedCaptionDescriptionSize, String closedCaptionDescriptionFlavor, Todo closedCaptionFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMClosedCaptionFormatDescriptionCreateFromBigEndianClosedCaptionDescriptionBlockBuffer")
    private static native int createFromBigEndianClosedCaptionDescriptionBlockBuffer(CFAllocator allocator, CMBlockBuffer closedCaptionDescriptionBlockBuffer, String closedCaptionDescriptionFlavor, Todo closedCaptionFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMClosedCaptionFormatDescriptionCopyAsBigEndianClosedCaptionDescriptionBlockBuffer")
    private static native int copyAsBigEndianClosedCaptionDescriptionBlockBuffer(CFAllocator allocator, CMClosedCaptionFormatDescription closedCaptionFormatDescription, String closedCaptionDescriptionFlavor, Todo closedCaptionDescriptionBlockBufferOut);
    
}
