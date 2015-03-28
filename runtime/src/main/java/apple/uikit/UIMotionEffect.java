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
@Library("UIKit/UIKit.h") @Mapping("UIMotionEffect")
public class UIMotionEffect 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    @Mapping("init")
    public UIMotionEffect() { }

    


    
    
    @Mapping("keyPathsAndRelativeValuesForViewerOffset:")
    public native NSDictionary<?, ?> getKeyPathsAndRelativeValues(UIOffset viewerOffset);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);

}
