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
public class UIStateRestorationKey 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIStateRestorationViewControllerStoryboardKey")
    protected static native String ViewControllerStoryboardKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIApplicationStateRestorationBundleVersionKey")
    protected static native String ApplicationBundleVersionKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UIApplicationStateRestorationUserInterfaceIdiomKey")
    protected static native String ApplicationUserInterfaceIdiomKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIApplicationStateRestorationTimestampKey")
    protected static native String ApplicationTimestampKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIApplicationStateRestorationSystemVersionKey")
    protected static native String ApplicationSystemVersionKey();
    
}
