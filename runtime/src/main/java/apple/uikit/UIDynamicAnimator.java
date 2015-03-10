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

@Library("UIKit") @Mapping("UIDynamicAnimator")
public class UIDynamicAnimator 
    extends NSObject 
     {

    
    
    public UIDynamicAnimator() {}
    @Mapping("initWithReferenceView:")
    public UIDynamicAnimator(UIView view) { }
    @Mapping("initWithCollectionViewLayout:")
    public UIDynamicAnimator(UICollectionViewLayout layout) { }
    
    
    @Mapping("referenceView")
    public native UIView getReferenceView();
    @Mapping("behaviors")
    public native NSArray<UIDynamicBehavior> getBehaviors();
    @Mapping("isRunning")
    public native boolean isRunning();
    @Mapping("delegate")
    public native UIDynamicAnimatorDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIDynamicAnimatorDelegate v);
    
    
    
    @Mapping("addBehavior:")
    public native void addBehavior(UIDynamicBehavior behavior);
    @Mapping("removeBehavior:")
    public native void removeBehavior(UIDynamicBehavior behavior);
    @Mapping("removeAllBehaviors")
    public native void removeAllBehaviors();
    @Mapping("itemsInRect:")
    public native List<UIDynamicItem> getItemsInRect(CGRect rect);
    @Mapping("updateItemUsingCurrentState:")
    public native void updateItemUsingCurrentState(UIDynamicItem item);
    @Mapping("elapsedTime")
    public native double getElapsedTime();
    @Mapping("layoutAttributesForCellAtIndexPath:")
    public native UICollectionViewLayoutAttributes getLayoutAttributesForCell(NSIndexPath indexPath);
    @Mapping("layoutAttributesForSupplementaryViewOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes getLayoutAttributesForSupplementaryView(String kind, NSIndexPath indexPath);
    @Mapping("layoutAttributesForDecorationViewOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes getLayoutAttributesForDecorationView(String decorationViewKind, NSIndexPath indexPath);
    
}
