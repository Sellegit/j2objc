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
 * @since Available in iOS 4.0 and later.
 */
@Library("UIKit/UIKit.h") @Mapping("UINib")
public class UINib 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public UINib() { }

    


    
    
    @Mapping("instantiateWithOwner:options:")
    public native NSArray<NSObject> instantiate(Object ownerOrNil, NSDictionary<?, ?> optionsOrNil);
    @Mapping("nibWithNibName:bundle:")
    public static native UINib create(String name, NSBundle bundleOrNil);
    @Mapping("nibWithData:bundle:")
    public static native UINib create(NSData data, NSBundle bundleOrNil);

}
