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
public class CMTextFormatDescription 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionGetDisplayFlags")
    public static native int getDisplayFlags(CMFormatDescription desc, Todo outDisplayFlags);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionGetJustification")
    public static native int getJustification(CMFormatDescription desc, Todo outHorizontalJust, Todo outVerticalJust);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionGetDefaultTextBox")
    public static native int getDefaultTextBox(CMFormatDescription desc, boolean originIsAtTopLeft, @MachineSizedFloat double heightOfTextTrack, CGRect outDefaultTextBox);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionGetDefaultStyle")
    public static native int getDefaultStyle(CMFormatDescription desc, Todo outLocalFontID, Todo outBold, Todo outItalic, Todo outUnderline, Todo outFontSize, Todo outColorComponents);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionGetFontName")
    public static native int getFontName(CMFormatDescription desc, short localFontID, Todo outFontName);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionCreateFromBigEndianTextDescriptionData")
    public static native int createFromBigEndianTextDescriptionData(CFAllocator allocator, Todo textDescriptionData, @MachineSizedUInt long textDescriptionSize, CFString textDescriptionFlavor, @Representing("CMMediaType") long mediaType, Todo textFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionCreateFromBigEndianTextDescriptionBlockBuffer")
    public static native int createFromBigEndianTextDescriptionBlockBuffer(CFAllocator allocator, CMBlockBuffer textDescriptionBlockBuffer, CFString textDescriptionFlavor, @Representing("CMMediaType") long mediaType, Todo textFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionCopyAsBigEndianTextDescriptionBlockBuffer")
    public static native int copyAsBigEndianTextDescriptionBlockBuffer(CFAllocator allocator, CMTextFormatDescription textFormatDescription, CFString textDescriptionFlavor, Todo textDescriptionBlockBufferOut);
    
}
