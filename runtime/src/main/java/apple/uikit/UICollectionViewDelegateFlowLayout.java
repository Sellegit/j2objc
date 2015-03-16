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





@Library("UIKit/UIKit.h") @Mapping("UICollectionViewDelegateFlowLayout")
public interface UICollectionViewDelegateFlowLayout 
    extends UICollectionViewDelegate {

    
    
    
    
    
    @Mapping("collectionView:layout:sizeForItemAtIndexPath:")
    CGSize getItemSize(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, NSIndexPath indexPath);
    @Mapping("collectionView:layout:insetForSectionAtIndex:")
    UIEdgeInsets getSectionInset(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section);
    @Mapping("collectionView:layout:minimumLineSpacingForSectionAtIndex:")
    @MachineSizedFloat double getSectionMinimumLineSpacing(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section);
    @Mapping("collectionView:layout:minimumInteritemSpacingForSectionAtIndex:")
    @MachineSizedFloat double getSectionMinimumInteritemSpacing(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section);
    @Mapping("collectionView:layout:referenceSizeForHeaderInSection:")
    CGSize getSectionHeaderReferenceSize(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section);
    @Mapping("collectionView:layout:referenceSizeForFooterInSection:")
    CGSize getSectionFooterReferenceSize(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section);
    
    /*<adapter>*/
    /*</adapter>*/
}
