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

@Library("UIKit") @Mapping("UIInputView")
public class UIInputView 
    extends UIView 
     {

    
    
    public UIInputView() {}
    @Mapping("initWithFrame:inputViewStyle:")
    public UIInputView(CGRect frame, @Representing("UIInputViewStyle") @MachineSizedSInt long inputViewStyle) { }
    @Mapping("initWithFrame:")
    public UIInputView(CGRect frame) { }
    
    
    @Mapping("inputViewStyle")
    public native @Representing("UIInputViewStyle") @MachineSizedSInt long getInputViewStyle();
    
    
    
    
    
}
