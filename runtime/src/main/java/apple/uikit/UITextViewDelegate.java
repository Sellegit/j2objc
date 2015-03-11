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





@Library("UIKit") @Mapping("UITextViewDelegate")
public interface UITextViewDelegate 
    extends NSObjectProtocol, UIScrollViewDelegate {

    
    
    
    
    
    @Mapping("textViewShouldBeginEditing:")
    boolean shouldBeginEditing(UITextView textView);
    @Mapping("textViewShouldEndEditing:")
    boolean shouldEndEditing(UITextView textView);
    @Mapping("textViewDidBeginEditing:")
    void didBeginEditing(UITextView textView);
    @Mapping("textViewDidEndEditing:")
    void didEndEditing(UITextView textView);
    @Mapping("textView:shouldChangeTextInRange:replacementText:")
    boolean shouldChangeCharacters(UITextView textView, NSRange range, String text);
    @Mapping("textViewDidChange:")
    void didChange(UITextView textView);
    @Mapping("textViewDidChangeSelection:")
    void didChangeSelection(UITextView textView);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("textView:shouldInteractWithURL:inRange:")
    boolean shouldInteractWithURL(UITextView textView, NSURL URL, NSRange characterRange);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("textView:shouldInteractWithTextAttachment:inRange:")
    boolean shouldInteractWithTextAttachment(UITextView textView, NSTextAttachment textAttachment, NSRange characterRange);
    
    /*<adapter>*/
    /*</adapter>*/
}
