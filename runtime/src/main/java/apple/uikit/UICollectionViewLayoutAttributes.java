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

@Library("UIKit/UIKit.h") @Mapping("UICollectionViewLayoutAttributes")
public class UICollectionViewLayoutAttributes 
    extends NSObject 
    implements NSCopying, UIDynamicItem {

    
    
    @Mapping("init")
    public UICollectionViewLayoutAttributes() { }
    
    
    @Mapping("frame")
    public native CGRect getFrame();
    @Mapping("setFrame:")
    public native void setFrame(CGRect v);
    @Mapping("center")
    public native CGPoint getCenter();
    @Mapping("setCenter:")
    public native void setCenter(CGPoint v);
    @Mapping("size")
    public native CGSize getSize();
    @Mapping("setSize:")
    public native void setSize(CGSize v);
    @Mapping("transform3D")
    public native CATransform3D getTransform3D();
    @Mapping("setTransform3D:")
    public native void setTransform3D(CATransform3D v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("bounds")
    public native CGRect getBounds();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setBounds:")
    public native void setBounds(CGRect v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("transform")
    public native CGAffineTransform getTransform();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setTransform:")
    public native void setTransform(CGAffineTransform v);
    @Mapping("alpha")
    public native @MachineSizedFloat double getAlpha();
    @Mapping("setAlpha:")
    public native void setAlpha(@MachineSizedFloat double v);
    @Mapping("zIndex")
    public native @MachineSizedSInt long getZIndex();
    @Mapping("setZIndex:")
    public native void setZIndex(@MachineSizedSInt long v);
    @Mapping("isHidden")
    public native boolean isHidden();
    @Mapping("setHidden:")
    public native void setHidden(boolean v);
    @Mapping("indexPath")
    public native NSIndexPath getIndexPath();
    @Mapping("setIndexPath:")
    public native void setIndexPath(NSIndexPath v);
    @Mapping("representedElementCategory")
    public native @Representing("UICollectionElementCategory") @MachineSizedUInt long getRepresentedElementCategory();
    @Mapping("representedElementKind")
    public native String getRepresentedElementKind();
    
    
    
    @Mapping("layoutAttributesForCellWithIndexPath:")
    public static native UICollectionViewLayoutAttributes createForCell(NSIndexPath indexPath);
    @Mapping("layoutAttributesForSupplementaryViewOfKind:withIndexPath:")
    public static native UICollectionViewLayoutAttributes createForSupplementaryView(String elementKind, NSIndexPath indexPath);
    @Mapping("layoutAttributesForDecorationViewOfKind:withIndexPath:")
    public static native UICollectionViewLayoutAttributes createForDecorationView(String decorationViewKind, NSIndexPath indexPath);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
