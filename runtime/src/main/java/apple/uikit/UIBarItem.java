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
 * @since Available in iOS 2.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIBarItem")
public class UIBarItem 
    extends NSObject 
    implements UIAppearanceContainer {

    
    
    @Mapping("init")
    public UIBarItem() { }
    
    
    @Mapping("isEnabled")
    public native boolean isEnabled();
    @Mapping("setEnabled:")
    public native void setEnabled(boolean v);
    @Mapping("title")
    public native String getTitle();
    @Mapping("setTitle:")
    public native void setTitle(String v);
    @Mapping("image")
    public native UIImage getImage();
    @Mapping("setImage:")
    public native void setImage(UIImage v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("landscapeImagePhone")
    public native UIImage getLandscapeImagePhone();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setLandscapeImagePhone:")
    public native void setLandscapeImagePhone(UIImage v);
    @Mapping("imageInsets")
    public native UIEdgeInsets getImageInsets();
    @Mapping("setImageInsets:")
    public native void setImageInsets(UIEdgeInsets v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("landscapeImagePhoneInsets")
    public native UIEdgeInsets getLandscapeImagePhoneInsets();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setLandscapeImagePhoneInsets:")
    public native void setLandscapeImagePhoneInsets(UIEdgeInsets v);
    @Mapping("tag")
    public native @MachineSizedSInt long getTag();
    @Mapping("setTag:")
    public native void setTag(@MachineSizedSInt long v);
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setTitleTextAttributes:forState:")
    public native void setTitleTextAttributes(NSDictionary<?, ?> attributes, @Representing("UIControlState") @MachineSizedUInt long state);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("titleTextAttributesForState:")
    public native NSDictionary<?, ?> getTitleTextAttributes(@Representing("UIControlState") @MachineSizedUInt long state);
    
}
