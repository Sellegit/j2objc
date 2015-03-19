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

@Library("UIKit/UIKit.h") @Mapping("UICollisionBehavior")
public class UICollisionBehavior 
    extends UIDynamicBehavior 
     {

    
    
    @Mapping("initWithItems:")
    public UICollisionBehavior(NSArray<?> items) { }
    @Mapping("init")
    public UICollisionBehavior() { }
    
    
    @Mapping("items")
    public native List<UIDynamicItem> getItems();
    @Mapping("collisionMode")
    public native @Representing("UICollisionBehaviorMode") long getCollisionMode();
    @Mapping("setCollisionMode:")
    public native void setCollisionMode(@Representing("UICollisionBehaviorMode") long v);
    @Mapping("translatesReferenceBoundsIntoBoundary")
    public native boolean isTranslatesReferenceBoundsIntoBoundary();
    @Mapping("setTranslatesReferenceBoundsIntoBoundary:")
    public native void setTranslatesReferenceBoundsIntoBoundary(boolean v);
    @Mapping("boundaryIdentifiers")
    public native NSArray<?> getBoundaryIdentifiers();
    @Mapping("collisionDelegate")
    public native UICollisionBehaviorDelegate getCollisionDelegate();
    @Mapping("setCollisionDelegate:")
    public native void setCollisionDelegate(UICollisionBehaviorDelegate v);
    
    
    
    @Mapping("addItem:")
    public native void addItem(UIDynamicItem item);
    @Mapping("removeItem:")
    public native void removeItem(UIDynamicItem item);
    @Mapping("setTranslatesReferenceBoundsIntoBoundaryWithInsets:")
    public native void setTranslatesReferenceBoundsIntoBoundaryWithInsets(UIEdgeInsets insets);
    @Mapping("addBoundaryWithIdentifier:forPath:")
    public native void addBoundary(Cloneable identifier, UIBezierPath bezierPath);
    @Mapping("addBoundaryWithIdentifier:fromPoint:toPoint:")
    public native void addBoundary(Cloneable identifier, CGPoint p1, CGPoint p2);
    @Mapping("boundaryWithIdentifier:")
    public native UIBezierPath getBoundary(Cloneable identifier);
    @Mapping("removeBoundaryWithIdentifier:")
    public native void removeBoundary(Cloneable identifier);
    @Mapping("removeAllBoundaries")
    public native void removeAllBoundaries();
    
}
