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
@Library("UIKit/UIKit.h") @Mapping("UINavigationItem")
public class UINavigationItem 
    extends NSObject 
    implements NSCoding {

    
    
    @Mapping("initWithTitle:")
    public UINavigationItem(String title) { }
    @Mapping("init")
    public UINavigationItem() { }

    
    @Mapping("title")
    public native String getTitle();
    @Mapping("setTitle:")
    public native void setTitle(String v);
    @Mapping("backBarButtonItem")
    public native UIBarButtonItem getBackBarButtonItem();
    @Mapping("setBackBarButtonItem:")
    public native void setBackBarButtonItem(UIBarButtonItem v);
    @Mapping("titleView")
    public native UIView getTitleView();
    @Mapping("setTitleView:")
    public native void setTitleView(UIView v);
    @Mapping("prompt")
    public native String getPrompt();
    @Mapping("setPrompt:")
    public native void setPrompt(String v);
    @Mapping("hidesBackButton")
    public native boolean hidesBackButton();
    @Mapping("setHidesBackButton:")
    public native void setHidesBackButton(boolean v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("leftBarButtonItems")
    public native NSArray<UIBarButtonItem> getLeftBarButtonItems();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setLeftBarButtonItems:")
    public native void setLeftBarButtonItems(NSArray<UIBarButtonItem> v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("rightBarButtonItems")
    public native NSArray<UIBarButtonItem> getRightBarButtonItems();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setRightBarButtonItems:")
    public native void setRightBarButtonItems(NSArray<UIBarButtonItem> v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("leftItemsSupplementBackButton")
    public native boolean leftItemsSupplementBackButton();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setLeftItemsSupplementBackButton:")
    public native void setLeftItemsSupplementBackButton(boolean v);
    @Mapping("leftBarButtonItem")
    public native UIBarButtonItem getLeftBarButtonItem();
    @Mapping("setLeftBarButtonItem:")
    public native void setLeftBarButtonItem(UIBarButtonItem v);
    @Mapping("rightBarButtonItem")
    public native UIBarButtonItem getRightBarButtonItem();
    @Mapping("setRightBarButtonItem:")
    public native void setRightBarButtonItem(UIBarButtonItem v);

    
    
    @Mapping("setHidesBackButton:animated:")
    public native void setHidesBackButton(boolean hidesBackButton, boolean animated);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setLeftBarButtonItems:animated:")
    public native void setLeftBarButtonItems(NSArray<?> items, boolean animated);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setRightBarButtonItems:animated:")
    public native void setRightBarButtonItems(NSArray<?> items, boolean animated);
    @Mapping("setLeftBarButtonItem:animated:")
    public native void setLeftBarButtonItem(UIBarButtonItem item, boolean animated);
    @Mapping("setRightBarButtonItem:animated:")
    public native void setRightBarButtonItem(UIBarButtonItem item, boolean animated);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);

}
