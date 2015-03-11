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
 * @since Available in iOS 8.0 and later.
 */

@Library("UIKit") @Mapping("UIAlertAction")
public class UIAlertAction 
    extends NSObject 
    implements NSCopying {

    
    
    public UIAlertAction() {}
    
    
    @Mapping("title")
    public native String getTitle();
    @Mapping("style")
    public native @Representing("UIAlertActionStyle") @MachineSizedSInt long getStyle();
    @Mapping("isEnabled")
    public native boolean isEnabled();
    @Mapping("setEnabled:")
    public native void setEnabled(boolean v);
    
    
    
    @Mapping("actionWithTitle:style:handler:")
    public static native UIAlertAction create(String title, @Representing("UIAlertActionStyle") @MachineSizedSInt long style, @Block VoidBlock1<UIAlertAction> handler);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
