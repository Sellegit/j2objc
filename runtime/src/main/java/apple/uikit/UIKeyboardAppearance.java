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





@Library("UIKit/UIKit.h")
@Mapping("UIKeyboardAppearance")
public final class UIKeyboardAppearance extends ObjCEnum {
    
    @GlobalConstant("UIKeyboardAppearanceDefault")
    public static final long Default = 0L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIKeyboardAppearanceDark")
    public static final long Dark = 1L;
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("UIKeyboardAppearanceLight")
    public static final long Light = 2L;
    @GlobalConstant("UIKeyboardAppearanceAlert")
    public static final long Alert = 1L;
    

}
