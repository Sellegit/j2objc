package apple.notificationcenter;


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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("NotificationCenter/NotificationCenter.h") @Mapping("NCWidgetController")
public class NCWidgetController 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public NCWidgetController() { }
    
    
    
    
    
    
    @Mapping("setHasContent:forWidgetWithBundleIdentifier:")
    public native void setHasContentForWidgetWithBundleID(boolean flag, String bundleID);
    @Mapping("widgetController")
    public static native NCWidgetController create();
    
}
