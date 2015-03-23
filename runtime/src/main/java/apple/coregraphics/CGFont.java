package apple.coregraphics;


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
import apple.uikit.*;

/*<javadoc>*/
/*</javadoc>*/
@Mapping("CGFontRef") @Library("CoreGraphics/CoreGraphics.h")
public class CGFont 
    extends CFType 
     {

    
    public static final int FontIndexMax = 65534;
    public static final int FontIndexInvalid = 65535;
    public static final int GlyphMax = 65534;

    
    protected CGFont() {}

    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontCreateWithDataProvider")
    public static native CGFont create(CGDataProvider provider);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontCreateWithFontName")
    public static native CGFont create(CFString name);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetNumberOfGlyphs")
    public static native @MachineSizedUInt long getNumberOfGlyphs(CGFont font);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetUnitsPerEm")
    public static native int getUnitsPerEm(CGFont font);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontCopyPostScriptName")
    public static native String getPostScriptName(CGFont font);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontCopyFullName")
    public static native String getFullName(CGFont font);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetAscent")
    public static native int getAscent(CGFont font);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetDescent")
    public static native int getDescent(CGFont font);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetLeading")
    public static native int getLeading(CGFont font);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetCapHeight")
    public static native int getCapHeight(CGFont font);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetXHeight")
    public static native int getXHeight(CGFont font);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetFontBBox")
    public static native CGRect getFontBBox(CGFont font);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetItalicAngle")
    public static native @MachineSizedFloat double getItalicAngle(CGFont font);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetStemV")
    public static native @MachineSizedFloat double getStemV(CGFont font);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetGlyphAdvances")
    public static native boolean getGlyphAdvances(CGFont font, Todo glyphs, @MachineSizedUInt long count, Todo advances);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetGlyphBBoxes")
    public static native boolean getGlyphBBoxes(CGFont font, Todo glyphs, @MachineSizedUInt long count, CGRect bboxes);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetGlyphWithGlyphName")
    public static native char getGlyphWithGlyphName(CGFont font, CFString name);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontCopyGlyphNameForGlyph")
    public static native String getGlyphNameForGlyph(CGFont font, short glyph);

}
