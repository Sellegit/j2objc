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





@Library("UIKit") @Mapping("NSLayoutManagerDelegate")
public interface NSLayoutManagerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("layoutManager:shouldGenerateGlyphs:properties:characterIndexes:font:forGlyphRange:")
    @MachineSizedUInt long shouldGenerateGlyphs(NSLayoutManager layoutManager, Todo glyphs, Todo props, Todo charIndexes, UIFont aFont, NSRange glyphRange);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("layoutManager:lineSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
    @MachineSizedFloat double getLineSpacingAfterGlyph(NSLayoutManager layoutManager, @MachineSizedUInt long glyphIndex, CGRect rect);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("layoutManager:paragraphSpacingBeforeGlyphAtIndex:withProposedLineFragmentRect:")
    @MachineSizedFloat double getParagraphSpacingBeforeGlyph(NSLayoutManager layoutManager, @MachineSizedUInt long glyphIndex, CGRect rect);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("layoutManager:paragraphSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
    @MachineSizedFloat double getParagraphSpacingAfterGlyph(NSLayoutManager layoutManager, @MachineSizedUInt long glyphIndex, CGRect rect);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("layoutManager:shouldUseAction:forControlCharacterAtIndex:")
    @Representing("NSControlCharacterAction") @MachineSizedSInt long shouldUseAction(NSLayoutManager layoutManager, @Representing("NSControlCharacterAction") @MachineSizedSInt long action, @MachineSizedUInt long charIndex);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("layoutManager:shouldBreakLineByWordBeforeCharacterAtIndex:")
    boolean shouldBreakLineByWordBeforeCharacter(NSLayoutManager layoutManager, @MachineSizedUInt long charIndex);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("layoutManager:shouldBreakLineByHyphenatingBeforeCharacterAtIndex:")
    boolean shouldBreakLineByHyphenatingBeforeCharacter(NSLayoutManager layoutManager, @MachineSizedUInt long charIndex);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("layoutManager:boundingBoxForControlGlyphAtIndex:forTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
    CGRect getBoundingBoxForControlGlyph(NSLayoutManager layoutManager, @MachineSizedUInt long glyphIndex, NSTextContainer textContainer, CGRect proposedRect, CGPoint glyphPosition, @MachineSizedUInt long charIndex);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("layoutManagerDidInvalidateLayout:")
    void didInvalidateLayout(NSLayoutManager sender);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("layoutManager:didCompleteLayoutForTextContainer:atEnd:")
    void didCompleteLayout(NSLayoutManager layoutManager, NSTextContainer textContainer, boolean layoutFinishedFlag);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("layoutManager:textContainer:didChangeGeometryFromSize:")
    void didChangeGeometry(NSLayoutManager layoutManager, NSTextContainer textContainer, CGSize oldSize);
    
    /*<adapter>*/
    /*</adapter>*/
}
