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

@Library("UIKit") @Mapping("UISegmentedControl")
public class UISegmentedControl 
    extends UIControl 
    implements NSCoding {

    
    public static final int NoSegment = -1;
    
    
    public UISegmentedControl() {}
    @Mapping("initWithItems:")
    public UISegmentedControl(NSArray<?> items) { }
    @Mapping("initWithFrame:")
    public UISegmentedControl(CGRect frame) { }
    
    
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("segmentedControlStyle")
    public native @Representing("UISegmentedControlStyle") @MachineSizedSInt long getControlStyle();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Mapping("setSegmentedControlStyle:")
    public native void setControlStyle(@Representing("UISegmentedControlStyle") @MachineSizedSInt long v);
    @Mapping("isMomentary")
    public native boolean isMomentary();
    @Mapping("setMomentary:")
    public native void setMomentary(boolean v);
    @Mapping("numberOfSegments")
    public native @MachineSizedUInt long getNumberOfSegments();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("apportionsSegmentWidthsByContent")
    public native boolean apportionsSegmentWidthsByContent();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setApportionsSegmentWidthsByContent:")
    public native void setApportionsSegmentWidthsByContent(boolean v);
    @Mapping("selectedSegmentIndex")
    public native @MachineSizedSInt long getSelectedSegment();
    @Mapping("setSelectedSegmentIndex:")
    public native void setSelectedSegment(@MachineSizedSInt long v);
    @Mapping("tintColor")
    public native UIColor getTintColor();
    @Mapping("setTintColor:")
    public native void setTintColor(UIColor v);
    
    
    
    @Mapping("insertSegmentWithTitle:atIndex:animated:")
    public native void insertSegment(String title, @MachineSizedUInt long segment, boolean animated);
    @Mapping("insertSegmentWithImage:atIndex:animated:")
    public native void insertSegment(UIImage image, @MachineSizedUInt long segment, boolean animated);
    @Mapping("removeSegmentAtIndex:animated:")
    public native void removeSegment(@MachineSizedUInt long segment, boolean animated);
    @Mapping("removeAllSegments")
    public native void removeAllSegments();
    @Mapping("setTitle:forSegmentAtIndex:")
    public native void setTitle(String title, @MachineSizedUInt long segment);
    @Mapping("titleForSegmentAtIndex:")
    public native String getTitle(@MachineSizedUInt long segment);
    @Mapping("setImage:forSegmentAtIndex:")
    public native void setImage(UIImage image, @MachineSizedUInt long segment);
    @Mapping("imageForSegmentAtIndex:")
    public native UIImage getImage(@MachineSizedUInt long segment);
    @Mapping("setWidth:forSegmentAtIndex:")
    public native void setWidth(@MachineSizedFloat double width, @MachineSizedUInt long segment);
    @Mapping("widthForSegmentAtIndex:")
    public native @MachineSizedFloat double getWidth(@MachineSizedUInt long segment);
    @Mapping("setContentOffset:forSegmentAtIndex:")
    public native void setContentOffset(CGSize offset, @MachineSizedUInt long segment);
    @Mapping("contentOffsetForSegmentAtIndex:")
    public native CGSize getContentOffset(@MachineSizedUInt long segment);
    @Mapping("setEnabled:forSegmentAtIndex:")
    public native void setEnabled(boolean enabled, @MachineSizedUInt long segment);
    @Mapping("isEnabledForSegmentAtIndex:")
    public native boolean isEnabled(@MachineSizedUInt long segment);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setBackgroundImage:forState:barMetrics:")
    public native void setBackgroundImage(UIImage backgroundImage, @Representing("UIControlState") @MachineSizedUInt long state, @Representing("UIBarMetrics") @MachineSizedSInt long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("backgroundImageForState:barMetrics:")
    public native UIImage getBackgroundImage(@Representing("UIControlState") @MachineSizedUInt long state, @Representing("UIBarMetrics") @MachineSizedSInt long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setDividerImage:forLeftSegmentState:rightSegmentState:barMetrics:")
    public native void setDividerImage(UIImage dividerImage, @Representing("UIControlState") @MachineSizedUInt long leftState, @Representing("UIControlState") @MachineSizedUInt long rightState, @Representing("UIBarMetrics") @MachineSizedSInt long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("dividerImageForLeftSegmentState:rightSegmentState:barMetrics:")
    public native UIImage getDividerImage(@Representing("UIControlState") @MachineSizedUInt long leftState, @Representing("UIControlState") @MachineSizedUInt long rightState, @Representing("UIBarMetrics") @MachineSizedSInt long barMetrics);
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
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setContentPositionAdjustment:forSegmentType:barMetrics:")
    public native void setContentPositionAdjustment(UIOffset adjustment, @Representing("UISegmentedControlSegment") @MachineSizedSInt long leftCenterRightOrAlone, @Representing("UIBarMetrics") @MachineSizedSInt long barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("contentPositionAdjustmentForSegmentType:barMetrics:")
    public native UIOffset getContentPositionAdjustment(@Representing("UISegmentedControlSegment") @MachineSizedSInt long leftCenterRightOrAlone, @Representing("UIBarMetrics") @MachineSizedSInt long barMetrics);
    
}
