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

@Library("UIKit")
@Mapping("UISplitViewControllerDisplayMode")
public final class UISplitViewControllerDisplayMode extends ObjCEnum {
    
    @GlobalConstant("UISplitViewControllerDisplayModeAutomatic")
    public static final long Automatic = 0L;
    @GlobalConstant("UISplitViewControllerDisplayModePrimaryHidden")
    public static final long PrimaryHidden = 1L;
    @GlobalConstant("UISplitViewControllerDisplayModeAllVisible")
    public static final long AllVisible = 2L;
    @GlobalConstant("UISplitViewControllerDisplayModePrimaryOverlay")
    public static final long PrimaryOverlay = 3L;
    

}
