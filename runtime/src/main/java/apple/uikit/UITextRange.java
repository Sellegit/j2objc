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
 * @since Available in iOS 3.2 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UITextRange")
public class UITextRange 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public UITextRange() { }
    
    
    @Mapping("isEmpty")
    public native boolean isEmpty();
    @Mapping("start")
    public native UITextPosition getStart();
    @Mapping("end")
    public native UITextPosition getEnd();
    
    
    
    
    
}
