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

@Library("UIKit/UIKit.h") @Mapping("UITableViewRowAction")
public class UITableViewRowAction 
    extends NSObject 
    implements NSCopying {

    
    
    public UITableViewRowAction() {}
    
    
    @Mapping("style")
    public native @Representing("UITableViewRowActionStyle") @MachineSizedSInt long getStyle();
    @Mapping("title")
    public native String getTitle();
    @Mapping("setTitle:")
    public native void setTitle(String v);
    @Mapping("backgroundColor")
    public native UIColor getBackgroundColor();
    @Mapping("setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Mapping("backgroundEffect")
    public native UIVisualEffect getBackgroundEffect();
    @Mapping("setBackgroundEffect:")
    public native void setBackgroundEffect(UIVisualEffect v);
    
    
    
    @Mapping("rowActionWithStyle:title:handler:")
    public static native UITableViewRowAction create(@Representing("UITableViewRowActionStyle") @MachineSizedSInt long style, String title, @Block VoidBlock2<UITableViewRowAction, NSIndexPath> handler);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
