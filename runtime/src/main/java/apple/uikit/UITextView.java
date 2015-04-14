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
 * @since Available in iOS 2.0 and later.
 */
@Library("UIKit/UIKit.h") @Mapping("UITextView")
public class UITextView 
    extends UIScrollView 
    implements UITextInput {

    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("initWithFrame:textContainer:")
    public UITextView(CGRect frame, NSTextContainer textContainer) { }
    @Mapping("initWithFrame:")
    public UITextView(CGRect frame) { }
    @Mapping("initWithCoder:")
    public UITextView(NSCoder aDecoder) { }
    @Mapping("init")
    public UITextView() { }

    
    @Mapping("delegate")
    public native UITextViewDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UITextViewDelegate v);
    @Mapping("text")
    public native String getText();
    @Mapping("setText:")
    public native void setText(String v);
    @Mapping("font")
    public native UIFont getFont();
    @Mapping("setFont:")
    public native void setFont(UIFont v);
    @Mapping("textColor")
    public native UIColor getTextColor();
    @Mapping("setTextColor:")
    public native void setTextColor(UIColor v);
    @Mapping("textAlignment")
    public native @Representing("NSTextAlignment") long getTextAlignment();
    @Mapping("setTextAlignment:")
    public native void setTextAlignment(@Representing("NSTextAlignment") long v);
    @Mapping("selectedRange")
    public native NSRange getSelectedRange();
    @Mapping("setSelectedRange:")
    public native void setSelectedRange(NSRange v);
    @Mapping("isEditable")
    public native boolean isEditable();
    @Mapping("setEditable:")
    public native void setEditable(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("isSelectable")
    public native boolean isSelectable();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setSelectable:")
    public native void setSelectable(boolean v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("dataDetectorTypes")
    public native @Representing("UIDataDetectorTypes") long getDataDetectorTypes();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setDataDetectorTypes:")
    public native void setDataDetectorTypes(@Representing("UIDataDetectorTypes") long v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("allowsEditingTextAttributes")
    public native boolean allowsEditingTextAttributes();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setAllowsEditingTextAttributes:")
    public native void setAllowsEditingTextAttributes(boolean v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("attributedText")
    public native NSAttributedString getAttributedText();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setAttributedText:")
    public native void setAttributedText(NSAttributedString v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("typingAttributes")
    public native NSDictionary<?, ?> getTypingAttributes();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setTypingAttributes:")
    public native void setTypingAttributes(NSDictionary<?, ?> v);
    @Mapping("inputView")
    public native UIView getInputView();
    @Mapping("setInputView:")
    public native void setInputView(UIView v);
    @Mapping("inputAccessoryView")
    public native UIView getInputAccessoryView();
    @Mapping("setInputAccessoryView:")
    public native void setInputAccessoryView(UIView v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("clearsOnInsertion")
    public native boolean clearsOnInsertion();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setClearsOnInsertion:")
    public native void setClearsOnInsertion(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("textContainer")
    public native NSTextContainer getTextContainer();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("textContainerInset")
    public native UIEdgeInsets getTextContainerInset();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setTextContainerInset:")
    public native void setTextContainerInset(UIEdgeInsets v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("layoutManager")
    public native NSLayoutManager getLayoutManager();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("textStorage")
    public native NSTextStorage getTextStorage();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("linkTextAttributes")
    public native NSDictionary<?, ?> getLinkTextAttributes();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setLinkTextAttributes:")
    public native void setLinkTextAttributes(NSDictionary<?, ?> v);
    @Mapping("selectedTextRange")
    public native UITextRange getSelectedTextRange();
    @Mapping("setSelectedTextRange:")
    public native void setSelectedTextRange(UITextRange v);
    @Mapping("markedTextRange")
    public native UITextRange getMarkedTextRange();
    @Mapping("markedTextStyle")
    public native UITextInputTextStyle getMarkedTextStyle();
    @Mapping("setMarkedTextStyle:")
    public native void setMarkedTextStyle(UITextInputTextStyle v);
    @Mapping("beginningOfDocument")
    public native UITextPosition getBeginningOfDocument();
    @Mapping("endOfDocument")
    public native UITextPosition getEndOfDocument();
    @Mapping("inputDelegate")
    public native UITextInputDelegate getInputDelegate();
    @Mapping("setInputDelegate:")
    public native void setInputDelegate(UITextInputDelegate v);
    @Mapping("tokenizer")
    public native UITextInputTokenizer getTokenizer();
    @Mapping("textInputView")
    public native UIView getTextInputView();
    @Mapping("selectionAffinity")
    public native @Representing("UITextStorageDirection") long getSelectionAffinity();
    @Mapping("setSelectionAffinity:")
    public native void setSelectionAffinity(@Representing("UITextStorageDirection") long v);
    @Mapping("autocapitalizationType")
    public native @Representing("UITextAutocapitalizationType") long getAutocapitalizationType();
    @Mapping("setAutocapitalizationType:")
    public native void setAutocapitalizationType(@Representing("UITextAutocapitalizationType") long v);
    @Mapping("autocorrectionType")
    public native @Representing("UITextAutocorrectionType") long getAutocorrectionType();
    @Mapping("setAutocorrectionType:")
    public native void setAutocorrectionType(@Representing("UITextAutocorrectionType") long v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("spellCheckingType")
    public native @Representing("UITextSpellCheckingType") long getSpellCheckingType();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setSpellCheckingType:")
    public native void setSpellCheckingType(@Representing("UITextSpellCheckingType") long v);
    @Mapping("keyboardType")
    public native @Representing("UIKeyboardType") long getKeyboardType();
    @Mapping("setKeyboardType:")
    public native void setKeyboardType(@Representing("UIKeyboardType") long v);
    @Mapping("keyboardAppearance")
    public native @Representing("UIKeyboardAppearance") long getKeyboardAppearance();
    @Mapping("setKeyboardAppearance:")
    public native void setKeyboardAppearance(@Representing("UIKeyboardAppearance") long v);
    @Mapping("returnKeyType")
    public native @Representing("UIReturnKeyType") long getReturnKeyType();
    @Mapping("setReturnKeyType:")
    public native void setReturnKeyType(@Representing("UIReturnKeyType") long v);
    @Mapping("enablesReturnKeyAutomatically")
    public native boolean enablesReturnKeyAutomatically();
    @Mapping("setEnablesReturnKeyAutomatically:")
    public native void setEnablesReturnKeyAutomatically(boolean v);
    @Mapping("isSecureTextEntry")
    public native boolean isSecureTextEntry();
    @Mapping("setSecureTextEntry:")
    public native void setSecureTextEntry(boolean v);

    
    
    @GlobalConstant("UITextViewTextDidBeginEditingNotification")
    public static native String DidBeginEditingNotification();
    @GlobalConstant("UITextViewTextDidChangeNotification")
    public static native String DidChangeNotification();
    @GlobalConstant("UITextViewTextDidEndEditingNotification")
    public static native String DidEndEditingNotification();

    @Mapping("scrollRangeToVisible:")
    public native void scrollRangeToVisible(NSRange range);
    @Mapping("textInRange:")
    public native String getText(UITextRange range);
    @Mapping("replaceRange:withText:")
    public native void replaceText(UITextRange range, String text);
    @Mapping("setMarkedText:selectedRange:")
    public native void setMarkedText(String markedText, NSRange selectedRange);
    @Mapping("unmarkText")
    public native void unmarkText();
    @Mapping("textRangeFromPosition:toPosition:")
    public native UITextRange getTextRange(UITextPosition fromPosition, UITextPosition toPosition);
    @Mapping("positionFromPosition:offset:")
    public native UITextPosition getPositionFromPosition(UITextPosition position, @MachineSizedSInt long offset);
    @Mapping("positionFromPosition:inDirection:offset:")
    public native UITextPosition getPositionFromPosition(UITextPosition position, @Representing("UITextLayoutDirection") long direction, @MachineSizedSInt long offset);
    @Mapping("comparePosition:toPosition:")
    public native @Representing("NSComparisonResult") long comparePositions(UITextPosition position, UITextPosition other);
    @Mapping("offsetFromPosition:toPosition:")
    public native @MachineSizedSInt long getOffset(UITextPosition from, UITextPosition toPosition);
    @Mapping("positionWithinRange:farthestInDirection:")
    public native UITextPosition getPositionWithinRangeFarthestInDirection(UITextRange range, @Representing("UITextLayoutDirection") long direction);
    @Mapping("characterRangeByExtendingPosition:inDirection:")
    public native UITextRange getCharacterRange(UITextPosition position, @Representing("UITextLayoutDirection") long direction);
    @Mapping("baseWritingDirectionForPosition:inDirection:")
    public native @Representing("UITextWritingDirection") long getBaseWritingDirection(UITextPosition position, @Representing("UITextStorageDirection") long direction);
    @Mapping("setBaseWritingDirection:forRange:")
    public native void setBaseWritingDirection(@Representing("UITextWritingDirection") long writingDirection, UITextRange range);
    @Mapping("firstRectForRange:")
    public native CGRect getFirstRect(UITextRange range);
    @Mapping("caretRectForPosition:")
    public native CGRect getCaretRect(UITextPosition position);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("selectionRectsForRange:")
    public native NSArray<UITextSelectionRect> getSelectionRects(UITextRange range);
    @Mapping("closestPositionToPoint:")
    public native UITextPosition getClosestPosition(CGPoint point);
    @Mapping("closestPositionToPoint:withinRange:")
    public native UITextPosition getClosestPosition(CGPoint point, UITextRange range);
    @Mapping("characterRangeAtPoint:")
    public native UITextRange getCharacterRange(CGPoint point);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("shouldChangeTextInRange:replacementText:")
    public native boolean shouldChangeText(UITextRange range, String text);
    @Mapping("textStylingAtPosition:inDirection:")
    public native UITextInputTextStyle getTextStyling(UITextPosition position, @Representing("UITextStorageDirection") long direction);
    @Mapping("positionWithinRange:atCharacterOffset:")
    public native UITextPosition getPositionWithinRangeAtCharacterOffset(UITextRange range, @MachineSizedSInt long offset);
    @Mapping("characterOffsetOfPosition:withinRange:")
    public native @MachineSizedSInt long getCharacterOffset(UITextPosition position, UITextRange range);
    @Mapping("insertDictationResult:")
    public native void insertDictationResult(NSArray<?> dictationResult);
    @Mapping("dictationRecordingDidEnd")
    public native void dictationRecordingDidEnd();
    @Mapping("dictationRecognitionFailed")
    public native void dictationRecognitionFailed();
    @Mapping("insertDictationResultPlaceholder")
    public native Object getInsertDictationResultPlaceholder();
    @Mapping("frameForDictationResultPlaceholder:")
    public native CGRect getDictationResultPlaceholderFrame(Object placeholder);
    @Mapping("removeDictationResultPlaceholder:willInsertResult:")
    public native void removeDictationResultPlaceholder(Object placeholder, boolean willInsertResult);
    @Mapping("hasText")
    public native boolean hasText();
    @Mapping("insertText:")
    public native void insertText(String text);
    @Mapping("deleteBackward")
    public native void deleteBackward();

}
