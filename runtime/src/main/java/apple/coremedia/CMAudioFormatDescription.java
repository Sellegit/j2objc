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
public class CMAudioFormatDescription 
    extends CMFormatDescription 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionCreate")
    private static native int create(CFAllocator allocator, AudioStreamBasicDescription asbd, @MachineSizedUInt long layoutSize, AudioChannelLayout layout, @MachineSizedUInt long magicCookieSize, Todo magicCookie, NSDictionary<?, ?> extensions, Todo outDesc);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionGetStreamBasicDescription")
    public static native AudioStreamBasicDescription getStreamBasicDescription(CMAudioFormatDescription desc);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionGetMagicCookie")
    private static native Todo getMagicCookie(CMAudioFormatDescription desc, Todo cookieSizeOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionGetChannelLayout")
    private static native AudioChannelLayout getChannelLayout(CMAudioFormatDescription desc, Todo layoutSize);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionGetFormatList")
    private static native AudioFormatListItem getFormatList(CMAudioFormatDescription desc, Todo formatListSize);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionGetRichestDecodableFormat")
    public static native AudioFormatListItem getRichestDecodableFormat(CMAudioFormatDescription desc);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionGetMostCompatibleFormat")
    public static native AudioFormatListItem getMostCompatibleFormat(CMAudioFormatDescription desc);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionCreateSummary")
    private static native int createSummary(CFAllocator allocator, NSArray<?> formatDescriptionArray, int flags, Todo summaryFormatDescriptionOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionEqual")
    private static native boolean equalsTo(CMAudioFormatDescription desc1, CMAudioFormatDescription desc2, CMAudioFormatDescriptionMask equalityMask, Todo equalityMaskOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionCreateFromBigEndianSoundDescriptionData")
    private static native int createFromBigEndianSoundDescriptionData(CFAllocator allocator, Todo soundDescriptionData, @MachineSizedUInt long soundDescriptionSize, String soundDescriptionFlavor, Todo audioFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionCreateFromBigEndianSoundDescriptionBlockBuffer")
    private static native int createFromBigEndianSoundDescriptionBlockBuffer(CFAllocator allocator, CMBlockBuffer soundDescriptionBlockBuffer, String soundDescriptionFlavor, Todo audioFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionCopyAsBigEndianSoundDescriptionBlockBuffer")
    private static native int copyAsBigEndianSoundDescriptionBlockBuffer(CFAllocator allocator, CMAudioFormatDescription audioFormatDescription, String soundDescriptionFlavor, Todo soundDescriptionBlockBufferOut);
    
}
