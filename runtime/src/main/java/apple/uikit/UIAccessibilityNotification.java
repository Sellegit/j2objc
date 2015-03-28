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
@Library("UIKit/UIKit.h")
public class UIAccessibilityNotification 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("UIAccessibilityScreenChangedNotification")
    public static native int ScreenChangedNotification();
    @GlobalConstant("UIAccessibilityLayoutChangedNotification")
    public static native int LayoutChangedNotification();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("UIAccessibilityAnnouncementNotification")
    public static native int AnnouncementNotification();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("UIAccessibilityPageScrolledNotification")
    public static native int PageScrolledNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilityPauseAssistiveTechnologyNotification")
    public static native int PauseAssistiveTechnologyNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilityResumeAssistiveTechnologyNotification")
    public static native int ResumeAssistiveTechnologyNotification();

}
