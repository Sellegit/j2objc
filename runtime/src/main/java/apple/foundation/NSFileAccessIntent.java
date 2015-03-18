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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("Foundation/Foundation.h") @Mapping("NSFileAccessIntent")
public class NSFileAccessIntent 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public NSFileAccessIntent() { }
    
    
    @Mapping("URL")
    public native NSURL getURL();
    
    
    
    @Mapping("readingIntentWithURL:options:")
    public static native NSFileAccessIntent createReadingIntent(NSURL url, @Representing("NSFileCoordinatorReadingOptions") @MachineSizedUInt long options);
    @Mapping("writingIntentWithURL:options:")
    public static native NSFileAccessIntent createWritingIntent(NSURL url, @Representing("NSFileCoordinatorWritingOptions") @MachineSizedUInt long options);
    
}
