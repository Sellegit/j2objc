package apple.social;


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
import apple.uikit.*;
import apple.accounts.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("Social/Social.h") @Mapping("SLComposeServiceViewController")
public class SLComposeServiceViewController 
    extends UIViewController 
    implements UITextViewDelegate {

    
    
    @Mapping("initWithNibName:bundle:")
    public SLComposeServiceViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    @Mapping("init")
    public SLComposeServiceViewController() { }
    
    
    @Mapping("textView")
    public native UITextView getTextView();
    @Mapping("contentText")
    public native String getContentText();
    @Mapping("placeholder")
    public native String getPlaceholder();
    @Mapping("setPlaceholder:")
    public native void setPlaceholder(String v);
    @Mapping("charactersRemaining")
    public native NSNumber getCharactersRemaining();
    @Mapping("setCharactersRemaining:")
    public native void setCharactersRemaining(NSNumber v);
    @Mapping("autoCompletionViewController")
    public native UIViewController getAutoCompletionViewController();
    @Mapping("setAutoCompletionViewController:")
    public native void setAutoCompletionViewController(UIViewController v);
    
    
    
    @Mapping("presentationAnimationDidFinish")
    public native void presentationAnimationDidFinish();
    @Mapping("didSelectPost")
    public native void didSelectPost();
    @Mapping("didSelectCancel")
    public native void didSelectCancel();
    @Mapping("cancel")
    public native void cancel();
    @Mapping("isContentValid")
    public native boolean isContentValid();
    @Mapping("validateContent")
    public native void validateContent();
    @Mapping("configurationItems")
    public native NSArray<SLComposeSheetConfigurationItem> getConfigurationItems();
    @Mapping("reloadConfigurationItems")
    public native void reloadConfigurationItems();
    @Mapping("pushConfigurationViewController:")
    public native void pushConfigurationViewController(UIViewController viewController);
    @Mapping("popConfigurationViewController")
    public native void popConfigurationViewController();
    @Mapping("loadPreviewView")
    public native UIView loadPreviewView();
    @Mapping("textViewShouldBeginEditing:")
    public native boolean shouldBeginEditing(UITextView textView);
    @Mapping("textViewShouldEndEditing:")
    public native boolean shouldEndEditing(UITextView textView);
    @Mapping("textViewDidBeginEditing:")
    public native void didBeginEditing(UITextView textView);
    @Mapping("textViewDidEndEditing:")
    public native void didEndEditing(UITextView textView);
    @Mapping("textView:shouldChangeTextInRange:replacementText:")
    public native boolean shouldChangeCharacters(UITextView textView, NSRange range, String text);
    @Mapping("textViewDidChange:")
    public native void didChange(UITextView textView);
    @Mapping("textViewDidChangeSelection:")
    public native void didChangeSelection(UITextView textView);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("textView:shouldInteractWithURL:inRange:")
    public native boolean shouldInteractWithURL(UITextView textView, NSURL URL, NSRange characterRange);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("textView:shouldInteractWithTextAttachment:inRange:")
    public native boolean shouldInteractWithTextAttachment(UITextView textView, NSTextAttachment textAttachment, NSRange characterRange);
    @Mapping("scrollViewDidScroll:")
    public native void didScroll(UIScrollView scrollView);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("scrollViewDidZoom:")
    public native void didZoom(UIScrollView scrollView);
    @Mapping("scrollViewWillBeginDragging:")
    public native void willBeginDragging(UIScrollView scrollView);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("scrollViewWillEndDragging:withVelocity:targetContentOffset:")
    public native void willEndDragging(UIScrollView scrollView, CGPoint velocity, CGPoint targetContentOffset);
    @Mapping("scrollViewDidEndDragging:willDecelerate:")
    public native void didEndDragging(UIScrollView scrollView, boolean decelerate);
    @Mapping("scrollViewWillBeginDecelerating:")
    public native void willBeginDecelerating(UIScrollView scrollView);
    @Mapping("scrollViewDidEndDecelerating:")
    public native void didEndDecelerating(UIScrollView scrollView);
    @Mapping("scrollViewDidEndScrollingAnimation:")
    public native void didEndScrollingAnimation(UIScrollView scrollView);
    @Mapping("viewForZoomingInScrollView:")
    public native UIView getViewForZooming(UIScrollView scrollView);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("scrollViewWillBeginZooming:withView:")
    public native void willBeginZooming(UIScrollView scrollView, UIView view);
    @Mapping("scrollViewDidEndZooming:withView:atScale:")
    public native void didEndZooming(UIScrollView scrollView, UIView view, @MachineSizedFloat double scale);
    @Mapping("scrollViewShouldScrollToTop:")
    public native boolean shouldScrollToTop(UIScrollView scrollView);
    @Mapping("scrollViewDidScrollToTop:")
    public native void didScrollToTop(UIScrollView scrollView);
    
}
