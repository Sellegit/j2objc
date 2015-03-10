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
@Library("UIKit")
public class UIAccessibilityNotification 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("UIAccessibilityScreenChangedNotification")
    protected static native int ScreenChangedNotification();
    @GlobalConstant("UIAccessibilityLayoutChangedNotification")
    protected static native int LayoutChangedNotification();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("UIAccessibilityAnnouncementNotification")
    protected static native int AnnouncementNotification();
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("UIAccessibilityPageScrolledNotification")
    protected static native int PageScrolledNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilityPauseAssistiveTechnologyNotification")
    protected static native int PauseAssistiveTechnologyNotification();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("UIAccessibilityResumeAssistiveTechnologyNotification")
    protected static native int ResumeAssistiveTechnologyNotification();
    
}
