package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("NSLayoutManager")
public class NSLayoutManager 
    extends NSObject 
    implements NSCoding {

    
    
    public NSLayoutManager() {}
    
    
    @Mapping("textStorage")
    public native NSTextStorage getTextStorage();
    @Mapping("setTextStorage:")
    public native void setTextStorage(NSTextStorage v);
    @Mapping("textContainers")
    public native NSArray<NSTextContainer> getTextContainers();
    @Mapping("delegate")
    public native NSLayoutManagerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(NSLayoutManagerDelegate v);
    @Mapping("showsInvisibleCharacters")
    public native boolean showsInvisibleCharacters();
    @Mapping("setShowsInvisibleCharacters:")
    public native void setShowsInvisibleCharacters(boolean v);
    @Mapping("showsControlCharacters")
    public native boolean showsControlCharacters();
    @Mapping("setShowsControlCharacters:")
    public native void setShowsControlCharacters(boolean v);
    @Mapping("hyphenationFactor")
    public native @MachineSizedFloat double getHyphenationFactor();
    @Mapping("setHyphenationFactor:")
    public native void setHyphenationFactor(@MachineSizedFloat double v);
    @Mapping("usesFontLeading")
    public native boolean usesFontLeading();
    @Mapping("setUsesFontLeading:")
    public native void setUsesFontLeading(boolean v);
    @Mapping("allowsNonContiguousLayout")
    public native boolean allowsNonContiguousLayout();
    @Mapping("setAllowsNonContiguousLayout:")
    public native void setAllowsNonContiguousLayout(boolean v);
    @Mapping("hasNonContiguousLayout")
    public native boolean hasNonContiguousLayout();
    @Mapping("numberOfGlyphs")
    public native @MachineSizedUInt long getNumberOfGlyphs();
    @Mapping("extraLineFragmentRect")
    public native CGRect getExtraLineFragmentRect();
    @Mapping("extraLineFragmentUsedRect")
    public native CGRect getExtraLineFragmentUsedRect();
    @Mapping("extraLineFragmentTextContainer")
    public native NSTextContainer getExtraLineFragmentTextContainer();
    
    
    
    @Mapping("addTextContainer:")
    public native void addTextContainer(NSTextContainer container);
    @Mapping("insertTextContainer:atIndex:")
    public native void insertTextContainer(NSTextContainer container, @MachineSizedUInt long index);
    @Mapping("removeTextContainerAtIndex:")
    public native void removeTextContainer(@MachineSizedUInt long index);
    @Mapping("textContainerChangedGeometry:")
    public native void textContainerChangedGeometry(NSTextContainer container);
    @Mapping("invalidateGlyphsForCharacterRange:changeInLength:actualCharacterRange:")
    public native void invalidateGlyphs(NSRange charRange, @MachineSizedSInt long delta, NSRange actualCharRange);
    @Mapping("invalidateLayoutForCharacterRange:actualCharacterRange:")
    public native void invalidateLayout(NSRange charRange, NSRange actualCharRange);
    @Mapping("invalidateDisplayForCharacterRange:")
    public native void invalidateDisplayForCharacterRange(NSRange charRange);
    @Mapping("invalidateDisplayForGlyphRange:")
    public native void invalidateDisplayForGlyphRange(NSRange glyphRange);
    @Mapping("processEditingForTextStorage:edited:range:changeInLength:invalidatedRange:")
    public native void processEditing(NSTextStorage textStorage, @Representing("NSTextStorageEditActions") @MachineSizedUInt long editMask, NSRange newCharRange, @MachineSizedSInt long delta, NSRange invalidatedCharRange);
    @Mapping("ensureGlyphsForCharacterRange:")
    public native void ensureGlyphsForCharacterRange(NSRange charRange);
    @Mapping("ensureGlyphsForGlyphRange:")
    public native void ensureGlyphsForGlyphRange(NSRange glyphRange);
    @Mapping("ensureLayoutForCharacterRange:")
    public native void ensureLayoutForCharacterRange(NSRange charRange);
    @Mapping("ensureLayoutForGlyphRange:")
    public native void ensureLayoutForGlyphRange(NSRange glyphRange);
    @Mapping("ensureLayoutForTextContainer:")
    public native void ensureLayoutForTextContainer(NSTextContainer container);
    @Mapping("ensureLayoutForBoundingRect:inTextContainer:")
    public native void ensureLayoutForBoundingRect(CGRect bounds, NSTextContainer container);
    @Mapping("setGlyphs:properties:characterIndexes:font:forGlyphRange:")
    public native void setGlyphs(Todo glyphs, Todo props, Todo charIndexes, UIFont aFont, NSRange glyphRange);
    @Mapping("glyphAtIndex:")
    public native short getGlyph(@MachineSizedUInt long glyphIndex);
    @Mapping("isValidGlyphIndex:")
    public native boolean isValidGlyphIndex(@MachineSizedUInt long glyphIndex);
    @Mapping("propertyForGlyphAtIndex:")
    public native @Representing("NSGlyphProperty") @MachineSizedSInt long getPropertyForGlyph(@MachineSizedUInt long glyphIndex);
    @Mapping("characterIndexForGlyphAtIndex:")
    public native @MachineSizedUInt long getCharacterIndexForGlyph(@MachineSizedUInt long glyphIndex);
    @Mapping("glyphIndexForCharacterAtIndex:")
    public native @MachineSizedUInt long getGlyphIndexForCharacter(@MachineSizedUInt long charIndex);
    @Mapping("getGlyphsInRange:glyphs:properties:characterIndexes:bidiLevels:")
    public native @MachineSizedUInt long getGlyphs(NSRange glyphRange, Todo glyphBuffer, Todo props, Todo charIndexBuffer, Todo bidiLevelBuffer);
    @Mapping("setTextContainer:forGlyphRange:")
    public native void setTextContainer(NSTextContainer container, NSRange glyphRange);
    @Mapping("setLineFragmentRect:forGlyphRange:usedRect:")
    public native void setLineFragmentRect(CGRect fragmentRect, NSRange glyphRange, CGRect usedRect);
    @Mapping("setExtraLineFragmentRect:usedRect:textContainer:")
    public native void setExtraLineFragmentRect(CGRect fragmentRect, CGRect usedRect, NSTextContainer container);
    @Mapping("setLocation:forStartOfGlyphRange:")
    public native void setLocation(CGPoint location, NSRange glyphRange);
    @Mapping("setNotShownAttribute:forGlyphAtIndex:")
    public native void setNotShownAttribute(boolean flag, @MachineSizedUInt long glyphIndex);
    @Mapping("setDrawsOutsideLineFragment:forGlyphAtIndex:")
    public native void setDrawsOutsideLineFragment(boolean flag, @MachineSizedUInt long glyphIndex);
    @Mapping("setAttachmentSize:forGlyphRange:")
    public native void setAttachmentSize(CGSize attachmentSize, NSRange glyphRange);
    @Mapping("getFirstUnlaidCharacterIndex:glyphIndex:")
    public native void getFirstUnlaidCharacterIndex(Todo charIndex, Todo glyphIndex);
    @Mapping("firstUnlaidCharacterIndex")
    public native @MachineSizedUInt long getFirstUnlaidCharacterIndex();
    @Mapping("firstUnlaidGlyphIndex")
    public native @MachineSizedUInt long getFirstUnlaidGlyphIndex();
    @Mapping("textContainerForGlyphAtIndex:effectiveRange:")
    public native NSTextContainer getTextContainer(@MachineSizedUInt long glyphIndex, NSRange effectiveGlyphRange);
    @Mapping("usedRectForTextContainer:")
    public native CGRect getUsedRectForTextContainer(NSTextContainer container);
    @Mapping("lineFragmentRectForGlyphAtIndex:effectiveRange:")
    public native CGRect getLineFragmentRect(@MachineSizedUInt long glyphIndex, NSRange effectiveGlyphRange);
    @Mapping("lineFragmentUsedRectForGlyphAtIndex:effectiveRange:")
    public native CGRect getLineFragmentUsedRect(@MachineSizedUInt long glyphIndex, NSRange effectiveGlyphRange);
    @Mapping("locationForGlyphAtIndex:")
    public native CGPoint getLocation(@MachineSizedUInt long glyphIndex);
    @Mapping("notShownAttributeForGlyphAtIndex:")
    public native boolean getNotShownAttribute(@MachineSizedUInt long glyphIndex);
    @Mapping("drawsOutsideLineFragmentForGlyphAtIndex:")
    public native boolean getDrawsOutsideLineFragment(@MachineSizedUInt long glyphIndex);
    @Mapping("attachmentSizeForGlyphAtIndex:")
    public native CGSize getAttachmentSize(@MachineSizedUInt long glyphIndex);
    @Mapping("truncatedGlyphRangeInLineFragmentForGlyphAtIndex:")
    public native NSRange getTruncatedGlyphRangeInLineFragment(@MachineSizedUInt long glyphIndex);
    @Mapping("glyphRangeForCharacterRange:actualCharacterRange:")
    public native NSRange getGlyphRangeForCharacterRange(NSRange charRange, NSRange actualCharRange);
    @Mapping("characterRangeForGlyphRange:actualGlyphRange:")
    public native NSRange getCharacterRangeForGlyphRange(NSRange glyphRange, NSRange actualGlyphRange);
    @Mapping("glyphRangeForTextContainer:")
    public native NSRange glyphRangeForTextContainer(NSTextContainer container);
    @Mapping("rangeOfNominallySpacedGlyphsContainingIndex:")
    public native NSRange getRangeOfNominallySpacedGlyphsContainingIndex(@MachineSizedUInt long glyphIndex);
    @Mapping("boundingRectForGlyphRange:inTextContainer:")
    public native CGRect getBoundingRectForGlyphRange(NSRange glyphRange, NSTextContainer container);
    @Mapping("glyphRangeForBoundingRect:inTextContainer:")
    public native NSRange getGlyphRangeForBoundingRect(CGRect bounds, NSTextContainer container);
    @Mapping("glyphRangeForBoundingRectWithoutAdditionalLayout:inTextContainer:")
    public native NSRange getGlyphRangeForBoundingRectWithoutAdditionalLayout(CGRect bounds, NSTextContainer container);
    @Mapping("glyphIndexForPoint:inTextContainer:fractionOfDistanceThroughGlyph:")
    public native @MachineSizedUInt long getSlyphIndexForPoint(CGPoint point, NSTextContainer container, Todo partialFraction);
    @Mapping("glyphIndexForPoint:inTextContainer:")
    public native @MachineSizedUInt long getSlyphIndexForPoint(CGPoint point, NSTextContainer container);
    @Mapping("fractionOfDistanceThroughGlyphForPoint:inTextContainer:")
    public native @MachineSizedFloat double getFractionOfDistanceThroughGlyphForPoint(CGPoint point, NSTextContainer container);
    @Mapping("characterIndexForPoint:inTextContainer:fractionOfDistanceBetweenInsertionPoints:")
    public native @MachineSizedUInt long getCharacterIndexForPoint(CGPoint point, NSTextContainer container, Todo partialFraction);
    @Mapping("getLineFragmentInsertionPointsForCharacterAtIndex:alternatePositions:inDisplayOrder:positions:characterIndexes:")
    public native @MachineSizedUInt long getLineFragmentInsertionPoints(@MachineSizedUInt long charIndex, boolean aFlag, boolean dFlag, Todo positions, Todo charIndexes);
    @Mapping("enumerateLineFragmentsForGlyphRange:usingBlock:")
    public native void enumerateLineFragments(NSRange glyphRange, @Block("(, , , , )") VoidBlock5<CGRect, CGRect, NSTextContainer, NSRange, Todo> block);
    @Mapping("enumerateEnclosingRectsForGlyphRange:withinSelectedGlyphRange:inTextContainer:usingBlock:")
    public native void enumerateEnclosingRects(NSRange glyphRange, NSRange selectedRange, NSTextContainer textContainer, @Block("(, )") VoidBlock2<CGRect, Todo> block);
    @Mapping("drawBackgroundForGlyphRange:atPoint:")
    public native void drawBackground(NSRange glyphsToShow, CGPoint origin);
    @Mapping("drawGlyphsForGlyphRange:atPoint:")
    public native void drawGlyphs(NSRange glyphsToShow, CGPoint origin);
    @Mapping("showCGGlyphs:positions:count:font:matrix:attributes:inContext:")
    protected native void showCGGlyphs(Todo glyphs, CGPoint positions, @MachineSizedUInt long glyphCount, UIFont font, CGAffineTransform textMatrix, NSDictionary<?, ?> attributes, CGContext graphicsContext);
    @Mapping("fillBackgroundRectArray:count:forCharacterRange:color:")
    protected native void fillBackground(CGRect rectArray, @MachineSizedUInt long rectCount, NSRange charRange, UIColor color);
    @Mapping("drawUnderlineForGlyphRange:underlineType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void drawUnderline(NSRange glyphRange, @Representing("NSUnderlineStyle") @MachineSizedSInt long underlineVal, @MachineSizedFloat double baselineOffset, CGRect lineRect, NSRange lineGlyphRange, CGPoint containerOrigin);
    @Mapping("underlineGlyphRange:underlineType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void underline(NSRange glyphRange, @Representing("NSUnderlineStyle") @MachineSizedSInt long underlineVal, CGRect lineRect, NSRange lineGlyphRange, CGPoint containerOrigin);
    @Mapping("drawStrikethroughForGlyphRange:strikethroughType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void drawStrikethrough(NSRange glyphRange, @Representing("NSUnderlineStyle") @MachineSizedSInt long strikethroughVal, @MachineSizedFloat double baselineOffset, CGRect lineRect, NSRange lineGlyphRange, CGPoint containerOrigin);
    @Mapping("strikethroughGlyphRange:strikethroughType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void strikethrough(NSRange glyphRange, @Representing("NSUnderlineStyle") @MachineSizedSInt long strikethroughVal, CGRect lineRect, NSRange lineGlyphRange, CGPoint containerOrigin);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
