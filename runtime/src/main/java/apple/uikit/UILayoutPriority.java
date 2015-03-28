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
public class UILayoutPriority 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UILayoutPriorityRequired")
    public static native float Required();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UILayoutPriorityDefaultHigh")
    public static native float DefaultHigh();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UILayoutPriorityDefaultLow")
    public static native float DefaultLow();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("UILayoutPriorityFittingSizeLevel")
    public static native float FittingSizeLevel();

}
