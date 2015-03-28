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
public abstract class UITextViewDelegateAdapter 
    extends UIScrollViewDelegateAdapter 
    implements UITextViewDelegate {

    
    
    


    
    
    @NotImplemented("textViewShouldBeginEditing:")
    public boolean shouldBeginEditing(UITextView textView) { throw new UnsupportedOperationException(); }
    @NotImplemented("textViewShouldEndEditing:")
    public boolean shouldEndEditing(UITextView textView) { throw new UnsupportedOperationException(); }
    @NotImplemented("textViewDidBeginEditing:")
    public void didBeginEditing(UITextView textView) { throw new UnsupportedOperationException(); }
    @NotImplemented("textViewDidEndEditing:")
    public void didEndEditing(UITextView textView) { throw new UnsupportedOperationException(); }
    @NotImplemented("textView:shouldChangeTextInRange:replacementText:")
    public boolean shouldChangeCharacters(UITextView textView, NSRange range, String text) { throw new UnsupportedOperationException(); }
    @NotImplemented("textViewDidChange:")
    public void didChange(UITextView textView) { throw new UnsupportedOperationException(); }
    @NotImplemented("textViewDidChangeSelection:")
    public void didChangeSelection(UITextView textView) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("textView:shouldInteractWithURL:inRange:")
    public boolean shouldInteractWithURL(UITextView textView, NSURL URL, NSRange characterRange) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("textView:shouldInteractWithTextAttachment:inRange:")
    public boolean shouldInteractWithTextAttachment(UITextView textView, NSTextAttachment textAttachment, NSRange characterRange) { throw new UnsupportedOperationException(); }

}
