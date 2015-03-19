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

@Library("UIKit/UIKit.h") @Mapping("UICollectionViewController")
public class UICollectionViewController 
    extends UIViewController 
    implements UICollectionViewDelegate, UICollectionViewDataSource {

    
    
    @Mapping("initWithCollectionViewLayout:")
    public UICollectionViewController(UICollectionViewLayout layout) { }
    @Mapping("initWithNibName:bundle:")
    public UICollectionViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    @Mapping("initWithCoder:")
    public UICollectionViewController(NSCoder aDecoder) { }
    @Mapping("init")
    public UICollectionViewController() { }
    
    
    @Mapping("collectionView")
    public native UICollectionView getCollectionView();
    @Mapping("setCollectionView:")
    public native void setCollectionView(UICollectionView v);
    @Mapping("clearsSelectionOnViewWillAppear")
    public native boolean clearsSelectionOnViewWillAppear();
    @Mapping("setClearsSelectionOnViewWillAppear:")
    public native void setClearsSelectionOnViewWillAppear(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("useLayoutToLayoutNavigationTransitions")
    public native boolean usesLayoutToLayoutNavigationTransitions();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setUseLayoutToLayoutNavigationTransitions:")
    public native void setUsesLayoutToLayoutNavigationTransitions(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("collectionViewLayout")
    public native UICollectionViewLayout getCollectionViewLayout();
    
    
    
    @Mapping("collectionView:shouldHighlightItemAtIndexPath:")
    public native boolean shouldHighlightItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Mapping("collectionView:didHighlightItemAtIndexPath:")
    public native void didHighlightItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Mapping("collectionView:didUnhighlightItemAtIndexPath:")
    public native void didUnhighlightItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Mapping("collectionView:shouldSelectItemAtIndexPath:")
    public native boolean shouldSelectItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Mapping("collectionView:shouldDeselectItemAtIndexPath:")
    public native boolean shouldDeselectItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Mapping("collectionView:didSelectItemAtIndexPath:")
    public native void didSelectItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Mapping("collectionView:didDeselectItemAtIndexPath:")
    public native void didDeselectItem(UICollectionView collectionView, NSIndexPath indexPath);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("collectionView:willDisplayCell:forItemAtIndexPath:")
    public native void willDisplayCell(UICollectionView collectionView, UICollectionViewCell cell, NSIndexPath indexPath);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("collectionView:willDisplaySupplementaryView:forElementKind:atIndexPath:")
    public native void willDisplaySupplementaryView(UICollectionView collectionView, UICollectionReusableView view, String elementKind, NSIndexPath indexPath);
    @Mapping("collectionView:didEndDisplayingCell:forItemAtIndexPath:")
    public native void didEndDisplayingCell(UICollectionView collectionView, UICollectionViewCell cell, NSIndexPath indexPath);
    @Mapping("collectionView:didEndDisplayingSupplementaryView:forElementOfKind:atIndexPath:")
    public native void didEndDisplayingSupplementaryView(UICollectionView collectionView, UICollectionReusableView view, String elementKind, NSIndexPath indexPath);
    @Mapping("collectionView:shouldShowMenuForItemAtIndexPath:")
    public native boolean shouldShowMenuForItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Mapping("collectionView:canPerformAction:forItemAtIndexPath:withSender:")
    public native boolean canPerformAction(UICollectionView collectionView, Selector action, NSIndexPath indexPath, Object sender);
    @Mapping("collectionView:performAction:forItemAtIndexPath:withSender:")
    public native void performAction(UICollectionView collectionView, Selector action, NSIndexPath indexPath, Object sender);
    @Mapping("collectionView:transitionLayoutForOldLayout:newLayout:")
    public native UICollectionViewTransitionLayout getTransitionLayout(UICollectionView collectionView, UICollectionViewLayout fromLayout, UICollectionViewLayout toLayout);
    @Mapping("scrollViewDidScroll:")
    public native void didScroll(UIScrollView scrollView);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("scrollViewDidZoom:")
    public native void didZoom(UIScrollView scrollView);
    @Mapping("scrollViewWillBeginDragging:")
    public native void willBeginDragging(UIScrollView scrollView);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("scrollViewWillEndDragging:withVelocity:targetContentOffset:")
    public native void willEndDragging(UIScrollView scrollView, CGPoint velocity, CGPoint targetContentOffset);
    @Mapping("scrollViewDidEndDragging:willDecelerate:")
    public native void didEndDragging(UIScrollView scrollView, boolean decelerate);
    @Mapping("scrollViewWillBeginDecelerating:")
    public native void willBeginDecelerating(UIScrollView scrollView);
    @Mapping("scrollViewDidEndDecelerating:")
    public native void didEndDecelerating(UIScrollView scrollView);
    @Mapping("scrollViewDidEndScrollingAnimation:")
    public native void didEndScrollingAnimation(UIScrollView scrollView);
    @Mapping("viewForZoomingInScrollView:")
    public native UIView getViewForZooming(UIScrollView scrollView);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("scrollViewWillBeginZooming:withView:")
    public native void willBeginZooming(UIScrollView scrollView, UIView view);
    @Mapping("scrollViewDidEndZooming:withView:atScale:")
    public native void didEndZooming(UIScrollView scrollView, UIView view, @MachineSizedFloat double scale);
    @Mapping("scrollViewShouldScrollToTop:")
    public native boolean shouldScrollToTop(UIScrollView scrollView);
    @Mapping("scrollViewDidScrollToTop:")
    public native void didScrollToTop(UIScrollView scrollView);
    @Mapping("collectionView:numberOfItemsInSection:")
    public native @MachineSizedSInt long getNumberOfItemsInSection(UICollectionView collectionView, @MachineSizedSInt long section);
    @Mapping("collectionView:cellForItemAtIndexPath:")
    public native UICollectionViewCell getCellForItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Mapping("numberOfSectionsInCollectionView:")
    public native @MachineSizedSInt long getNumberOfSections(UICollectionView collectionView);
    @Mapping("collectionView:viewForSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionReusableView getViewForSupplementaryElement(UICollectionView collectionView, String kind, NSIndexPath indexPath);
    
}
