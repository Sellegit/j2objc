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
    extends CMFormatDescription 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionGetDisplayFlags")
    private static native int getDisplayFlags(CMFormatDescription desc, Todo outDisplayFlags);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionGetJustification")
    private static native int getJustification(CMFormatDescription desc, Todo outHorizontalJust, Todo outVerticalJust);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionGetDefaultTextBox")
    private static native int getDefaultTextBox(CMFormatDescription desc, boolean originIsAtTopLeft, @MachineSizedFloat double heightOfTextTrack, CGRect outDefaultTextBox);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionGetDefaultStyle")
    private static native int getDefaultStyle(CMFormatDescription desc, Todo outLocalFontID, Todo outBold, Todo outItalic, Todo outUnderline, Todo outFontSize, Todo outColorComponents);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionGetFontName")
    private static native int getFontName(CMFormatDescription desc, short localFontID, Todo outFontName);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionCreateFromBigEndianTextDescriptionData")
    private static native int createFromBigEndianTextDescriptionData(CFAllocator allocator, Todo textDescriptionData, @MachineSizedUInt long textDescriptionSize, String textDescriptionFlavor, CMMediaType mediaType, Todo textFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionCreateFromBigEndianTextDescriptionBlockBuffer")
    private static native int createFromBigEndianTextDescriptionBlockBuffer(CFAllocator allocator, CMBlockBuffer textDescriptionBlockBuffer, String textDescriptionFlavor, CMMediaType mediaType, Todo textFormatDescriptionOut);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionCopyAsBigEndianTextDescriptionBlockBuffer")
    private static native int copyAsBigEndianTextDescriptionBlockBuffer(CFAllocator allocator, CMTextFormatDescription textFormatDescription, String textDescriptionFlavor, Todo textDescriptionBlockBufferOut);
    
}