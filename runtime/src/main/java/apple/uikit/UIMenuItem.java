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

@Library("UIKit") @Mapping("UIMenuItem")
public class UIMenuItem 
    extends NSObject 
     {

    
    
    public UIMenuItem() {}
    @Mapping("initWithTitle:action:")
    public UIMenuItem(String title, Selector action) { }
    
    
    @Mapping("title")
    public native String getTitle();
    @Mapping("setTitle:")
    public native void setTitle(String v);
    @Mapping("action")
    public native Selector getAction();
    @Mapping("setAction:")
    public native void setAction(Selector v);
    
    
    
    
    
}
