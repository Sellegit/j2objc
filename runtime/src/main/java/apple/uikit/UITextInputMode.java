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
 * @since Available in iOS 4.2 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UITextInputMode")
public class UITextInputMode 
    extends NSObject 
     {

    
    
    public UITextInputMode() {}
    
    
    @Mapping("primaryLanguage")
    public native String getPrimaryLanguage();
    
    
    
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalConstant("UITextInputCurrentInputModeDidChangeNotification")
    public static native NSString CurrentInputModeDidChange();
    
    /**
     * @since Available in iOS 4.2 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("currentInputMode")
    public static native UITextInputMode getCurrentInputMode();
    @Mapping("activeInputModes")
    public static native NSArray<UITextInputMode> getActiveInputModes();
    
}
