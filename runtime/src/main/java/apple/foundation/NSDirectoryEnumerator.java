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





@Library("Foundation/Foundation.h") @Mapping("NSDirectoryEnumerator")
public class NSDirectoryEnumerator 
    extends NSEnumerator 
     {

    
    
    
    
    
    @Mapping("fileAttributes")
    public native NSDictionary<?, ?> getFileAttributes();
    @Mapping("directoryAttributes")
    public native NSDictionary<?, ?> getDirectoryAttributes();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("level")
    public native @MachineSizedUInt long getLevel();
    
    
    
    @Mapping("skipDescendents")
    public native void skipDescendents();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("skipDescendants")
    public native void skipDescendants();
    
}
