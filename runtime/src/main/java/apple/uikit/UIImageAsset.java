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
 * @since Available in iOS 8.0 and later.
 */

@Library("UIKit") @Mapping("UIImageAsset")
public class UIImageAsset 
    extends NSObject 
     {

    
    
    public UIImageAsset() {}
    
    
    
    
    
    
    @Mapping("imageWithTraitCollection:")
    public native UIImage getImage(UITraitCollection traitCollection);
    @Mapping("registerImage:withTraitCollection:")
    public native void registerImage(UIImage image, UITraitCollection traitCollection);
    @Mapping("unregisterImageWithTraitCollection:")
    public native void unregisterImage(UITraitCollection traitCollection);
    
}
