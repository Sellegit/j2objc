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
public abstract class UICollectionViewDataSourceAdapter 
    extends Object 
    implements UICollectionViewDataSource {

    
    
    


    
    
    @NotImplemented("collectionView:numberOfItemsInSection:")
    public @MachineSizedSInt long getNumberOfItemsInSection(UICollectionView collectionView, @MachineSizedSInt long section) { throw new UnsupportedOperationException(); }
    @NotImplemented("collectionView:cellForItemAtIndexPath:")
    public UICollectionViewCell getCellForItem(UICollectionView collectionView, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }
    @NotImplemented("numberOfSectionsInCollectionView:")
    public @MachineSizedSInt long getNumberOfSections(UICollectionView collectionView) { throw new UnsupportedOperationException(); }
    @NotImplemented("collectionView:viewForSupplementaryElementOfKind:atIndexPath:")
    public UICollectionReusableView getViewForSupplementaryElement(UICollectionView collectionView, String kind, NSIndexPath indexPath) { throw new UnsupportedOperationException(); }

}
