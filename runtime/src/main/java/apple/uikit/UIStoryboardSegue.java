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

@Library("UIKit/UIKit.h") @Mapping("UIStoryboardSegue")
public class UIStoryboardSegue 
    extends NSObject 
     {

    
    
    public UIStoryboardSegue() {}
    @Mapping("initWithIdentifier:source:destination:")
    public UIStoryboardSegue(String identifier, UIViewController source, UIViewController destination) { }
    
    
    @Mapping("identifier")
    public native String getIdentifier();
    @Mapping("sourceViewController")
    public native UIViewController getSourceViewController();
    @Mapping("destinationViewController")
    public native UIViewController getDestinationViewController();
    
    
    
    @Mapping("perform")
    public native void perform();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("segueWithIdentifier:source:destination:performHandler:")
    public static native UIStoryboardSegue create(String identifier, UIViewController source, UIViewController destination, @Block Runnable performHandler);
    
}
