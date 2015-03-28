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
@Library("UIKit/UIKit.h") @Mapping("UIStoryboard")
public class UIStoryboard 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public UIStoryboard() { }

    


    
    
    @Mapping("instantiateInitialViewController")
    public native UIViewController instantiateInitialViewController();
    @Mapping("instantiateViewControllerWithIdentifier:")
    public native UIViewController instantiateViewController(String identifier);
    @Mapping("storyboardWithName:bundle:")
    public static native UIStoryboard create(String name, NSBundle storyboardBundleOrNil);

}
