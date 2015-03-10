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
@Library("UIKit")
public class UIKeyboardAnimation 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("UIKeyboardFrameBeginUserInfoKey")
    protected static native NSString FrameBeginKey();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalConstant("UIKeyboardFrameEndUserInfoKey")
    protected static native NSString FrameEndKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("UIKeyboardAnimationDurationUserInfoKey")
    protected static native NSString AnimationDurationKey();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalConstant("UIKeyboardAnimationCurveUserInfoKey")
    protected static native NSString AnimationCurveKey();
    
}
