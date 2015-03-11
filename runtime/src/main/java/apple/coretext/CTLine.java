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
@Library("CoreText")
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
    public static native CTLine create(NSAttributedString string);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineCreateTruncatedLine")
    public native CTLine createTruncatedLine(double width, CTLineTruncationType truncationType, CTLine truncationToken);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineCreateJustifiedLine")
    public native CTLine createJustifiedLine(@MachineSizedFloat double justificationFactor, double justificationWidth);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineGetGlyphCount")
    public native @MachineSizedSInt long getGlyphCount();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineGetGlyphRuns")
    protected native CFArray getGlyphRuns0();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineGetStringRange")
    public native CFRange getStringRange();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineGetPenOffsetForFlush")
    public native double getPenOffset(@MachineSizedFloat double flushFactor, double flushWidth);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineDraw")
    public native void draw(CGContext context);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineGetTypographicBounds")
    protected native double getTypographicBounds(Todo ascent, Todo descent, Todo leading);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CTLineGetBoundsWithOptions")
    public native CGRect getBounds(CTLineBoundsOptions options);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineGetTrailingWhitespaceWidth")
    public native double getTrailingWhitespaceWidth();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineGetImageBounds")
    public native CGRect getImageBounds(CGContext context);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineGetStringIndexForPosition")
    public native @MachineSizedSInt long getStringIndex(CGPoint position);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTLineGetOffsetForStringIndex")
    protected native @MachineSizedFloat double getOffset(@MachineSizedSInt long charIndex, Todo secondaryOffset);
    
}
