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

@Library("UIKit/UIKit.h") @Mapping("UICollectionViewFlowLayoutInvalidationContext")
public class UICollectionViewFlowLayoutInvalidationContext 
    extends UICollectionViewLayoutInvalidationContext 
     {

    
    
    public UICollectionViewFlowLayoutInvalidationContext() {}
    
    
    @Mapping("invalidateFlowLayoutDelegateMetrics")
    public native boolean invalidatesFlowLayoutDelegateMetrics();
    @Mapping("setInvalidateFlowLayoutDelegateMetrics:")
    public native void setInvalidatesFlowLayoutDelegateMetrics(boolean v);
    @Mapping("invalidateFlowLayoutAttributes")
    public native boolean invalidatesFlowLayoutAttributes();
    @Mapping("setInvalidateFlowLayoutAttributes:")
    public native void setInvalidatesFlowLayoutAttributes(boolean v);
    
    
    
    
    
}
