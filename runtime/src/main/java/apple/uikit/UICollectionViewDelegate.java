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





@Library("UIKit/UIKit.h") @Mapping("UICollectionViewDelegate")
public interface UICollectionViewDelegate 
    extends UIScrollViewDelegate {

    
    
    
    
    
    @Mapping("collectionView:shouldHighlightItemAtIndexPath:")
    boolean shouldHighlightItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Mapping("collectionView:didHighlightItemAtIndexPath:")
    void didHighlightItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Mapping("collectionView:didUnhighlightItemAtIndexPath:")
    void didUnhighlightItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Mapping("collectionView:shouldSelectItemAtIndexPath:")
    boolean shouldSelectItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Mapping("collectionView:shouldDeselectItemAtIndexPath:")
    boolean shouldDeselectItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Mapping("collectionView:didSelectItemAtIndexPath:")
    void didSelectItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Mapping("collectionView:didDeselectItemAtIndexPath:")
    void didDeselectItem(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("collectionView:willDisplayCell:forItemAtIndexPath:")
    void willDisplayCell(UICollectionView collectionView, UICollectionViewCell cell, NSIndexPath indexPath);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("collectionView:willDisplaySupplementaryView:forElementKind:atIndexPath:")
    void willDisplaySupplementaryView(UICollectionView collectionView, UICollectionReusableView view, String elementKind, NSIndexPath indexPath);
    @Mapping("collectionView:didEndDisplayingCell:forItemAtIndexPath:")
    void didEndDisplayingCell(UICollectionView collectionView, UICollectionViewCell cell, NSIndexPath indexPath);
    @Mapping("collectionView:didEndDisplayingSupplementaryView:forElementOfKind:atIndexPath:")
    void didEndDisplayingSupplementaryView(UICollectionView collectionView, UICollectionReusableView view, String elementKind, NSIndexPath indexPath);
    @Mapping("collectionView:shouldShowMenuForItemAtIndexPath:")
    boolean shouldShowMenuForItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Mapping("collectionView:canPerformAction:forItemAtIndexPath:withSender:")
    boolean canPerformAction(UICollectionView collectionView, Selector action, NSIndexPath indexPath, Object sender);
    @Mapping("collectionView:performAction:forItemAtIndexPath:withSender:")
    void performAction(UICollectionView collectionView, Selector action, NSIndexPath indexPath, Object sender);
    @Mapping("collectionView:transitionLayoutForOldLayout:newLayout:")
    UICollectionViewTransitionLayout getTransitionLayout(UICollectionView collectionView, UICollectionViewLayout fromLayout, UICollectionViewLayout toLayout);
    
    /*<adapter>*/
    /*</adapter>*/
}
