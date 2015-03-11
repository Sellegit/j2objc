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
public class CTRun 
    extends CFType 
     {

    
    
    protected CTRun() {}
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetGlyphCount")
    public native @MachineSizedSInt long getGlyphCount();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetAttributes")
    public native CFDictionary getAttributes();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetStatus")
    public native CTRunStatus getStatus();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetGlyphs")
    protected native void getGlyphs(CFRange range, Todo buffer);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetPositions")
    protected native void getPositions(CFRange range, CGPoint buffer);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetAdvances")
    protected native void getAdvances(CFRange range, CGSize buffer);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetStringIndices")
    protected native void getStringIndices(CFRange range, Todo buffer);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetStringRange")
    public native CFRange getStringRange();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetTypographicBounds")
    protected native double getTypographicBounds(CFRange range, Todo ascent, Todo descent, Todo leading);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetImageBounds")
    public native CGRect getImageBounds(CGContext context, CFRange range);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetTextMatrix")
    public native CGAffineTransform getTextMatrix();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunDraw")
    public native void draw(CGContext context, CFRange range);
    
}
