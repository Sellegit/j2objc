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
public class CMTextFormatDescription 
    extends CMFormatDescription 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionGetDisplayFlags")
    private native int getDisplayFlags(Todo outDisplayFlags);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionGetJustification")
    private native int getJustification(Todo outHorizontalJust, Todo outVerticalJust);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionGetDefaultTextBox")
    private native int getDefaultTextBox(boolean originIsAtTopLeft, @MachineSizedFloat double heightOfTextTrack, Todo outDefaultTextBox);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionGetDefaultStyle")
    private native int getDefaultStyle(Todo outLocalFontID, Todo outBold, Todo outItalic, Todo outUnderline, Todo outFontSize, Todo outColorComponents);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMTextFormatDescriptionGetFontName")
    private native int getFontName(short localFontID, Todo outFontName);
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
