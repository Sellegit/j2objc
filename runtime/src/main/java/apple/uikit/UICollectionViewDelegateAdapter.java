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

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class UICollectionViewDelegateFlowLayoutUICollectionViewDelegateAdapter
    extends UIScrollViewDelegateAdapter 
    implements UICollectionViewDelegate {

    
    
    


    
    
    @NotImplemented("collectionView:shouldHighlightItemAtIndexPath:")
    public boolean shouldHighlightItem(UICollectionView collectionView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("collectionView:didHighlightItemAtIndexPath:")
    public void didHighlightItem(UICollectionView collectionView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("collectionView:didUnhighlightItemAtIndexPath:")
    public void didUnhighlightItem(UICollectionView collectionView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("collectionView:shouldSelectItemAtIndexPath:")
    public boolean shouldSelectItem(UICollectionView collectionView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("collectionView:shouldDeselectItemAtIndexPath:")
    public boolean shouldDeselectItem(UICollectionView collectionView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("collectionView:didSelectItemAtIndexPath:")
    public void didSelectItem(UICollectionView collectionView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("collectionView:didDeselectItemAtIndexPath:")
    public void didDeselectItem(UICollectionView collectionView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("collectionView:willDisplayCell:forItemAtIndexPath:")
    public void willDisplayCell(UICollectionView collectionView, UICollectionViewCell cell, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("collectionView:willDisplaySupplementaryView:forElementKind:atIndexPath:")
    public void willDisplaySupplementaryView(UICollectionView collectionView, UICollectionReusableView view, String elementKind, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("collectionView:didEndDisplayingCell:forItemAtIndexPath:")
    public void didEndDisplayingCell(UICollectionView collectionView, UICollectionViewCell cell, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("collectionView:didEndDisplayingSupplementaryView:forElementOfKind:atIndexPath:")
    public void didEndDisplayingSupplementaryView(UICollectionView collectionView, UICollectionReusableView view, String elementKind, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("collectionView:shouldShowMenuForItemAtIndexPath:")
    public boolean shouldShowMenuForItem(UICollectionView collectionView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("collectionView:canPerformAction:forItemAtIndexPath:withSender:")
    public boolean canPerformAction(UICollectionView collectionView, Selector action, NSIndexPath indexPath, Object sender) { throw new UnsupportedOperationException(); }
    @NotImplemented("collectionView:performAction:forItemAtIndexPath:withSender:")
    public void performAction(UICollectionView collectionView, Selector action, NSIndexPath indexPath, Object sender) { throw new UnsupportedOperationException(); }
    @NotImplemented("collectionView:transitionLayoutForOldLayout:newLayout:")
    public UICollectionViewTransitionLayout getTransitionLayout(UICollectionView collectionView, UICollectionViewLayout fromLayout, UICollectionViewLayout toLayout) { throw new UnsupportedOperationException(); }

}
