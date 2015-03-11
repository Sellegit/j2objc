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
 * @since Available in iOS 6.0 and later.
 */

@Library("UIKit") @Mapping("NSLayoutConstraint")
public class NSLayoutConstraint 
    extends NSObject 
     {

    
    
    public NSLayoutConstraint() {}
    
    
    @Mapping("priority")
    public native float getPriority();
    @Mapping("setPriority:")
    public native void setPriority(float v);
    @Mapping("shouldBeArchived")
    public native boolean shouldBeArchived();
    @Mapping("setShouldBeArchived:")
    public native void setShouldBeArchived(boolean v);
    @Mapping("firstItem")
    public native Object getFirstItem();
    @Mapping("firstAttribute")
    public native @Representing("NSLayoutAttribute") @MachineSizedSInt long getFirstAttribute();
    @Mapping("relation")
    public native @Representing("NSLayoutRelation") @MachineSizedSInt long getRelation();
    @Mapping("secondItem")
    public native Object getSecondItem();
    @Mapping("secondAttribute")
    public native @Representing("NSLayoutAttribute") @MachineSizedSInt long getSecondAttribute();
    @Mapping("multiplier")
    public native @MachineSizedFloat double getMultiplier();
    @Mapping("constant")
    public native @MachineSizedFloat double getConstant();
    @Mapping("setConstant:")
    public native void setConstant(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("isActive")
    public native boolean isActive();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setActive:")
    public native void setActive(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("identifier")
    public native String getIdentifier();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setIdentifier:")
    public native void setIdentifier(String v);
    
    
    
    @Mapping("constraintsWithVisualFormat:options:metrics:views:")
    public static native NSArray<NSLayoutConstraint> create(String format, @Representing("NSLayoutFormatOptions") @MachineSizedUInt long opts, Map<String, Number> metrics, Map<String, NSObjectProtocol> views);
    @Mapping("constraintWithItem:attribute:relatedBy:toItem:attribute:multiplier:constant:")
    public static native NSLayoutConstraint create(Object view1, @Representing("NSLayoutAttribute") @MachineSizedSInt long attr1, @Representing("NSLayoutRelation") @MachineSizedSInt long relation, Object view2, @Representing("NSLayoutAttribute") @MachineSizedSInt long attr2, @MachineSizedFloat double multiplier, @MachineSizedFloat double c);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("activateConstraints:")
    public static native void activateConstraints(NSArray<NSLayoutConstraint> constraints);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("deactivateConstraints:")
    public static native void deactivateConstraints(NSArray<NSLayoutConstraint> constraints);
    
}
