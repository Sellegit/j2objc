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
@Library("UIKit/UIKit.h") @Mapping("UICollectionReusableView")
public class UICollectionReusableView 
    extends UIView 
     {

    
    
    @Mapping("initWithFrame:")
    public UICollectionReusableView(CGRect frame) { }
    @Mapping("initWithCoder:")
    public UICollectionReusableView(NSCoder aDecoder) { }
    @Mapping("init")
    public UICollectionReusableView() { }

    
    @Mapping("reuseIdentifier")
    public native String getReuseIdentifier();

    
    
    @Mapping("prepareForReuse")
    public native void prepareForReuse();
    @Mapping("applyLayoutAttributes:")
    public native void applyLayoutAttributes(UICollectionViewLayoutAttributes layoutAttributes);
    @Mapping("willTransitionFromLayout:toLayout:")
    public native void willTransition(UICollectionViewLayout oldLayout, UICollectionViewLayout newLayout);
    @Mapping("didTransitionFromLayout:toLayout:")
    public native void didTransition(UICollectionViewLayout oldLayout, UICollectionViewLayout newLayout);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("preferredLayoutAttributesFittingAttributes:")
    public native UICollectionViewLayoutAttributes getPreferredLayoutAttributesFittingAttributes(UICollectionViewLayoutAttributes layoutAttributes);

}
