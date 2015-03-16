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

@Library("UIKit/UIKit.h") @Mapping("UITapGestureRecognizer")
public class UITapGestureRecognizer 
    extends UIGestureRecognizer 
     {

    
    
    public UITapGestureRecognizer() {}
    @Mapping("initWithTarget:action:")
    public UITapGestureRecognizer(Object target, Selector action) { }
    
    
    @Mapping("numberOfTapsRequired")
    public native @MachineSizedUInt long getNumberOfTapsRequired();
    @Mapping("setNumberOfTapsRequired:")
    public native void setNumberOfTapsRequired(@MachineSizedUInt long v);
    @Mapping("numberOfTouchesRequired")
    public native @MachineSizedUInt long getNumberOfTouchesRequired();
    @Mapping("setNumberOfTouchesRequired:")
    public native void setNumberOfTouchesRequired(@MachineSizedUInt long v);
    
    
    
    
    
}
