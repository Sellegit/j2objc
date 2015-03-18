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
 * @since Available in iOS 7.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIKeyCommand")
public class UIKeyCommand 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public UIKeyCommand() { }
    
    
    @Mapping("input")
    public native String getInput();
    @Mapping("modifierFlags")
    public native @Representing("UIKeyModifierFlags") @MachineSizedSInt long getModifierFlags();
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIKeyInputUpArrow")
    public static native String UpArrow();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIKeyInputDownArrow")
    public static native String DownArrow();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIKeyInputLeftArrow")
    public static native String LeftArrow();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIKeyInputRightArrow")
    public static native String RightArrow();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIKeyInputEscape")
    public static native String Escape();
    
    @Mapping("keyCommandWithInput:modifierFlags:action:")
    public static native UIKeyCommand create(String input, @Representing("UIKeyModifierFlags") @MachineSizedSInt long modifierFlags, Selector action);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
