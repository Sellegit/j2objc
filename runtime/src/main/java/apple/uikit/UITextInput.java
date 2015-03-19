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





@Library("UIKit/UIKit.h") @Mapping("UITextInput")
public interface UITextInput 
    extends UIKeyInput {

    
    
    @Mapping("selectedTextRange")
    UITextRange getSelectedTextRange();
    @Mapping("setSelectedTextRange:")
    void setSelectedTextRange(UITextRange v);
    @Mapping("markedTextRange")
    UITextRange getMarkedTextRange();
    @Mapping("markedTextStyle")
    UITextInputTextStyle getMarkedTextStyle();
    @Mapping("setMarkedTextStyle:")
    void setMarkedTextStyle(UITextInputTextStyle v);
    @Mapping("beginningOfDocument")
    UITextPosition getBeginningOfDocument();
    @Mapping("endOfDocument")
    UITextPosition getEndOfDocument();
    @Mapping("inputDelegate")
    UITextInputDelegate getInputDelegate();
    @Mapping("setInputDelegate:")
    void setInputDelegate(UITextInputDelegate v);
    @Mapping("tokenizer")
    UITextInputTokenizer getTokenizer();
    @Mapping("textInputView")
    UIView getTextInputView();
    @Mapping("selectionAffinity")
    @Representing("UITextStorageDirection") long getSelectionAffinity();
    @Mapping("setSelectionAffinity:")
    void setSelectionAffinity(@Representing("UITextStorageDirection") long v);
    
    
    @Mapping("textInRange:")
    String getText(UITextRange range);
    @Mapping("replaceRange:withText:")
    void replaceText(UITextRange range, String text);
    @Mapping("setMarkedText:selectedRange:")
    void setMarkedText(String markedText, NSRange selectedRange);
    @Mapping("unmarkText")
    void unmarkText();
    @Mapping("textRangeFromPosition:toPosition:")
    UITextRange getTextRange(UITextPosition fromPosition, UITextPosition toPosition);
    @Mapping("positionFromPosition:offset:")
    UITextPosition getPositionFromPosition(UITextPosition position, @MachineSizedSInt long offset);
    @Mapping("positionFromPosition:inDirection:offset:")
    UITextPosition getPositionFromPosition(UITextPosition position, @Representing("UITextLayoutDirection") long direction, @MachineSizedSInt long offset);
    @Mapping("comparePosition:toPosition:")
    @Representing("NSComparisonResult") long comparePositions(UITextPosition position, UITextPosition other);
    @Mapping("offsetFromPosition:toPosition:")
    @MachineSizedSInt long getOffset(UITextPosition from, UITextPosition toPosition);
    @Mapping("positionWithinRange:farthestInDirection:")
    UITextPosition getPositionWithinRangeFarthestInDirection(UITextRange range, @Representing("UITextLayoutDirection") long direction);
    @Mapping("characterRangeByExtendingPosition:inDirection:")
    UITextRange getCharacterRange(UITextPosition position, @Representing("UITextLayoutDirection") long direction);
    @Mapping("baseWritingDirectionForPosition:inDirection:")
    @Representing("UITextWritingDirection") long getBaseWritingDirection(UITextPosition position, @Representing("UITextStorageDirection") long direction);
    @Mapping("setBaseWritingDirection:forRange:")
    void setBaseWritingDirection(@Representing("UITextWritingDirection") long writingDirection, UITextRange range);
    @Mapping("firstRectForRange:")
    CGRect getFirstRect(UITextRange range);
    @Mapping("caretRectForPosition:")
    CGRect getCaretRect(UITextPosition position);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("selectionRectsForRange:")
    NSArray<UITextSelectionRect> getSelectionRects(UITextRange range);
    @Mapping("closestPositionToPoint:")
    UITextPosition getClosestPosition(CGPoint point);
    @Mapping("closestPositionToPoint:withinRange:")
    UITextPosition getClosestPosition(CGPoint point, UITextRange range);
    @Mapping("characterRangeAtPoint:")
    UITextRange getCharacterRange(CGPoint point);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("shouldChangeTextInRange:replacementText:")
    boolean shouldChangeText(UITextRange range, String text);
    @Mapping("textStylingAtPosition:inDirection:")
    UITextInputTextStyle getTextStyling(UITextPosition position, @Representing("UITextStorageDirection") long direction);
    @Mapping("positionWithinRange:atCharacterOffset:")
    UITextPosition getPositionWithinRangeAtCharacterOffset(UITextRange range, @MachineSizedSInt long offset);
    @Mapping("characterOffsetOfPosition:withinRange:")
    @MachineSizedSInt long getCharacterOffset(UITextPosition position, UITextRange range);
    @Mapping("insertDictationResult:")
    void insertDictationResult(NSArray<?> dictationResult);
    @Mapping("dictationRecordingDidEnd")
    void dictationRecordingDidEnd();
    @Mapping("dictationRecognitionFailed")
    void dictationRecognitionFailed();
    @Mapping("insertDictationResultPlaceholder")
    Object getInsertDictationResultPlaceholder();
    @Mapping("frameForDictationResultPlaceholder:")
    CGRect getDictationResultPlaceholderFrame(Object placeholder);
    @Mapping("removeDictationResultPlaceholder:willInsertResult:")
    void removeDictationResultPlaceholder(Object placeholder, boolean willInsertResult);
    
    /*<adapter>*/
    /*</adapter>*/
}
