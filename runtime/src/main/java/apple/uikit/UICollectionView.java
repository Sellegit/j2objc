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
@Library("UIKit/UIKit.h") @Mapping("UICollectionView")
public class UICollectionView 
    extends UIScrollView 
     {

    
    
    @Mapping("initWithFrame:collectionViewLayout:")
    public UICollectionView(CGRect frame, UICollectionViewLayout layout) { }
    @Mapping("initWithFrame:")
    public UICollectionView(CGRect frame) { }
    @Mapping("initWithCoder:")
    public UICollectionView(NSCoder aDecoder) { }
    @Mapping("init")
    public UICollectionView() { }

    
    @Mapping("collectionViewLayout")
    public native UICollectionViewLayout getCollectionViewLayout();
    @Mapping("setCollectionViewLayout:")
    public native void setCollectionViewLayout(UICollectionViewLayout v);
    @Mapping("delegate")
    public native UICollectionViewDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UICollectionViewDelegate v);
    @Mapping("dataSource")
    public native UICollectionViewDataSource getDataSource();
    @Mapping("setDataSource:")
    public native void setDataSource(UICollectionViewDataSource v);
    @Mapping("backgroundView")
    public native UIView getBackgroundView();
    @Mapping("setBackgroundView:")
    public native void setBackgroundView(UIView v);
    @Mapping("allowsSelection")
    public native boolean allowsSelection();
    @Mapping("setAllowsSelection:")
    public native void setAllowsSelection(boolean v);
    @Mapping("allowsMultipleSelection")
    public native boolean allowsMultipleSelection();
    @Mapping("setAllowsMultipleSelection:")
    public native void setAllowsMultipleSelection(boolean v);

    
    
    @Mapping("registerNib:forCellWithReuseIdentifier:")
    public native void registerReusableCellNib(UINib nib, String identifier);
    @Mapping("registerNib:forSupplementaryViewOfKind:withReuseIdentifier:")
    public native void registerReusableSupplementaryViewNib(UINib nib, String kind, String identifier);
    @Mapping("dequeueReusableCellWithReuseIdentifier:forIndexPath:")
    public native UICollectionReusableView dequeueReusableCell(String identifier, NSIndexPath indexPath);
    @Mapping("dequeueReusableSupplementaryViewOfKind:withReuseIdentifier:forIndexPath:")
    public native UICollectionReusableView dequeueReusableSupplementaryView(String elementKind, String identifier, NSIndexPath indexPath);
    @Mapping("indexPathsForSelectedItems")
    public native NSArray<NSIndexPath> getIndexPathsForSelectedItems();
    @Mapping("selectItemAtIndexPath:animated:scrollPosition:")
    public native void selectItem(NSIndexPath indexPath, boolean animated, @Representing("UICollectionViewScrollPosition") long scrollPosition);
    @Mapping("deselectItemAtIndexPath:animated:")
    public native void deselectItem(NSIndexPath indexPath, boolean animated);
    @Mapping("reloadData")
    public native void reloadData();
    @Mapping("setCollectionViewLayout:animated:")
    public native void setCollectionViewLayout(UICollectionViewLayout layout, boolean animated);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setCollectionViewLayout:animated:completion:")
    public native void setCollectionViewLayout(UICollectionViewLayout layout, boolean animated, @Block VoidBooleanBlock completion);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("finishInteractiveTransition")
    public native void finishInteractiveTransition();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("cancelInteractiveTransition")
    public native void cancelInteractiveTransition();
    @Mapping("numberOfSections")
    public native @MachineSizedSInt long getNumberOfSections();
    @Mapping("numberOfItemsInSection:")
    public native @MachineSizedSInt long getNumberOfItemsInSection(@MachineSizedSInt long section);
    @Mapping("layoutAttributesForItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes getLayoutAttributesForItem(NSIndexPath indexPath);
    @Mapping("layoutAttributesForSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes getLayoutAttributesForSupplementaryElement(String kind, NSIndexPath indexPath);
    @Mapping("indexPathForItemAtPoint:")
    public native NSIndexPath getIndexPathForItem(CGPoint point);
    @Mapping("indexPathForCell:")
    public native NSIndexPath getIndexPathForCell(UICollectionViewCell cell);
    @Mapping("cellForItemAtIndexPath:")
    public native UICollectionViewCell getCellForItem(NSIndexPath indexPath);
    @Mapping("visibleCells")
    public native NSArray<UICollectionViewCell> getVisibleCells();
    @Mapping("indexPathsForVisibleItems")
    public native NSArray<NSIndexPath> getIndexPathsForVisibleItems();
    @Mapping("scrollToItemAtIndexPath:atScrollPosition:animated:")
    public native void scrollToItem(NSIndexPath indexPath, @Representing("UICollectionViewScrollPosition") long scrollPosition, boolean animated);
    @Mapping("insertSections:")
    public native void insertSections(NSIndexSet sections);
    @Mapping("deleteSections:")
    public native void deleteSections(NSIndexSet sections);
    @Mapping("reloadSections:")
    public native void reloadSections(NSIndexSet sections);
    @Mapping("moveSection:toSection:")
    public native void moveSection(@MachineSizedSInt long section, @MachineSizedSInt long newSection);
    @Mapping("insertItemsAtIndexPaths:")
    public native void insertItems(NSArray<?> indexPaths);
    @Mapping("deleteItemsAtIndexPaths:")
    public native void deleteItems(NSArray<?> indexPaths);
    @Mapping("reloadItemsAtIndexPaths:")
    public native void reloadItems(NSArray<?> indexPaths);
    @Mapping("moveItemAtIndexPath:toIndexPath:")
    public native void moveItem(NSIndexPath indexPath, NSIndexPath newIndexPath);
    @Mapping("performBatchUpdates:completion:")
    public native void performBatchUpdates(@Block Runnable updates, @Block VoidBooleanBlock completion);

}
