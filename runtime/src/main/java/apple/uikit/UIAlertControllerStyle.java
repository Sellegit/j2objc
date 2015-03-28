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
 * @since Available in iOS 8.0 and later.
 */
@Library("UIKit/UIKit.h")
@Mapping("UIAlertControllerStyle")
public final class UIAlertControllerStyle extends ObjCEnum {
    
    @GlobalConstant("UIAlertControllerStyleActionSheet")
    public static final long ActionSheet = 0L;
    @GlobalConstant("UIAlertControllerStyleAlert")
    public static final long Alert = 1L;


}
