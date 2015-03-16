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
@Library("CoreMedia/CoreMedia.h")
public class CMVideoFormatDescription 
    extends CMFormatDescription 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMVideoFormatDescriptionCreate")
    private static native int create(CFAllocator allocator, CMVideoCodecType codecType, int width, int height, NSDictionary<?, ?> extensions, Todo outDesc);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMVideoFormatDescriptionCreateForImageBuffer")
    private static native int create(CFAllocator allocator, CVImageBuffer imageBuffer, Todo outDesc);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMVideoFormatDescriptionGetDimensions")
    public static native CMVideoDimensions getDimensions(CMVideoFormatDescription videoDesc);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMVideoFormatDescriptionGetPresentationDimensions")
    public static native CGSize getPresentationDimensions(CMVideoFormatDescription videoDesc, boolean usePixelAspectRatio, boolean useCleanAperture);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMVideoFormatDescriptionGetCleanAperture")
    public static native CGRect getCleanAperture(CMVideoFormatDescription videoDesc, boolean originIsAtTopLeft);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMVideoFormatDescriptionGetExtensionKeysCommonWithImageBuffers")
    public static native List<String> getExtensionKeysCommonWithImageBuffers();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMVideoFormatDescriptionMatchesImageBuffer")
    public static native boolean matchesImageBuffer(CMVideoFormatDescription desc, CVImageBuffer imageBuffer);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMVideoFormatDescriptionCreateFromBigEndianImageDescriptionData")
    private static native int createFromBigEndianImageDescriptionData(CFAllocator allocator, Todo imageDescriptionData, @MachineSizedUInt long imageDescriptionSize, int imageDescriptionStringEncoding, String imageDescriptionFlavor, Todo videoFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMVideoFormatDescriptionCreateFromBigEndianImageDescriptionBlockBuffer")
    private static native int createFromBigEndianImageDescriptionBlockBuffer(CFAllocator allocator, CMBlockBuffer imageDescriptionBlockBuffer, int imageDescriptionStringEncoding, String imageDescriptionFlavor, Todo videoFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMVideoFormatDescriptionCopyAsBigEndianImageDescriptionBlockBuffer")
    private static native int copyAsBigEndianImageDescriptionBlockBuffer(CFAllocator allocator, CMVideoFormatDescription videoFormatDescription, int imageDescriptionStringEncoding, String imageDescriptionFlavor, Todo imageDescriptionBlockBufferOut);
    
}
