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

@Library("UIKit/UIKit.h") @Mapping("UIEvent")
public class UIEvent 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public UIEvent() { }
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("type")
    public native @Representing("UIEventType") long getType();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("subtype")
    public native @Representing("UIEventSubtype") long getSubtype();
    @Mapping("timestamp")
    public native double getTimestamp();
    
    
    
    @Mapping("allTouches")
    public native NSSet<UITouch> getAllTouches();
    @Mapping("touchesForWindow:")
    public native NSSet<UITouch> getTouches(UIWindow window);
    @Mapping("touchesForView:")
    public native NSSet<UITouch> getTouches(UIView view);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("touchesForGestureRecognizer:")
    public native NSSet<UITouch> getTouches(UIGestureRecognizer gesture);
    
}
