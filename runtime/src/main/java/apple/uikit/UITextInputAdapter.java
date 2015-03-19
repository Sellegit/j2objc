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
public abstract class UITextInputAdapter 
    extends UIKeyInputAdapter 
    implements UITextInput {

    
    
    
    @NotImplemented("selectedTextRange")
    public UITextRange getSelectedTextRange() { throw new UnsupportedOperationException(); }
    @Mapping("setSelectedTextRange:")
    public void setSelectedTextRange(UITextRange v) { throw new UnsupportedOperationException(); }
    @NotImplemented("markedTextRange")
    public UITextRange getMarkedTextRange() { throw new UnsupportedOperationException(); }
    @NotImplemented("markedTextStyle")
    public UITextInputTextStyle getMarkedTextStyle() { throw new UnsupportedOperationException(); }
    @Mapping("setMarkedTextStyle:")
    public void setMarkedTextStyle(UITextInputTextStyle v) { throw new UnsupportedOperationException(); }
    @NotImplemented("beginningOfDocument")
    public UITextPosition getBeginningOfDocument() { throw new UnsupportedOperationException(); }
    @NotImplemented("endOfDocument")
    public UITextPosition getEndOfDocument() { throw new UnsupportedOperationException(); }
    @NotImplemented("inputDelegate")
    public UITextInputDelegate getInputDelegate() { throw new UnsupportedOperationException(); }
    @Mapping("setInputDelegate:")
    public void setInputDelegate(UITextInputDelegate v) { throw new UnsupportedOperationException(); }
    @NotImplemented("tokenizer")
    public UITextInputTokenizer getTokenizer() { throw new UnsupportedOperationException(); }
    @NotImplemented("textInputView")
    public UIView getTextInputView() { throw new UnsupportedOperationException(); }
    @NotImplemented("selectionAffinity")
    public @Representing("UITextStorageDirection") long getSelectionAffinity() { throw new UnsupportedOperationException(); }
    @Mapping("setSelectionAffinity:")
    public void setSelectionAffinity(@Representing("UITextStorageDirection") long v) { throw new UnsupportedOperationException(); }
    
    
    
    @NotImplemented("textInRange:")
    public String getText(UITextRange range) { throw new UnsupportedOperationException(); }
    @NotImplemented("replaceRange:withText:")
    public void replaceText(UITextRange range, String text) { throw new UnsupportedOperationException(); }
    @NotImplemented("setMarkedText:selectedRange:")
    public void setMarkedText(String markedText, NSRange selectedRange) { throw new UnsupportedOperationException(); }
    @NotImplemented("unmarkText")
    public void unmarkText() { throw new UnsupportedOperationException(); }
    @NotImplemented("textRangeFromPosition:toPosition:")
    public UITextRange getTextRange(UITextPosition fromPosition, UITextPosition toPosition) { throw new UnsupportedOperationException(); }
    @NotImplemented("positionFromPosition:offset:")
    public UITextPosition getPositionFromPosition(UITextPosition position, @MachineSizedSInt long offset) { throw new UnsupportedOperationException(); }
    @NotImplemented("positionFromPosition:inDirection:offset:")
    public UITextPosition getPositionFromPosition(UITextPosition position, @Representing("UITextLayoutDirection") long direction, @MachineSizedSInt long offset) { throw new UnsupportedOperationException(); }
    @NotImplemented("comparePosition:toPosition:")
    public @Representing("NSComparisonResult") long comparePositions(UITextPosition position, UITextPosition other) { throw new UnsupportedOperationException(); }
    @NotImplemented("offsetFromPosition:toPosition:")
    public @MachineSizedSInt long getOffset(UITextPosition from, UITextPosition toPosition) { throw new UnsupportedOperationException(); }
    @NotImplemented("positionWithinRange:farthestInDirection:")
    public UITextPosition getPositionWithinRangeFarthestInDirection(UITextRange range, @Representing("UITextLayoutDirection") long direction) { throw new UnsupportedOperationException(); }
    @NotImplemented("characterRangeByExtendingPosition:inDirection:")
    public UITextRange getCharacterRange(UITextPosition position, @Representing("UITextLayoutDirection") long direction) { throw new UnsupportedOperationException(); }
    @NotImplemented("baseWritingDirectionForPosition:inDirection:")
    public @Representing("UITextWritingDirection") long getBaseWritingDirection(UITextPosition position, @Representing("UITextStorageDirection") long direction) { throw new UnsupportedOperationException(); }
    @NotImplemented("setBaseWritingDirection:forRange:")
    public void setBaseWritingDirection(@Representing("UITextWritingDirection") long writingDirection, UITextRange range) { throw new UnsupportedOperationException(); }
    @NotImplemented("firstRectForRange:")
    public CGRect getFirstRect(UITextRange range) { throw new UnsupportedOperationException(); }
    @NotImplemented("caretRectForPosition:")
    public CGRect getCaretRect(UITextPosition position) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("selectionRectsForRange:")
    public NSArray<UITextSelectionRect> getSelectionRects(UITextRange range) { throw new UnsupportedOperationException(); }
    @NotImplemented("closestPositionToPoint:")
    public UITextPosition getClosestPosition(CGPoint point) { throw new UnsupportedOperationException(); }
    @NotImplemented("closestPositionToPoint:withinRange:")
    public UITextPosition getClosestPosition(CGPoint point, UITextRange range) { throw new UnsupportedOperationException(); }
    @NotImplemented("characterRangeAtPoint:")
    public UITextRange getCharacterRange(CGPoint point) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("shouldChangeTextInRange:replacementText:")
    public boolean shouldChangeText(UITextRange range, String text) { throw new UnsupportedOperationException(); }
    @NotImplemented("textStylingAtPosition:inDirection:")
    public UITextInputTextStyle getTextStyling(UITextPosition position, @Representing("UITextStorageDirection") long direction) { throw new UnsupportedOperationException(); }
    @NotImplemented("positionWithinRange:atCharacterOffset:")
    public UITextPosition getPositionWithinRangeAtCharacterOffset(UITextRange range, @MachineSizedSInt long offset) { throw new UnsupportedOperationException(); }
    @NotImplemented("characterOffsetOfPosition:withinRange:")
    public @MachineSizedSInt long getCharacterOffset(UITextPosition position, UITextRange range) { throw new UnsupportedOperationException(); }
    @NotImplemented("insertDictationResult:")
    public void insertDictationResult(NSArray<?> dictationResult) { throw new UnsupportedOperationException(); }
    @NotImplemented("dictationRecordingDidEnd")
    public void dictationRecordingDidEnd() { throw new UnsupportedOperationException(); }
    @NotImplemented("dictationRecognitionFailed")
    public void dictationRecognitionFailed() { throw new UnsupportedOperationException(); }
    @NotImplemented("insertDictationResultPlaceholder")
    public Object getInsertDictationResultPlaceholder() { throw new UnsupportedOperationException(); }
    @NotImplemented("frameForDictationResultPlaceholder:")
    public CGRect getDictationResultPlaceholderFrame(Object placeholder) { throw new UnsupportedOperationException(); }
    @NotImplemented("removeDictationResultPlaceholder:willInsertResult:")
    public void removeDictationResultPlaceholder(Object placeholder, boolean willInsertResult) { throw new UnsupportedOperationException(); }
    
}
