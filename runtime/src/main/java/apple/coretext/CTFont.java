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
public class CTFont 
    extends CFType 
     {

    
    
    protected CTFont() {}
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateWithName")
    public static native CTFont create(String name, @MachineSizedFloat double size, CGAffineTransform matrix);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateWithFontDescriptor")
    public static native CTFont create(CTFontDescriptor descriptor, @MachineSizedFloat double size, CGAffineTransform matrix);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateWithNameAndOptions")
    public static native CTFont create(String name, @MachineSizedFloat double size, CGAffineTransform matrix, CTFontOptions options);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateWithFontDescriptorAndOptions")
    public static native CTFont create(CTFontDescriptor descriptor, @MachineSizedFloat double size, CGAffineTransform matrix, CTFontOptions options);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateUIFontForLanguage")
    public static native CTFont create(CTFontUIFontType uiType, @MachineSizedFloat double size, String language);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateCopyWithAttributes")
    public static native CTFont createCopy(CTFont font, @MachineSizedFloat double size, CGAffineTransform matrix, CTFontDescriptor attributes);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateCopyWithSymbolicTraits")
    public static native CTFont createCopy(CTFont font, @MachineSizedFloat double size, CGAffineTransform matrix, CTFontSymbolicTraits symTraitValue, CTFontSymbolicTraits symTraitMask);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateCopyWithFamily")
    public static native CTFont createCopy(CTFont font, @MachineSizedFloat double size, CGAffineTransform matrix, String family);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateForString")
    public native CTFont create(String string, CFRange range);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyFontDescriptor")
    public native CTFontDescriptor getFontDescriptor();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyAttribute")
    public native CFType getAttribute(String attribute);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetSize")
    public native @MachineSizedFloat double getSize();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetMatrix")
    public native CGAffineTransform getMatrix();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetSymbolicTraits")
    public native CTFontSymbolicTraits getSymbolicTraits();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyTraits")
    public native CTFontTraits getTraits();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyPostScriptName")
    public native String getPostScriptName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyFamilyName")
    public native String getFamilyName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyFullName")
    public native String getFullName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyDisplayName")
    public native String getDisplayName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyName")
    protected native String getName(CFString nameKey);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyLocalizedName")
    protected native String getLocalizedName(CFString nameKey, Todo actualLanguage);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyCharacterSet")
    public native NSCharacterSet getCharacterSet();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetStringEncoding")
    public native int getStringEncoding();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopySupportedLanguages")
    public native List<String> getSupportedLanguages();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetGlyphsForCharacters")
    protected native boolean getGlyphs(Todo characters, Todo glyphs, @MachineSizedSInt long count);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetAscent")
    public native @MachineSizedFloat double getAscent();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetDescent")
    public native @MachineSizedFloat double getDescent();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetLeading")
    public native @MachineSizedFloat double getLeading();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetUnitsPerEm")
    public native int getUnitsPerEm();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetGlyphCount")
    public native @MachineSizedSInt long getGlyphCount();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetBoundingBox")
    public native CGRect getBoundingBox();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetUnderlinePosition")
    public native @MachineSizedFloat double getUnderlinePosition();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetUnderlineThickness")
    public native @MachineSizedFloat double getUnderlineThickness();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetSlantAngle")
    public native @MachineSizedFloat double getSlantAngle();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetCapHeight")
    public native @MachineSizedFloat double getCapHeight();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetXHeight")
    public native @MachineSizedFloat double getXHeight();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetGlyphWithName")
    public native short getGlyph(String glyphName);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetBoundingRectsForGlyphs")
    protected native CGRect getBoundingRects(CTFontOrientation orientation, Todo glyphs, CGRect boundingRects, @MachineSizedSInt long count);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CTFontGetOpticalBoundsForGlyphs")
    protected native CGRect getOpticalBounds(Todo glyphs, CGRect boundingRects, @MachineSizedSInt long count, @MachineSizedUInt long options);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetAdvancesForGlyphs")
    protected native double getAdvances(CTFontOrientation orientation, Todo glyphs, CGSize advances, @MachineSizedSInt long count);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetVerticalTranslationsForGlyphs")
    protected native void getVerticalTranslations(Todo glyphs, CGSize translations, @MachineSizedSInt long count);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreatePathForGlyph")
    public native CGPath createPath(short glyph, CGAffineTransform transform);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyVariationAxes")
    public native List<CTFontVariationAxes> getVariationAxes();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyVariation")
    public native CFDictionary getVariation();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyFeatures")
    public native CFArray getFeatures();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyFeatureSettings")
    public native CFArray getFeatureSettings();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyGraphicsFont")
    public native CGFont getGraphicsFont(Todo attributes);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCreateWithGraphicsFont")
    public static native CTFont create(CGFont graphicsFont, @MachineSizedFloat double size, CGAffineTransform matrix, CTFontDescriptor attributes);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyAvailableTables")
    public native CFArray getAvailableTables(CTFontTableOptions options);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCopyTable")
    public native NSData getTable(CTFontTableTag table, CTFontTableOptions options);
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalFunction("CTFontDrawGlyphs")
    public native void drawGlyphs(Todo glyphs, CGPoint positions, @MachineSizedUInt long count, CGContext context);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontGetLigatureCaretPositions")
    public native @MachineSizedSInt long getLigatureCaretPositions(short glyph, Todo positions, @MachineSizedSInt long maxPositions);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CTFontCopyDefaultCascadeListForLanguages")
    public native CFArray getDefaultCascadeList(List<String> languagePrefList);
    
}
