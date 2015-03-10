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
public abstract class UICollectionViewDelegateFlowLayoutAdapter 
    extends UICollectionViewDelegateAdapter 
    implements UICollectionViewDelegateFlowLayout {

    
    
    
    
    
    
    
    @NotImplemented("collectionView:layout:sizeForItemAtIndexPath:")
    public CGSize getItemSize(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("collectionView:layout:insetForSectionAtIndex:")
    public UIEdgeInsets getSectionInset(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section) { throw new UnsupportedOperationException(); }
    @NotImplemented("collectionView:layout:minimumLineSpacingForSectionAtIndex:")
    public @MachineSizedFloat double getSectionMinimumLineSpacing(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section) { throw new UnsupportedOperationException(); }
    @NotImplemented("collectionView:layout:minimumInteritemSpacingForSectionAtIndex:")
    public @MachineSizedFloat double getSectionMinimumInteritemSpacing(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section) { throw new UnsupportedOperationException(); }
    @NotImplemented("collectionView:layout:referenceSizeForHeaderInSection:")
    public CGSize getSectionHeaderReferenceSize(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section) { throw new UnsupportedOperationException(); }
    @NotImplemented("collectionView:layout:referenceSizeForFooterInSection:")
    public CGSize getSectionFooterReferenceSize(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section) { throw new UnsupportedOperationException(); }
    
}
