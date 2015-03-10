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

@Library("UIKit") @Mapping("UICollectionViewLayout")
public class UICollectionViewLayout 
    extends NSObject 
    implements NSCoding {

    
    
    public UICollectionViewLayout() {}
    
    
    @Mapping("collectionView")
    public native UICollectionView getCollectionView();
    
    
    
    @Mapping("invalidateLayout")
    public native void invalidateLayout();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("invalidateLayoutWithContext:")
    public native void invalidateLayout(UICollectionViewLayoutInvalidationContext context);
    @Mapping("registerNib:forDecorationViewOfKind:")
    public native void registerDecorationViewNib(UINib nib, String elementKind);
    @Mapping("prepareLayout")
    public native void prepareLayout();
    @Mapping("layoutAttributesForElementsInRect:")
    public native NSArray<UICollectionViewLayoutAttributes> getLayoutAttributesForElements(CGRect rect);
    @Mapping("layoutAttributesForItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes getLayoutAttributesForItem(NSIndexPath indexPath);
    @Mapping("layoutAttributesForSupplementaryViewOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes getLayoutAttributesForSupplementaryView(String elementKind, NSIndexPath indexPath);
    @Mapping("layoutAttributesForDecorationViewOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes getLayoutAttributesForDecorationView(String elementKind, NSIndexPath indexPath);
    @Mapping("shouldInvalidateLayoutForBoundsChange:")
    public native boolean shouldInvalidateLayoutForBoundsChange(CGRect newBounds);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("invalidationContextForBoundsChange:")
    public native UICollectionViewLayoutInvalidationContext getInvalidationContextForBoundsChange(CGRect newBounds);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("shouldInvalidateLayoutForPreferredLayoutAttributes:withOriginalAttributes:")
    public native boolean shouldInvalidateLayoutForPreferredLayoutAttributes(UICollectionViewLayoutAttributes preferredAttributes, UICollectionViewLayoutAttributes originalAttributes);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("invalidationContextForPreferredLayoutAttributes:withOriginalAttributes:")
    public native UICollectionViewLayoutInvalidationContext getInvalidationContextForPreferredLayoutAttributes(UICollectionViewLayoutAttributes preferredAttributes, UICollectionViewLayoutAttributes originalAttributes);
    @Mapping("targetContentOffsetForProposedContentOffset:withScrollingVelocity:")
    public native CGPoint getTargetContentOffset(CGPoint proposedContentOffset, CGPoint velocity);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("targetContentOffsetForProposedContentOffset:")
    public native CGPoint getTargetContentOffset(CGPoint proposedContentOffset);
    @Mapping("collectionViewContentSize")
    public native CGSize getCollectionViewContentSize();
    @Mapping("prepareForCollectionViewUpdates:")
    public native void prepareForCollectionViewUpdates(NSArray<UICollectionViewUpdateItem> updateItems);
    @Mapping("finalizeCollectionViewUpdates")
    public native void finalizeCollectionViewUpdates();
    @Mapping("prepareForAnimatedBoundsChange:")
    public native void prepareForAnimatedBoundsChange(CGRect oldBounds);
    @Mapping("finalizeAnimatedBoundsChange")
    public native void finalizeAnimatedBoundsChange();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("prepareForTransitionToLayout:")
    public native void prepareForTransitionToLayout(UICollectionViewLayout newLayout);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("prepareForTransitionFromLayout:")
    public native void prepareForTransitionFromLayout(UICollectionViewLayout oldLayout);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("finalizeLayoutTransition")
    public native void finalizeLayoutTransition();
    @Mapping("initialLayoutAttributesForAppearingItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes getInitialLayoutAttributesForAppearingItem(NSIndexPath itemIndexPath);
    @Mapping("finalLayoutAttributesForDisappearingItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes getFinalLayoutAttributesForDisappearingItem(NSIndexPath itemIndexPath);
    @Mapping("initialLayoutAttributesForAppearingSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes getInitialLayoutAttributesForAppearingSupplementaryElement(String elementKind, NSIndexPath elementIndexPath);
    @Mapping("finalLayoutAttributesForDisappearingSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes getFinalLayoutAttributesForDisappearingSupplementaryElement(String elementKind, NSIndexPath elementIndexPath);
    @Mapping("initialLayoutAttributesForAppearingDecorationElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes getInitialLayoutAttributesForAppearingDecorationElement(String elementKind, NSIndexPath decorationIndexPath);
    @Mapping("finalLayoutAttributesForDisappearingDecorationElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes getFinalLayoutAttributesForDisappearingDecorationElement(String elementKind, NSIndexPath decorationIndexPath);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("indexPathsToDeleteForSupplementaryViewOfKind:")
    public native NSArray<NSIndexPath> getIndexPathsToDeleteForSupplementaryView(String elementKind);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("indexPathsToDeleteForDecorationViewOfKind:")
    public native NSArray<NSIndexPath> getIndexPathsToDeleteForDecorationView(String elementKind);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("indexPathsToInsertForSupplementaryViewOfKind:")
    public native NSArray<NSIndexPath> getIndexPathsToInsertForSupplementaryView(String elementKind);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("indexPathsToInsertForDecorationViewOfKind:")
    public native NSArray<NSIndexPath> getIndexPathsToInsertForDecorationView(String elementKind);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
