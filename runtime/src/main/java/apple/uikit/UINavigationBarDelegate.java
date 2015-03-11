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





@Library("UIKit") @Mapping("UINavigationBarDelegate")
public interface UINavigationBarDelegate 
    extends UIBarPositioningDelegate {

    
    
    
    
    
    @Mapping("navigationBar:shouldPushItem:")
    boolean shouldPushItem(UINavigationBar navigationBar, UINavigationItem item);
    @Mapping("navigationBar:didPushItem:")
    void didPushItem(UINavigationBar navigationBar, UINavigationItem item);
    @Mapping("navigationBar:shouldPopItem:")
    boolean shouldPopItem(UINavigationBar navigationBar, UINavigationItem item);
    @Mapping("navigationBar:didPopItem:")
    void didPopItem(UINavigationBar navigationBar, UINavigationItem item);
    
    /*<adapter>*/
    /*</adapter>*/
}
