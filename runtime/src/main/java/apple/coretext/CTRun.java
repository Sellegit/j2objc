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
@Library("CoreText/CoreText.h")
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
    public static native @MachineSizedSInt long getGlyphCount(CTRun run);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetAttributes")
    public static native CFDictionary getAttributes(CTRun run);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetStatus")
    public static native CTRunStatus getStatus(CTRun run);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetGlyphs")
    public static native void getGlyphs(CTRun run, CFRange range, Todo buffer);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetPositions")
    public static native void getPositions(CTRun run, CFRange range, CGPoint buffer);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetAdvances")
    public static native void getAdvances(CTRun run, CFRange range, CGSize buffer);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetStringIndices")
    public static native void getStringIndices(CTRun run, CFRange range, Todo buffer);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetStringRange")
    public static native CFRange getStringRange(CTRun run);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetTypographicBounds")
    public static native double getTypographicBounds(CTRun run, CFRange range, Todo ascent, Todo descent, Todo leading);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetImageBounds")
    public static native CGRect getImageBounds(CTRun run, CGContext context, CFRange range);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunGetTextMatrix")
    public static native CGAffineTransform getTextMatrix(CTRun run);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTRunDraw")
    public static native void draw(CTRun run, CGContext context, CFRange range);
    
}
