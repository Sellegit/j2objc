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

@Library("UIKit") @Mapping("UICollectionViewFlowLayout")
public class UICollectionViewFlowLayout 
    extends UICollectionViewLayout 
     {

    
    
    public UICollectionViewFlowLayout() {}
    
    
    @Mapping("minimumLineSpacing")
    public native @MachineSizedFloat double getMinimumLineSpacing();
    @Mapping("setMinimumLineSpacing:")
    public native void setMinimumLineSpacing(@MachineSizedFloat double v);
    @Mapping("minimumInteritemSpacing")
    public native @MachineSizedFloat double getMinimumInteritemSpacing();
    @Mapping("setMinimumInteritemSpacing:")
    public native void setMinimumInteritemSpacing(@MachineSizedFloat double v);
    @Mapping("itemSize")
    public native CGSize getItemSize();
    @Mapping("setItemSize:")
    public native void setItemSize(CGSize v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("estimatedItemSize")
    public native CGSize getEstimatedItemSize();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setEstimatedItemSize:")
    public native void setEstimatedItemSize(CGSize v);
    @Mapping("scrollDirection")
    public native @Representing("UICollectionViewScrollDirection") @MachineSizedSInt long getScrollDirection();
    @Mapping("setScrollDirection:")
    public native void setScrollDirection(@Representing("UICollectionViewScrollDirection") @MachineSizedSInt long v);
    @Mapping("headerReferenceSize")
    public native CGSize getHeaderReferenceSize();
    @Mapping("setHeaderReferenceSize:")
    public native void setHeaderReferenceSize(CGSize v);
    @Mapping("footerReferenceSize")
    public native CGSize getFooterReferenceSize();
    @Mapping("setFooterReferenceSize:")
    public native void setFooterReferenceSize(CGSize v);
    @Mapping("sectionInset")
    public native UIEdgeInsets getSectionInset();
    @Mapping("setSectionInset:")
    public native void setSectionInset(UIEdgeInsets v);
    
    
    
    
    
}
