package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


@Library("Foundation/Foundation.h") @Mapping("NSKeyedUnarchiver")
public class NSKeyedUnarchiver 
    extends NSCoder 
     {

    
    
    @Mapping("initForReadingWithData:")
    public NSKeyedUnarchiver(NSData data) { }
    @Mapping("init")
    public NSKeyedUnarchiver() { }

    
    @Mapping("delegate")
    public native NSKeyedUnarchiverDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(NSKeyedUnarchiverDelegate v);

    
    
    @Mapping("finishDecoding")
    public native void finishDecoding();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("setRequiresSecureCoding:")
    public native void setRequiresSecureCoding(boolean b);
    @Mapping("unarchiveObjectWithData:")
    public static native Object unarchive(NSData data);
    @Mapping("unarchiveObjectWithFile:")
    public static native Object unarchiveObject(String path);

}
