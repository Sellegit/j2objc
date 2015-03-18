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

@Library("UIKit/UIKit.h") @Mapping("UIStoryboardPopoverSegue")
public class UIStoryboardPopoverSegue 
    extends UIStoryboardSegue 
     {

    
    
    @Mapping("initWithIdentifier:source:destination:")
    public UIStoryboardPopoverSegue(String identifier, UIViewController source, UIViewController destination) { }
    @Mapping("init")
    public UIStoryboardPopoverSegue() { }
    
    
    @Mapping("popoverController")
    public native UIPopoverController getPopoverController();
    
    
    
    
    
}
