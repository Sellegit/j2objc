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
@Mapping("CMAudioFormatDescriptionRef") @Library("CoreMedia/CoreMedia.h")
public class CMAudioFormatDescription 
    extends CMFormatDescription 
     {

    
    
    protected CMAudioFormatDescription() {}

    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionCreate")
    public static native int create(CFAllocator allocator, AudioStreamBasicDescription asbd, @MachineSizedUInt long layoutSize, AudioChannelLayout layout, @MachineSizedUInt long magicCookieSize, Todo magicCookie, CFDictionary extensions, Todo outDesc);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionGetStreamBasicDescription")
    public static native AudioStreamBasicDescription getStreamBasicDescription(CMAudioFormatDescription desc);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionGetMagicCookie")
    public static native Todo getMagicCookie(CMAudioFormatDescription desc, Todo cookieSizeOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionGetChannelLayout")
    public static native AudioChannelLayout getChannelLayout(CMAudioFormatDescription desc, Todo layoutSize);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionGetFormatList")
    public static native Todo getFormatList(CMAudioFormatDescription desc, Todo formatListSize);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionGetRichestDecodableFormat")
    public static native Todo getRichestDecodableFormat(CMAudioFormatDescription desc);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionGetMostCompatibleFormat")
    public static native Todo getMostCompatibleFormat(CMAudioFormatDescription desc);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionCreateSummary")
    public static native int createSummary(CFAllocator allocator, CFArray formatDescriptionArray, int flags, Todo summaryFormatDescriptionOut);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionEqual")
    public static native boolean equalsTo(CMAudioFormatDescription desc1, CMAudioFormatDescription desc2, @Representing("CMAudioFormatDescriptionMask") long equalityMask, Todo equalityMaskOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionCreateFromBigEndianSoundDescriptionData")
    public static native int createFromBigEndianSoundDescriptionData(CFAllocator allocator, Todo soundDescriptionData, @MachineSizedUInt long soundDescriptionSize, CFString soundDescriptionFlavor, Todo audioFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionCreateFromBigEndianSoundDescriptionBlockBuffer")
    public static native int createFromBigEndianSoundDescriptionBlockBuffer(CFAllocator allocator, CMBlockBuffer soundDescriptionBlockBuffer, CFString soundDescriptionFlavor, Todo audioFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMAudioFormatDescriptionCopyAsBigEndianSoundDescriptionBlockBuffer")
    public static native int copyAsBigEndianSoundDescriptionBlockBuffer(CFAllocator allocator, CMAudioFormatDescription audioFormatDescription, CFString soundDescriptionFlavor, Todo soundDescriptionBlockBufferOut);

}
