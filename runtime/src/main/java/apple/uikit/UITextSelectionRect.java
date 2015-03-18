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
 * @since Available in iOS 6.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UITextSelectionRect")
public class UITextSelectionRect 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public UITextSelectionRect() { }
    
    
    @Mapping("rect")
    public native CGRect getRect();
    @Mapping("writingDirection")
    public native @Representing("UITextWritingDirection") @MachineSizedSInt long getWritingDirection();
    @Mapping("containsStart")
    public native boolean containsStart();
    @Mapping("containsEnd")
    public native boolean containsEnd();
    @Mapping("isVertical")
    public native boolean isVertical();
    
    
    
    
    
}
