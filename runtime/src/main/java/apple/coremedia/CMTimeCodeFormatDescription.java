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
@Mapping("CMTimeCodeFormatDescriptionRef") @Library("CoreMedia/CoreMedia.h")
public class CMTimeCodeFormatDescription 
    extends CMFormatDescription 
     {

    
    
    protected CMTimeCodeFormatDescription() {}

    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeCodeFormatDescriptionCreate")
    public static native int create(CFAllocator allocator, @Representing("CMTimeCodeFormatType") long timeCodeFormatType, CMTime frameDuration, int frameQuanta, int tcFlags, CFDictionary extensions, Todo descOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeCodeFormatDescriptionGetFrameDuration")
    public static native CMTime getFrameDuration(CMTimeCodeFormatDescription timeCodeFormatDescription);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeCodeFormatDescriptionGetFrameQuanta")
    public static native int getFrameQuanta(CMTimeCodeFormatDescription timeCodeFormatDescription);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTimeCodeFormatDescriptionGetTimeCodeFlags")
    public static native CMTimeCodeFlag getTimeCodeFlags(CMTimeCodeFormatDescription desc);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMTimeCodeFormatDescriptionCreateFromBigEndianTimeCodeDescriptionData")
    public static native int createFromBigEndianTimeCodeDescriptionData(CFAllocator allocator, Todo timeCodeDescriptionData, @MachineSizedUInt long timeCodeDescriptionSize, CFString timeCodeDescriptionFlavor, Todo timeCodeFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMTimeCodeFormatDescriptionCreateFromBigEndianTimeCodeDescriptionBlockBuffer")
    public static native int createFromBigEndianTimeCodeDescriptionBlockBuffer(CFAllocator allocator, CMBlockBuffer timeCodeDescriptionBlockBuffer, CFString timeCodeDescriptionFlavor, Todo timeCodeFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMTimeCodeFormatDescriptionCopyAsBigEndianTimeCodeDescriptionBlockBuffer")
    public static native int copyAsBigEndianTimeCodeDescriptionBlockBuffer(CFAllocator allocator, CMTimeCodeFormatDescription timeCodeFormatDescription, CFString timeCodeDescriptionFlavor, Todo timeCodeDescriptionBlockBufferOut);

}
