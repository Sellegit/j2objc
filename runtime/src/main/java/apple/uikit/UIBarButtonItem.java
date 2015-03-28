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
@Library("UIKit/UIKit.h") @Mapping("UIBarButtonItem")
public class UIBarButtonItem 
    extends UIBarItem 
    implements NSCoding {

    
    
    @Mapping("initWithImage:style:target:action:")
    public UIBarButtonItem(UIImage image, @Representing("UIBarButtonItemStyle") long style, Object target, Selector action) { }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("initWithImage:landscapeImagePhone:style:target:action:")
    public UIBarButtonItem(UIImage image, UIImage landscapeImagePhone, @Representing("UIBarButtonItemStyle") long style, Object target, Selector action) { }
    @Mapping("initWithTitle:style:target:action:")
    public UIBarButtonItem(String title, @Representing("UIBarButtonItemStyle") long style, Object target, Selector action) { }
    @Mapping("initWithBarButtonSystemItem:target:action:")
    public UIBarButtonItem(@Representing("UIBarButtonSystemItem") long systemItem, Object target, Selector action) { }
    @Mapping("initWithCustomView:")
    public UIBarButtonItem(UIView customView) { }
    @Mapping("init")
    public UIBarButtonItem() { }

    
    @Mapping("style")
    public native @Representing("UIBarButtonItemStyle") long getStyle();
    @Mapping("setStyle:")
    public native void setStyle(@Representing("UIBarButtonItemStyle") long v);
    @Mapping("width")
    public native @MachineSizedFloat double getWidth();
    @Mapping("setWidth:")
    public native void setWidth(@MachineSizedFloat double v);
    @Mapping("possibleTitles")
    public native List<String> getPossibleTitles();
    @Mapping("setPossibleTitles:")
    public native void setPossibleTitles(List<String> v);
    @Mapping("customView")
    public native UIView getCustomView();
    @Mapping("setCustomView:")
    public native void setCustomView(UIView v);
    @Mapping("action")
    public native Selector getAction();
    @Mapping("setAction:")
    public native void setAction(Selector v);
    @Mapping("target")
    public native Object getTarget();
    @Mapping("setTarget:")
    public native void setTarget(Object v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("tintColor")
    public native UIColor getTintColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setTintColor:")
    public native void setTintColor(UIColor v);

    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setBackgroundImage:forState:barMetrics:")
    public native void setBackgroundImage(UIImage backgroundImage, @Representing("UIControlState") long state, @Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("backgroundImageForState:barMetrics:")
    public native UIImage getBackgroundImage(@Representing("UIControlState") long state, @Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setBackgroundImage:forState:style:barMetrics:")
    public native void setBackgroundImage(UIImage backgroundImage, @Representing("UIControlState") long state, @Representing("UIBarButtonItemStyle") long style, @Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("backgroundImageForState:style:barMetrics:")
    public native UIImage getBackgroundImage(@Representing("UIControlState") long state, @Representing("UIBarButtonItemStyle") long style, @Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setBackgroundVerticalPositionAdjustment:forBarMetrics:")
    public native void setBackgroundVerticalPositionAdjustment(@MachineSizedFloat double adjustment, @Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("backgroundVerticalPositionAdjustmentForBarMetrics:")
    public native @MachineSizedFloat double getBackgroundVerticalPositionAdjustment(@Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setTitlePositionAdjustment:forBarMetrics:")
    public native void setTitlePositionAdjustment(UIOffset adjustment, @Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("titlePositionAdjustmentForBarMetrics:")
    public native UIOffset getTitlePositionAdjustment(@Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setBackButtonBackgroundImage:forState:barMetrics:")
    public native void setBackButtonBackgroundImage(UIImage backgroundImage, @Representing("UIControlState") long state, @Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("backButtonBackgroundImageForState:barMetrics:")
    public native UIImage getBackButtonBackgroundImage(@Representing("UIControlState") long state, @Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setBackButtonTitlePositionAdjustment:forBarMetrics:")
    public native void setBackButtonTitlePositionAdjustment(UIOffset adjustment, @Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("backButtonTitlePositionAdjustmentForBarMetrics:")
    public native UIOffset getBackButtonTitlePositionAdjustment(@Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setBackButtonBackgroundVerticalPositionAdjustment:forBarMetrics:")
    public native void setBackButtonBackgroundVerticalPositionAdjustment(@MachineSizedFloat double adjustment, @Representing("UIBarMetrics") long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("backButtonBackgroundVerticalPositionAdjustmentForBarMetrics:")
    public native @MachineSizedFloat double getBackButtonBackgroundVerticalPositionAdjustment(@Representing("UIBarMetrics") long barMetrics);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);

}
