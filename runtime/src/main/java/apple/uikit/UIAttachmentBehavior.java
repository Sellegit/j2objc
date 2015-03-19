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

@Library("UIKit/UIKit.h") @Mapping("UIAttachmentBehavior")
public class UIAttachmentBehavior 
    extends UIDynamicBehavior 
     {

    
    
    @Mapping("initWithItem:attachedToAnchor:")
    public UIAttachmentBehavior(UIDynamicItem item, CGPoint point) { }
    @Mapping("initWithItem:offsetFromCenter:attachedToAnchor:")
    public UIAttachmentBehavior(UIDynamicItem item, UIOffset offset, CGPoint point) { }
    @Mapping("initWithItem:attachedToItem:")
    public UIAttachmentBehavior(UIDynamicItem item1, UIDynamicItem item2) { }
    @Mapping("initWithItem:offsetFromCenter:attachedToItem:offsetFromCenter:")
    public UIAttachmentBehavior(UIDynamicItem item1, UIOffset offset1, UIDynamicItem item2, UIOffset offset2) { }
    @Mapping("init")
    public UIAttachmentBehavior() { }
    
    
    @Mapping("items")
    public native List<UIDynamicItem> getItems();
    @Mapping("attachedBehaviorType")
    public native @Representing("UIAttachmentBehaviorType") long getAttachedBehaviorType();
    @Mapping("anchorPoint")
    public native CGPoint getAnchorPoint();
    @Mapping("setAnchorPoint:")
    public native void setAnchorPoint(CGPoint v);
    @Mapping("length")
    public native @MachineSizedFloat double getLength();
    @Mapping("setLength:")
    public native void setLength(@MachineSizedFloat double v);
    @Mapping("damping")
    public native @MachineSizedFloat double getDamping();
    @Mapping("setDamping:")
    public native void setDamping(@MachineSizedFloat double v);
    @Mapping("frequency")
    public native @MachineSizedFloat double getFrequency();
    @Mapping("setFrequency:")
    public native void setFrequency(@MachineSizedFloat double v);
    
    
    
    
    
}
