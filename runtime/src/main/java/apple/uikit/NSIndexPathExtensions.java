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
@Library("UIKit/UIKit.h")
public final class NSIndexPathExtensions 
    extends NSExtensions 
     {

    
    
    private NSIndexPathExtensions() {}
    
    
    
    
    
    
    @Mapping("indexPathForRow:inSection:")
    public static native NSIndexPath createIndexPathForRowInSection(@MachineSizedSInt long row, @MachineSizedSInt long section);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("indexPathForItem:inSection:")
    public static native NSIndexPath createIndexPathForItemInSection(@MachineSizedSInt long item, @MachineSizedSInt long section);
    
}
