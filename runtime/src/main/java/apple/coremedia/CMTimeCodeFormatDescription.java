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
public class CMTimeCodeFormatDescription 
    extends CMFormatDescription 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeCodeFormatDescriptionCreate")
    private static native int create(CFAllocator allocator, CMTimeCodeFormatType timeCodeFormatType, CMTime frameDuration, int frameQuanta, CMTimeCodeFlag tcFlags, CMTimeCodeFormatDescriptionExtension extensions, Todo descOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeCodeFormatDescriptionGetFrameDuration")
    public native CMTime getFrameDuration();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeCodeFormatDescriptionGetFrameQuanta")
    public native int getFrameQuanta();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeCodeFormatDescriptionGetTimeCodeFlags")
    public native CMTimeCodeFlag getTimeCodeFlags();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMTimeCodeFormatDescriptionCreateFromBigEndianTimeCodeDescriptionData")
    private static native int createFromBigEndianTimeCodeDescriptionData(CFAllocator allocator, Todo timeCodeDescriptionData, @MachineSizedUInt long timeCodeDescriptionSize, String timeCodeDescriptionFlavor, Todo timeCodeFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMTimeCodeFormatDescriptionCreateFromBigEndianTimeCodeDescriptionBlockBuffer")
    private static native int createFromBigEndianTimeCodeDescriptionBlockBuffer(CFAllocator allocator, CMBlockBuffer timeCodeDescriptionBlockBuffer, String timeCodeDescriptionFlavor, Todo timeCodeFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMTimeCodeFormatDescriptionCopyAsBigEndianTimeCodeDescriptionBlockBuffer")
    private static native int copyAsBigEndianTimeCodeDescriptionBlockBuffer(CFAllocator allocator, CMTimeCodeFormatDescription timeCodeFormatDescription, String timeCodeDescriptionFlavor, Todo timeCodeDescriptionBlockBufferOut);
    
}
