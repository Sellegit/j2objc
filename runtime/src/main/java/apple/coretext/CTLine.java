package apple.coretext;


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

/*<javadoc>*/
/*</javadoc>*/
@Mapping("CTLineRef") @Library("CoreText/CoreText.h")
public class CTLine 
    extends CFType 
     {

    
    
    protected CTLine() {}

    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineCreateWithAttributedString")
    public static native CTLine create(CFAttributedString string);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineCreateTruncatedLine")
    public static native CTLine createTruncatedLine(CTLine line, double width, @Representing("CTLineTruncationType") long truncationType, CTLine truncationToken);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineCreateJustifiedLine")
    public static native CTLine createJustifiedLine(CTLine line, @MachineSizedFloat double justificationFactor, double justificationWidth);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineGetGlyphCount")
    public static native @MachineSizedSInt long getGlyphCount(CTLine line);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineGetGlyphRuns")
    public static native CFArray getGlyphRuns0(CTLine line);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineGetStringRange")
    public static native CFRange getStringRange(CTLine line);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineGetPenOffsetForFlush")
    public static native double getPenOffset(CTLine line, @MachineSizedFloat double flushFactor, double flushWidth);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineDraw")
    public static native void draw(CTLine line, CGContext context);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineGetTypographicBounds")
    public static native double getTypographicBounds(CTLine line, Todo ascent, Todo descent, Todo leading);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CTLineGetBoundsWithOptions")
    public static native CGRect getBounds(CTLine line, @Representing("CTLineBoundsOptions") long options);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineGetTrailingWhitespaceWidth")
    public static native double getTrailingWhitespaceWidth(CTLine line);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineGetImageBounds")
    public static native CGRect getImageBounds(CTLine line, CGContext context);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineGetStringIndexForPosition")
    public static native @MachineSizedSInt long getStringIndex(CTLine line, CGPoint position);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineGetOffsetForStringIndex")
    public static native @MachineSizedFloat double getOffset(CTLine line, @MachineSizedSInt long charIndex, Todo secondaryOffset);

}
