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


/*<javadoc>*/
/*</javadoc>*/
@Library("Foundation")
public class NSFileSystemAttribute 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("NSFileSystemNumber")
    protected static native NSString NumberAttribute();
    @GlobalConstant("NSFileSystemSize")
    protected static native NSString SizeAttribute();
    @GlobalConstant("NSFileSystemFreeSize")
    protected static native NSString FreeSizeAttribute();
    @GlobalConstant("NSFileSystemNodes")
    protected static native NSString NodesAttribute();
    @GlobalConstant("NSFileSystemFreeNodes")
    protected static native NSString FreeNodesAttribute();
    
}
