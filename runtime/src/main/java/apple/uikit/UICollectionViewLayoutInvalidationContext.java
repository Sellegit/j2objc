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

@Library("UIKit/UIKit.h") @Mapping("UICollectionViewLayoutInvalidationContext")
public class UICollectionViewLayoutInvalidationContext 
    extends NSObject 
     {

    
    
    public UICollectionViewLayoutInvalidationContext() {}
    
    
    @Mapping("invalidateEverything")
    public native boolean invalidatesEverything();
    @Mapping("invalidateDataSourceCounts")
    public native boolean invalidatesDataSourceCounts();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("invalidatedItemIndexPaths")
    public native NSArray<NSIndexPath> getInvalidatedItemIndexPaths();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("invalidatedSupplementaryIndexPaths")
    public native NSArray<NSIndexPath> getInvalidatedSupplementaryIndexPaths();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("invalidatedDecorationIndexPaths")
    public native NSArray<NSIndexPath> getInvalidatedDecorationIndexPaths();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("contentOffsetAdjustment")
    public native CGPoint getContentOffsetAdjustment();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setContentOffsetAdjustment:")
    public native void setContentOffsetAdjustment(CGPoint v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("contentSizeAdjustment")
    public native CGSize getContentSizeAdjustment();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setContentSizeAdjustment:")
    public native void setContentSizeAdjustment(CGSize v);
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("invalidateItemsAtIndexPaths:")
    public native void invalidateItems(NSArray<?> indexPaths);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("invalidateSupplementaryElementsOfKind:atIndexPaths:")
    public native void invalidateSupplementaryElementsOfKind(String elementKind, NSArray<?> indexPaths);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("invalidateDecorationElementsOfKind:atIndexPaths:")
    public native void invalidateDecorationElementsOfKind(String elementKind, NSArray<?> indexPaths);
    
}
