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

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class NSLayoutManagerDelegateAdapter 
    extends Object 
    implements NSLayoutManagerDelegate {

    
    
    


    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("layoutManager:shouldGenerateGlyphs:properties:characterIndexes:font:forGlyphRange:")
    public @MachineSizedUInt long shouldGenerateGlyphs(NSLayoutManager layoutManager, Todo glyphs, Todo props, Todo charIndexes, UIFont aFont, NSRange glyphRange) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("layoutManager:lineSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
    public @MachineSizedFloat double getLineSpacingAfterGlyph(NSLayoutManager layoutManager, @MachineSizedUInt long glyphIndex, CGRect rect) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("layoutManager:paragraphSpacingBeforeGlyphAtIndex:withProposedLineFragmentRect:")
    public @MachineSizedFloat double getParagraphSpacingBeforeGlyph(NSLayoutManager layoutManager, @MachineSizedUInt long glyphIndex, CGRect rect) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("layoutManager:paragraphSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
    public @MachineSizedFloat double getParagraphSpacingAfterGlyph(NSLayoutManager layoutManager, @MachineSizedUInt long glyphIndex, CGRect rect) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("layoutManager:shouldUseAction:forControlCharacterAtIndex:")
    public @Representing("NSControlCharacterAction") long shouldUseAction(NSLayoutManager layoutManager, @Representing("NSControlCharacterAction") long action, @MachineSizedUInt long charIndex) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("layoutManager:shouldBreakLineByWordBeforeCharacterAtIndex:")
    public boolean shouldBreakLineByWordBeforeCharacter(NSLayoutManager layoutManager, @MachineSizedUInt long charIndex) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("layoutManager:shouldBreakLineByHyphenatingBeforeCharacterAtIndex:")
    public boolean shouldBreakLineByHyphenatingBeforeCharacter(NSLayoutManager layoutManager, @MachineSizedUInt long charIndex) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("layoutManager:boundingBoxForControlGlyphAtIndex:forTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
    public CGRect getBoundingBoxForControlGlyph(NSLayoutManager layoutManager, @MachineSizedUInt long glyphIndex, NSTextContainer textContainer, CGRect proposedRect, CGPoint glyphPosition, @MachineSizedUInt long charIndex) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("layoutManagerDidInvalidateLayout:")
    public void didInvalidateLayout(NSLayoutManager sender) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("layoutManager:didCompleteLayoutForTextContainer:atEnd:")
    public void didCompleteLayout(NSLayoutManager layoutManager, NSTextContainer textContainer, boolean layoutFinishedFlag) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("layoutManager:textContainer:didChangeGeometryFromSize:")
    public void didChangeGeometry(NSLayoutManager layoutManager, NSTextContainer textContainer, CGSize oldSize) { throw new UnsupportedOperationException(); }

}
