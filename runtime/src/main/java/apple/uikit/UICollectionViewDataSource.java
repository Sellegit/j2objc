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





@Library("UIKit/UIKit.h") @Mapping("UICollectionViewDataSource")
public interface UICollectionViewDataSource 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("collectionView:numberOfItemsInSection:")
    @MachineSizedSInt long getNumberOfItemsInSection(UICollectionView collectionView, @MachineSizedSInt long section);
    @Mapping("collectionView:cellForItemAtIndexPath:")
    UICollectionViewCell getCellForItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Mapping("numberOfSectionsInCollectionView:")
    @MachineSizedSInt long getNumberOfSections(UICollectionView collectionView);
    @Mapping("collectionView:viewForSupplementaryElementOfKind:atIndexPath:")
    UICollectionReusableView getViewForSupplementaryElement(UICollectionView collectionView, String kind, NSIndexPath indexPath);
    
    /*<adapter>*/
    /*</adapter>*/
}
