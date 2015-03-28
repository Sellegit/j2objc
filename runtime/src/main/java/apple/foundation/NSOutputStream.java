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


@Library("Foundation/Foundation.h") @Mapping("NSOutputStream")
public class NSOutputStream 
    extends NSStream 
     {

    
    
    @Mapping("initToMemory")
    public NSOutputStream() { }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("initWithURL:append:")
    public NSOutputStream(NSURL url, boolean shouldAppend) { }
    @Mapping("initToFileAtPath:append:")
    public NSOutputStream(String path, boolean shouldAppend) { }

    
    @Mapping("hasSpaceAvailable")
    public native boolean hasSpaceAvailable();

    
    
    @Mapping("write:maxLength:")
    public native @MachineSizedSInt long write(Todo buffer, @MachineSizedUInt long len);

}
