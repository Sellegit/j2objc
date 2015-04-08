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
@Library("UIKit/UIKit.h") @Mapping("NSBundle")
public final class NSBundleExtensions 
    extends NSExtensions 
     {

    
    
    private NSBundleExtensions() {}

    


    
    
    @ExtensionMapping("loadNibNamed:owner:options:")
    public static native NSArray<?> loadNib(NSBundle thiz, String name, Object owner, NSDictionary<?, ?> options);

}
