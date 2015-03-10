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
@Library("CoreGraphics")
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
    public static native CGFont create(String name);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetNumberOfGlyphs")
    public native @MachineSizedUInt long getNumberOfGlyphs();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetUnitsPerEm")
    public native int getUnitsPerEm();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontCopyPostScriptName")
    public native String getPostScriptName();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontCopyFullName")
    public native String getFullName();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetAscent")
    public native int getAscent();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetDescent")
    public native int getDescent();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetLeading")
    public native int getLeading();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetCapHeight")
    public native int getCapHeight();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetXHeight")
    public native int getXHeight();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetFontBBox")
    public native CGRect getFontBBox();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetItalicAngle")
    public native @MachineSizedFloat double getItalicAngle();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetStemV")
    public native @MachineSizedFloat double getStemV();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetGlyphAdvances")
    protected native boolean getGlyphAdvances(Todo glyphs, @MachineSizedUInt long count, Todo advances);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetGlyphBBoxes")
    protected native boolean getGlyphBBoxes(Todo glyphs, @MachineSizedUInt long count, CGRect bboxes);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontGetGlyphWithGlyphName")
    public native char getGlyphWithGlyphName(String name);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGFontCopyGlyphNameForGlyph")
    public native String getGlyphNameForGlyph(char glyph);
    
}
