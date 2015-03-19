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

@Library("UIKit/UIKit.h") @Mapping("UIInputView")
public class UIInputView 
    extends UIView 
     {

    
    
    @Mapping("initWithFrame:inputViewStyle:")
    public UIInputView(CGRect frame, @Representing("UIInputViewStyle") long inputViewStyle) { }
    @Mapping("initWithFrame:")
    public UIInputView(CGRect frame) { }
    @Mapping("initWithCoder:")
    public UIInputView(NSCoder aDecoder) { }
    @Mapping("init")
    public UIInputView() { }
    
    
    @Mapping("inputViewStyle")
    public native @Representing("UIInputViewStyle") long getInputViewStyle();
    
    
    
    
    
}
