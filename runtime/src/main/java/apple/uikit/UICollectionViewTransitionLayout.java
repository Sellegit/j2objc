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
 * @since Available in iOS 7.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UICollectionViewTransitionLayout")
public class UICollectionViewTransitionLayout 
    extends UICollectionViewLayout 
     {

    
    
    @Mapping("initWithCurrentLayout:nextLayout:")
    public UICollectionViewTransitionLayout(UICollectionViewLayout currentLayout, UICollectionViewLayout newLayout) { }
    @Mapping("init")
    public UICollectionViewTransitionLayout() { }
    
    
    @Mapping("transitionProgress")
    public native @MachineSizedFloat double getTransitionProgress();
    @Mapping("setTransitionProgress:")
    public native void setTransitionProgress(@MachineSizedFloat double v);
    @Mapping("currentLayout")
    public native UICollectionViewLayout getCurrentLayout();
    @Mapping("nextLayout")
    public native UICollectionViewLayout getNextLayout();
    
    
    
    @Mapping("updateValue:forAnimatedKey:")
    public native void updateValue(@MachineSizedFloat double value, String key);
    @Mapping("valueForAnimatedKey:")
    public native @MachineSizedFloat double getValue(String key);
    
}
