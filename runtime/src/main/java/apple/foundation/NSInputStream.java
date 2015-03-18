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





@Library("Foundation/Foundation.h") @Mapping("NSInputStream")
public class NSInputStream 
    extends NSStream 
     {

    
    
    @Mapping("initWithData:")
    public NSInputStream(NSData data) { }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("initWithURL:")
    public NSInputStream(NSURL url) { }
    @Mapping("init")
    public NSInputStream() { }
    @Mapping("initWithFileAtPath:")
    public NSInputStream(String path) { }
    
    
    @Mapping("hasBytesAvailable")
    public native boolean hasBytesAvailable();
    
    
    
    @Mapping("read:maxLength:")
    public native @MachineSizedSInt long read(Todo buffer, @MachineSizedUInt long len);
    
}
