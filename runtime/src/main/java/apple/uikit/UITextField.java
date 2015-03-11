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

@Library("UIKit") @Mapping("UITextField")
public class UITextField 
    extends UIControl 
    implements UITextInput, NSCoding {

    
    
    public UITextField() {}
    @Mapping("initWithFrame:")
    public UITextField(CGRect frame) { }
    
    
    @Mapping("text")
    public native String getText();
    @Mapping("setText:")
    public native void setText(String v);
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
    @Mapping("textColor")
    public native UIColor getTextColor();
    @Mapping("setTextColor:")
    public native void setTextColor(UIColor v);
    @Mapping("font")
    public native UIFont getFont();
    @Mapping("setFont:")
    public native void setFont(UIFont v);
    @Mapping("textAlignment")
    public native @Representing("NSTextAlignment") @MachineSizedSInt long getTextAlignment();
    @Mapping("setTextAlignment:")
    public native void setTextAlignment(@Representing("NSTextAlignment") @MachineSizedSInt long v);
    @Mapping("borderStyle")
    public native @Representing("UITextBorderStyle") @MachineSizedSInt long getBorderStyle();
    @Mapping("setBorderStyle:")
    public native void setBorderStyle(@Representing("UITextBorderStyle") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("defaultTextAttributes")
    public native NSDictionary<?, ?> getDefaultTextAttributes();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setDefaultTextAttributes:")
    public native void setDefaultTextAttributes(NSDictionary<?, ?> v);
    @Mapping("placeholder")
    public native String getPlaceholder();
    @Mapping("setPlaceholder:")
    public native void setPlaceholder(String v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("attributedPlaceholder")
    public native NSAttributedString getAttributedPlaceholder();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setAttributedPlaceholder:")
    public native void setAttributedPlaceholder(NSAttributedString v);
    @Mapping("clearsOnBeginEditing")
    public native boolean clearsOnBeginEditing();
    @Mapping("setClearsOnBeginEditing:")
    public native void setClearsOnBeginEditing(boolean v);
    @Mapping("adjustsFontSizeToFitWidth")
    public native boolean adjustsFontSizeToFitWidth();
    @Mapping("setAdjustsFontSizeToFitWidth:")
    public native void setAdjustsFontSizeToFitWidth(boolean v);
    @Mapping("minimumFontSize")
    public native @MachineSizedFloat double getMinimumFontSize();
    @Mapping("setMinimumFontSize:")
    public native void setMinimumFontSize(@MachineSizedFloat double v);
    @Mapping("delegate")
    public native UITextFieldDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UITextFieldDelegate v);
    @Mapping("background")
    public native UIImage getBackground();
    @Mapping("setBackground:")
    public native void setBackground(UIImage v);
    @Mapping("disabledBackground")
    public native UIImage getDisabledBackground();
    @Mapping("setDisabledBackground:")
    public native void setDisabledBackground(UIImage v);
    @Mapping("isEditing")
    public native boolean isEditing();
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
    @Mapping("typingAttributes")
    public native NSDictionary<?, ?> getTypingAttributes();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setTypingAttributes:")
    public native void setTypingAttributes(NSDictionary<?, ?> v);
    @Mapping("clearButtonMode")
    public native @Representing("UITextFieldViewMode") @MachineSizedSInt long getClearButtonMode();
    @Mapping("setClearButtonMode:")
    public native void setClearButtonMode(@Representing("UITextFieldViewMode") @MachineSizedSInt long v);
    @Mapping("leftView")
    public native UIView getLeftView();
    @Mapping("setLeftView:")
    public native void setLeftView(UIView v);
    @Mapping("leftViewMode")
    public native @Representing("UITextFieldViewMode") @MachineSizedSInt long getLeftViewMode();
    @Mapping("setLeftViewMode:")
    public native void setLeftViewMode(@Representing("UITextFieldViewMode") @MachineSizedSInt long v);
    @Mapping("rightView")
    public native UIView getRightView();
    @Mapping("setRightView:")
    public native void setRightView(UIView v);
    @Mapping("rightViewMode")
    public native @Representing("UITextFieldViewMode") @MachineSizedSInt long getRightViewMode();
    @Mapping("setRightViewMode:")
    public native void setRightViewMode(@Representing("UITextFieldViewMode") @MachineSizedSInt long v);
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
    public native @Representing("UITextStorageDirection") @MachineSizedSInt long getSelectionAffinity();
    @Mapping("setSelectionAffinity:")
    public native void setSelectionAffinity(@Representing("UITextStorageDirection") @MachineSizedSInt long v);
    @Mapping("autocapitalizationType")
    public native @Representing("UITextAutocapitalizationType") @MachineSizedSInt long getAutocapitalizationType();
    @Mapping("setAutocapitalizationType:")
    public native void setAutocapitalizationType(@Representing("UITextAutocapitalizationType") @MachineSizedSInt long v);
    @Mapping("autocorrectionType")
    public native @Representing("UITextAutocorrectionType") @MachineSizedSInt long getAutocorrectionType();
    @Mapping("setAutocorrectionType:")
    public native void setAutocorrectionType(@Representing("UITextAutocorrectionType") @MachineSizedSInt long v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("spellCheckingType")
    public native @Representing("UITextSpellCheckingType") @MachineSizedSInt long getSpellCheckingType();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setSpellCheckingType:")
    public native void setSpellCheckingType(@Representing("UITextSpellCheckingType") @MachineSizedSInt long v);
    @Mapping("keyboardType")
    public native @Representing("UIKeyboardType") @MachineSizedSInt long getKeyboardType();
    @Mapping("setKeyboardType:")
    public native void setKeyboardType(@Representing("UIKeyboardType") @MachineSizedSInt long v);
    @Mapping("keyboardAppearance")
    public native @Representing("UIKeyboardAppearance") @MachineSizedSInt long getKeyboardAppearance();
    @Mapping("setKeyboardAppearance:")
    public native void setKeyboardAppearance(@Representing("UIKeyboardAppearance") @MachineSizedSInt long v);
    @Mapping("returnKeyType")
    public native @Representing("UIReturnKeyType") @MachineSizedSInt long getReturnKeyType();
    @Mapping("setReturnKeyType:")
    public native void setReturnKeyType(@Representing("UIReturnKeyType") @MachineSizedSInt long v);
    @Mapping("enablesReturnKeyAutomatically")
    public native boolean enablesReturnKeyAutomatically();
    @Mapping("setEnablesReturnKeyAutomatically:")
    public native void setEnablesReturnKeyAutomatically(boolean v);
    @Mapping("isSecureTextEntry")
    public native boolean isSecureTextEntry();
    @Mapping("setSecureTextEntry:")
    public native void setSecureTextEntry(boolean v);
    
    
    
    @GlobalConstant("UITextFieldTextDidBeginEditingNotification")
    public static native NSString DidBeginEditingNotification();
    @GlobalConstant("UITextFieldTextDidEndEditingNotification")
    public static native NSString DidEndEditingNotification();
    @GlobalConstant("UITextFieldTextDidChangeNotification")
    public static native NSString DidChangeNotification();
    
    @Mapping("borderRectForBounds:")
    public native CGRect getBorderRect(CGRect bounds);
    @Mapping("textRectForBounds:")
    public native CGRect getTextRect(CGRect bounds);
    @Mapping("placeholderRectForBounds:")
    public native CGRect getPlaceholderRect(CGRect bounds);
    @Mapping("editingRectForBounds:")
    public native CGRect getEditingRect(CGRect bounds);
    @Mapping("clearButtonRectForBounds:")
    public native CGRect getClearButtonRect(CGRect bounds);
    @Mapping("leftViewRectForBounds:")
    public native CGRect getLeftViewRect(CGRect bounds);
    @Mapping("rightViewRectForBounds:")
    public native CGRect getRightViewRect(CGRect bounds);
    @Mapping("drawTextInRect:")
    public native void drawText(CGRect rect);
    @Mapping("drawPlaceholderInRect:")
    public native void drawPlaceholder(CGRect rect);
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
    public native UITextPosition getPositionFromPosition(UITextPosition position, @Representing("UITextLayoutDirection") @MachineSizedSInt long direction, @MachineSizedSInt long offset);
    @Mapping("comparePosition:toPosition:")
    public native @Representing("NSComparisonResult") @MachineSizedSInt long comparePositions(UITextPosition position, UITextPosition other);
    @Mapping("offsetFromPosition:toPosition:")
    public native @MachineSizedSInt long getOffset(UITextPosition from, UITextPosition toPosition);
    @Mapping("positionWithinRange:farthestInDirection:")
    public native UITextPosition getPositionWithinRangeFarthestInDirection(UITextRange range, @Representing("UITextLayoutDirection") @MachineSizedSInt long direction);
    @Mapping("characterRangeByExtendingPosition:inDirection:")
    public native UITextRange getCharacterRange(UITextPosition position, @Representing("UITextLayoutDirection") @MachineSizedSInt long direction);
    @Mapping("baseWritingDirectionForPosition:inDirection:")
    public native @Representing("UITextWritingDirection") @MachineSizedSInt long getBaseWritingDirection(UITextPosition position, @Representing("UITextStorageDirection") @MachineSizedSInt long direction);
    @Mapping("setBaseWritingDirection:forRange:")
    public native void setBaseWritingDirection(@Representing("UITextWritingDirection") @MachineSizedSInt long writingDirection, UITextRange range);
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
    public native UITextInputTextStyle getTextStyling(UITextPosition position, @Representing("UITextStorageDirection") @MachineSizedSInt long direction);
    @Mapping("positionWithinRange:atCharacterOffset:")
    public native UITextPosition getPositionWithinRangeAtCharacterOffset(UITextRange range, @MachineSizedSInt long offset);
    @Mapping("characterOffsetOfPosition:withinRange:")
    public native @MachineSizedSInt long getCharacterOffset(UITextPosition position, UITextRange range);
    @Mapping("insertDictationResult:")
    public native void insertDictationResult(NSArray<UIDictationPhrase> dictationResult);
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
