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
 * @since Available in iOS 5.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIPopoverBackgroundView")
public class UIPopoverBackgroundView 
    extends UIView 
     {

    
    
    @Mapping("initWithFrame:")
    public UIPopoverBackgroundView(CGRect frame) { }
    @Mapping("init")
    public UIPopoverBackgroundView() { }
    
    
    @Mapping("arrowOffset")
    public native @MachineSizedFloat double getArrowOffset();
    @Mapping("setArrowOffset:")
    public native void setArrowOffset(@MachineSizedFloat double v);
    @Mapping("arrowDirection")
    public native @Representing("UIPopoverArrowDirection") @MachineSizedUInt long getArrowDirection();
    @Mapping("setArrowDirection:")
    public native void setArrowDirection(@Representing("UIPopoverArrowDirection") @MachineSizedUInt long v);
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("wantsDefaultContentAppearance")
    public static native boolean wantsDefaultContentAppearance();
    
}
