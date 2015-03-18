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

@Library("UIKit/UIKit.h") @Mapping("UITraitCollection")
public class UITraitCollection 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public UITraitCollection() { }
    
    
    @Mapping("userInterfaceIdiom")
    public native @Representing("UIUserInterfaceIdiom") @MachineSizedSInt long getUserInterfaceIdiom();
    @Mapping("displayScale")
    public native @MachineSizedFloat double getDisplayScale();
    @Mapping("horizontalSizeClass")
    public native @Representing("UIUserInterfaceSizeClass") @MachineSizedSInt long getHorizontalSizeClass();
    @Mapping("verticalSizeClass")
    public native @Representing("UIUserInterfaceSizeClass") @MachineSizedSInt long getVerticalSizeClass();
    
    
    
    @Mapping("containsTraitsInCollection:")
    public native boolean containsTraits(UITraitCollection trait);
    @Mapping("traitCollectionWithTraitsFromCollections:")
    public static native UITraitCollection createWithTraits(NSArray<?> traitCollections);
    @Mapping("traitCollectionWithUserInterfaceIdiom:")
    public static native UITraitCollection createWithUserInterfaceIdiom(@Representing("UIUserInterfaceIdiom") @MachineSizedSInt long idiom);
    @Mapping("traitCollectionWithDisplayScale:")
    public static native UITraitCollection createWithDisplayScale(@MachineSizedFloat double scale);
    @Mapping("traitCollectionWithHorizontalSizeClass:")
    public static native UITraitCollection createWithHorizontalSizeClass(@Representing("UIUserInterfaceSizeClass") @MachineSizedSInt long horizontalSizeClass);
    @Mapping("traitCollectionWithVerticalSizeClass:")
    public static native UITraitCollection createWithVerticalSizeClass(@Representing("UIUserInterfaceSizeClass") @MachineSizedSInt long verticalSizeClass);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
