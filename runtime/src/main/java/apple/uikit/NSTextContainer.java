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

@Library("UIKit/UIKit.h") @Mapping("NSTextContainer")
public class NSTextContainer 
    extends NSObject 
    implements NSCoding, NSTextLayoutOrientationProvider {

    
    
    @Mapping("initWithSize:")
    public NSTextContainer(CGSize size) { }
    @Mapping("init")
    public NSTextContainer() { }
    
    
    @Mapping("layoutManager")
    public native NSLayoutManager getLayoutManager();
    @Mapping("setLayoutManager:")
    public native void setLayoutManager(NSLayoutManager v);
    @Mapping("size")
    public native CGSize getSize();
    @Mapping("setSize:")
    public native void setSize(CGSize v);
    @Mapping("exclusionPaths")
    public native NSArray<UIBezierPath> getExclusionPaths();
    @Mapping("setExclusionPaths:")
    public native void setExclusionPaths(NSArray<UIBezierPath> v);
    @Mapping("lineBreakMode")
    public native @Representing("NSLineBreakMode") long getLineBreakMode();
    @Mapping("setLineBreakMode:")
    public native void setLineBreakMode(@Representing("NSLineBreakMode") long v);
    @Mapping("lineFragmentPadding")
    public native @MachineSizedFloat double getLineFragmentPadding();
    @Mapping("setLineFragmentPadding:")
    public native void setLineFragmentPadding(@MachineSizedFloat double v);
    @Mapping("maximumNumberOfLines")
    public native @MachineSizedUInt long getMaximumNumberOfLines();
    @Mapping("setMaximumNumberOfLines:")
    public native void setMaximumNumberOfLines(@MachineSizedUInt long v);
    @Mapping("widthTracksTextView")
    public native boolean widthTracksTextView();
    @Mapping("setWidthTracksTextView:")
    public native void setWidthTracksTextView(boolean v);
    @Mapping("heightTracksTextView")
    public native boolean heightTracksTextView();
    @Mapping("setHeightTracksTextView:")
    public native void setHeightTracksTextView(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("layoutOrientation")
    public native @Representing("NSTextLayoutOrientation") long getLayoutOrientation();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setLayoutOrientation:")
    public native void setLayoutOrientation(@Representing("NSTextLayoutOrientation") long v);
    
    
    
    @Mapping("lineFragmentRectForProposedRect:atIndex:writingDirection:remainingRect:")
    public native CGRect getLineFragmentRect(CGRect proposedRect, @MachineSizedUInt long characterIndex, @Representing("NSWritingDirection") long baseWritingDirection, CGRect remainingRect);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
